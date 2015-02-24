/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.packageDeclaration#getModifiers <em>Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.packageDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getpackageDeclaration()
 * @model
 * @generated
 */
public interface packageDeclaration extends EObject {
   /**
    * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.packageModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getpackageDeclaration_Modifiers()
    * @model containment="true"
    * @generated
    */
   EList<packageModifier> getModifiers();

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
    * @see org.sourcepit.java.type.type.TypePackage#getpackageDeclaration_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.packageDeclaration#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

} // packageDeclaration
