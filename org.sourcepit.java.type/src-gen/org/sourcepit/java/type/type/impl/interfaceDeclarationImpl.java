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
import org.sourcepit.java.type.type.interfaceDeclaration;
import org.sourcepit.java.type.type.interfaceModifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.interfaceDeclarationImpl#getInterfaceModifiers <em>Interface Modifiers
 * </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.interfaceDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class interfaceDeclarationImpl extends typeDeclarationImpl implements interfaceDeclaration {
   /**
    * The cached value of the '{@link #getInterfaceModifiers() <em>Interface Modifiers</em>}' containment reference
    * list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getInterfaceModifiers()
    * @generated
    * @ordered
    */
   protected EList<interfaceModifier> interfaceModifiers;

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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected interfaceDeclarationImpl() {
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
      return TypePackage.Literals.INTERFACE_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<interfaceModifier> getInterfaceModifiers() {
      if (interfaceModifiers == null) {
         interfaceModifiers = new EObjectContainmentEList<interfaceModifier>(interfaceModifier.class, this,
            TypePackage.INTERFACE_DECLARATION__INTERFACE_MODIFIERS);
      }
      return interfaceModifiers;
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
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INTERFACE_DECLARATION__NAME, oldName, name));
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
         case TypePackage.INTERFACE_DECLARATION__INTERFACE_MODIFIERS :
            return ((InternalEList<?>) getInterfaceModifiers()).basicRemove(otherEnd, msgs);
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
         case TypePackage.INTERFACE_DECLARATION__INTERFACE_MODIFIERS :
            return getInterfaceModifiers();
         case TypePackage.INTERFACE_DECLARATION__NAME :
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
         case TypePackage.INTERFACE_DECLARATION__INTERFACE_MODIFIERS :
            getInterfaceModifiers().clear();
            getInterfaceModifiers().addAll((Collection<? extends interfaceModifier>) newValue);
            return;
         case TypePackage.INTERFACE_DECLARATION__NAME :
            setName((String) newValue);
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
         case TypePackage.INTERFACE_DECLARATION__INTERFACE_MODIFIERS :
            getInterfaceModifiers().clear();
            return;
         case TypePackage.INTERFACE_DECLARATION__NAME :
            setName(NAME_EDEFAULT);
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
         case TypePackage.INTERFACE_DECLARATION__INTERFACE_MODIFIERS :
            return interfaceModifiers != null && !interfaceModifiers.isEmpty();
         case TypePackage.INTERFACE_DECLARATION__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} // interfaceDeclarationImpl
