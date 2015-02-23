/**
 */

package org.sourcepit.java.expressions.expressions;

import org.eclipse.emf.common.util.EList;
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
 * <li>{@link org.sourcepit.java.expressions.expressions.Model#getGreetings <em>Greetings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.expressions.expressions.ExpressionsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
   /**
    * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.literals.literals.literal}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Greetings</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Greetings</em>' containment reference list.
    * @see org.sourcepit.java.expressions.expressions.ExpressionsPackage#getModel_Greetings()
    * @model containment="true"
    * @generated
    */
   EList<literal> getGreetings();

} // Model
