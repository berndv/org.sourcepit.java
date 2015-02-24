/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.arrayInitializer;
import org.sourcepit.java.type.type.variableInitializerList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>array Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.arrayInitializerImpl#getVariableInitializerList <em>Variable Initializer
 * List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class arrayInitializerImpl extends variableInitializerImpl implements arrayInitializer {
   /**
    * The cached value of the '{@link #getVariableInitializerList() <em>Variable Initializer List</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVariableInitializerList()
    * @generated
    * @ordered
    */
   protected variableInitializerList variableInitializerList;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected arrayInitializerImpl() {
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
      return TypePackage.Literals.ARRAY_INITIALIZER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableInitializerList getVariableInitializerList() {
      return variableInitializerList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetVariableInitializerList(variableInitializerList newVariableInitializerList,
      NotificationChain msgs) {
      variableInitializerList oldVariableInitializerList = variableInitializerList;
      variableInitializerList = newVariableInitializerList;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST, oldVariableInitializerList,
            newVariableInitializerList);
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
   public void setVariableInitializerList(variableInitializerList newVariableInitializerList) {
      if (newVariableInitializerList != variableInitializerList) {
         NotificationChain msgs = null;
         if (variableInitializerList != null)
            msgs = ((InternalEObject) variableInitializerList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST, null, msgs);
         if (newVariableInitializerList != null)
            msgs = ((InternalEObject) newVariableInitializerList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST, null, msgs);
         msgs = basicSetVariableInitializerList(newVariableInitializerList, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST, newVariableInitializerList,
            newVariableInitializerList));
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
         case TypePackage.ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST :
            return basicSetVariableInitializerList(null, msgs);
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
         case TypePackage.ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST :
            return getVariableInitializerList();
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
         case TypePackage.ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST :
            setVariableInitializerList((variableInitializerList) newValue);
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
         case TypePackage.ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST :
            setVariableInitializerList((variableInitializerList) null);
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
         case TypePackage.ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST :
            return variableInitializerList != null;
      }
      return super.eIsSet(featureID);
   }

} // arrayInitializerImpl
