/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exception Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.exceptionTypeList#getExceptionTypes <em>Exception Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getexceptionTypeList()
 * @model
 * @generated
 */
public interface exceptionTypeList extends throws_ {
   /**
    * Returns the value of the '<em><b>Exception Types</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.exceptionType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Exception Types</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Exception Types</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getexceptionTypeList_ExceptionTypes()
    * @model containment="true"
    * @generated
    */
   EList<exceptionType> getExceptionTypes();

} // exceptionTypeList
