/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>last Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.lastFormalParameter#getModifiers <em>Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.lastFormalParameter#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.lastFormalParameter#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.lastFormalParameter#isVarargs <em>Varargs</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.lastFormalParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getlastFormalParameter()
 * @model
 * @generated
 */
public interface lastFormalParameter extends EObject {
   /**
    * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.variableModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getlastFormalParameter_Modifiers()
    * @model containment="true"
    * @generated
    */
   EList<variableModifier> getModifiers();

   /**
    * Returns the value of the '<em><b>Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type</em>' containment reference.
    * @see #setType(unannType)
    * @see org.sourcepit.java.type.type.TypePackage#getlastFormalParameter_Type()
    * @model containment="true"
    * @generated
    */
   unannType getType();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.lastFormalParameter#getType <em>Type</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type</em>' containment reference.
    * @see #getType()
    * @generated
    */
   void setType(unannType value);

   /**
    * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.annotation}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Annotations</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getlastFormalParameter_Annotations()
    * @model containment="true"
    * @generated
    */
   EList<annotation> getAnnotations();

   /**
    * Returns the value of the '<em><b>Varargs</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Varargs</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Varargs</em>' attribute.
    * @see #setVarargs(boolean)
    * @see org.sourcepit.java.type.type.TypePackage#getlastFormalParameter_Varargs()
    * @model
    * @generated
    */
   boolean isVarargs();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.lastFormalParameter#isVarargs <em>Varargs</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Varargs</em>' attribute.
    * @see #isVarargs()
    * @generated
    */
   void setVarargs(boolean value);

   /**
    * Returns the value of the '<em><b>Name</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Name</em>' containment reference.
    * @see #setName(variableDeclaratorId)
    * @see org.sourcepit.java.type.type.TypePackage#getlastFormalParameter_Name()
    * @model containment="true"
    * @generated
    */
   variableDeclaratorId getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.lastFormalParameter#getName <em>Name</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' containment reference.
    * @see #getName()
    * @generated
    */
   void setName(variableDeclaratorId value);

} // lastFormalParameter
