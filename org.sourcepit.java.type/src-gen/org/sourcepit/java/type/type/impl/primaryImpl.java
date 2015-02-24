/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.primary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>primary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.primaryImpl#getDummy <em>Dummy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class primaryImpl extends MinimalEObjectImpl.Container implements primary {
   /**
    * The default value of the '{@link #getDummy() <em>Dummy</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getDummy()
    * @generated
    * @ordered
    */
   protected static final String DUMMY_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getDummy() <em>Dummy</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getDummy()
    * @generated
    * @ordered
    */
   protected String dummy = DUMMY_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected primaryImpl() {
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
      return TypePackage.Literals.PRIMARY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getDummy() {
      return dummy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setDummy(String newDummy) {
      String oldDummy = dummy;
      dummy = newDummy;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PRIMARY__DUMMY, oldDummy, dummy));
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
         case TypePackage.PRIMARY__DUMMY :
            return getDummy();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case TypePackage.PRIMARY__DUMMY :
            setDummy((String) newValue);
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
         case TypePackage.PRIMARY__DUMMY :
            setDummy(DUMMY_EDEFAULT);
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
         case TypePackage.PRIMARY__DUMMY :
            return DUMMY_EDEFAULT == null ? dummy != null : !DUMMY_EDEFAULT.equals(dummy);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (dummy: ");
      result.append(dummy);
      result.append(')');
      return result.toString();
   }

} // primaryImpl
