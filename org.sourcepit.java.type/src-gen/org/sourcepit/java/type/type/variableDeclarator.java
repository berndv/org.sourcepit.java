/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.variableDeclarator#getId <em>Id</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.variableDeclarator#getInitializer <em>Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getvariableDeclarator()
 * @model
 * @generated
 */
public interface variableDeclarator extends EObject {
   /**
    * Returns the value of the '<em><b>Id</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Id</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Id</em>' containment reference.
    * @see #setId(variableDeclaratorId)
    * @see org.sourcepit.java.type.type.TypePackage#getvariableDeclarator_Id()
    * @model containment="true"
    * @generated
    */
   variableDeclaratorId getId();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.variableDeclarator#getId <em>Id</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Id</em>' containment reference.
    * @see #getId()
    * @generated
    */
   void setId(variableDeclaratorId value);

   /**
    * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Initializer</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Initializer</em>' containment reference.
    * @see #setInitializer(variableInitializer)
    * @see org.sourcepit.java.type.type.TypePackage#getvariableDeclarator_Initializer()
    * @model containment="true"
    * @generated
    */
   variableInitializer getInitializer();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.variableDeclarator#getInitializer <em>Initializer</em>}
    * ' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Initializer</em>' containment reference.
    * @see #getInitializer()
    * @generated
    */
   void setInitializer(variableInitializer value);

} // variableDeclarator
