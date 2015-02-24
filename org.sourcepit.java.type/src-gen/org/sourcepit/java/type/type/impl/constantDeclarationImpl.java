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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.constantDeclaration;
import org.sourcepit.java.type.type.constantModifier;
import org.sourcepit.java.type.type.unannType;
import org.sourcepit.java.type.type.variableDeclaratorList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.constantDeclarationImpl#getConstantModifiers <em>Constant Modifiers
 * </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.constantDeclarationImpl#getUnannType <em>Unann Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.constantDeclarationImpl#getVariableDeclaratorList <em>Variable
 * Declarator List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constantDeclarationImpl extends interfaceMemberDeclarationImpl implements constantDeclaration {
   /**
    * The cached value of the '{@link #getConstantModifiers() <em>Constant Modifiers</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getConstantModifiers()
    * @generated
    * @ordered
    */
   protected EList<constantModifier> constantModifiers;

   /**
    * The cached value of the '{@link #getUnannType() <em>Unann Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getUnannType()
    * @generated
    * @ordered
    */
   protected unannType unannType;

   /**
    * The cached value of the '{@link #getVariableDeclaratorList() <em>Variable Declarator List</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVariableDeclaratorList()
    * @generated
    * @ordered
    */
   protected variableDeclaratorList variableDeclaratorList;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected constantDeclarationImpl() {
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
      return TypePackage.Literals.CONSTANT_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<constantModifier> getConstantModifiers() {
      if (constantModifiers == null) {
         constantModifiers = new EObjectContainmentEList<constantModifier>(constantModifier.class, this,
            TypePackage.CONSTANT_DECLARATION__CONSTANT_MODIFIERS);
      }
      return constantModifiers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannType getUnannType() {
      return unannType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetUnannType(unannType newUnannType, NotificationChain msgs) {
      unannType oldUnannType = unannType;
      unannType = newUnannType;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.CONSTANT_DECLARATION__UNANN_TYPE, oldUnannType, newUnannType);
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
   public void setUnannType(unannType newUnannType) {
      if (newUnannType != unannType) {
         NotificationChain msgs = null;
         if (unannType != null)
            msgs = ((InternalEObject) unannType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CONSTANT_DECLARATION__UNANN_TYPE, null, msgs);
         if (newUnannType != null)
            msgs = ((InternalEObject) newUnannType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CONSTANT_DECLARATION__UNANN_TYPE, null, msgs);
         msgs = basicSetUnannType(newUnannType, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CONSTANT_DECLARATION__UNANN_TYPE,
            newUnannType, newUnannType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableDeclaratorList getVariableDeclaratorList() {
      return variableDeclaratorList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetVariableDeclaratorList(variableDeclaratorList newVariableDeclaratorList,
      NotificationChain msgs) {
      variableDeclaratorList oldVariableDeclaratorList = variableDeclaratorList;
      variableDeclaratorList = newVariableDeclaratorList;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST, oldVariableDeclaratorList,
            newVariableDeclaratorList);
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
   public void setVariableDeclaratorList(variableDeclaratorList newVariableDeclaratorList) {
      if (newVariableDeclaratorList != variableDeclaratorList) {
         NotificationChain msgs = null;
         if (variableDeclaratorList != null)
            msgs = ((InternalEObject) variableDeclaratorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST, null, msgs);
         if (newVariableDeclaratorList != null)
            msgs = ((InternalEObject) newVariableDeclaratorList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST, null, msgs);
         msgs = basicSetVariableDeclaratorList(newVariableDeclaratorList, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST, newVariableDeclaratorList,
            newVariableDeclaratorList));
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
         case TypePackage.CONSTANT_DECLARATION__CONSTANT_MODIFIERS :
            return ((InternalEList<?>) getConstantModifiers()).basicRemove(otherEnd, msgs);
         case TypePackage.CONSTANT_DECLARATION__UNANN_TYPE :
            return basicSetUnannType(null, msgs);
         case TypePackage.CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST :
            return basicSetVariableDeclaratorList(null, msgs);
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
         case TypePackage.CONSTANT_DECLARATION__CONSTANT_MODIFIERS :
            return getConstantModifiers();
         case TypePackage.CONSTANT_DECLARATION__UNANN_TYPE :
            return getUnannType();
         case TypePackage.CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST :
            return getVariableDeclaratorList();
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
         case TypePackage.CONSTANT_DECLARATION__CONSTANT_MODIFIERS :
            getConstantModifiers().clear();
            getConstantModifiers().addAll((Collection<? extends constantModifier>) newValue);
            return;
         case TypePackage.CONSTANT_DECLARATION__UNANN_TYPE :
            setUnannType((unannType) newValue);
            return;
         case TypePackage.CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST :
            setVariableDeclaratorList((variableDeclaratorList) newValue);
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
         case TypePackage.CONSTANT_DECLARATION__CONSTANT_MODIFIERS :
            getConstantModifiers().clear();
            return;
         case TypePackage.CONSTANT_DECLARATION__UNANN_TYPE :
            setUnannType((unannType) null);
            return;
         case TypePackage.CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST :
            setVariableDeclaratorList((variableDeclaratorList) null);
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
         case TypePackage.CONSTANT_DECLARATION__CONSTANT_MODIFIERS :
            return constantModifiers != null && !constantModifiers.isEmpty();
         case TypePackage.CONSTANT_DECLARATION__UNANN_TYPE :
            return unannType != null;
         case TypePackage.CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST :
            return variableDeclaratorList != null;
      }
      return super.eIsSet(featureID);
   }

} // constantDeclarationImpl
