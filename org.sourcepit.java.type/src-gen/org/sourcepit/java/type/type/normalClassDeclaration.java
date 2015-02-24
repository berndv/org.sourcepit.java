/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>normal Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.normalClassDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.normalClassDeclaration#getSuperclass <em>Superclass</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.normalClassDeclaration#getClassBody <em>Class Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getnormalClassDeclaration()
 * @model
 * @generated
 */
public interface normalClassDeclaration extends classDeclaration {
   /**
    * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Parameters</em>' containment reference isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Parameters</em>' containment reference.
    * @see #setTypeParameters(typeParameters)
    * @see org.sourcepit.java.type.type.TypePackage#getnormalClassDeclaration_TypeParameters()
    * @model containment="true"
    * @generated
    */
   typeParameters getTypeParameters();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.normalClassDeclaration#getTypeParameters
    * <em>Type Parameters</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type Parameters</em>' containment reference.
    * @see #getTypeParameters()
    * @generated
    */
   void setTypeParameters(typeParameters value);

   /**
    * Returns the value of the '<em><b>Superclass</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Superclass</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Superclass</em>' containment reference.
    * @see #setSuperclass(superclass)
    * @see org.sourcepit.java.type.type.TypePackage#getnormalClassDeclaration_Superclass()
    * @model containment="true"
    * @generated
    */
   superclass getSuperclass();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.normalClassDeclaration#getSuperclass
    * <em>Superclass</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Superclass</em>' containment reference.
    * @see #getSuperclass()
    * @generated
    */
   void setSuperclass(superclass value);

   /**
    * Returns the value of the '<em><b>Class Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Class Body</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Class Body</em>' containment reference.
    * @see #setClassBody(classBody)
    * @see org.sourcepit.java.type.type.TypePackage#getnormalClassDeclaration_ClassBody()
    * @model containment="true"
    * @generated
    */
   classBody getClassBody();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.normalClassDeclaration#getClassBody
    * <em>Class Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Class Body</em>' containment reference.
    * @see #getClassBody()
    * @generated
    */
   void setClassBody(classBody value);

} // normalClassDeclaration
