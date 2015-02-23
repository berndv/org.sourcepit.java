/**
 */

package org.sourcepit.java.literals.literals;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.sourcepit.java.literals.literals.LiteralsFactory
 * @model kind="package"
 * @generated
 */
public interface LiteralsPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "literals";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/java/literals/Literals";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "literals";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   LiteralsPackage eINSTANCE = org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.java.literals.literals.impl.literalImpl <em>literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.literals.literals.impl.literalImpl
    * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getliteral()
    * @generated
    */
   int LITERAL = 0;

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
    * The number of structural features of the '<em>literal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LITERAL_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.literals.literals.impl.IntegerLiteralImpl
    * <em>Integer Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.literals.literals.impl.IntegerLiteralImpl
    * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
    * @generated
    */
   int INTEGER_LITERAL = 1;

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
    * The meta object id for the '{@link org.sourcepit.java.literals.literals.impl.FloatingPointLiteralImpl
    * <em>Floating Point Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.literals.literals.impl.FloatingPointLiteralImpl
    * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getFloatingPointLiteral()
    * @generated
    */
   int FLOATING_POINT_LITERAL = 2;

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
    * The meta object id for the '{@link org.sourcepit.java.literals.literals.impl.BooleanLiteralImpl
    * <em>Boolean Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.literals.literals.impl.BooleanLiteralImpl
    * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getBooleanLiteral()
    * @generated
    */
   int BOOLEAN_LITERAL = 3;

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
    * The meta object id for the '{@link org.sourcepit.java.literals.literals.impl.CharacterLiteralImpl
    * <em>Character Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.literals.literals.impl.CharacterLiteralImpl
    * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getCharacterLiteral()
    * @generated
    */
   int CHARACTER_LITERAL = 4;

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
    * The meta object id for the '{@link org.sourcepit.java.literals.literals.impl.StringLiteralImpl
    * <em>String Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.literals.literals.impl.StringLiteralImpl
    * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getStringLiteral()
    * @generated
    */
   int STRING_LITERAL = 5;

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
    * The meta object id for the '{@link org.sourcepit.java.literals.literals.impl.NullLiteralImpl
    * <em>Null Literal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.literals.literals.impl.NullLiteralImpl
    * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getNullLiteral()
    * @generated
    */
   int NULL_LITERAL = 6;

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
    * Returns the meta object for class '{@link org.sourcepit.java.literals.literals.literal <em>literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>literal</em>'.
    * @see org.sourcepit.java.literals.literals.literal
    * @generated
    */
   EClass getliteral();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.literals.literals.literal#getValue
    * <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see org.sourcepit.java.literals.literals.literal#getValue()
    * @see #getliteral()
    * @generated
    */
   EAttribute getliteral_Value();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.literals.literals.IntegerLiteral
    * <em>Integer Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Integer Literal</em>'.
    * @see org.sourcepit.java.literals.literals.IntegerLiteral
    * @generated
    */
   EClass getIntegerLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.literals.literals.FloatingPointLiteral
    * <em>Floating Point Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Floating Point Literal</em>'.
    * @see org.sourcepit.java.literals.literals.FloatingPointLiteral
    * @generated
    */
   EClass getFloatingPointLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.literals.literals.BooleanLiteral
    * <em>Boolean Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Boolean Literal</em>'.
    * @see org.sourcepit.java.literals.literals.BooleanLiteral
    * @generated
    */
   EClass getBooleanLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.literals.literals.CharacterLiteral
    * <em>Character Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Character Literal</em>'.
    * @see org.sourcepit.java.literals.literals.CharacterLiteral
    * @generated
    */
   EClass getCharacterLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.literals.literals.StringLiteral
    * <em>String Literal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>String Literal</em>'.
    * @see org.sourcepit.java.literals.literals.StringLiteral
    * @generated
    */
   EClass getStringLiteral();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.literals.literals.NullLiteral <em>Null Literal</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Null Literal</em>'.
    * @see org.sourcepit.java.literals.literals.NullLiteral
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
   LiteralsFactory getLiteralsFactory();

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
       * The meta object literal for the '{@link org.sourcepit.java.literals.literals.impl.literalImpl <em>literal</em>}
       * ' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.literals.literals.impl.literalImpl
       * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getliteral()
       * @generated
       */
      EClass LITERAL = eINSTANCE.getliteral();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute LITERAL__VALUE = eINSTANCE.getliteral_Value();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.literals.literals.impl.IntegerLiteralImpl
       * <em>Integer Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.literals.literals.impl.IntegerLiteralImpl
       * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
       * @generated
       */
      EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.literals.literals.impl.FloatingPointLiteralImpl
       * <em>Floating Point Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.literals.literals.impl.FloatingPointLiteralImpl
       * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getFloatingPointLiteral()
       * @generated
       */
      EClass FLOATING_POINT_LITERAL = eINSTANCE.getFloatingPointLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.literals.literals.impl.BooleanLiteralImpl
       * <em>Boolean Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.literals.literals.impl.BooleanLiteralImpl
       * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getBooleanLiteral()
       * @generated
       */
      EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.literals.literals.impl.CharacterLiteralImpl
       * <em>Character Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.literals.literals.impl.CharacterLiteralImpl
       * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getCharacterLiteral()
       * @generated
       */
      EClass CHARACTER_LITERAL = eINSTANCE.getCharacterLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.literals.literals.impl.StringLiteralImpl
       * <em>String Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.literals.literals.impl.StringLiteralImpl
       * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getStringLiteral()
       * @generated
       */
      EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.literals.literals.impl.NullLiteralImpl
       * <em>Null Literal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.literals.literals.impl.NullLiteralImpl
       * @see org.sourcepit.java.literals.literals.impl.LiteralsPackageImpl#getNullLiteral()
       * @generated
       */
      EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

   }

} // LiteralsPackage
