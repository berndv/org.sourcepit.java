/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Declarator List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.variableDeclaratorList#getVariableDeclarators <em>Variable Declarators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getvariableDeclaratorList()
 * @model
 * @generated
 */
public interface variableDeclaratorList extends EObject {
   /**
    * Returns the value of the '<em><b>Variable Declarators</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.variableDeclarator}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Variable Declarators</em>' containment reference list isn't clear, there really should
    * be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Variable Declarators</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getvariableDeclaratorList_VariableDeclarators()
    * @model containment="true"
    * @generated
    */
   EList<variableDeclarator> getVariableDeclarators();

} // variableDeclaratorList
