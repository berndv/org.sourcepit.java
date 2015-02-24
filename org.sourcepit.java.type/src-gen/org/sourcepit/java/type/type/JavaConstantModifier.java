/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Constant Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.JavaConstantModifier#getModifier <em>Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getJavaConstantModifier()
 * @model
 * @generated
 */
public interface JavaConstantModifier extends constantModifier {
   /**
    * Returns the value of the '<em><b>Modifier</b></em>' attribute.
    * The literals are from the enumeration {@link org.sourcepit.java.type.type.ConstantModifiers}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modifier</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Modifier</em>' attribute.
    * @see org.sourcepit.java.type.type.ConstantModifiers
    * @see #setModifier(ConstantModifiers)
    * @see org.sourcepit.java.type.type.TypePackage#getJavaConstantModifier_Modifier()
    * @model
    * @generated
    */
   ConstantModifiers getModifier();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.JavaConstantModifier#getModifier <em>Modifier</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Modifier</em>' attribute.
    * @see org.sourcepit.java.type.type.ConstantModifiers
    * @see #getModifier()
    * @generated
    */
   void setModifier(ConstantModifiers value);

} // JavaConstantModifier
