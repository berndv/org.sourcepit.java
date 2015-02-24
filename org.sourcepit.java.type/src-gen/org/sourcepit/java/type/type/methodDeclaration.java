/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.methodDeclaration#getMethodModifiers <em>Method Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.methodDeclaration#getMethodHeader <em>Method Header</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.methodDeclaration#getMethodBody <em>Method Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getmethodDeclaration()
 * @model
 * @generated
 */
public interface methodDeclaration extends classMemberDeclaration {
   /**
    * Returns the value of the '<em><b>Method Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.methodModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Method Modifiers</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Method Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getmethodDeclaration_MethodModifiers()
    * @model containment="true"
    * @generated
    */
   EList<methodModifier> getMethodModifiers();

   /**
    * Returns the value of the '<em><b>Method Header</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Method Header</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Method Header</em>' containment reference.
    * @see #setMethodHeader(methodHeader)
    * @see org.sourcepit.java.type.type.TypePackage#getmethodDeclaration_MethodHeader()
    * @model containment="true"
    * @generated
    */
   methodHeader getMethodHeader();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.methodDeclaration#getMethodHeader
    * <em>Method Header</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Method Header</em>' containment reference.
    * @see #getMethodHeader()
    * @generated
    */
   void setMethodHeader(methodHeader value);

   /**
    * Returns the value of the '<em><b>Method Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Method Body</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Method Body</em>' containment reference.
    * @see #setMethodBody(methodBody)
    * @see org.sourcepit.java.type.type.TypePackage#getmethodDeclaration_MethodBody()
    * @model containment="true"
    * @generated
    */
   methodBody getMethodBody();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.methodDeclaration#getMethodBody <em>Method Body</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Method Body</em>' containment reference.
    * @see #getMethodBody()
    * @generated
    */
   void setMethodBody(methodBody value);

} // methodDeclaration
