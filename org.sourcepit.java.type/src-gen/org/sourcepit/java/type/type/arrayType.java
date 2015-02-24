/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.arrayType#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.arrayType#getDims <em>Dims</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getarrayType()
 * @model
 * @generated
 */
public interface arrayType extends referenceType {
   /**
    * Returns the value of the '<em><b>Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type</em>' containment reference.
    * @see #setType(type)
    * @see org.sourcepit.java.type.type.TypePackage#getarrayType_Type()
    * @model containment="true"
    * @generated
    */
   type getType();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.arrayType#getType <em>Type</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type</em>' containment reference.
    * @see #getType()
    * @generated
    */
   void setType(type value);

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
    * @see org.sourcepit.java.type.type.TypePackage#getarrayType_Dims()
    * @model containment="true"
    * @generated
    */
   dims getDims();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.arrayType#getDims <em>Dims</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Dims</em>' containment reference.
    * @see #getDims()
    * @generated
    */
   void setDims(dims value);

} // arrayType
