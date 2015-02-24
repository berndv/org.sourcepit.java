/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.annotation#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getannotation()
 * @model
 * @generated
 */
public interface annotation
   extends
      typeParameterModifier,
      packageModifier,
      classModifier,
      fieldModifier,
      methodModifier,
      variableModifier,
      constructorModifier,
      enumConstantModifier,
      interfaceModifier,
      constantModifier,
      interfaceMethodModifier,
      annotationTypeElementModifier,
      elementValue {
   /**
    * Returns the value of the '<em><b>Type Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Name</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Name</em>' attribute.
    * @see #setTypeName(String)
    * @see org.sourcepit.java.type.type.TypePackage#getannotation_TypeName()
    * @model
    * @generated
    */
   String getTypeName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.annotation#getTypeName <em>Type Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type Name</em>' attribute.
    * @see #getTypeName()
    * @generated
    */
   void setTypeName(String value);

} // annotation
