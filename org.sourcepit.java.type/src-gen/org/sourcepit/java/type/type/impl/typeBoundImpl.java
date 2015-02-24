/**
 */

package org.sourcepit.java.type.type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.additionalBound;
import org.sourcepit.java.type.type.classOrInterfaceType;
import org.sourcepit.java.type.type.typeBound;
import org.sourcepit.java.type.type.typeVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Bound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.typeBoundImpl#getTypeVariable <em>Type Variable</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.typeBoundImpl#getClassOrInterfaceType <em>Class Or Interface Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.typeBoundImpl#getAdditionalBound <em>Additional Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeBoundImpl extends MinimalEObjectImpl.Container implements typeBound {
   /**
    * The cached value of the '{@link #getTypeVariable() <em>Type Variable</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeVariable()
    * @generated
    * @ordered
    */
   protected typeVariable typeVariable;

   /**
    * The cached value of the '{@link #getClassOrInterfaceType() <em>Class Or Interface Type</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getClassOrInterfaceType()
    * @generated
    * @ordered
    */
   protected classOrInterfaceType classOrInterfaceType;

   /**
    * The cached value of the '{@link #getAdditionalBound() <em>Additional Bound</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getAdditionalBound()
    * @generated
    * @ordered
    */
   protected EList<additionalBound> additionalBound;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected typeBoundImpl() {
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
      return TypePackage.Literals.TYPE_BOUND;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeVariable getTypeVariable() {
      return typeVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetTypeVariable(typeVariable newTypeVariable, NotificationChain msgs) {
      typeVariable oldTypeVariable = typeVariable;
      typeVariable = newTypeVariable;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.TYPE_BOUND__TYPE_VARIABLE, oldTypeVariable, newTypeVariable);
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
   public void setTypeVariable(typeVariable newTypeVariable) {
      if (newTypeVariable != typeVariable) {
         NotificationChain msgs = null;
         if (typeVariable != null)
            msgs = ((InternalEObject) typeVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.TYPE_BOUND__TYPE_VARIABLE, null, msgs);
         if (newTypeVariable != null)
            msgs = ((InternalEObject) newTypeVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.TYPE_BOUND__TYPE_VARIABLE, null, msgs);
         msgs = basicSetTypeVariable(newTypeVariable, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.TYPE_BOUND__TYPE_VARIABLE, newTypeVariable,
            newTypeVariable));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classOrInterfaceType getClassOrInterfaceType() {
      return classOrInterfaceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetClassOrInterfaceType(classOrInterfaceType newClassOrInterfaceType,
      NotificationChain msgs) {
      classOrInterfaceType oldClassOrInterfaceType = classOrInterfaceType;
      classOrInterfaceType = newClassOrInterfaceType;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.TYPE_BOUND__CLASS_OR_INTERFACE_TYPE, oldClassOrInterfaceType, newClassOrInterfaceType);
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
   public void setClassOrInterfaceType(classOrInterfaceType newClassOrInterfaceType) {
      if (newClassOrInterfaceType != classOrInterfaceType) {
         NotificationChain msgs = null;
         if (classOrInterfaceType != null)
            msgs = ((InternalEObject) classOrInterfaceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.TYPE_BOUND__CLASS_OR_INTERFACE_TYPE, null, msgs);
         if (newClassOrInterfaceType != null)
            msgs = ((InternalEObject) newClassOrInterfaceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.TYPE_BOUND__CLASS_OR_INTERFACE_TYPE, null, msgs);
         msgs = basicSetClassOrInterfaceType(newClassOrInterfaceType, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.TYPE_BOUND__CLASS_OR_INTERFACE_TYPE,
            newClassOrInterfaceType, newClassOrInterfaceType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<additionalBound> getAdditionalBound() {
      if (additionalBound == null) {
         additionalBound = new EObjectContainmentEList<additionalBound>(additionalBound.class, this,
            TypePackage.TYPE_BOUND__ADDITIONAL_BOUND);
      }
      return additionalBound;
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
         case TypePackage.TYPE_BOUND__TYPE_VARIABLE :
            return basicSetTypeVariable(null, msgs);
         case TypePackage.TYPE_BOUND__CLASS_OR_INTERFACE_TYPE :
            return basicSetClassOrInterfaceType(null, msgs);
         case TypePackage.TYPE_BOUND__ADDITIONAL_BOUND :
            return ((InternalEList<?>) getAdditionalBound()).basicRemove(otherEnd, msgs);
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
         case TypePackage.TYPE_BOUND__TYPE_VARIABLE :
            return getTypeVariable();
         case TypePackage.TYPE_BOUND__CLASS_OR_INTERFACE_TYPE :
            return getClassOrInterfaceType();
         case TypePackage.TYPE_BOUND__ADDITIONAL_BOUND :
            return getAdditionalBound();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case TypePackage.TYPE_BOUND__TYPE_VARIABLE :
            setTypeVariable((typeVariable) newValue);
            return;
         case TypePackage.TYPE_BOUND__CLASS_OR_INTERFACE_TYPE :
            setClassOrInterfaceType((classOrInterfaceType) newValue);
            return;
         case TypePackage.TYPE_BOUND__ADDITIONAL_BOUND :
            getAdditionalBound().clear();
            getAdditionalBound().addAll((Collection<? extends additionalBound>) newValue);
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
         case TypePackage.TYPE_BOUND__TYPE_VARIABLE :
            setTypeVariable((typeVariable) null);
            return;
         case TypePackage.TYPE_BOUND__CLASS_OR_INTERFACE_TYPE :
            setClassOrInterfaceType((classOrInterfaceType) null);
            return;
         case TypePackage.TYPE_BOUND__ADDITIONAL_BOUND :
            getAdditionalBound().clear();
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
         case TypePackage.TYPE_BOUND__TYPE_VARIABLE :
            return typeVariable != null;
         case TypePackage.TYPE_BOUND__CLASS_OR_INTERFACE_TYPE :
            return classOrInterfaceType != null;
         case TypePackage.TYPE_BOUND__ADDITIONAL_BOUND :
            return additionalBound != null && !additionalBound.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // typeBoundImpl
