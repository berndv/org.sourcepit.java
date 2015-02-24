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
import org.sourcepit.java.type.type.exceptionType;
import org.sourcepit.java.type.type.exceptionTypeList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>exception Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.exceptionTypeListImpl#getExceptionTypes <em>Exception Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class exceptionTypeListImpl extends throws_Impl implements exceptionTypeList {
   /**
    * The cached value of the '{@link #getExceptionTypes() <em>Exception Types</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getExceptionTypes()
    * @generated
    * @ordered
    */
   protected EList<exceptionType> exceptionTypes;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected exceptionTypeListImpl() {
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
      return TypePackage.Literals.EXCEPTION_TYPE_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<exceptionType> getExceptionTypes() {
      if (exceptionTypes == null) {
         exceptionTypes = new EObjectContainmentEList<exceptionType>(exceptionType.class, this,
            TypePackage.EXCEPTION_TYPE_LIST__EXCEPTION_TYPES);
      }
      return exceptionTypes;
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
         case TypePackage.EXCEPTION_TYPE_LIST__EXCEPTION_TYPES :
            return ((InternalEList<?>) getExceptionTypes()).basicRemove(otherEnd, msgs);
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
         case TypePackage.EXCEPTION_TYPE_LIST__EXCEPTION_TYPES :
            return getExceptionTypes();
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
         case TypePackage.EXCEPTION_TYPE_LIST__EXCEPTION_TYPES :
            getExceptionTypes().clear();
            getExceptionTypes().addAll((Collection<? extends exceptionType>) newValue);
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
         case TypePackage.EXCEPTION_TYPE_LIST__EXCEPTION_TYPES :
            getExceptionTypes().clear();
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
         case TypePackage.EXCEPTION_TYPE_LIST__EXCEPTION_TYPES :
            return exceptionTypes != null && !exceptionTypes.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // exceptionTypeListImpl
