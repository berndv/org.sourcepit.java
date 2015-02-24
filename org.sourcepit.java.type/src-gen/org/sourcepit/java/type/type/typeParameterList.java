/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.typeParameterList#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#gettypeParameterList()
 * @model
 * @generated
 */
public interface typeParameterList extends typeParameters {
   /**
    * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.typeParameter}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Parameters</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#gettypeParameterList_TypeParameters()
    * @model containment="true"
    * @generated
    */
   EList<typeParameter> getTypeParameters();

} // typeParameterList
