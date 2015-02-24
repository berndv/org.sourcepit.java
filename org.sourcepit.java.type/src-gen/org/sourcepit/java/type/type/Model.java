/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.ecore.EObject;
import org.sourcepit.java.literals.literals.literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.Model#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
    * @see #setType(literal)
    * @see org.sourcepit.java.type.type.TypePackage#getModel_Type()
    * @model containment="true"
    * @generated
    */
   literal getType();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.Model#getType <em>Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type</em>' containment reference.
    * @see #getType()
    * @generated
    */
   void setType(literal value);

} // Model
