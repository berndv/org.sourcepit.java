/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dims</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.dims#getDims <em>Dims</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getdims()
 * @model
 * @generated
 */
public interface dims extends EObject {
   /**
    * Returns the value of the '<em><b>Dims</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.dim}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Dims</em>' containment reference list isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Dims</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getdims_Dims()
    * @model containment="true"
    * @generated
    */
   EList<dim> getDims();

} // dims
