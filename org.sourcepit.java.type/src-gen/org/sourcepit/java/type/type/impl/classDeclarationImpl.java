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
import org.sourcepit.java.type.type.classDeclaration;
import org.sourcepit.java.type.type.classModifier;
import org.sourcepit.java.type.type.superinterfaces;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.classDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.classDeclarationImpl#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.classDeclarationImpl#getSuperinterfaces <em>Superinterfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class classDeclarationImpl extends typeDeclarationImpl implements classDeclaration {
   /**
    * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getModifiers()
    * @generated
    * @ordered
    */
   protected EList<classModifier> modifiers;

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
    * The cached value of the '{@link #getSuperinterfaces() <em>Superinterfaces</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSuperinterfaces()
    * @generated
    * @ordered
    */
   protected superinterfaces superinterfaces;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected classDeclarationImpl() {
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
      return TypePackage.Literals.CLASS_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<classModifier> getModifiers() {
      if (modifiers == null) {
         modifiers = new EObjectContainmentEList<classModifier>(classModifier.class, this,
            TypePackage.CLASS_DECLARATION__MODIFIERS);
      }
      return modifiers;
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
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CLASS_DECLARATION__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public superinterfaces getSuperinterfaces() {
      return superinterfaces;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetSuperinterfaces(superinterfaces newSuperinterfaces, NotificationChain msgs) {
      superinterfaces oldSuperinterfaces = superinterfaces;
      superinterfaces = newSuperinterfaces;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.CLASS_DECLARATION__SUPERINTERFACES, oldSuperinterfaces, newSuperinterfaces);
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
   public void setSuperinterfaces(superinterfaces newSuperinterfaces) {
      if (newSuperinterfaces != superinterfaces) {
         NotificationChain msgs = null;
         if (superinterfaces != null)
            msgs = ((InternalEObject) superinterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CLASS_DECLARATION__SUPERINTERFACES, null, msgs);
         if (newSuperinterfaces != null)
            msgs = ((InternalEObject) newSuperinterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CLASS_DECLARATION__SUPERINTERFACES, null, msgs);
         msgs = basicSetSuperinterfaces(newSuperinterfaces, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CLASS_DECLARATION__SUPERINTERFACES,
            newSuperinterfaces, newSuperinterfaces));
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
         case TypePackage.CLASS_DECLARATION__MODIFIERS :
            return ((InternalEList<?>) getModifiers()).basicRemove(otherEnd, msgs);
         case TypePackage.CLASS_DECLARATION__SUPERINTERFACES :
            return basicSetSuperinterfaces(null, msgs);
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
         case TypePackage.CLASS_DECLARATION__MODIFIERS :
            return getModifiers();
         case TypePackage.CLASS_DECLARATION__NAME :
            return getName();
         case TypePackage.CLASS_DECLARATION__SUPERINTERFACES :
            return getSuperinterfaces();
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
         case TypePackage.CLASS_DECLARATION__MODIFIERS :
            getModifiers().clear();
            getModifiers().addAll((Collection<? extends classModifier>) newValue);
            return;
         case TypePackage.CLASS_DECLARATION__NAME :
            setName((String) newValue);
            return;
         case TypePackage.CLASS_DECLARATION__SUPERINTERFACES :
            setSuperinterfaces((superinterfaces) newValue);
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
         case TypePackage.CLASS_DECLARATION__MODIFIERS :
            getModifiers().clear();
            return;
         case TypePackage.CLASS_DECLARATION__NAME :
            setName(NAME_EDEFAULT);
            return;
         case TypePackage.CLASS_DECLARATION__SUPERINTERFACES :
            setSuperinterfaces((superinterfaces) null);
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
         case TypePackage.CLASS_DECLARATION__MODIFIERS :
            return modifiers != null && !modifiers.isEmpty();
         case TypePackage.CLASS_DECLARATION__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case TypePackage.CLASS_DECLARATION__SUPERINTERFACES :
            return superinterfaces != null;
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

} // classDeclarationImpl
