/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.ConstructorModifiers;
import org.sourcepit.java.type.type.JavaConstructorModifier;
import org.sourcepit.java.type.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Constructor Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.JavaConstructorModifierImpl#getModifier <em>Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaConstructorModifierImpl extends constructorModifierImpl implements JavaConstructorModifier {
   /**
    * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getModifier()
    * @generated
    * @ordered
    */
   protected static final ConstructorModifiers MODIFIER_EDEFAULT = ConstructorModifiers.PUBLIC;

   /**
    * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getModifier()
    * @generated
    * @ordered
    */
   protected ConstructorModifiers modifier = MODIFIER_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected JavaConstructorModifierImpl() {
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
      return TypePackage.Literals.JAVA_CONSTRUCTOR_MODIFIER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ConstructorModifiers getModifier() {
      return modifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setModifier(ConstructorModifiers newModifier) {
      ConstructorModifiers oldModifier = modifier;
      modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.JAVA_CONSTRUCTOR_MODIFIER__MODIFIER,
            oldModifier, modifier));
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
         case TypePackage.JAVA_CONSTRUCTOR_MODIFIER__MODIFIER :
            return getModifier();
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
         case TypePackage.JAVA_CONSTRUCTOR_MODIFIER__MODIFIER :
            setModifier((ConstructorModifiers) newValue);
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
         case TypePackage.JAVA_CONSTRUCTOR_MODIFIER__MODIFIER :
            setModifier(MODIFIER_EDEFAULT);
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
         case TypePackage.JAVA_CONSTRUCTOR_MODIFIER__MODIFIER :
            return modifier != MODIFIER_EDEFAULT;
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
      result.append(" (modifier: ");
      result.append(modifier);
      result.append(')');
      return result.toString();
   }

} // JavaConstructorModifierImpl
