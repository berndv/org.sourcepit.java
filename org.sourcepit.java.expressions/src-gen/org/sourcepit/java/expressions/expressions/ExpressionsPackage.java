/**
 */

package org.sourcepit.java.expressions.expressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.expressions.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "expressions";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/java/expressions/Expressions";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "expressions";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   ExpressionsPackage eINSTANCE = org.sourcepit.java.expressions.expressions.impl.ExpressionsPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.java.expressions.expressions.impl.ModelImpl <em>Model</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.expressions.expressions.impl.ModelImpl
    * @see org.sourcepit.java.expressions.expressions.impl.ExpressionsPackageImpl#getModel()
    * @generated
    */
   int MODEL = 0;

   /**
    * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MODEL__GREETINGS = 0;

   /**
    * The number of structural features of the '<em>Model</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MODEL_FEATURE_COUNT = 1;


   /**
    * Returns the meta object for class '{@link org.sourcepit.java.expressions.expressions.Model <em>Model</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Model</em>'.
    * @see org.sourcepit.java.expressions.expressions.Model
    * @generated
    */
   EClass getModel();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.expressions.expressions.Model#getGreetings <em>Greetings</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Greetings</em>'.
    * @see org.sourcepit.java.expressions.expressions.Model#getGreetings()
    * @see #getModel()
    * @generated
    */
   EReference getModel_Greetings();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ExpressionsFactory getExpressionsFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link org.sourcepit.java.expressions.expressions.impl.ModelImpl
       * <em>Model</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.expressions.expressions.impl.ModelImpl
       * @see org.sourcepit.java.expressions.expressions.impl.ExpressionsPackageImpl#getModel()
       * @generated
       */
      EClass MODEL = eINSTANCE.getModel();

      /**
       * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

   }

} // ExpressionsPackage
