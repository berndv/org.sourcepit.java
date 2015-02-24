/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>single Element Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.singleElementAnnotation#getElementValue <em>Element Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getsingleElementAnnotation()
 * @model
 * @generated
 */
public interface singleElementAnnotation extends annotation {
   /**
    * Returns the value of the '<em><b>Element Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Element Value</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Element Value</em>' containment reference.
    * @see #setElementValue(elementValue)
    * @see org.sourcepit.java.type.type.TypePackage#getsingleElementAnnotation_ElementValue()
    * @model containment="true"
    * @generated
    */
   elementValue getElementValue();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.singleElementAnnotation#getElementValue
    * <em>Element Value</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Element Value</em>' containment reference.
    * @see #getElementValue()
    * @generated
    */
   void setElementValue(elementValue value);

} // singleElementAnnotation
