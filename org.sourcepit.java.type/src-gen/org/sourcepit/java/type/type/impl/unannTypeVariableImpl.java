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
import org.sourcepit.java.type.type.unannTypeVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unann Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.unannTypeVariableImpl#getDims <em>Dims</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.unannTypeVariableImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unannTypeVariableImpl extends unannReferenceTypeImpl implements unannTypeVariable {
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
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected unannTypeVariableImpl() {
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
      return TypePackage.Literals.UNANN_TYPE_VARIABLE;
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
            TypePackage.UNANN_TYPE_VARIABLE__DIMS, oldDims, newDims);
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
               - TypePackage.UNANN_TYPE_VARIABLE__DIMS, null, msgs);
         if (newDims != null)
            msgs = ((InternalEObject) newDims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.UNANN_TYPE_VARIABLE__DIMS, null, msgs);
         msgs = basicSetDims(newDims, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.UNANN_TYPE_VARIABLE__DIMS, newDims, newDims));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getName() {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setName(String newName) {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.UNANN_TYPE_VARIABLE__NAME, oldName, name));
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
         case TypePackage.UNANN_TYPE_VARIABLE__DIMS :
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
         case TypePackage.UNANN_TYPE_VARIABLE__DIMS :
            return getDims();
         case TypePackage.UNANN_TYPE_VARIABLE__NAME :
            return getName();
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
         case TypePackage.UNANN_TYPE_VARIABLE__DIMS :
            setDims((dims) newValue);
            return;
         case TypePackage.UNANN_TYPE_VARIABLE__NAME :
            setName((String) newValue);
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
         case TypePackage.UNANN_TYPE_VARIABLE__DIMS :
            setDims((dims) null);
            return;
         case TypePackage.UNANN_TYPE_VARIABLE__NAME :
            setName(NAME_EDEFAULT);
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
         case TypePackage.UNANN_TYPE_VARIABLE__DIMS :
            return dims != null;
         case TypePackage.UNANN_TYPE_VARIABLE__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
            case TypePackage.UNANN_TYPE_VARIABLE__DIMS :
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
               return TypePackage.UNANN_TYPE_VARIABLE__DIMS;
            default :
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
      result.append(" (name: ");
      result.append(name);
      result.append(')');
      return result.toString();
   }

} // unannTypeVariableImpl
