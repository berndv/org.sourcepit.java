/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.classType#getTypeArguments <em>Type Arguments</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.classType#getClassOrInterfaceType <em>Class Or Interface Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getclassType()
 * @model
 * @generated
 */
public interface classType extends interfaceType, superclass, exceptionType {
   /**
    * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Arguments</em>' containment reference isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Arguments</em>' containment reference.
    * @see #setTypeArguments(typeArguments)
    * @see org.sourcepit.java.type.type.TypePackage#getclassType_TypeArguments()
    * @model containment="true"
    * @generated
    */
   typeArguments getTypeArguments();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.classType#getTypeArguments <em>Type Arguments</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type Arguments</em>' containment reference.
    * @see #getTypeArguments()
    * @generated
    */
   void setTypeArguments(typeArguments value);

   /**
    * Returns the value of the '<em><b>Class Or Interface Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Class Or Interface Type</em>' containment reference isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Class Or Interface Type</em>' containment reference.
    * @see #setClassOrInterfaceType(classOrInterfaceType)
    * @see org.sourcepit.java.type.type.TypePackage#getclassType_ClassOrInterfaceType()
    * @model containment="true"
    * @generated
    */
   classOrInterfaceType getClassOrInterfaceType();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.classType#getClassOrInterfaceType
    * <em>Class Or Interface Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Class Or Interface Type</em>' containment reference.
    * @see #getClassOrInterfaceType()
    * @generated
    */
   void setClassOrInterfaceType(classOrInterfaceType value);

} // classType
