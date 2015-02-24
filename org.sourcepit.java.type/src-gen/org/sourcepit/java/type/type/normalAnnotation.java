/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>normal Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.normalAnnotation#getElementValuePairList <em>Element Value Pair List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getnormalAnnotation()
 * @model
 * @generated
 */
public interface normalAnnotation extends annotation {
   /**
    * Returns the value of the '<em><b>Element Value Pair List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Element Value Pair List</em>' containment reference isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Element Value Pair List</em>' containment reference.
    * @see #setElementValuePairList(elementValuePairList)
    * @see org.sourcepit.java.type.type.TypePackage#getnormalAnnotation_ElementValuePairList()
    * @model containment="true"
    * @generated
    */
   elementValuePairList getElementValuePairList();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.normalAnnotation#getElementValuePairList
    * <em>Element Value Pair List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Element Value Pair List</em>' containment reference.
    * @see #getElementValuePairList()
    * @generated
    */
   void setElementValuePairList(elementValuePairList value);

} // normalAnnotation
