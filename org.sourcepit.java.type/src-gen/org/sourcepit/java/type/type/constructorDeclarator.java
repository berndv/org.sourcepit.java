/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constructor Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.constructorDeclarator#getTypeParameters <em>Type Parameters</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.constructorDeclarator#getSimpleTypeName <em>Simple Type Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.constructorDeclarator#getFormalParameterList <em>Formal Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getconstructorDeclarator()
 * @model
 * @generated
 */
public interface constructorDeclarator extends EObject {
   /**
    * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.typeParameters}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Parameters</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getconstructorDeclarator_TypeParameters()
    * @model containment="true"
    * @generated
    */
   EList<typeParameters> getTypeParameters();

   /**
    * Returns the value of the '<em><b>Simple Type Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Simple Type Name</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Simple Type Name</em>' attribute.
    * @see #setSimpleTypeName(String)
    * @see org.sourcepit.java.type.type.TypePackage#getconstructorDeclarator_SimpleTypeName()
    * @model
    * @generated
    */
   String getSimpleTypeName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.constructorDeclarator#getSimpleTypeName
    * <em>Simple Type Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Simple Type Name</em>' attribute.
    * @see #getSimpleTypeName()
    * @generated
    */
   void setSimpleTypeName(String value);

   /**
    * Returns the value of the '<em><b>Formal Parameter List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Formal Parameter List</em>' containment reference isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Formal Parameter List</em>' containment reference.
    * @see #setFormalParameterList(formalParameterList)
    * @see org.sourcepit.java.type.type.TypePackage#getconstructorDeclarator_FormalParameterList()
    * @model containment="true"
    * @generated
    */
   formalParameterList getFormalParameterList();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.constructorDeclarator#getFormalParameterList
    * <em>Formal Parameter List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Formal Parameter List</em>' containment reference.
    * @see #getFormalParameterList()
    * @generated
    */
   void setFormalParameterList(formalParameterList value);

} // constructorDeclarator
