/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.primitiveType#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.primitiveType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getprimitiveType()
 * @model
 * @generated
 */
public interface primitiveType extends type {
   /**
    * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.annotation}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Annotations</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getprimitiveType_Annotations()
    * @model containment="true"
    * @generated
    */
   EList<annotation> getAnnotations();

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
    * @see org.sourcepit.java.type.type.TypePackage#getprimitiveType_TypeName()
    * @model
    * @generated
    */
   String getTypeName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.primitiveType#getTypeName <em>Type Name</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type Name</em>' attribute.
    * @see #getTypeName()
    * @generated
    */
   void setTypeName(String value);

} // primitiveType
