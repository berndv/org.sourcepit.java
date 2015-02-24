/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interface Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.interfaceBody#getInterfaceMemberDeclarations <em>Interface Member
 * Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getinterfaceBody()
 * @model
 * @generated
 */
public interface interfaceBody extends EObject {
   /**
    * Returns the value of the '<em><b>Interface Member Declarations</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.interfaceMemberDeclaration}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Interface Member Declarations</em>' containment reference list isn't clear, there
    * really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Interface Member Declarations</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getinterfaceBody_InterfaceMemberDeclarations()
    * @model containment="true"
    * @generated
    */
   EList<interfaceMemberDeclaration> getInterfaceMemberDeclarations();

} // interfaceBody
