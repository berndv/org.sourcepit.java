/**
 */

package org.sourcepit.java.type.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Field Modifiers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.type.type.TypePackage#getFieldModifiers()
 * @model
 * @generated
 */
public enum FieldModifiers implements Enumerator {
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
    * The '<em><b>STATIC</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #STATIC_VALUE
    * @generated
    * @ordered
    */
   STATIC(3, "STATIC", "static"),

   /**
    * The '<em><b>FINAL</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #FINAL_VALUE
    * @generated
    * @ordered
    */
   FINAL(4, "FINAL", "final"),

   /**
    * The '<em><b>TRANSIENT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #TRANSIENT_VALUE
    * @generated
    * @ordered
    */
   TRANSIENT(5, "TRANSIENT", "transient"),

   /**
    * The '<em><b>VOLATILE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #VOLATILE_VALUE
    * @generated
    * @ordered
    */
   VOLATILE(6, "VOLATILE", "volatile");

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
   public static final int STATIC_VALUE = 3;

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
   public static final int FINAL_VALUE = 4;

   /**
    * The '<em><b>TRANSIENT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>TRANSIENT</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #TRANSIENT
    * @model literal="transient"
    * @generated
    * @ordered
    */
   public static final int TRANSIENT_VALUE = 5;

   /**
    * The '<em><b>VOLATILE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>VOLATILE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #VOLATILE
    * @model literal="volatile"
    * @generated
    * @ordered
    */
   public static final int VOLATILE_VALUE = 6;

   /**
    * An array of all the '<em><b>Field Modifiers</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static final FieldModifiers[] VALUES_ARRAY = new FieldModifiers[] { PUBLIC, PROTECTED, PRIVATE, STATIC,
      FINAL, TRANSIENT, VOLATILE, };

   /**
    * A public read-only list of all the '<em><b>Field Modifiers</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static final List<FieldModifiers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Field Modifiers</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static FieldModifiers get(String literal) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         FieldModifiers result = VALUES_ARRAY[i];
         if (result.toString().equals(literal)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Field Modifiers</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static FieldModifiers getByName(String name) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         FieldModifiers result = VALUES_ARRAY[i];
         if (result.getName().equals(name)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Field Modifiers</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static FieldModifiers get(int value) {
      switch (value) {
         case PUBLIC_VALUE :
            return PUBLIC;
         case PROTECTED_VALUE :
            return PROTECTED;
         case PRIVATE_VALUE :
            return PRIVATE;
         case STATIC_VALUE :
            return STATIC;
         case FINAL_VALUE :
            return FINAL;
         case TRANSIENT_VALUE :
            return TRANSIENT;
         case VOLATILE_VALUE :
            return VOLATILE;
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
   private FieldModifiers(int value, String name, String literal) {
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

} // FieldModifiers
