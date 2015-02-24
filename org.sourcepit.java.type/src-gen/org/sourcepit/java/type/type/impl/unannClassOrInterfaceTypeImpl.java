/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.dims;
import org.sourcepit.java.type.type.unannArrayType;
import org.sourcepit.java.type.type.unannClassOrInterfaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unann Class Or Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.unannClassOrInterfaceTypeImpl#getDims <em>Dims</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unannClassOrInterfaceTypeImpl extends unannReferenceTypeImpl implements unannClassOrInterfaceType {
   /**
    * The cached value of the '{@link #getDims() <em>Dims</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getDims()
    * @generated
    * @ordered
    */
   protected dims dims;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected unannClassOrInterfaceTypeImpl() {
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
      return TypePackage.Literals.UNANN_CLASS_OR_INTERFACE_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public dims getDims() {
      return dims;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetDims(dims newDims, NotificationChain msgs) {
      dims oldDims = dims;
      dims = newDims;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS, oldDims, newDims);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setDims(dims newDims) {
      if (newDims != dims) {
         NotificationChain msgs = null;
         if (dims != null)
            msgs = ((InternalEObject) dims).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS, null, msgs);
         if (newDims != null)
            msgs = ((InternalEObject) newDims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS, null, msgs);
         msgs = basicSetDims(newDims, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS,
            newDims, newDims));
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
         case TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS :
            return basicSetDims(null, msgs);
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
         case TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS :
            return getDims();
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
         case TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS :
            setDims((dims) newValue);
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
         case TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS :
            setDims((dims) null);
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
         case TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS :
            return dims != null;
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
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == unannArrayType.class) {
         switch (derivedFeatureID) {
            case TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS :
               return TypePackage.UNANN_ARRAY_TYPE__DIMS;
            default :
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == unannArrayType.class) {
         switch (baseFeatureID) {
            case TypePackage.UNANN_ARRAY_TYPE__DIMS :
               return TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE__DIMS;
            default :
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} // unannClassOrInterfaceTypeImpl
