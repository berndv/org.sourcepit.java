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
import org.sourcepit.java.type.type.annotation;
import org.sourcepit.java.type.type.lastFormalParameter;
import org.sourcepit.java.type.type.unannType;
import org.sourcepit.java.type.type.variableDeclaratorId;
import org.sourcepit.java.type.type.variableModifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>last Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.lastFormalParameterImpl#getModifiers <em>Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.lastFormalParameterImpl#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.lastFormalParameterImpl#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.lastFormalParameterImpl#isVarargs <em>Varargs</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.lastFormalParameterImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class lastFormalParameterImpl extends MinimalEObjectImpl.Container implements lastFormalParameter {
   /**
    * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getModifiers()
    * @generated
    * @ordered
    */
   protected EList<variableModifier> modifiers;

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getType()
    * @generated
    * @ordered
    */
   protected unannType type;

   /**
    * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getAnnotations()
    * @generated
    * @ordered
    */
   protected EList<annotation> annotations;

   /**
    * The default value of the '{@link #isVarargs() <em>Varargs</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #isVarargs()
    * @generated
    * @ordered
    */
   protected static final boolean VARARGS_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isVarargs() <em>Varargs</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #isVarargs()
    * @generated
    * @ordered
    */
   protected boolean varargs = VARARGS_EDEFAULT;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getName()
    * @generated
    * @ordered
    */
   protected variableDeclaratorId name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected lastFormalParameterImpl() {
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
      return TypePackage.Literals.LAST_FORMAL_PARAMETER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<variableModifier> getModifiers() {
      if (modifiers == null) {
         modifiers = new EObjectContainmentEList<variableModifier>(variableModifier.class, this,
            TypePackage.LAST_FORMAL_PARAMETER__MODIFIERS);
      }
      return modifiers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannType getType() {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetType(unannType newType, NotificationChain msgs) {
      unannType oldType = type;
      type = newType;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.LAST_FORMAL_PARAMETER__TYPE, oldType, newType);
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
   public void setType(unannType newType) {
      if (newType != type) {
         NotificationChain msgs = null;
         if (type != null)
            msgs = ((InternalEObject) type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.LAST_FORMAL_PARAMETER__TYPE, null, msgs);
         if (newType != null)
            msgs = ((InternalEObject) newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.LAST_FORMAL_PARAMETER__TYPE, null, msgs);
         msgs = basicSetType(newType, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.LAST_FORMAL_PARAMETER__TYPE, newType,
            newType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<annotation> getAnnotations() {
      if (annotations == null) {
         annotations = new EObjectContainmentEList<annotation>(annotation.class, this,
            TypePackage.LAST_FORMAL_PARAMETER__ANNOTATIONS);
      }
      return annotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isVarargs() {
      return varargs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setVarargs(boolean newVarargs) {
      boolean oldVarargs = varargs;
      varargs = newVarargs;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.LAST_FORMAL_PARAMETER__VARARGS, oldVarargs,
            varargs));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableDeclaratorId getName() {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetName(variableDeclaratorId newName, NotificationChain msgs) {
      variableDeclaratorId oldName = name;
      name = newName;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.LAST_FORMAL_PARAMETER__NAME, oldName, newName);
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
   public void setName(variableDeclaratorId newName) {
      if (newName != name) {
         NotificationChain msgs = null;
         if (name != null)
            msgs = ((InternalEObject) name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.LAST_FORMAL_PARAMETER__NAME, null, msgs);
         if (newName != null)
            msgs = ((InternalEObject) newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.LAST_FORMAL_PARAMETER__NAME, null, msgs);
         msgs = basicSetName(newName, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.LAST_FORMAL_PARAMETER__NAME, newName,
            newName));
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
         case TypePackage.LAST_FORMAL_PARAMETER__MODIFIERS :
            return ((InternalEList<?>) getModifiers()).basicRemove(otherEnd, msgs);
         case TypePackage.LAST_FORMAL_PARAMETER__TYPE :
            return basicSetType(null, msgs);
         case TypePackage.LAST_FORMAL_PARAMETER__ANNOTATIONS :
            return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
         case TypePackage.LAST_FORMAL_PARAMETER__NAME :
            return basicSetName(null, msgs);
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
         case TypePackage.LAST_FORMAL_PARAMETER__MODIFIERS :
            return getModifiers();
         case TypePackage.LAST_FORMAL_PARAMETER__TYPE :
            return getType();
         case TypePackage.LAST_FORMAL_PARAMETER__ANNOTATIONS :
            return getAnnotations();
         case TypePackage.LAST_FORMAL_PARAMETER__VARARGS :
            return isVarargs();
         case TypePackage.LAST_FORMAL_PARAMETER__NAME :
            return getName();
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
         case TypePackage.LAST_FORMAL_PARAMETER__MODIFIERS :
            getModifiers().clear();
            getModifiers().addAll((Collection<? extends variableModifier>) newValue);
            return;
         case TypePackage.LAST_FORMAL_PARAMETER__TYPE :
            setType((unannType) newValue);
            return;
         case TypePackage.LAST_FORMAL_PARAMETER__ANNOTATIONS :
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends annotation>) newValue);
            return;
         case TypePackage.LAST_FORMAL_PARAMETER__VARARGS :
            setVarargs((Boolean) newValue);
            return;
         case TypePackage.LAST_FORMAL_PARAMETER__NAME :
            setName((variableDeclaratorId) newValue);
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
         case TypePackage.LAST_FORMAL_PARAMETER__MODIFIERS :
            getModifiers().clear();
            return;
         case TypePackage.LAST_FORMAL_PARAMETER__TYPE :
            setType((unannType) null);
            return;
         case TypePackage.LAST_FORMAL_PARAMETER__ANNOTATIONS :
            getAnnotations().clear();
            return;
         case TypePackage.LAST_FORMAL_PARAMETER__VARARGS :
            setVarargs(VARARGS_EDEFAULT);
            return;
         case TypePackage.LAST_FORMAL_PARAMETER__NAME :
            setName((variableDeclaratorId) null);
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
         case TypePackage.LAST_FORMAL_PARAMETER__MODIFIERS :
            return modifiers != null && !modifiers.isEmpty();
         case TypePackage.LAST_FORMAL_PARAMETER__TYPE :
            return type != null;
         case TypePackage.LAST_FORMAL_PARAMETER__ANNOTATIONS :
            return annotations != null && !annotations.isEmpty();
         case TypePackage.LAST_FORMAL_PARAMETER__VARARGS :
            return varargs != VARARGS_EDEFAULT;
         case TypePackage.LAST_FORMAL_PARAMETER__NAME :
            return name != null;
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
      result.append(" (varargs: ");
      result.append(varargs);
      result.append(')');
      return result.toString();
   }

} // lastFormalParameterImpl
