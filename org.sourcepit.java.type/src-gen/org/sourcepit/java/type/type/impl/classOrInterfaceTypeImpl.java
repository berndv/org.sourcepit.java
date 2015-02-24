/**
 */

package org.sourcepit.java.type.type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.classOrInterfaceType;
import org.sourcepit.java.type.type.classOrInterfaceTypeSegment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>class Or Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.classOrInterfaceTypeImpl#getClassOrInterfaceTypeSegments <em>Class Or
 * Interface Type Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class classOrInterfaceTypeImpl extends referenceTypeImpl implements classOrInterfaceType {
   /**
    * The cached value of the '{@link #getClassOrInterfaceTypeSegments() <em>Class Or Interface Type Segments</em>}'
    * containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getClassOrInterfaceTypeSegments()
    * @generated
    * @ordered
    */
   protected EList<classOrInterfaceTypeSegment> classOrInterfaceTypeSegments;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected classOrInterfaceTypeImpl() {
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
      return TypePackage.Literals.CLASS_OR_INTERFACE_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<classOrInterfaceTypeSegment> getClassOrInterfaceTypeSegments() {
      if (classOrInterfaceTypeSegments == null) {
         classOrInterfaceTypeSegments = new EObjectContainmentEList<classOrInterfaceTypeSegment>(
            classOrInterfaceTypeSegment.class, this,
            TypePackage.CLASS_OR_INTERFACE_TYPE__CLASS_OR_INTERFACE_TYPE_SEGMENTS);
      }
      return classOrInterfaceTypeSegments;
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
         case TypePackage.CLASS_OR_INTERFACE_TYPE__CLASS_OR_INTERFACE_TYPE_SEGMENTS :
            return ((InternalEList<?>) getClassOrInterfaceTypeSegments()).basicRemove(otherEnd, msgs);
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
         case TypePackage.CLASS_OR_INTERFACE_TYPE__CLASS_OR_INTERFACE_TYPE_SEGMENTS :
            return getClassOrInterfaceTypeSegments();
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
         case TypePackage.CLASS_OR_INTERFACE_TYPE__CLASS_OR_INTERFACE_TYPE_SEGMENTS :
            getClassOrInterfaceTypeSegments().clear();
            getClassOrInterfaceTypeSegments().addAll((Collection<? extends classOrInterfaceTypeSegment>) newValue);
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
         case TypePackage.CLASS_OR_INTERFACE_TYPE__CLASS_OR_INTERFACE_TYPE_SEGMENTS :
            getClassOrInterfaceTypeSegments().clear();
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
         case TypePackage.CLASS_OR_INTERFACE_TYPE__CLASS_OR_INTERFACE_TYPE_SEGMENTS :
            return classOrInterfaceTypeSegments != null && !classOrInterfaceTypeSegments.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // classOrInterfaceTypeImpl
