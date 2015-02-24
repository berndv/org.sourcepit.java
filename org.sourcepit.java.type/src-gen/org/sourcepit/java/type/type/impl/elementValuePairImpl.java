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
import org.sourcepit.java.type.type.elementValue;
import org.sourcepit.java.type.type.elementValuePair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>element Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.elementValuePairImpl#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.elementValuePairImpl#getElementValue <em>Element Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elementValuePairImpl extends MinimalEObjectImpl.Container implements elementValuePair {
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
    * The cached value of the '{@link #getElementValue() <em>Element Value</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getElementValue()
    * @generated
    * @ordered
    */
   protected elementValue elementValue;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected elementValuePairImpl() {
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
      return TypePackage.Literals.ELEMENT_VALUE_PAIR;
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
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ELEMENT_VALUE_PAIR__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public elementValue getElementValue() {
      return elementValue;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetElementValue(elementValue newElementValue, NotificationChain msgs) {
      elementValue oldElementValue = elementValue;
      elementValue = newElementValue;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ELEMENT_VALUE_PAIR__ELEMENT_VALUE, oldElementValue, newElementValue);
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
   public void setElementValue(elementValue newElementValue) {
      if (newElementValue != elementValue) {
         NotificationChain msgs = null;
         if (elementValue != null)
            msgs = ((InternalEObject) elementValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ELEMENT_VALUE_PAIR__ELEMENT_VALUE, null, msgs);
         if (newElementValue != null)
            msgs = ((InternalEObject) newElementValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ELEMENT_VALUE_PAIR__ELEMENT_VALUE, null, msgs);
         msgs = basicSetElementValue(newElementValue, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ELEMENT_VALUE_PAIR__ELEMENT_VALUE,
            newElementValue, newElementValue));
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
         case TypePackage.ELEMENT_VALUE_PAIR__ELEMENT_VALUE :
            return basicSetElementValue(null, msgs);
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
         case TypePackage.ELEMENT_VALUE_PAIR__NAME :
            return getName();
         case TypePackage.ELEMENT_VALUE_PAIR__ELEMENT_VALUE :
            return getElementValue();
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
         case TypePackage.ELEMENT_VALUE_PAIR__NAME :
            setName((String) newValue);
            return;
         case TypePackage.ELEMENT_VALUE_PAIR__ELEMENT_VALUE :
            setElementValue((elementValue) newValue);
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
         case TypePackage.ELEMENT_VALUE_PAIR__NAME :
            setName(NAME_EDEFAULT);
            return;
         case TypePackage.ELEMENT_VALUE_PAIR__ELEMENT_VALUE :
            setElementValue((elementValue) null);
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
         case TypePackage.ELEMENT_VALUE_PAIR__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case TypePackage.ELEMENT_VALUE_PAIR__ELEMENT_VALUE :
            return elementValue != null;
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
      result.append(" (name: ");
      result.append(name);
      result.append(')');
      return result.toString();
   }

} // elementValuePairImpl
