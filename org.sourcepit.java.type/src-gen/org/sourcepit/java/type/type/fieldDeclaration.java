/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.fieldDeclaration#getFieldModifiers <em>Field Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.fieldDeclaration#getUnannType <em>Unann Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.fieldDeclaration#getVariableDeclaratorList <em>Variable Declarator List</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getfieldDeclaration()
 * @model
 * @generated
 */
public interface fieldDeclaration extends classMemberDeclaration {
   /**
    * Returns the value of the '<em><b>Field Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.fieldModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Field Modifiers</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Field Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getfieldDeclaration_FieldModifiers()
    * @model containment="true"
    * @generated
    */
   EList<fieldModifier> getFieldModifiers();

   /**
    * Returns the value of the '<em><b>Unann Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Unann Type</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Unann Type</em>' containment reference.
    * @see #setUnannType(unannType)
    * @see org.sourcepit.java.type.type.TypePackage#getfieldDeclaration_UnannType()
    * @model containment="true"
    * @generated
    */
   unannType getUnannType();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.fieldDeclaration#getUnannType <em>Unann Type</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Unann Type</em>' containment reference.
    * @see #getUnannType()
    * @generated
    */
   void setUnannType(unannType value);

   /**
    * Returns the value of the '<em><b>Variable Declarator List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Variable Declarator List</em>' containment reference isn't clear, there really should
    * be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Variable Declarator List</em>' containment reference.
    * @see #setVariableDeclaratorList(variableDeclaratorList)
    * @see org.sourcepit.java.type.type.TypePackage#getfieldDeclaration_VariableDeclaratorList()
    * @model containment="true"
    * @generated
    */
   variableDeclaratorList getVariableDeclaratorList();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.fieldDeclaration#getVariableDeclaratorList
    * <em>Variable Declarator List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Variable Declarator List</em>' containment reference.
    * @see #getVariableDeclaratorList()
    * @generated
    */
   void setVariableDeclaratorList(variableDeclaratorList value);

} // fieldDeclaration
