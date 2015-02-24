/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.classDeclaration#getModifiers <em>Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.classDeclaration#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.classDeclaration#getSuperinterfaces <em>Superinterfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getclassDeclaration()
 * @model
 * @generated
 */
public interface classDeclaration
   extends
      typeDeclaration,
      classMemberDeclaration,
      interfaceMemberDeclaration,
      annotationTypeMemberDeclaration {
   /**
    * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.classModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getclassDeclaration_Modifiers()
    * @model containment="true"
    * @generated
    */
   EList<classModifier> getModifiers();

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
    * @see org.sourcepit.java.type.type.TypePackage#getclassDeclaration_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.classDeclaration#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Superinterfaces</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Superinterfaces</em>' containment reference isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Superinterfaces</em>' containment reference.
    * @see #setSuperinterfaces(superinterfaces)
    * @see org.sourcepit.java.type.type.TypePackage#getclassDeclaration_Superinterfaces()
    * @model containment="true"
    * @generated
    */
   superinterfaces getSuperinterfaces();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.classDeclaration#getSuperinterfaces
    * <em>Superinterfaces</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Superinterfaces</em>' containment reference.
    * @see #getSuperinterfaces()
    * @generated
    */
   void setSuperinterfaces(superinterfaces value);

} // classDeclaration
