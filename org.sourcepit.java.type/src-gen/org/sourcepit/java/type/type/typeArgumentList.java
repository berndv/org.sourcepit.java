/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Argument List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.typeArgumentList#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#gettypeArgumentList()
 * @model
 * @generated
 */
public interface typeArgumentList extends typeArguments {
   /**
    * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.typeArgument}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Arguments</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Arguments</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#gettypeArgumentList_TypeArguments()
    * @model containment="true"
    * @generated
    */
   EList<typeArgument> getTypeArguments();

} // typeArgumentList
