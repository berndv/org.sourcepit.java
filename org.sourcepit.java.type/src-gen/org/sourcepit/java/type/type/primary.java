/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.primary#getDummy <em>Dummy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getprimary()
 * @model
 * @generated
 */
public interface primary extends EObject {
   /**
    * Returns the value of the '<em><b>Dummy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Dummy</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Dummy</em>' attribute.
    * @see #setDummy(String)
    * @see org.sourcepit.java.type.type.TypePackage#getprimary_Dummy()
    * @model
    * @generated
    */
   String getDummy();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.primary#getDummy <em>Dummy</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Dummy</em>' attribute.
    * @see #getDummy()
    * @generated
    */
   void setDummy(String value);

} // primary
