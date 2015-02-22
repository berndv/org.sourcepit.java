/**
 */

package org.sourcepit.java.java;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.sourcepit.java.java.JavaFactory
 * @model kind="package"
 * @generated
 */
public interface JavaPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "java";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/java/Java";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "java";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   JavaPackage eINSTANCE = org.sourcepit.java.java.impl.JavaPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.java.java.impl.ModelImpl <em>Model</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.java.impl.ModelImpl
    * @see org.sourcepit.java.java.impl.JavaPackageImpl#getModel()
    * @generated
    */
   int MODEL = 0;

   /**
    * The feature id for the '<em><b>Literals</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MODEL__LITERALS = 0;

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
    * The meta object id for the '{@link org.sourcepit.java.java.impl.LiteralImpl <em>Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.java.impl.LiteralImpl
    * @see org.sourcepit.java.java.impl.JavaPackageImpl#getLiteral()
    * @generated
    */
   int LITERAL = 1;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LITERAL__VALUE = 0;

   /**
    * The number of structural features of the '<em>Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LITERAL_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.java.impl.IntegerLiteralImpl <em>Integer Literal</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.java.impl.IntegerLiteralImpl
    * @see org.sourcepit.java.java.impl.JavaPackageImpl#getIntegerLiteral()
    * @generated
    */
   int INTEGER_LITERAL = 2;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTEGER_LITERAL__VALUE = LITERAL__VALUE;

   /**
    * The number of structural features of the '<em>Integer Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.java.impl.FloatingPointLiteralImpl
    * <em>Floating Point Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.java.impl.FloatingPointLiteralImpl
    * @see org.sourcepit.java.java.impl.JavaPackageImpl#getFloatingPointLiteral()
    * @generated
    */
   int FLOATING_POINT_LITERAL = 3;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FLOATING_POINT_LITERAL__VALUE = LITERAL__VALUE;

   /**
    * The number of structural features of the '<em>Floating Point Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FLOATING_POINT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.java.impl.BooleanLiteralImpl <em>Boolean Literal</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.java.impl.BooleanLiteralImpl
    * @see org.sourcepit.java.java.impl.JavaPackageImpl#getBooleanLiteral()
    * @generated
    */
   int BOOLEAN_LITERAL = 4;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BOOLEAN_LITERAL__VALUE = LITERAL__VALUE;

   /**
    * The number of structural features of the '<em>Boolean Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.java.impl.CharacterLiteralImpl <em>Character Literal</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.java.impl.CharacterLiteralImpl
    * @see org.sourcepit.java.java.impl.JavaPackageImpl#getCharacterLiteral()
    * @generated
    */
   int CHARACTER_LITERAL = 5;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CHARACTER_LITERAL__VALUE = LITERAL__VALUE;

   /**
    * The number of structural features of the '<em>Character Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CHARACTER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.java.impl.StringLiteralImpl <em>String Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.java.impl.StringLiteralImpl
    * @see org.sourcepit.java.java.impl.JavaPackageImpl#getStringLiteral()
    * @generated
    */
   int STRING_LITERAL = 6;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STRING_LITERAL__VALUE = LITERAL__VALUE;

   /**
    * The number of structural features of the '<em>String Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.java.impl.NullLiteralImpl <em>Null Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.java.impl.NullLiteralImpl
    * @see org.sourcepit.java.java.impl.JavaPackageImpl#getNullLiteral()
    * @generated
    */
   int NULL_LITERAL = 7;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NULL_LITERAL__VALUE = LITERAL__VALUE;

   /**
    * The number of structural features of the '<em>Null Literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;


   /**
    * Returns the meta object for class '{@link org.sourcepit.java.java.Model <em>Model</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Model</em>'.
    * @see org.sourcepit.java.java.Model
    * @generated
    */
   EClass getModel();

   /**
    * Returns the meta object for the containment reference list '{@link org.sourcepit.java.java.Model#getLiterals
    * <em>Literals</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Literals</em>'.
    * @see org.sourcepit.java.java.Model#getLiterals()
    * @see #getModel()
    * @generated
    */
   EReference getModel_Literals();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.java.Literal <em>Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Literal</em>'.
    * @see org.sourcepit.java.java.Literal
    * @generated
    */
   EClass getLiteral();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.java.Literal#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see org.sourcepit.java.java.Literal#getValue()
    * @see #getLiteral()
    * @generated
    */
   EAttribute getLiteral_Value();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.java.IntegerLiteral <em>Integer Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Integer Literal</em>'.
    * @see org.sourcepit.java.java.IntegerLiteral
    * @generated
    */
   EClass getIntegerLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.java.FloatingPointLiteral
    * <em>Floating Point Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Floating Point Literal</em>'.
    * @see org.sourcepit.java.java.FloatingPointLiteral
    * @generated
    */
   EClass getFloatingPointLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.java.BooleanLiteral <em>Boolean Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Boolean Literal</em>'.
    * @see org.sourcepit.java.java.BooleanLiteral
    * @generated
    */
   EClass getBooleanLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.java.CharacterLiteral <em>Character Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Character Literal</em>'.
    * @see org.sourcepit.java.java.CharacterLiteral
    * @generated
    */
   EClass getCharacterLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.java.StringLiteral <em>String Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>String Literal</em>'.
    * @see org.sourcepit.java.java.StringLiteral
    * @generated
    */
   EClass getStringLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.java.NullLiteral <em>Null Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Null Literal</em>'.
    * @see org.sourcepit.java.java.NullLiteral
    * @generated
    */
   EClass getNullLiteral();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   JavaFactory getJavaFactory();

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
       * The meta object literal for the '{@link org.sourcepit.java.java.impl.ModelImpl <em>Model</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.java.impl.ModelImpl
       * @see org.sourcepit.java.java.impl.JavaPackageImpl#getModel()
       * @generated
       */
      EClass MODEL = eINSTANCE.getModel();

      /**
       * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference MODEL__LITERALS = eINSTANCE.getModel_Literals();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.java.impl.LiteralImpl <em>Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.java.impl.LiteralImpl
       * @see org.sourcepit.java.java.impl.JavaPackageImpl#getLiteral()
       * @generated
       */
      EClass LITERAL = eINSTANCE.getLiteral();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.java.impl.IntegerLiteralImpl
       * <em>Integer Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.java.impl.IntegerLiteralImpl
       * @see org.sourcepit.java.java.impl.JavaPackageImpl#getIntegerLiteral()
       * @generated
       */
      EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.java.impl.FloatingPointLiteralImpl
       * <em>Floating Point Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.java.impl.FloatingPointLiteralImpl
       * @see org.sourcepit.java.java.impl.JavaPackageImpl#getFloatingPointLiteral()
       * @generated
       */
      EClass FLOATING_POINT_LITERAL = eINSTANCE.getFloatingPointLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.java.impl.BooleanLiteralImpl
       * <em>Boolean Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.java.impl.BooleanLiteralImpl
       * @see org.sourcepit.java.java.impl.JavaPackageImpl#getBooleanLiteral()
       * @generated
       */
      EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.java.impl.CharacterLiteralImpl
       * <em>Character Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.java.impl.CharacterLiteralImpl
       * @see org.sourcepit.java.java.impl.JavaPackageImpl#getCharacterLiteral()
       * @generated
       */
      EClass CHARACTER_LITERAL = eINSTANCE.getCharacterLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.java.impl.StringLiteralImpl <em>String Literal</em>}
       * ' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.java.impl.StringLiteralImpl
       * @see org.sourcepit.java.java.impl.JavaPackageImpl#getStringLiteral()
       * @generated
       */
      EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.java.impl.NullLiteralImpl <em>Null Literal</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.java.impl.NullLiteralImpl
       * @see org.sourcepit.java.java.impl.JavaPackageImpl#getNullLiteral()
       * @generated
       */
      EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

   }

} // JavaPackage
