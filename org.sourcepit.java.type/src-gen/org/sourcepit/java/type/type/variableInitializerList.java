/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Initializer List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.variableInitializerList#getVariableInitializer <em>Variable Initializer</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getvariableInitializerList()
 * @model
 * @generated
 */
public interface variableInitializerList extends EObject {
   /**
    * Returns the value of the '<em><b>Variable Initializer</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.variableInitializer}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Variable Initializer</em>' containment reference list isn't clear, there really should
    * be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Variable Initializer</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getvariableInitializerList_VariableInitializer()
    * @model containment="true"
    * @generated
    */
   EList<variableInitializer> getVariableInitializer();

} // variableInitializerList
