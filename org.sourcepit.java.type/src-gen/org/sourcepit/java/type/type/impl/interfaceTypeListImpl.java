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
import org.sourcepit.java.type.type.interfaceType;
import org.sourcepit.java.type.type.interfaceTypeList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interface Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.interfaceTypeListImpl#getInterfaceTypes <em>Interface Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class interfaceTypeListImpl extends superinterfacesImpl implements interfaceTypeList {
   /**
    * The cached value of the '{@link #getInterfaceTypes() <em>Interface Types</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getInterfaceTypes()
    * @generated
    * @ordered
    */
   protected EList<interfaceType> interfaceTypes;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected interfaceTypeListImpl() {
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
      return TypePackage.Literals.INTERFACE_TYPE_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<interfaceType> getInterfaceTypes() {
      if (interfaceTypes == null) {
         interfaceTypes = new EObjectContainmentEList<interfaceType>(interfaceType.class, this,
            TypePackage.INTERFACE_TYPE_LIST__INTERFACE_TYPES);
      }
      return interfaceTypes;
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
         case TypePackage.INTERFACE_TYPE_LIST__INTERFACE_TYPES :
            return ((InternalEList<?>) getInterfaceTypes()).basicRemove(otherEnd, msgs);
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
         case TypePackage.INTERFACE_TYPE_LIST__INTERFACE_TYPES :
            return getInterfaceTypes();
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
         case TypePackage.INTERFACE_TYPE_LIST__INTERFACE_TYPES :
            getInterfaceTypes().clear();
            getInterfaceTypes().addAll((Collection<? extends interfaceType>) newValue);
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
         case TypePackage.INTERFACE_TYPE_LIST__INTERFACE_TYPES :
            getInterfaceTypes().clear();
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
         case TypePackage.INTERFACE_TYPE_LIST__INTERFACE_TYPES :
            return interfaceTypes != null && !interfaceTypes.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // interfaceTypeListImpl
