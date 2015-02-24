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
import org.sourcepit.java.type.type.primitiveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.primitiveTypeImpl#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.primitiveTypeImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class primitiveTypeImpl extends typeImpl implements primitiveType {
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
    * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeName()
    * @generated
    * @ordered
    */
   protected static final String TYPE_NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeName()
    * @generated
    * @ordered
    */
   protected String typeName = TYPE_NAME_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected primitiveTypeImpl() {
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
      return TypePackage.Literals.PRIMITIVE_TYPE;
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
            TypePackage.PRIMITIVE_TYPE__ANNOTATIONS);
      }
      return annotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getTypeName() {
      return typeName;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setTypeName(String newTypeName) {
      String oldTypeName = typeName;
      typeName = newTypeName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PRIMITIVE_TYPE__TYPE_NAME, oldTypeName,
            typeName));
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
         case TypePackage.PRIMITIVE_TYPE__ANNOTATIONS :
            return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
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
         case TypePackage.PRIMITIVE_TYPE__ANNOTATIONS :
            return getAnnotations();
         case TypePackage.PRIMITIVE_TYPE__TYPE_NAME :
            return getTypeName();
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
         case TypePackage.PRIMITIVE_TYPE__ANNOTATIONS :
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends annotation>) newValue);
            return;
         case TypePackage.PRIMITIVE_TYPE__TYPE_NAME :
            setTypeName((String) newValue);
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
         case TypePackage.PRIMITIVE_TYPE__ANNOTATIONS :
            getAnnotations().clear();
            return;
         case TypePackage.PRIMITIVE_TYPE__TYPE_NAME :
            setTypeName(TYPE_NAME_EDEFAULT);
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
         case TypePackage.PRIMITIVE_TYPE__ANNOTATIONS :
            return annotations != null && !annotations.isEmpty();
         case TypePackage.PRIMITIVE_TYPE__TYPE_NAME :
            return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
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
      result.append(" (typeName: ");
      result.append(typeName);
      result.append(')');
      return result.toString();
   }

} // primitiveTypeImpl
