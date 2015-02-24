/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.InterfaceMethodModifiers;
import org.sourcepit.java.type.type.JavaInterfaceMethodModifiers;
import org.sourcepit.java.type.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Interface Method Modifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.JavaInterfaceMethodModifiersImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaInterfaceMethodModifiersImpl extends interfaceMethodModifierImpl
   implements
      JavaInterfaceMethodModifiers {
   /**
    * The default value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getModifiers()
    * @generated
    * @ordered
    */
   protected static final InterfaceMethodModifiers MODIFIERS_EDEFAULT = InterfaceMethodModifiers.PUBLIC;

   /**
    * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getModifiers()
    * @generated
    * @ordered
    */
   protected InterfaceMethodModifiers modifiers = MODIFIERS_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected JavaInterfaceMethodModifiersImpl() {
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
      return TypePackage.Literals.JAVA_INTERFACE_METHOD_MODIFIERS;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public InterfaceMethodModifiers getModifiers() {
      return modifiers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setModifiers(InterfaceMethodModifiers newModifiers) {
      InterfaceMethodModifiers oldModifiers = modifiers;
      modifiers = newModifiers == null ? MODIFIERS_EDEFAULT : newModifiers;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS,
            oldModifiers, modifiers));
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
         case TypePackage.JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS :
            return getModifiers();
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
         case TypePackage.JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS :
            setModifiers((InterfaceMethodModifiers) newValue);
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
         case TypePackage.JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS :
            setModifiers(MODIFIERS_EDEFAULT);
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
         case TypePackage.JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS :
            return modifiers != MODIFIERS_EDEFAULT;
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
      result.append(" (modifiers: ");
      result.append(modifiers);
      result.append(')');
      return result.toString();
   }

} // JavaInterfaceMethodModifiersImpl
