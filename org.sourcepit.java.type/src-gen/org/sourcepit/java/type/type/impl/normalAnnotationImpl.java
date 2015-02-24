/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.elementValuePairList;
import org.sourcepit.java.type.type.normalAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>normal Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.normalAnnotationImpl#getElementValuePairList <em>Element Value Pair List
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class normalAnnotationImpl extends annotationImpl implements normalAnnotation {
   /**
    * The cached value of the '{@link #getElementValuePairList() <em>Element Value Pair List</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getElementValuePairList()
    * @generated
    * @ordered
    */
   protected elementValuePairList elementValuePairList;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected normalAnnotationImpl() {
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
      return TypePackage.Literals.NORMAL_ANNOTATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public elementValuePairList getElementValuePairList() {
      return elementValuePairList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetElementValuePairList(elementValuePairList newElementValuePairList,
      NotificationChain msgs) {
      elementValuePairList oldElementValuePairList = elementValuePairList;
      elementValuePairList = newElementValuePairList;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST, oldElementValuePairList, newElementValuePairList);
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
   public void setElementValuePairList(elementValuePairList newElementValuePairList) {
      if (newElementValuePairList != elementValuePairList) {
         NotificationChain msgs = null;
         if (elementValuePairList != null)
            msgs = ((InternalEObject) elementValuePairList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST, null, msgs);
         if (newElementValuePairList != null)
            msgs = ((InternalEObject) newElementValuePairList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST, null, msgs);
         msgs = basicSetElementValuePairList(newElementValuePairList, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST,
            newElementValuePairList, newElementValuePairList));
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
         case TypePackage.NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST :
            return basicSetElementValuePairList(null, msgs);
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
         case TypePackage.NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST :
            return getElementValuePairList();
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
         case TypePackage.NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST :
            setElementValuePairList((elementValuePairList) newValue);
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
         case TypePackage.NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST :
            setElementValuePairList((elementValuePairList) null);
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
         case TypePackage.NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST :
            return elementValuePairList != null;
      }
      return super.eIsSet(featureID);
   }

} // normalAnnotationImpl
