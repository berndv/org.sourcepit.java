/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Annotation Type Element Modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.JavaAnnotationTypeElementModifiers#getModifier <em>Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getJavaAnnotationTypeElementModifiers()
 * @model
 * @generated
 */
public interface JavaAnnotationTypeElementModifiers extends annotationTypeElementModifier {
   /**
    * Returns the value of the '<em><b>Modifier</b></em>' attribute.
    * The literals are from the enumeration {@link org.sourcepit.java.type.type.AnnotationTypeElementModifiers}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modifier</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Modifier</em>' attribute.
    * @see org.sourcepit.java.type.type.AnnotationTypeElementModifiers
    * @see #setModifier(AnnotationTypeElementModifiers)
    * @see org.sourcepit.java.type.type.TypePackage#getJavaAnnotationTypeElementModifiers_Modifier()
    * @model
    * @generated
    */
   AnnotationTypeElementModifiers getModifier();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.JavaAnnotationTypeElementModifiers#getModifier
    * <em>Modifier</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Modifier</em>' attribute.
    * @see org.sourcepit.java.type.type.AnnotationTypeElementModifiers
    * @see #getModifier()
    * @generated
    */
   void setModifier(AnnotationTypeElementModifiers value);

} // JavaAnnotationTypeElementModifiers
