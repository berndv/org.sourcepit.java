/**
 */

package org.sourcepit.java.type.type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.annotationTypeBody;
import org.sourcepit.java.type.type.annotationTypeMemberDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>annotation Type Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.annotationTypeBodyImpl#getAnnotationTypeMemberDeclarations <em>
 * Annotation Type Member Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class annotationTypeBodyImpl extends MinimalEObjectImpl.Container implements annotationTypeBody {
   /**
    * The cached value of the '{@link #getAnnotationTypeMemberDeclarations()
    * <em>Annotation Type Member Declarations</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getAnnotationTypeMemberDeclarations()
    * @generated
    * @ordered
    */
   protected EList<annotationTypeMemberDeclaration> annotationTypeMemberDeclarations;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected annotationTypeBodyImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return TypePackage.Literals.ANNOTATION_TYPE_BODY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<annotationTypeMemberDeclaration> getAnnotationTypeMemberDeclarations() {
      if (annotationTypeMemberDeclarations == null) {
         annotationTypeMemberDeclarations = new EObjectContainmentEList<annotationTypeMemberDeclaration>(
            annotationTypeMemberDeclaration.class, this,
            TypePackage.ANNOTATION_TYPE_BODY__ANNOTATION_TYPE_MEMBER_DECLARATIONS);
      }
      return annotationTypeMemberDeclarations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case TypePackage.ANNOTATION_TYPE_BODY__ANNOTATION_TYPE_MEMBER_DECLARATIONS :
            return ((InternalEList<?>) getAnnotationTypeMemberDeclarations()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case TypePackage.ANNOTATION_TYPE_BODY__ANNOTATION_TYPE_MEMBER_DECLARATIONS :
            return getAnnotationTypeMemberDeclarations();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case TypePackage.ANNOTATION_TYPE_BODY__ANNOTATION_TYPE_MEMBER_DECLARATIONS :
            getAnnotationTypeMemberDeclarations().clear();
            getAnnotationTypeMemberDeclarations().addAll(
               (Collection<? extends annotationTypeMemberDeclaration>) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case TypePackage.ANNOTATION_TYPE_BODY__ANNOTATION_TYPE_MEMBER_DECLARATIONS :
            getAnnotationTypeMemberDeclarations().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case TypePackage.ANNOTATION_TYPE_BODY__ANNOTATION_TYPE_MEMBER_DECLARATIONS :
            return annotationTypeMemberDeclarations != null && !annotationTypeMemberDeclarations.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // annotationTypeBodyImpl
