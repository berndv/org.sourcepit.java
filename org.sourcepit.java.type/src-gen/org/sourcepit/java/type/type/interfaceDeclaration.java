/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.interfaceDeclaration#getInterfaceModifiers <em>Interface Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.interfaceDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getinterfaceDeclaration()
 * @model
 * @generated
 */
public interface interfaceDeclaration
   extends
      typeDeclaration,
      classMemberDeclaration,
      interfaceMemberDeclaration,
      annotationTypeMemberDeclaration {
   /**
    * Returns the value of the '<em><b>Interface Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.interfaceModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Interface Modifiers</em>' containment reference list isn't clear, there really should
    * be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Interface Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getinterfaceDeclaration_InterfaceModifiers()
    * @model containment="true"
    * @generated
    */
   EList<interfaceModifier> getInterfaceModifiers();

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
    * @see org.sourcepit.java.type.type.TypePackage#getinterfaceDeclaration_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.interfaceDeclaration#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

} // interfaceDeclaration
