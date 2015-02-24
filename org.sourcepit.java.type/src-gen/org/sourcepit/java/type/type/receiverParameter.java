/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>receiver Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.receiverParameter#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.receiverParameter#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.receiverParameter#getQualifier <em>Qualifier</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.receiverParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getreceiverParameter()
 * @model
 * @generated
 */
public interface receiverParameter extends EObject {
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
    * @see org.sourcepit.java.type.type.TypePackage#getreceiverParameter_Annotations()
    * @model containment="true"
    * @generated
    */
   EList<annotation> getAnnotations();

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
    * @see #setType(unannType)
    * @see org.sourcepit.java.type.type.TypePackage#getreceiverParameter_Type()
    * @model containment="true"
    * @generated
    */
   unannType getType();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.receiverParameter#getType <em>Type</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type</em>' containment reference.
    * @see #getType()
    * @generated
    */
   void setType(unannType value);

   /**
    * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Qualifier</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Qualifier</em>' attribute.
    * @see #setQualifier(String)
    * @see org.sourcepit.java.type.type.TypePackage#getreceiverParameter_Qualifier()
    * @model
    * @generated
    */
   String getQualifier();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.receiverParameter#getQualifier <em>Qualifier</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Qualifier</em>' attribute.
    * @see #getQualifier()
    * @generated
    */
   void setQualifier(String value);

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
    * @see org.sourcepit.java.type.type.TypePackage#getreceiverParameter_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.receiverParameter#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

} // receiverParameter
