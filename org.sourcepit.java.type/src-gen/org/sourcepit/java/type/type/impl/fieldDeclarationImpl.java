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
import org.sourcepit.java.type.type.fieldDeclaration;
import org.sourcepit.java.type.type.fieldModifier;
import org.sourcepit.java.type.type.unannType;
import org.sourcepit.java.type.type.variableDeclaratorList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>field Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.fieldDeclarationImpl#getFieldModifiers <em>Field Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.fieldDeclarationImpl#getUnannType <em>Unann Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.fieldDeclarationImpl#getVariableDeclaratorList <em>Variable Declarator
 * List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fieldDeclarationImpl extends classMemberDeclarationImpl implements fieldDeclaration {
   /**
    * The cached value of the '{@link #getFieldModifiers() <em>Field Modifiers</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getFieldModifiers()
    * @generated
    * @ordered
    */
   protected EList<fieldModifier> fieldModifiers;

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
   protected fieldDeclarationImpl() {
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
      return TypePackage.Literals.FIELD_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<fieldModifier> getFieldModifiers() {
      if (fieldModifiers == null) {
         fieldModifiers = new EObjectContainmentEList<fieldModifier>(fieldModifier.class, this,
            TypePackage.FIELD_DECLARATION__FIELD_MODIFIERS);
      }
      return fieldModifiers;
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
            TypePackage.FIELD_DECLARATION__UNANN_TYPE, oldUnannType, newUnannType);
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
               - TypePackage.FIELD_DECLARATION__UNANN_TYPE, null, msgs);
         if (newUnannType != null)
            msgs = ((InternalEObject) newUnannType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.FIELD_DECLARATION__UNANN_TYPE, null, msgs);
         msgs = basicSetUnannType(newUnannType, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.FIELD_DECLARATION__UNANN_TYPE, newUnannType,
            newUnannType));
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
            TypePackage.FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST, oldVariableDeclaratorList,
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
               - TypePackage.FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST, null, msgs);
         if (newVariableDeclaratorList != null)
            msgs = ((InternalEObject) newVariableDeclaratorList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST, null, msgs);
         msgs = basicSetVariableDeclaratorList(newVariableDeclaratorList, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST,
            newVariableDeclaratorList, newVariableDeclaratorList));
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
         case TypePackage.FIELD_DECLARATION__FIELD_MODIFIERS :
            return ((InternalEList<?>) getFieldModifiers()).basicRemove(otherEnd, msgs);
         case TypePackage.FIELD_DECLARATION__UNANN_TYPE :
            return basicSetUnannType(null, msgs);
         case TypePackage.FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST :
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
         case TypePackage.FIELD_DECLARATION__FIELD_MODIFIERS :
            return getFieldModifiers();
         case TypePackage.FIELD_DECLARATION__UNANN_TYPE :
            return getUnannType();
         case TypePackage.FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST :
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
         case TypePackage.FIELD_DECLARATION__FIELD_MODIFIERS :
            getFieldModifiers().clear();
            getFieldModifiers().addAll((Collection<? extends fieldModifier>) newValue);
            return;
         case TypePackage.FIELD_DECLARATION__UNANN_TYPE :
            setUnannType((unannType) newValue);
            return;
         case TypePackage.FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST :
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
         case TypePackage.FIELD_DECLARATION__FIELD_MODIFIERS :
            getFieldModifiers().clear();
            return;
         case TypePackage.FIELD_DECLARATION__UNANN_TYPE :
            setUnannType((unannType) null);
            return;
         case TypePackage.FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST :
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
         case TypePackage.FIELD_DECLARATION__FIELD_MODIFIERS :
            return fieldModifiers != null && !fieldModifiers.isEmpty();
         case TypePackage.FIELD_DECLARATION__UNANN_TYPE :
            return unannType != null;
         case TypePackage.FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST :
            return variableDeclaratorList != null;
      }
      return super.eIsSet(featureID);
   }

} // fieldDeclarationImpl
