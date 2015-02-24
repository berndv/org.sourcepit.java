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
import org.sourcepit.java.type.type.typeBound;
import org.sourcepit.java.type.type.typeParameter;
import org.sourcepit.java.type.type.typeParameterModifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.typeParameterImpl#getTypeParameterModifiers <em>Type Parameter Modifiers
 * </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.typeParameterImpl#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.typeParameterImpl#getTypeBound <em>Type Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeParameterImpl extends MinimalEObjectImpl.Container implements typeParameter {
   /**
    * The cached value of the '{@link #getTypeParameterModifiers() <em>Type Parameter Modifiers</em>}' containment
    * reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeParameterModifiers()
    * @generated
    * @ordered
    */
   protected EList<typeParameterModifier> typeParameterModifiers;

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
    * The cached value of the '{@link #getTypeBound() <em>Type Bound</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeBound()
    * @generated
    * @ordered
    */
   protected typeBound typeBound;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected typeParameterImpl() {
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
      return TypePackage.Literals.TYPE_PARAMETER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<typeParameterModifier> getTypeParameterModifiers() {
      if (typeParameterModifiers == null) {
         typeParameterModifiers = new EObjectContainmentEList<typeParameterModifier>(typeParameterModifier.class, this,
            TypePackage.TYPE_PARAMETER__TYPE_PARAMETER_MODIFIERS);
      }
      return typeParameterModifiers;
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
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.TYPE_PARAMETER__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeBound getTypeBound() {
      return typeBound;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetTypeBound(typeBound newTypeBound, NotificationChain msgs) {
      typeBound oldTypeBound = typeBound;
      typeBound = newTypeBound;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.TYPE_PARAMETER__TYPE_BOUND, oldTypeBound, newTypeBound);
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
   public void setTypeBound(typeBound newTypeBound) {
      if (newTypeBound != typeBound) {
         NotificationChain msgs = null;
         if (typeBound != null)
            msgs = ((InternalEObject) typeBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.TYPE_PARAMETER__TYPE_BOUND, null, msgs);
         if (newTypeBound != null)
            msgs = ((InternalEObject) newTypeBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.TYPE_PARAMETER__TYPE_BOUND, null, msgs);
         msgs = basicSetTypeBound(newTypeBound, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.TYPE_PARAMETER__TYPE_BOUND, newTypeBound,
            newTypeBound));
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
         case TypePackage.TYPE_PARAMETER__TYPE_PARAMETER_MODIFIERS :
            return ((InternalEList<?>) getTypeParameterModifiers()).basicRemove(otherEnd, msgs);
         case TypePackage.TYPE_PARAMETER__TYPE_BOUND :
            return basicSetTypeBound(null, msgs);
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
         case TypePackage.TYPE_PARAMETER__TYPE_PARAMETER_MODIFIERS :
            return getTypeParameterModifiers();
         case TypePackage.TYPE_PARAMETER__NAME :
            return getName();
         case TypePackage.TYPE_PARAMETER__TYPE_BOUND :
            return getTypeBound();
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
         case TypePackage.TYPE_PARAMETER__TYPE_PARAMETER_MODIFIERS :
            getTypeParameterModifiers().clear();
            getTypeParameterModifiers().addAll((Collection<? extends typeParameterModifier>) newValue);
            return;
         case TypePackage.TYPE_PARAMETER__NAME :
            setName((String) newValue);
            return;
         case TypePackage.TYPE_PARAMETER__TYPE_BOUND :
            setTypeBound((typeBound) newValue);
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
         case TypePackage.TYPE_PARAMETER__TYPE_PARAMETER_MODIFIERS :
            getTypeParameterModifiers().clear();
            return;
         case TypePackage.TYPE_PARAMETER__NAME :
            setName(NAME_EDEFAULT);
            return;
         case TypePackage.TYPE_PARAMETER__TYPE_BOUND :
            setTypeBound((typeBound) null);
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
         case TypePackage.TYPE_PARAMETER__TYPE_PARAMETER_MODIFIERS :
            return typeParameterModifiers != null && !typeParameterModifiers.isEmpty();
         case TypePackage.TYPE_PARAMETER__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case TypePackage.TYPE_PARAMETER__TYPE_BOUND :
            return typeBound != null;
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

} // typeParameterImpl
