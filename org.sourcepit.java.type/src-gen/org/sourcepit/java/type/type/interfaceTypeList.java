/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interface Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.interfaceTypeList#getInterfaceTypes <em>Interface Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getinterfaceTypeList()
 * @model
 * @generated
 */
public interface interfaceTypeList extends superinterfaces, extendsInterfaces {
   /**
    * Returns the value of the '<em><b>Interface Types</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.interfaceType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Interface Types</em>' containment reference list isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Interface Types</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getinterfaceTypeList_InterfaceTypes()
    * @model containment="true"
    * @generated
    */
   EList<interfaceType> getInterfaceTypes();

} // interfaceTypeList
