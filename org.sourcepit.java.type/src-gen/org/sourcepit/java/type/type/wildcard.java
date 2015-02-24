/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.wildcard#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.wildcard#getWildcardBounds <em>Wildcard Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.java.type.type.TypePackage#getwildcard()
 * @model
 * @generated
 */
public interface wildcard extends typeArgument {
   /**
    * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.java.type.type.annotation}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Annotations</em>' containment reference list.
    * @see org.sourcepit.java.type.type.TypePackage#getwildcard_Annotations()
    * @model containment="true"
    * @generated
    */
   EList<annotation> getAnnotations();

   /**
    * Returns the value of the '<em><b>Wildcard Bounds</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Wildcard Bounds</em>' containment reference isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Wildcard Bounds</em>' containment reference.
    * @see #setWildcardBounds(wildcardBounds)
    * @see org.sourcepit.java.type.type.TypePackage#getwildcard_WildcardBounds()
    * @model containment="true"
    * @generated
    */
   wildcardBounds getWildcardBounds();

   /**
    * Sets the value of the '{@link org.sourcepit.java.type.type.wildcard#getWildcardBounds <em>Wildcard Bounds</em>}'
    * containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Wildcard Bounds</em>' containment reference.
    * @see #getWildcardBounds()
    * @generated
    */
   void setWildcardBounds(wildcardBounds value);

} // wildcard
