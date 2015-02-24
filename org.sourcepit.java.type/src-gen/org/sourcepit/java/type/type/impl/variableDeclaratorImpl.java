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
import org.sourcepit.java.type.type.variableDeclarator;
import org.sourcepit.java.type.type.variableDeclaratorId;
import org.sourcepit.java.type.type.variableInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.variableDeclaratorImpl#getId <em>Id</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.variableDeclaratorImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variableDeclaratorImpl extends MinimalEObjectImpl.Container implements variableDeclarator {
   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getId()
    * @generated
    * @ordered
    */
   protected variableDeclaratorId id;

   /**
    * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getInitializer()
    * @generated
    * @ordered
    */
   protected variableInitializer initializer;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected variableDeclaratorImpl() {
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
      return TypePackage.Literals.VARIABLE_DECLARATOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableDeclaratorId getId() {
      return id;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetId(variableDeclaratorId newId, NotificationChain msgs) {
      variableDeclaratorId oldId = id;
      id = newId;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.VARIABLE_DECLARATOR__ID, oldId, newId);
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
   public void setId(variableDeclaratorId newId) {
      if (newId != id) {
         NotificationChain msgs = null;
         if (id != null)
            msgs = ((InternalEObject) id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.VARIABLE_DECLARATOR__ID, null, msgs);
         if (newId != null)
            msgs = ((InternalEObject) newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.VARIABLE_DECLARATOR__ID, null, msgs);
         msgs = basicSetId(newId, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.VARIABLE_DECLARATOR__ID, newId, newId));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableInitializer getInitializer() {
      return initializer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetInitializer(variableInitializer newInitializer, NotificationChain msgs) {
      variableInitializer oldInitializer = initializer;
      initializer = newInitializer;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.VARIABLE_DECLARATOR__INITIALIZER, oldInitializer, newInitializer);
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
   public void setInitializer(variableInitializer newInitializer) {
      if (newInitializer != initializer) {
         NotificationChain msgs = null;
         if (initializer != null)
            msgs = ((InternalEObject) initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.VARIABLE_DECLARATOR__INITIALIZER, null, msgs);
         if (newInitializer != null)
            msgs = ((InternalEObject) newInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.VARIABLE_DECLARATOR__INITIALIZER, null, msgs);
         msgs = basicSetInitializer(newInitializer, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.VARIABLE_DECLARATOR__INITIALIZER,
            newInitializer, newInitializer));
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
         case TypePackage.VARIABLE_DECLARATOR__ID :
            return basicSetId(null, msgs);
         case TypePackage.VARIABLE_DECLARATOR__INITIALIZER :
            return basicSetInitializer(null, msgs);
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
         case TypePackage.VARIABLE_DECLARATOR__ID :
            return getId();
         case TypePackage.VARIABLE_DECLARATOR__INITIALIZER :
            return getInitializer();
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
         case TypePackage.VARIABLE_DECLARATOR__ID :
            setId((variableDeclaratorId) newValue);
            return;
         case TypePackage.VARIABLE_DECLARATOR__INITIALIZER :
            setInitializer((variableInitializer) newValue);
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
         case TypePackage.VARIABLE_DECLARATOR__ID :
            setId((variableDeclaratorId) null);
            return;
         case TypePackage.VARIABLE_DECLARATOR__INITIALIZER :
            setInitializer((variableInitializer) null);
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
         case TypePackage.VARIABLE_DECLARATOR__ID :
            return id != null;
         case TypePackage.VARIABLE_DECLARATOR__INITIALIZER :
            return initializer != null;
      }
      return super.eIsSet(featureID);
   }

} // variableDeclaratorImpl
