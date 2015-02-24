/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>annotation Type Element Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getAnnotationTypeElementModifiers <em>
 * Annotation Type Element Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getUnannType <em>Unann Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getDims <em>Dims</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeElementDeclaration()
 * @model
 * @generated
 */
public interface annotationTypeElementDeclaration extends annotationTypeMemberDeclaration {
   /**
    * Returns the value of the '<em><b>Annotation Type Element Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.annotationTypeElementModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Annotation Type Element Modifiers</em>' containment reference list isn't clear, there
    * really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Annotation Type Element Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeElementDeclaration_AnnotationTypeElementModifiers()
    * @model containment="true"
    * @generated
    */
   EList<annotationTypeElementModifier> getAnnotationTypeElementModifiers();

   /**
    * Returns the value of the '<em><b>Unann Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Unann Type</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Unann Type</em>' containment reference.
    * @see #setUnannType(unannType)
    * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeElementDeclaration_UnannType()
    * @model containment="true"
    * @generated
    */
   unannType getUnannType();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getUnannType
    * <em>Unann Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Unann Type</em>' containment reference.
    * @see #getUnannType()
    * @generated
    */
   void setUnannType(unannType value);

   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeElementDeclaration_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getName <em>Name</em>}
    * ' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Dims</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Dims</em>' containment reference.
    * @see #setDims(dims)
    * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeElementDeclaration_Dims()
    * @model containment="true"
    * @generated
    */
   dims getDims();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getDims <em>Dims</em>}
    * ' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Dims</em>' containment reference.
    * @see #getDims()
    * @generated
    */
   void setDims(dims value);

   /**
    * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Default Value</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Default Value</em>' containment reference.
    * @see #setDefaultValue(defaultValue)
    * @see org.sourcepit.java.type.type.TypePackage#getannotationTypeElementDeclaration_DefaultValue()
    * @model containment="true"
    * @generated
    */
   defaultValue getDefaultValue();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getDefaultValue
    * <em>Default Value</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Default Value</em>' containment reference.
    * @see #getDefaultValue()
    * @generated
    */
   void setDefaultValue(defaultValue value);

} // annotationTypeElementDeclaration
