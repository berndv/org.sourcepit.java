/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.dims;
import org.sourcepit.java.type.type.variableDeclaratorId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable Declarator Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.variableDeclaratorIdImpl#getId <em>Id</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.variableDeclaratorIdImpl#getDims <em>Dims</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variableDeclaratorIdImpl extends MinimalEObjectImpl.Container implements variableDeclaratorId {
   /**
    * The default value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getId()
    * @generated
    * @ordered
    */
   protected static final String ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getId()
    * @generated
    * @ordered
    */
   protected String id = ID_EDEFAULT;

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
   protected variableDeclaratorIdImpl() {
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
      return TypePackage.Literals.VARIABLE_DECLARATOR_ID;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getId() {
      return id;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setId(String newId) {
      String oldId = id;
      id = newId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.VARIABLE_DECLARATOR_ID__ID, oldId, id));
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
            TypePackage.VARIABLE_DECLARATOR_ID__DIMS, oldDims, newDims);
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
               - TypePackage.VARIABLE_DECLARATOR_ID__DIMS, null, msgs);
         if (newDims != null)
            msgs = ((InternalEObject) newDims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.VARIABLE_DECLARATOR_ID__DIMS, null, msgs);
         msgs = basicSetDims(newDims, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.VARIABLE_DECLARATOR_ID__DIMS, newDims,
            newDims));
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
         case TypePackage.VARIABLE_DECLARATOR_ID__DIMS :
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
         case TypePackage.VARIABLE_DECLARATOR_ID__ID :
            return getId();
         case TypePackage.VARIABLE_DECLARATOR_ID__DIMS :
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
         case TypePackage.VARIABLE_DECLARATOR_ID__ID :
            setId((String) newValue);
            return;
         case TypePackage.VARIABLE_DECLARATOR_ID__DIMS :
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
         case TypePackage.VARIABLE_DECLARATOR_ID__ID :
            setId(ID_EDEFAULT);
            return;
         case TypePackage.VARIABLE_DECLARATOR_ID__DIMS :
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
         case TypePackage.VARIABLE_DECLARATOR_ID__ID :
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
         case TypePackage.VARIABLE_DECLARATOR_ID__DIMS :
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
   public String toString() {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (id: ");
      result.append(id);
      result.append(')');
      return result.toString();
   }

} // variableDeclaratorIdImpl
