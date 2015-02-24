/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enum Constant List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.enumConstantList#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getenumConstantList()
 * @model
 * @generated
 */
public interface enumConstantList extends EObject {
   /**
    * Returns the value of the '<em><b>Enum Constants</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.enumConstant}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Enum Constants</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Enum Constants</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getenumConstantList_EnumConstants()
    * @model containment="true"
    * @generated
    */
   EList<enumConstant> getEnumConstants();

} // enumConstantList
