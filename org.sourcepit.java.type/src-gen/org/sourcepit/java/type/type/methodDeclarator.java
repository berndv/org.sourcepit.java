/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>method Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.methodDeclarator#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.methodDeclarator#getParameters <em>Parameters</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.methodDeclarator#getDims_ <em>Dims </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getmethodDeclarator()
 * @model
 * @generated
 */
public interface methodDeclarator extends EObject {
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
    * @see org.sourcepit.java.type.type.TypePackage#getmethodDeclarator_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.methodDeclarator#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.formalParameterList}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Parameters</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getmethodDeclarator_Parameters()
    * @model containment="true"
    * @generated
    */
   EList<formalParameterList> getParameters();

   /**
    * Returns the value of the '<em><b>Dims </b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Dims </em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Dims </em>' containment reference.
    * @see #setDims_(dims)
    * @see org.sourcepit.java.type.type.TypePackage#getmethodDeclarator_Dims_()
    * @model containment="true"
    * @generated
    */
   dims getDims_();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.methodDeclarator#getDims_ <em>Dims </em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Dims </em>' containment reference.
    * @see #getDims_()
    * @generated
    */
   void setDims_(dims value);

} // methodDeclarator
