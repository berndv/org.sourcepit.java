/**
 */

package org.sourcepit.java.type.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Class Modifiers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.type.type.TypePackage#getClassModifiers()
 * @model
 * @generated
 */
public enum ClassModifiers implements Enumerator {
   /**
    * The '<em><b>PUBLIC</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #PUBLIC_VALUE
    * @generated
    * @ordered
    */
   PUBLIC(0, "PUBLIC", "public"),

   /**
    * The '<em><b>PROTECTED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #PROTECTED_VALUE
    * @generated
    * @ordered
    */
   PROTECTED(1, "PROTECTED", "protected"),

   /**
    * The '<em><b>PRIVATE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #PRIVATE_VALUE
    * @generated
    * @ordered
    */
   PRIVATE(2, "PRIVATE", "private"),

   /**
    * The '<em><b>ABSTRACT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #ABSTRACT_VALUE
    * @generated
    * @ordered
    */
   ABSTRACT(3, "ABSTRACT", "abstract"),

   /**
    * The '<em><b>STATIC</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #STATIC_VALUE
    * @generated
    * @ordered
    */
   STATIC(4, "STATIC", "static"),

   /**
    * The '<em><b>FINAL</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #FINAL_VALUE
    * @generated
    * @ordered
    */
   FINAL(5, "FINAL", "final"),

   /**
    * The '<em><b>STRICTFP</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #STRICTFP_VALUE
    * @generated
    * @ordered
    */
   STRICTFP(6, "STRICTFP", "strictfp");

   /**
    * The '<em><b>PUBLIC</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>PUBLIC</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #PUBLIC
    * @model literal="public"
    * @generated
    * @ordered
    */
   public static final int PUBLIC_VALUE = 0;

   /**
    * The '<em><b>PROTECTED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>PROTECTED</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #PROTECTED
    * @model literal="protected"
    * @generated
    * @ordered
    */
   public static final int PROTECTED_VALUE = 1;

   /**
    * The '<em><b>PRIVATE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>PRIVATE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #PRIVATE
    * @model literal="private"
    * @generated
    * @ordered
    */
   public static final int PRIVATE_VALUE = 2;

   /**
    * The '<em><b>ABSTRACT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>ABSTRACT</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #ABSTRACT
    * @model literal="abstract"
    * @generated
    * @ordered
    */
   public static final int ABSTRACT_VALUE = 3;

   /**
    * The '<em><b>STATIC</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>STATIC</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #STATIC
    * @model literal="static"
    * @generated
    * @ordered
    */
   public static final int STATIC_VALUE = 4;

   /**
    * The '<em><b>FINAL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FINAL</b></em>' literal object isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #FINAL
    * @model literal="final"
    * @generated
    * @ordered
    */
   public static final int FINAL_VALUE = 5;

   /**
    * The '<em><b>STRICTFP</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>STRICTFP</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #STRICTFP
    * @model literal="strictfp"
    * @generated
    * @ordered
    */
   public static final int STRICTFP_VALUE = 6;

   /**
    * An array of all the '<em><b>Class Modifiers</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static final ClassModifiers[] VALUES_ARRAY = new ClassModifiers[] { PUBLIC, PROTECTED, PRIVATE, ABSTRACT,
      STATIC, FINAL, STRICTFP, };

   /**
    * A public read-only list of all the '<em><b>Class Modifiers</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static final List<ClassModifiers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Class Modifiers</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static ClassModifiers get(String literal) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         ClassModifiers result = VALUES_ARRAY[i];
         if (result.toString().equals(literal)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Class Modifiers</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static ClassModifiers getByName(String name) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         ClassModifiers result = VALUES_ARRAY[i];
         if (result.getName().equals(name)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Class Modifiers</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static ClassModifiers get(int value) {
      switch (value) {
         case PUBLIC_VALUE :
            return PUBLIC;
         case PROTECTED_VALUE :
            return PROTECTED;
         case PRIVATE_VALUE :
            return PRIVATE;
         case ABSTRACT_VALUE :
            return ABSTRACT;
         case STATIC_VALUE :
            return STATIC;
         case FINAL_VALUE :
            return FINAL;
         case STRICTFP_VALUE :
            return STRICTFP;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private ClassModifiers(int value, String name, String literal) {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public int getValue() {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getName() {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getLiteral() {
      return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString() {
      return literal;
   }

} // ClassModifiers
