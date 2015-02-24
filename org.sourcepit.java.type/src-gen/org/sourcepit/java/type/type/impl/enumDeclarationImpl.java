/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.enumBody;
import org.sourcepit.java.type.type.enumDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.enumDeclarationImpl#getEnumBody <em>Enum Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enumDeclarationImpl extends classDeclarationImpl implements enumDeclaration {
   /**
    * The cached value of the '{@link #getEnumBody() <em>Enum Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getEnumBody()
    * @generated
    * @ordered
    */
   protected enumBody enumBody;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected enumDeclarationImpl() {
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
      return TypePackage.Literals.ENUM_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public enumBody getEnumBody() {
      return enumBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetEnumBody(enumBody newEnumBody, NotificationChain msgs) {
      enumBody oldEnumBody = enumBody;
      enumBody = newEnumBody;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ENUM_DECLARATION__ENUM_BODY, oldEnumBody, newEnumBody);
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
   public void setEnumBody(enumBody newEnumBody) {
      if (newEnumBody != enumBody) {
         NotificationChain msgs = null;
         if (enumBody != null)
            msgs = ((InternalEObject) enumBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_DECLARATION__ENUM_BODY, null, msgs);
         if (newEnumBody != null)
            msgs = ((InternalEObject) newEnumBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_DECLARATION__ENUM_BODY, null, msgs);
         msgs = basicSetEnumBody(newEnumBody, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENUM_DECLARATION__ENUM_BODY, newEnumBody,
            newEnumBody));
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
         case TypePackage.ENUM_DECLARATION__ENUM_BODY :
            return basicSetEnumBody(null, msgs);
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
         case TypePackage.ENUM_DECLARATION__ENUM_BODY :
            return getEnumBody();
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
         case TypePackage.ENUM_DECLARATION__ENUM_BODY :
            setEnumBody((enumBody) newValue);
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
         case TypePackage.ENUM_DECLARATION__ENUM_BODY :
            setEnumBody((enumBody) null);
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
         case TypePackage.ENUM_DECLARATION__ENUM_BODY :
            return enumBody != null;
      }
      return super.eIsSet(featureID);
   }

} // enumDeclarationImpl
