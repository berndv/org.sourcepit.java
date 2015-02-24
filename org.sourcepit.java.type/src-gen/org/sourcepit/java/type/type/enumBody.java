/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enum Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.enumBody#getEnumConstantList <em>Enum Constant List</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.enumBody#getEnumBodyDeclarations <em>Enum Body Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getenumBody()
 * @model
 * @generated
 */
public interface enumBody extends EObject {
   /**
    * Returns the value of the '<em><b>Enum Constant List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Enum Constant List</em>' containment reference isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Enum Constant List</em>' containment reference.
    * @see #setEnumConstantList(enumConstantList)
    * @see org.sourcepit.java.type.type.TypePackage#getenumBody_EnumConstantList()
    * @model containment="true"
    * @generated
    */
   enumConstantList getEnumConstantList();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.enumBody#getEnumConstantList
    * <em>Enum Constant List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Enum Constant List</em>' containment reference.
    * @see #getEnumConstantList()
    * @generated
    */
   void setEnumConstantList(enumConstantList value);

   /**
    * Returns the value of the '<em><b>Enum Body Declarations</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Enum Body Declarations</em>' containment reference isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Enum Body Declarations</em>' containment reference.
    * @see #setEnumBodyDeclarations(enumBodyDeclarations)
    * @see org.sourcepit.java.type.type.TypePackage#getenumBody_EnumBodyDeclarations()
    * @model containment="true"
    * @generated
    */
   enumBodyDeclarations getEnumBodyDeclarations();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.enumBody#getEnumBodyDeclarations
    * <em>Enum Body Declarations</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Enum Body Declarations</em>' containment reference.
    * @see #getEnumBodyDeclarations()
    * @generated
    */
   void setEnumBodyDeclarations(enumBodyDeclarations value);

} // enumBody
