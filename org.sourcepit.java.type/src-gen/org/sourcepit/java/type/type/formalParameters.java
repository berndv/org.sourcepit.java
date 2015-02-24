/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>formal Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.formalParameters#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getformalParameters()
 * @model
 * @generated
 */
public interface formalParameters extends EObject {
   /**
    * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Parameters</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getformalParameters_Parameters()
    * @model containment="true"
    * @generated
    */
   EList<EObject> getParameters();

} // formalParameters
