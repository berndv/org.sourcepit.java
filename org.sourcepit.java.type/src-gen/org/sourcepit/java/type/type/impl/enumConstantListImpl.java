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
import org.sourcepit.java.type.type.enumConstant;
import org.sourcepit.java.type.type.enumConstantList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enum Constant List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.enumConstantListImpl#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enumConstantListImpl extends MinimalEObjectImpl.Container implements enumConstantList {
   /**
    * The cached value of the '{@link #getEnumConstants() <em>Enum Constants</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getEnumConstants()
    * @generated
    * @ordered
    */
   protected EList<enumConstant> enumConstants;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected enumConstantListImpl() {
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
      return TypePackage.Literals.ENUM_CONSTANT_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<enumConstant> getEnumConstants() {
      if (enumConstants == null) {
         enumConstants = new EObjectContainmentEList<enumConstant>(enumConstant.class, this,
            TypePackage.ENUM_CONSTANT_LIST__ENUM_CONSTANTS);
      }
      return enumConstants;
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
         case TypePackage.ENUM_CONSTANT_LIST__ENUM_CONSTANTS :
            return ((InternalEList<?>) getEnumConstants()).basicRemove(otherEnd, msgs);
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
         case TypePackage.ENUM_CONSTANT_LIST__ENUM_CONSTANTS :
            return getEnumConstants();
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
         case TypePackage.ENUM_CONSTANT_LIST__ENUM_CONSTANTS :
            getEnumConstants().clear();
            getEnumConstants().addAll((Collection<? extends enumConstant>) newValue);
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
         case TypePackage.ENUM_CONSTANT_LIST__ENUM_CONSTANTS :
            getEnumConstants().clear();
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
         case TypePackage.ENUM_CONSTANT_LIST__ENUM_CONSTANTS :
            return enumConstants != null && !enumConstants.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // enumConstantListImpl
