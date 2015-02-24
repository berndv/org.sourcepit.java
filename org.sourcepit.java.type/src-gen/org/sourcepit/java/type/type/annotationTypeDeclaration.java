/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>annotation Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.annotationTypeDeclaration#getAnnotationTypeBody <em>Annotation Type Body
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeDeclaration()
 * @model
 * @generated
 */
public interface annotationTypeDeclaration extends interfaceDeclaration {
   /**
    * Returns the value of the '<em><b>Annotation Type Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Annotation Type Body</em>' containment reference isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Annotation Type Body</em>' containment reference.
    * @see #setAnnotationTypeBody(annotationTypeBody)
    * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeDeclaration_AnnotationTypeBody()
    * @model containment="true"
    * @generated
    */
   annotationTypeBody getAnnotationTypeBody();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.annotationTypeDeclaration#getAnnotationTypeBody
    * <em>Annotation Type Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Annotation Type Body</em>' containment reference.
    * @see #getAnnotationTypeBody()
    * @generated
    */
   void setAnnotationTypeBody(annotationTypeBody value);

} // annotationTypeDeclaration
