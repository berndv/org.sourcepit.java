/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.compilationUnit#getPackage <em>Package</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.compilationUnit#getImports <em>Imports</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.compilationUnit#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getcompilationUnit()
 * @model
 * @generated
 */
public interface compilationUnit extends EObject {
   /**
    * Returns the value of the '<em><b>Package</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Package</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Package</em>' containment reference.
    * @see #setPackage(packageDeclaration)
    * @see org.sourcepit.java.type.type.TypePackage#getcompilationUnit_Package()
    * @model containment="true"
    * @generated
    */
   packageDeclaration getPackage();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.compilationUnit#getPackage <em>Package</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Package</em>' containment reference.
    * @see #getPackage()
    * @generated
    */
   void setPackage(packageDeclaration value);

   /**
    * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.importDeclaration}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Imports</em>' containment reference list isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Imports</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getcompilationUnit_Imports()
    * @model containment="true"
    * @generated
    */
   EList<importDeclaration> getImports();

   /**
    * Returns the value of the '<em><b>Types</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.typeDeclaration}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Types</em>' containment reference list isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Types</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getcompilationUnit_Types()
    * @model containment="true"
    * @generated
    */
   EList<typeDeclaration> getTypes();

} // compilationUnit
