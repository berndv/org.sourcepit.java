/**
 */

package org.sourcepit.java.type.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>array Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.arrayInitializer#getVariableInitializerList <em>Variable Initializer List
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getarrayInitializer()
 * @model
 * @generated
 */
public interface arrayInitializer extends variableInitializer {
   /**
    * Returns the value of the '<em><b>Variable Initializer List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Variable Initializer List</em>' containment reference isn't clear, there really should
    * be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Variable Initializer List</em>' containment reference.
    * @see #setVariableInitializerList(variableInitializerList)
    * @see org.sourcepit.java.type.type.TypePackage#getarrayInitializer_VariableInitializerList()
    * @model containment="true"
    * @generated
    */
   variableInitializerList getVariableInitializerList();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.arrayInitializer#getVariableInitializerList
    * <em>Variable Initializer List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Variable Initializer List</em>' containment reference.
    * @see #getVariableInitializerList()
    * @generated
    */
   void setVariableInitializerList(variableInitializerList value);

} // arrayInitializer
