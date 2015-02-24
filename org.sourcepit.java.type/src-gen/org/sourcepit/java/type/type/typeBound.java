/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.typeBound#getTypeVariable <em>Type Variable</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.typeBound#getClassOrInterfaceType <em>Class Or Interface Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.typeBound#getAdditionalBound <em>Additional Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#gettypeBound()
 * @model
 * @generated
 */
public interface typeBound extends EObject {
   /**
    * Returns the value of the '<em><b>Type Variable</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Variable</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Variable</em>' containment reference.
    * @see #setTypeVariable(typeVariable)
    * @see org.sourcepit.java.type.type.TypePackage#gettypeBound_TypeVariable()
    * @model containment="true"
    * @generated
    */
   typeVariable getTypeVariable();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.typeBound#getTypeVariable <em>Type Variable</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type Variable</em>' containment reference.
    * @see #getTypeVariable()
    * @generated
    */
   void setTypeVariable(typeVariable value);

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
    * @see org.sourcepit.java.type.type.TypePackage#gettypeBound_ClassOrInterfaceType()
    * @model containment="true"
    * @generated
    */
   classOrInterfaceType getClassOrInterfaceType();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.typeBound#getClassOrInterfaceType
    * <em>Class Or Interface Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Class Or Interface Type</em>' containment reference.
    * @see #getClassOrInterfaceType()
    * @generated
    */
   void setClassOrInterfaceType(classOrInterfaceType value);

   /**
    * Returns the value of the '<em><b>Additional Bound</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.additionalBound}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Additional Bound</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Additional Bound</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#gettypeBound_AdditionalBound()
    * @model containment="true"
    * @generated
    */
   EList<additionalBound> getAdditionalBound();

} // typeBound
