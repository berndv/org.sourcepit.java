/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.sourcepit.java.type.type.ClassTypeSegment;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.typeArguments;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Type Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.ClassTypeSegmentImpl#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.ClassTypeSegmentImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassTypeSegmentImpl extends MinimalEObjectImpl.Container implements ClassTypeSegment {
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
   protected ClassTypeSegmentImpl() {
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
      return TypePackage.Literals.CLASS_TYPE_SEGMENT;
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
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CLASS_TYPE_SEGMENT__NAME, oldName, name));
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
            TypePackage.CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS, oldTypeArguments, newTypeArguments);
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
               - TypePackage.CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS, null, msgs);
         if (newTypeArguments != null)
            msgs = ((InternalEObject) newTypeArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS, null, msgs);
         msgs = basicSetTypeArguments(newTypeArguments, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS,
            newTypeArguments, newTypeArguments));
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
         case TypePackage.CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS :
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
         case TypePackage.CLASS_TYPE_SEGMENT__NAME :
            return getName();
         case TypePackage.CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS :
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
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case TypePackage.CLASS_TYPE_SEGMENT__NAME :
            setName((String) newValue);
            return;
         case TypePackage.CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS :
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
         case TypePackage.CLASS_TYPE_SEGMENT__NAME :
            setName(NAME_EDEFAULT);
            return;
         case TypePackage.CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS :
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
         case TypePackage.CLASS_TYPE_SEGMENT__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case TypePackage.CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS :
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

} // ClassTypeSegmentImpl
