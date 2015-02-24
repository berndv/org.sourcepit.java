/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>element Value Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.elementValueArrayInitializer#getElementValueList <em>Element Value List</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getelementValueArrayInitializer()
 * @model
 * @generated
 */
public interface elementValueArrayInitializer extends elementValue {
   /**
    * Returns the value of the '<em><b>Element Value List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Element Value List</em>' containment reference isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Element Value List</em>' containment reference.
    * @see #setElementValueList(elementValueList)
    * @see org.sourcepit.java.type.type.TypePackage#getelementValueArrayInitializer_ElementValueList()
    * @model containment="true"
    * @generated
    */
   elementValueList getElementValueList();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.elementValueArrayInitializer#getElementValueList
    * <em>Element Value List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Element Value List</em>' containment reference.
    * @see #getElementValueList()
    * @generated
    */
   void setElementValueList(elementValueList value);

} // elementValueArrayInitializer
