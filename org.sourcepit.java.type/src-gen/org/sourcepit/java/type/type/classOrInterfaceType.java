/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Or Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.classOrInterfaceType#getClassOrInterfaceTypeSegments <em>Class Or Interface
 * Type Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getclassOrInterfaceType()
 * @model
 * @generated
 */
public interface classOrInterfaceType extends referenceType {
   /**
    * Returns the value of the '<em><b>Class Or Interface Type Segments</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Class Or Interface Type Segments</em>' containment reference list isn't clear, there
    * really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Class Or Interface Type Segments</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getclassOrInterfaceType_ClassOrInterfaceTypeSegments()
    * @model containment="true"
    * @generated
    */
   EList<classOrInterfaceTypeSegment> getClassOrInterfaceTypeSegments();

} // classOrInterfaceType
