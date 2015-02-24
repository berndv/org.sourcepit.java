/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>element Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.elementValuePair#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.elementValuePair#getElementValue <em>Element Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getelementValuePair()
 * @model
 * @generated
 */
public interface elementValuePair extends EObject {
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
    * @see org.sourcepit.java.type.type.TypePackage#getelementValuePair_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.elementValuePair#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

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
    * @see org.sourcepit.java.type.type.TypePackage#getelementValuePair_ElementValue()
    * @model containment="true"
    * @generated
    */
   elementValue getElementValue();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.elementValuePair#getElementValue
    * <em>Element Value</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Element Value</em>' containment reference.
    * @see #getElementValue()
    * @generated
    */
   void setElementValue(elementValue value);

} // elementValuePair
