/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unann Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.unannClassType#getClassTypeSegment <em>Class Type Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getunannClassType()
 * @model
 * @generated
 */
public interface unannClassType extends unannClassOrInterfaceType, unannInterfaceType {
   /**
    * Returns the value of the '<em><b>Class Type Segment</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Class Type Segment</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Class Type Segment</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getunannClassType_ClassTypeSegment()
    * @model containment="true"
    * @generated
    */
   EList<EObject> getClassTypeSegment();

} // unannClassType
