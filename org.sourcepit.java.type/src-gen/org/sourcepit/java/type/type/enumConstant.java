/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enum Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.enumConstant#getEnumConstantModifiers <em>Enum Constant Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.enumConstant#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.enumConstant#getArgumentList <em>Argument List</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.enumConstant#getClassBody <em>Class Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getenumConstant()
 * @model
 * @generated
 */
public interface enumConstant extends EObject {
   /**
    * Returns the value of the '<em><b>Enum Constant Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.enumConstantModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Enum Constant Modifiers</em>' containment reference list isn't clear, there really
    * should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Enum Constant Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getenumConstant_EnumConstantModifiers()
    * @model containment="true"
    * @generated
    */
   EList<enumConstantModifier> getEnumConstantModifiers();

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
    * @see org.sourcepit.java.type.type.TypePackage#getenumConstant_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.enumConstant#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Argument List</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Argument List</em>' containment reference.
    * @see #setArgumentList(argumentList)
    * @see org.sourcepit.java.type.type.TypePackage#getenumConstant_ArgumentList()
    * @model containment="true"
    * @generated
    */
   argumentList getArgumentList();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.enumConstant#getArgumentList <em>Argument List</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Argument List</em>' containment reference.
    * @see #getArgumentList()
    * @generated
    */
   void setArgumentList(argumentList value);

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
    * @see org.sourcepit.java.type.type.TypePackage#getenumConstant_ClassBody()
    * @model containment="true"
    * @generated
    */
   classBody getClassBody();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.enumConstant#getClassBody <em>Class Body</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Class Body</em>' containment reference.
    * @see #getClassBody()
    * @generated
    */
   void setClassBody(classBody value);

} // enumConstant
