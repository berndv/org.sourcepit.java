/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>annotation Type Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.annotationTypeBody#getAnnotationTypeMemberDeclarations <em>Annotation Type
 * Member Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeBody()
 * @model
 * @generated
 */
public interface annotationTypeBody extends EObject {
   /**
    * Returns the value of the '<em><b>Annotation Type Member Declarations</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.annotationTypeMemberDeclaration}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Annotation Type Member Declarations</em>' containment reference list isn't clear, there
    * really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Annotation Type Member Declarations</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeBody_AnnotationTypeMemberDeclarations()
    * @model containment="true"
    * @generated
    */
   EList<annotationTypeMemberDeclaration> getAnnotationTypeMemberDeclarations();

} // annotationTypeBody
