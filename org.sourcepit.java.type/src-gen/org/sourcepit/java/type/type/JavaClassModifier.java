/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Class Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.JavaClassModifier#getModifier <em>Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getJavaClassModifier()
 * @model
 * @generated
 */
public interface JavaClassModifier extends classModifier {
   /**
    * Returns the value of the '<em><b>Modifier</b></em>' attribute.
    * The literals are from the enumeration {@link org.sourcepit.java.type.type.ClassModifiers}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modifier</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Modifier</em>' attribute.
    * @see org.sourcepit.java.type.type.ClassModifiers
    * @see #setModifier(ClassModifiers)
    * @see org.sourcepit.java.type.type.TypePackage#getJavaClassModifier_Modifier()
    * @model
    * @generated
    */
   ClassModifiers getModifier();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.JavaClassModifier#getModifier <em>Modifier</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Modifier</em>' attribute.
    * @see org.sourcepit.java.type.type.ClassModifiers
    * @see #getModifier()
    * @generated
    */
   void setModifier(ClassModifiers value);

} // JavaClassModifier
