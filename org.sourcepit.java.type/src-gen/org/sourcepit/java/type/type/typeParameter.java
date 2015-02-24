/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.typeParameter#getTypeParameterModifiers <em>Type Parameter Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.typeParameter#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.typeParameter#getTypeBound <em>Type Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#gettypeParameter()
 * @model
 * @generated
 */
public interface typeParameter extends EObject {
   /**
    * Returns the value of the '<em><b>Type Parameter Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.typeParameterModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Parameter Modifiers</em>' containment reference list isn't clear, there really
    * should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Parameter Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#gettypeParameter_TypeParameterModifiers()
    * @model containment="true"
    * @generated
    */
   EList<typeParameterModifier> getTypeParameterModifiers();

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
    * @see org.sourcepit.java.type.type.TypePackage#gettypeParameter_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.typeParameter#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Type Bound</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Bound</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Bound</em>' containment reference.
    * @see #setTypeBound(typeBound)
    * @see org.sourcepit.java.type.type.TypePackage#gettypeParameter_TypeBound()
    * @model containment="true"
    * @generated
    */
   typeBound getTypeBound();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.typeParameter#getTypeBound <em>Type Bound</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type Bound</em>' containment reference.
    * @see #getTypeBound()
    * @generated
    */
   void setTypeBound(typeBound value);

} // typeParameter
