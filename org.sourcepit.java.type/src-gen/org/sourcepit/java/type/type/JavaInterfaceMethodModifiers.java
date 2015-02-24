/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Interface Method Modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.JavaInterfaceMethodModifiers#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getJavaInterfaceMethodModifiers()
 * @model
 * @generated
 */
public interface JavaInterfaceMethodModifiers extends interfaceMethodModifier {
   /**
    * Returns the value of the '<em><b>Modifiers</b></em>' attribute.
    * The literals are from the enumeration {@link org.sourcepit.java.type.type.InterfaceMethodModifiers}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modifiers</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Modifiers</em>' attribute.
    * @see org.sourcepit.java.type.type.InterfaceMethodModifiers
    * @see #setModifiers(InterfaceMethodModifiers)
    * @see org.sourcepit.java.type.type.TypePackage#getJavaInterfaceMethodModifiers_Modifiers()
    * @model
    * @generated
    */
   InterfaceMethodModifiers getModifiers();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.JavaInterfaceMethodModifiers#getModifiers
    * <em>Modifiers</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Modifiers</em>' attribute.
    * @see org.sourcepit.java.type.type.InterfaceMethodModifiers
    * @see #getModifiers()
    * @generated
    */
   void setModifiers(InterfaceMethodModifiers value);

} // JavaInterfaceMethodModifiers
