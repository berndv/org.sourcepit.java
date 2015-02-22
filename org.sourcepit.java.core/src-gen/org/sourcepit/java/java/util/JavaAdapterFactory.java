/**
 */

package org.sourcepit.java.java.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.java.JavaPackage
 * @generated
 */
public class JavaAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static JavaPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = JavaPackage.eINSTANCE;
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
   protected JavaSwitch<Adapter> modelSwitch = new JavaSwitch<Adapter>() {
      @Override
      public Adapter caseModel(Model object) {
         return createModelAdapter();
      }

      @Override
      public Adapter caseLiteral(Literal object) {
         return createLiteralAdapter();
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
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.java.Model <em>Model</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.java.Model
    * @generated
    */
   public Adapter createModelAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.java.Literal <em>Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.java.Literal
    * @generated
    */
   public Adapter createLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.java.IntegerLiteral
    * <em>Integer Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.java.IntegerLiteral
    * @generated
    */
   public Adapter createIntegerLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.java.FloatingPointLiteral
    * <em>Floating Point Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.java.FloatingPointLiteral
    * @generated
    */
   public Adapter createFloatingPointLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.java.BooleanLiteral
    * <em>Boolean Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.java.BooleanLiteral
    * @generated
    */
   public Adapter createBooleanLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.java.CharacterLiteral
    * <em>Character Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.java.CharacterLiteral
    * @generated
    */
   public Adapter createCharacterLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.java.StringLiteral
    * <em>String Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.java.StringLiteral
    * @generated
    */
   public Adapter createStringLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.java.NullLiteral <em>Null Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.java.NullLiteral
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

} // JavaAdapterFactory
