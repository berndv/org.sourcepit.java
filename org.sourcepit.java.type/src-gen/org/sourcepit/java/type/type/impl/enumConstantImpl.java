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
import org.sourcepit.java.type.type.argumentList;
import org.sourcepit.java.type.type.classBody;
import org.sourcepit.java.type.type.enumConstant;
import org.sourcepit.java.type.type.enumConstantModifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enum Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.enumConstantImpl#getEnumConstantModifiers <em>Enum Constant Modifiers
 * </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.enumConstantImpl#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.enumConstantImpl#getArgumentList <em>Argument List</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.enumConstantImpl#getClassBody <em>Class Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enumConstantImpl extends MinimalEObjectImpl.Container implements enumConstant {
   /**
    * The cached value of the '{@link #getEnumConstantModifiers() <em>Enum Constant Modifiers</em>}' containment
    * reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getEnumConstantModifiers()
    * @generated
    * @ordered
    */
   protected EList<enumConstantModifier> enumConstantModifiers;

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
    * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getArgumentList()
    * @generated
    * @ordered
    */
   protected argumentList argumentList;

   /**
    * The cached value of the '{@link #getClassBody() <em>Class Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getClassBody()
    * @generated
    * @ordered
    */
   protected classBody classBody;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected enumConstantImpl() {
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
      return TypePackage.Literals.ENUM_CONSTANT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<enumConstantModifier> getEnumConstantModifiers() {
      if (enumConstantModifiers == null) {
         enumConstantModifiers = new EObjectContainmentEList<enumConstantModifier>(enumConstantModifier.class, this,
            TypePackage.ENUM_CONSTANT__ENUM_CONSTANT_MODIFIERS);
      }
      return enumConstantModifiers;
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
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENUM_CONSTANT__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public argumentList getArgumentList() {
      return argumentList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetArgumentList(argumentList newArgumentList, NotificationChain msgs) {
      argumentList oldArgumentList = argumentList;
      argumentList = newArgumentList;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ENUM_CONSTANT__ARGUMENT_LIST, oldArgumentList, newArgumentList);
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
   public void setArgumentList(argumentList newArgumentList) {
      if (newArgumentList != argumentList) {
         NotificationChain msgs = null;
         if (argumentList != null)
            msgs = ((InternalEObject) argumentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_CONSTANT__ARGUMENT_LIST, null, msgs);
         if (newArgumentList != null)
            msgs = ((InternalEObject) newArgumentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_CONSTANT__ARGUMENT_LIST, null, msgs);
         msgs = basicSetArgumentList(newArgumentList, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENUM_CONSTANT__ARGUMENT_LIST,
            newArgumentList, newArgumentList));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classBody getClassBody() {
      return classBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetClassBody(classBody newClassBody, NotificationChain msgs) {
      classBody oldClassBody = classBody;
      classBody = newClassBody;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ENUM_CONSTANT__CLASS_BODY, oldClassBody, newClassBody);
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
   public void setClassBody(classBody newClassBody) {
      if (newClassBody != classBody) {
         NotificationChain msgs = null;
         if (classBody != null)
            msgs = ((InternalEObject) classBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_CONSTANT__CLASS_BODY, null, msgs);
         if (newClassBody != null)
            msgs = ((InternalEObject) newClassBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ENUM_CONSTANT__CLASS_BODY, null, msgs);
         msgs = basicSetClassBody(newClassBody, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENUM_CONSTANT__CLASS_BODY, newClassBody,
            newClassBody));
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
         case TypePackage.ENUM_CONSTANT__ENUM_CONSTANT_MODIFIERS :
            return ((InternalEList<?>) getEnumConstantModifiers()).basicRemove(otherEnd, msgs);
         case TypePackage.ENUM_CONSTANT__ARGUMENT_LIST :
            return basicSetArgumentList(null, msgs);
         case TypePackage.ENUM_CONSTANT__CLASS_BODY :
            return basicSetClassBody(null, msgs);
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
         case TypePackage.ENUM_CONSTANT__ENUM_CONSTANT_MODIFIERS :
            return getEnumConstantModifiers();
         case TypePackage.ENUM_CONSTANT__NAME :
            return getName();
         case TypePackage.ENUM_CONSTANT__ARGUMENT_LIST :
            return getArgumentList();
         case TypePackage.ENUM_CONSTANT__CLASS_BODY :
            return getClassBody();
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
         case TypePackage.ENUM_CONSTANT__ENUM_CONSTANT_MODIFIERS :
            getEnumConstantModifiers().clear();
            getEnumConstantModifiers().addAll((Collection<? extends enumConstantModifier>) newValue);
            return;
         case TypePackage.ENUM_CONSTANT__NAME :
            setName((String) newValue);
            return;
         case TypePackage.ENUM_CONSTANT__ARGUMENT_LIST :
            setArgumentList((argumentList) newValue);
            return;
         case TypePackage.ENUM_CONSTANT__CLASS_BODY :
            setClassBody((classBody) newValue);
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
         case TypePackage.ENUM_CONSTANT__ENUM_CONSTANT_MODIFIERS :
            getEnumConstantModifiers().clear();
            return;
         case TypePackage.ENUM_CONSTANT__NAME :
            setName(NAME_EDEFAULT);
            return;
         case TypePackage.ENUM_CONSTANT__ARGUMENT_LIST :
            setArgumentList((argumentList) null);
            return;
         case TypePackage.ENUM_CONSTANT__CLASS_BODY :
            setClassBody((classBody) null);
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
         case TypePackage.ENUM_CONSTANT__ENUM_CONSTANT_MODIFIERS :
            return enumConstantModifiers != null && !enumConstantModifiers.isEmpty();
         case TypePackage.ENUM_CONSTANT__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case TypePackage.ENUM_CONSTANT__ARGUMENT_LIST :
            return argumentList != null;
         case TypePackage.ENUM_CONSTANT__CLASS_BODY :
            return classBody != null;
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

} // enumConstantImpl
