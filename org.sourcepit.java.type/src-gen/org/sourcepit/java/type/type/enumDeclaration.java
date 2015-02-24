/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.enumDeclaration#getEnumBody <em>Enum Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getenumDeclaration()
 * @model
 * @generated
 */
public interface enumDeclaration extends classDeclaration {
   /**
    * Returns the value of the '<em><b>Enum Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Enum Body</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Enum Body</em>' containment reference.
    * @see #setEnumBody(enumBody)
    * @see org.sourcepit.java.type.type.TypePackage#getenumDeclaration_EnumBody()
    * @model containment="true"
    * @generated
    */
   enumBody getEnumBody();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.enumDeclaration#getEnumBody <em>Enum Body</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Enum Body</em>' containment reference.
    * @see #getEnumBody()
    * @generated
    */
   void setEnumBody(enumBody value);

} // enumDeclaration
