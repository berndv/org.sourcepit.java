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
import org.sourcepit.java.type.type.annotation;
import org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType;
import org.sourcepit.java.type.type.typeArguments;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>class Type lfno class Or Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.classType_lfno_classOrInterfaceTypeImpl#getAnnotations <em>Annotations
 * </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.classType_lfno_classOrInterfaceTypeImpl#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.classType_lfno_classOrInterfaceTypeImpl#getTypeArguments <em>Type
 * Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class classType_lfno_classOrInterfaceTypeImpl extends interfaceType_lfno_classOrInterfaceTypeImpl
   implements
      classType_lfno_classOrInterfaceType {
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
    * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeArguments()
    * @generated
    * @ordered
    */
   protected typeArguments typeArguments;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected classType_lfno_classOrInterfaceTypeImpl() {
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
      return TypePackage.Literals.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE;
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
            TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS);
      }
      return annotations;
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
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeArguments getTypeArguments() {
      return typeArguments;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetTypeArguments(typeArguments newTypeArguments, NotificationChain msgs) {
      typeArguments oldTypeArguments = typeArguments;
      typeArguments = newTypeArguments;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS, oldTypeArguments, newTypeArguments);
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
   public void setTypeArguments(typeArguments newTypeArguments) {
      if (newTypeArguments != typeArguments) {
         NotificationChain msgs = null;
         if (typeArguments != null)
            msgs = ((InternalEObject) typeArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS, null, msgs);
         if (newTypeArguments != null)
            msgs = ((InternalEObject) newTypeArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS, null, msgs);
         msgs = basicSetTypeArguments(newTypeArguments, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS, newTypeArguments, newTypeArguments));
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
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS :
            return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS :
            return basicSetTypeArguments(null, msgs);
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
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS :
            return getAnnotations();
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__NAME :
            return getName();
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS :
            return getTypeArguments();
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
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS :
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends annotation>) newValue);
            return;
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__NAME :
            setName((String) newValue);
            return;
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS :
            setTypeArguments((typeArguments) newValue);
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
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS :
            getAnnotations().clear();
            return;
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__NAME :
            setName(NAME_EDEFAULT);
            return;
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS :
            setTypeArguments((typeArguments) null);
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
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS :
            return annotations != null && !annotations.isEmpty();
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS :
            return typeArguments != null;
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

} // classType_lfno_classOrInterfaceTypeImpl
