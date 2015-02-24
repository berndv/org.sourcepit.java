/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Declarator Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.variableDeclaratorId#getId <em>Id</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.variableDeclaratorId#getDims <em>Dims</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getvariableDeclaratorId()
 * @model
 * @generated
 */
public interface variableDeclaratorId extends EObject {
   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(String)
    * @see org.sourcepit.java.type.type.TypePackage#getvariableDeclaratorId_Id()
    * @model
    * @generated
    */
   String getId();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.variableDeclaratorId#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(String value);

   /**
    * Returns the value of the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Dims</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Dims</em>' containment reference.
    * @see #setDims(dims)
    * @see org.sourcepit.java.type.type.TypePackage#getvariableDeclaratorId_Dims()
    * @model containment="true"
    * @generated
    */
   dims getDims();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.variableDeclaratorId#getDims <em>Dims</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Dims</em>' containment reference.
    * @see #getDims()
    * @generated
    */
   void setDims(dims value);

} // variableDeclaratorId
