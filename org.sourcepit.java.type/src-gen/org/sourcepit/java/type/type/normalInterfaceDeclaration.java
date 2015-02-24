/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>normal Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.normalInterfaceDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.normalInterfaceDeclaration#getExtendsInterfaces <em>Extends Interfaces</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.normalInterfaceDeclaration#getInterfaceBody <em>Interface Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getnormalInterfaceDeclaration()
 * @model
 * @generated
 */
public interface normalInterfaceDeclaration extends interfaceDeclaration {
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
    * @see org.sourcepit.java.type.type.TypePackage#getnormalInterfaceDeclaration_TypeParameters()
    * @model containment="true"
    * @generated
    */
   typeParameters getTypeParameters();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.normalInterfaceDeclaration#getTypeParameters
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
    * Returns the value of the '<em><b>Extends Interfaces</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Extends Interfaces</em>' containment reference isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Extends Interfaces</em>' containment reference.
    * @see #setExtendsInterfaces(extendsInterfaces)
    * @see org.sourcepit.java.type.type.TypePackage#getnormalInterfaceDeclaration_ExtendsInterfaces()
    * @model containment="true"
    * @generated
    */
   extendsInterfaces getExtendsInterfaces();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.normalInterfaceDeclaration#getExtendsInterfaces
    * <em>Extends Interfaces</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Extends Interfaces</em>' containment reference.
    * @see #getExtendsInterfaces()
    * @generated
    */
   void setExtendsInterfaces(extendsInterfaces value);

   /**
    * Returns the value of the '<em><b>Interface Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Interface Body</em>' containment reference isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Interface Body</em>' containment reference.
    * @see #setInterfaceBody(interfaceBody)
    * @see org.sourcepit.java.type.type.TypePackage#getnormalInterfaceDeclaration_InterfaceBody()
    * @model containment="true"
    * @generated
    */
   interfaceBody getInterfaceBody();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.normalInterfaceDeclaration#getInterfaceBody
    * <em>Interface Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Interface Body</em>' containment reference.
    * @see #getInterfaceBody()
    * @generated
    */
   void setInterfaceBody(interfaceBody value);

} // normalInterfaceDeclaration
