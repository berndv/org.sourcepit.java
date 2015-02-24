/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>method Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.methodHeader#getResult <em>Result</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.methodHeader#getMethodDeclarator <em>Method Declarator</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.methodHeader#getThrows_ <em>Throws </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.methodHeader#getTypeParameters <em>Type Parameters</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.methodHeader#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getmethodHeader()
 * @model
 * @generated
 */
public interface methodHeader extends EObject {
   /**
    * Returns the value of the '<em><b>Result</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Result</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Result</em>' containment reference.
    * @see #setResult(result)
    * @see org.sourcepit.java.type.type.TypePackage#getmethodHeader_Result()
    * @model containment="true"
    * @generated
    */
   result getResult();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.methodHeader#getResult <em>Result</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Result</em>' containment reference.
    * @see #getResult()
    * @generated
    */
   void setResult(result value);

   /**
    * Returns the value of the '<em><b>Method Declarator</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Method Declarator</em>' containment reference isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Method Declarator</em>' containment reference.
    * @see #setMethodDeclarator(methodDeclarator)
    * @see org.sourcepit.java.type.type.TypePackage#getmethodHeader_MethodDeclarator()
    * @model containment="true"
    * @generated
    */
   methodDeclarator getMethodDeclarator();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.methodHeader#getMethodDeclarator
    * <em>Method Declarator</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Method Declarator</em>' containment reference.
    * @see #getMethodDeclarator()
    * @generated
    */
   void setMethodDeclarator(methodDeclarator value);

   /**
    * Returns the value of the '<em><b>Throws </b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Throws </em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Throws </em>' containment reference.
    * @see #setThrows_(throws_)
    * @see org.sourcepit.java.type.type.TypePackage#getmethodHeader_Throws_()
    * @model containment="true"
    * @generated
    */
   throws_ getThrows_();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.methodHeader#getThrows_ <em>Throws </em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Throws </em>' containment reference.
    * @see #getThrows_()
    * @generated
    */
   void setThrows_(throws_ value);

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
    * @see org.sourcepit.java.type.type.TypePackage#getmethodHeader_TypeParameters()
    * @model containment="true"
    * @generated
    */
   typeParameters getTypeParameters();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.methodHeader#getTypeParameters
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
    * @see org.sourcepit.java.type.type.TypePackage#getmethodHeader_Annotations()
    * @model containment="true"
    * @generated
    */
   EList<annotation> getAnnotations();

} // methodHeader
