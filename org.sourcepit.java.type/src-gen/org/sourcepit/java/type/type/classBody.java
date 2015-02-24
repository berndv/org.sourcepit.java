/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.classBody#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getclassBody()
 * @model
 * @generated
 */
public interface classBody extends EObject {
   /**
    * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.classBodyDeclaration}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Declarations</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getclassBody_Declarations()
    * @model containment="true"
    * @generated
    */
   EList<classBodyDeclaration> getDeclarations();

} // classBody
