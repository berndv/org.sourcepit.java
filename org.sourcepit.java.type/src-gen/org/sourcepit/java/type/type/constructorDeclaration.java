/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constructor Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.constructorDeclaration#getConstructorModifiers <em>Constructor Modifiers
 * </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.constructorDeclaration#getConstructorDeclarator <em>Constructor Declarator
 * </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.constructorDeclaration#getThrows_ <em>Throws </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getconstructorDeclaration()
 * @model
 * @generated
 */
public interface constructorDeclaration extends classBodyDeclaration {
   /**
    * Returns the value of the '<em><b>Constructor Modifiers</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.constructorModifier}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constructor Modifiers</em>' containment reference list isn't clear, there really should
    * be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Constructor Modifiers</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getconstructorDeclaration_ConstructorModifiers()
    * @model containment="true"
    * @generated
    */
   EList<constructorModifier> getConstructorModifiers();

   /**
    * Returns the value of the '<em><b>Constructor Declarator</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Constructor Declarator</em>' containment reference isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Constructor Declarator</em>' containment reference.
    * @see #setConstructorDeclarator(constructorDeclarator)
    * @see org.sourcepit.java.type.type.TypePackage#getconstructorDeclaration_ConstructorDeclarator()
    * @model containment="true"
    * @generated
    */
   constructorDeclarator getConstructorDeclarator();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.constructorDeclaration#getConstructorDeclarator
    * <em>Constructor Declarator</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Constructor Declarator</em>' containment reference.
    * @see #getConstructorDeclarator()
    * @generated
    */
   void setConstructorDeclarator(constructorDeclarator value);

   /**
    * Returns the value of the '<em><b>Throws </b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Throws </em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Throws </em>' containment reference.
    * @see #setThrows_(throws_)
    * @see org.sourcepit.java.type.type.TypePackage#getconstructorDeclaration_Throws_()
    * @model containment="true"
    * @generated
    */
   throws_ getThrows_();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.constructorDeclaration#getThrows_ <em>Throws </em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Throws </em>' containment reference.
    * @see #getThrows_()
    * @generated
    */
   void setThrows_(throws_ value);

} // constructorDeclaration
