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
import org.sourcepit.java.type.type.elementValue;
import org.sourcepit.java.type.type.elementValueList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>element Value List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.elementValueListImpl#getElementValues <em>Element Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elementValueListImpl extends MinimalEObjectImpl.Container implements elementValueList {
   /**
    * The cached value of the '{@link #getElementValues() <em>Element Values</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getElementValues()
    * @generated
    * @ordered
    */
   protected EList<elementValue> elementValues;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected elementValueListImpl() {
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
      return TypePackage.Literals.ELEMENT_VALUE_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<elementValue> getElementValues() {
      if (elementValues == null) {
         elementValues = new EObjectContainmentEList<elementValue>(elementValue.class, this,
            TypePackage.ELEMENT_VALUE_LIST__ELEMENT_VALUES);
      }
      return elementValues;
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
         case TypePackage.ELEMENT_VALUE_LIST__ELEMENT_VALUES :
            return ((InternalEList<?>) getElementValues()).basicRemove(otherEnd, msgs);
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
         case TypePackage.ELEMENT_VALUE_LIST__ELEMENT_VALUES :
            return getElementValues();
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
         case TypePackage.ELEMENT_VALUE_LIST__ELEMENT_VALUES :
            getElementValues().clear();
            getElementValues().addAll((Collection<? extends elementValue>) newValue);
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
         case TypePackage.ELEMENT_VALUE_LIST__ELEMENT_VALUES :
            getElementValues().clear();
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
         case TypePackage.ELEMENT_VALUE_LIST__ELEMENT_VALUES :
            return elementValues != null && !elementValues.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // elementValueListImpl
