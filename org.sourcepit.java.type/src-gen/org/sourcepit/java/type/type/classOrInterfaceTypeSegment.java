/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Or Interface Type Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getclassOrInterfaceTypeSegment()
 * @model
 * @generated
 */
public interface classOrInterfaceTypeSegment extends EObject {
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
    * @see org.sourcepit.java.type.type.TypePackage#getclassOrInterfaceTypeSegment_Annotations()
    * @model containment="true"
    * @generated
    */
   EList<annotation> getAnnotations();

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
    * @see org.sourcepit.java.type.type.TypePackage#getclassOrInterfaceTypeSegment_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getName <em>Name</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type Arguments</em>' containment reference isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type Arguments</em>' containment reference.
    * @see #setTypeArguments(typeArguments)
    * @see org.sourcepit.java.type.type.TypePackage#getclassOrInterfaceTypeSegment_TypeArguments()
    * @model containment="true"
    * @generated
    */
   typeArguments getTypeArguments();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getTypeArguments
    * <em>Type Arguments</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type Arguments</em>' containment reference.
    * @see #getTypeArguments()
    * @generated
    */
   void setTypeArguments(typeArguments value);

} // classOrInterfaceTypeSegment
