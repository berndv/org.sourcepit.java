/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.elementValueArrayInitializer;
import org.sourcepit.java.type.type.elementValueList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>element Value Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.elementValueArrayInitializerImpl#getElementValueList <em>Element Value
 * List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elementValueArrayInitializerImpl extends elementValueImpl implements elementValueArrayInitializer {
   /**
    * The cached value of the '{@link #getElementValueList() <em>Element Value List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getElementValueList()
    * @generated
    * @ordered
    */
   protected elementValueList elementValueList;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected elementValueArrayInitializerImpl() {
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
      return TypePackage.Literals.ELEMENT_VALUE_ARRAY_INITIALIZER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public elementValueList getElementValueList() {
      return elementValueList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetElementValueList(elementValueList newElementValueList, NotificationChain msgs) {
      elementValueList oldElementValueList = elementValueList;
      elementValueList = newElementValueList;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST, oldElementValueList, newElementValueList);
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
   public void setElementValueList(elementValueList newElementValueList) {
      if (newElementValueList != elementValueList) {
         NotificationChain msgs = null;
         if (elementValueList != null)
            msgs = ((InternalEObject) elementValueList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST, null, msgs);
         if (newElementValueList != null)
            msgs = ((InternalEObject) newElementValueList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST, null, msgs);
         msgs = basicSetElementValueList(newElementValueList, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST, newElementValueList, newElementValueList));
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
         case TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST :
            return basicSetElementValueList(null, msgs);
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
         case TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST :
            return getElementValueList();
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
         case TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST :
            setElementValueList((elementValueList) newValue);
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
         case TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST :
            setElementValueList((elementValueList) null);
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
         case TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST :
            return elementValueList != null;
      }
      return super.eIsSet(featureID);
   }

} // elementValueArrayInitializerImpl
