/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.arrayType;
import org.sourcepit.java.type.type.dims;
import org.sourcepit.java.type.type.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.arrayTypeImpl#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.arrayTypeImpl#getDims <em>Dims</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class arrayTypeImpl extends referenceTypeImpl implements arrayType {
   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getType()
    * @generated
    * @ordered
    */
   protected type type;

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
   protected arrayTypeImpl() {
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
      return TypePackage.Literals.ARRAY_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public type getType() {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetType(type newType, NotificationChain msgs) {
      type oldType = type;
      type = newType;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.ARRAY_TYPE__TYPE,
            oldType, newType);
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
   public void setType(type newType) {
      if (newType != type) {
         NotificationChain msgs = null;
         if (type != null)
            msgs = ((InternalEObject) type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.ARRAY_TYPE__TYPE,
               null, msgs);
         if (newType != null)
            msgs = ((InternalEObject) newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.ARRAY_TYPE__TYPE,
               null, msgs);
         msgs = basicSetType(newType, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ARRAY_TYPE__TYPE, newType, newType));
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
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.ARRAY_TYPE__DIMS,
            oldDims, newDims);
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
            msgs = ((InternalEObject) dims).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.ARRAY_TYPE__DIMS,
               null, msgs);
         if (newDims != null)
            msgs = ((InternalEObject) newDims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.ARRAY_TYPE__DIMS,
               null, msgs);
         msgs = basicSetDims(newDims, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ARRAY_TYPE__DIMS, newDims, newDims));
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
         case TypePackage.ARRAY_TYPE__TYPE :
            return basicSetType(null, msgs);
         case TypePackage.ARRAY_TYPE__DIMS :
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
         case TypePackage.ARRAY_TYPE__TYPE :
            return getType();
         case TypePackage.ARRAY_TYPE__DIMS :
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
         case TypePackage.ARRAY_TYPE__TYPE :
            setType((type) newValue);
            return;
         case TypePackage.ARRAY_TYPE__DIMS :
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
         case TypePackage.ARRAY_TYPE__TYPE :
            setType((type) null);
            return;
         case TypePackage.ARRAY_TYPE__DIMS :
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
         case TypePackage.ARRAY_TYPE__TYPE :
            return type != null;
         case TypePackage.ARRAY_TYPE__DIMS :
            return dims != null;
      }
      return super.eIsSet(featureID);
   }

} // arrayTypeImpl
