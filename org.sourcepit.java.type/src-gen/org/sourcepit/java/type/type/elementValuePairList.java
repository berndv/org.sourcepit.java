/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>element Value Pair List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.elementValuePairList#getElementValuePairs <em>Element Value Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getelementValuePairList()
 * @model
 * @generated
 */
public interface elementValuePairList extends EObject {
   /**
    * Returns the value of the '<em><b>Element Value Pairs</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.elementValuePair}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Element Value Pairs</em>' containment reference list isn't clear, there really should
    * be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Element Value Pairs</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getelementValuePairList_ElementValuePairs()
    * @model containment="true"
    * @generated
    */
   EList<elementValuePair> getElementValuePairs();

} // elementValuePairList
