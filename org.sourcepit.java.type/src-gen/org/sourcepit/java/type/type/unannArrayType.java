/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unann Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.unannArrayType#getDims <em>Dims</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getunannArrayType()
 * @model
 * @generated
 */
public interface unannArrayType extends unannReferenceType {
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
    * @see org.sourcepit.java.type.type.TypePackage#getunannArrayType_Dims()
    * @model containment="true"
    * @generated
    */
   dims getDims();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.unannArrayType#getDims <em>Dims</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Dims</em>' containment reference.
    * @see #getDims()
    * @generated
    */
   void setDims(dims value);

} // unannArrayType
