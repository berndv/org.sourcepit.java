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
import org.sourcepit.java.type.type.enumBody;
import org.sourcepit.java.type.type.enumBodyDeclarations;
import org.sourcepit.java.type.type.enumConstantList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enum Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.enumBodyImpl#getEnumConstantList <em>Enum Constant List</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.enumBodyImpl#getEnumBodyDeclarations <em>Enum Body Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enumBodyImpl extends MinimalEObjectImpl.Container implements enumBody {
   /**
    * The cached value of the '{@link #getEnumConstantList() <em>Enum Constant List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getEnumConstantList()
    * @generated
    * @ordered
    */
   protected enumConstantList enumConstantList;

   /**
    * The cached value of the '{@link #getEnumBodyDeclarations() <em>Enum Body Declarations</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getEnumBodyDeclarations()
    * @generated
    * @ordered
    */
   protected enumBodyDeclarations enumBodyDeclarations;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected enumBodyImpl() {
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
      return TypePackage.Literals.ENUM_BODY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public enumConstantList getEnumConstantList() {
      return enumConstantList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetEnumConstantList(enumConstantList newEnumConstantList, NotificationChain msgs) {
      enumConstantList oldEnumConstantList = enumConstantList;
      enumConstantList = newEnumConstantList;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ENUM_BODY__ENUM_CONSTANT_LIST, oldEnumConstantList, newEnumConstantList);
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
   public void setEnumConstantList(enumConstantList newEnumConstantList) {
      if (newEnumConstantList != enumConstantList) {
         NotificationChain msgs = null;
         if (enumConstantList != null)
            msgs = ((InternalEObject) enumConstantList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_BODY__ENUM_CONSTANT_LIST, null, msgs);
         if (newEnumConstantList != null)
            msgs = ((InternalEObject) newEnumConstantList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_BODY__ENUM_CONSTANT_LIST, null, msgs);
         msgs = basicSetEnumConstantList(newEnumConstantList, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENUM_BODY__ENUM_CONSTANT_LIST,
            newEnumConstantList, newEnumConstantList));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public enumBodyDeclarations getEnumBodyDeclarations() {
      return enumBodyDeclarations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetEnumBodyDeclarations(enumBodyDeclarations newEnumBodyDeclarations,
      NotificationChain msgs) {
      enumBodyDeclarations oldEnumBodyDeclarations = enumBodyDeclarations;
      enumBodyDeclarations = newEnumBodyDeclarations;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ENUM_BODY__ENUM_BODY_DECLARATIONS, oldEnumBodyDeclarations, newEnumBodyDeclarations);
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
   public void setEnumBodyDeclarations(enumBodyDeclarations newEnumBodyDeclarations) {
      if (newEnumBodyDeclarations != enumBodyDeclarations) {
         NotificationChain msgs = null;
         if (enumBodyDeclarations != null)
            msgs = ((InternalEObject) enumBodyDeclarations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_BODY__ENUM_BODY_DECLARATIONS, null, msgs);
         if (newEnumBodyDeclarations != null)
            msgs = ((InternalEObject) newEnumBodyDeclarations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_BODY__ENUM_BODY_DECLARATIONS, null, msgs);
         msgs = basicSetEnumBodyDeclarations(newEnumBodyDeclarations, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENUM_BODY__ENUM_BODY_DECLARATIONS,
            newEnumBodyDeclarations, newEnumBodyDeclarations));
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
         case TypePackage.ENUM_BODY__ENUM_CONSTANT_LIST :
            return basicSetEnumConstantList(null, msgs);
         case TypePackage.ENUM_BODY__ENUM_BODY_DECLARATIONS :
            return basicSetEnumBodyDeclarations(null, msgs);
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
         case TypePackage.ENUM_BODY__ENUM_CONSTANT_LIST :
            return getEnumConstantList();
         case TypePackage.ENUM_BODY__ENUM_BODY_DECLARATIONS :
            return getEnumBodyDeclarations();
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
         case TypePackage.ENUM_BODY__ENUM_CONSTANT_LIST :
            setEnumConstantList((enumConstantList) newValue);
            return;
         case TypePackage.ENUM_BODY__ENUM_BODY_DECLARATIONS :
            setEnumBodyDeclarations((enumBodyDeclarations) newValue);
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
         case TypePackage.ENUM_BODY__ENUM_CONSTANT_LIST :
            setEnumConstantList((enumConstantList) null);
            return;
         case TypePackage.ENUM_BODY__ENUM_BODY_DECLARATIONS :
            setEnumBodyDeclarations((enumBodyDeclarations) null);
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
         case TypePackage.ENUM_BODY__ENUM_CONSTANT_LIST :
            return enumConstantList != null;
         case TypePackage.ENUM_BODY__ENUM_BODY_DECLARATIONS :
            return enumBodyDeclarations != null;
      }
      return super.eIsSet(featureID);
   }

} // enumBodyImpl
