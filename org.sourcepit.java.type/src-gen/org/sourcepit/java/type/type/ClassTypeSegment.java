/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.ClassTypeSegment#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.ClassTypeSegment#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getClassTypeSegment()
 * @model
 * @generated
 */
public interface ClassTypeSegment extends EObject {
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.sourcepit.java.type.type.TypePackage#getClassTypeSegment_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.ClassTypeSegment#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

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
    * @see org.sourcepit.java.type.type.TypePackage#getClassTypeSegment_TypeArguments()
    * @model containment="true"
    * @generated
    */
   typeArguments getTypeArguments();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.ClassTypeSegment#getTypeArguments
    * <em>Type Arguments</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type Arguments</em>' containment reference.
    * @see #getTypeArguments()
    * @generated
    */
   void setTypeArguments(typeArguments value);

} // ClassTypeSegment
