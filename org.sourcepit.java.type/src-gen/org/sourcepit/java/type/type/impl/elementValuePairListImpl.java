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
import org.sourcepit.java.type.type.elementValuePair;
import org.sourcepit.java.type.type.elementValuePairList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>element Value Pair List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.elementValuePairListImpl#getElementValuePairs <em>Element Value Pairs
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elementValuePairListImpl extends MinimalEObjectImpl.Container implements elementValuePairList {
   /**
    * The cached value of the '{@link #getElementValuePairs() <em>Element Value Pairs</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getElementValuePairs()
    * @generated
    * @ordered
    */
   protected EList<elementValuePair> elementValuePairs;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected elementValuePairListImpl() {
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
      return TypePackage.Literals.ELEMENT_VALUE_PAIR_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<elementValuePair> getElementValuePairs() {
      if (elementValuePairs == null) {
         elementValuePairs = new EObjectContainmentEList<elementValuePair>(elementValuePair.class, this,
            TypePackage.ELEMENT_VALUE_PAIR_LIST__ELEMENT_VALUE_PAIRS);
      }
      return elementValuePairs;
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
         case TypePackage.ELEMENT_VALUE_PAIR_LIST__ELEMENT_VALUE_PAIRS :
            return ((InternalEList<?>) getElementValuePairs()).basicRemove(otherEnd, msgs);
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
         case TypePackage.ELEMENT_VALUE_PAIR_LIST__ELEMENT_VALUE_PAIRS :
            return getElementValuePairs();
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
         case TypePackage.ELEMENT_VALUE_PAIR_LIST__ELEMENT_VALUE_PAIRS :
            getElementValuePairs().clear();
            getElementValuePairs().addAll((Collection<? extends elementValuePair>) newValue);
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
         case TypePackage.ELEMENT_VALUE_PAIR_LIST__ELEMENT_VALUE_PAIRS :
            getElementValuePairs().clear();
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
         case TypePackage.ELEMENT_VALUE_PAIR_LIST__ELEMENT_VALUE_PAIRS :
            return elementValuePairs != null && !elementValuePairs.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // elementValuePairListImpl
