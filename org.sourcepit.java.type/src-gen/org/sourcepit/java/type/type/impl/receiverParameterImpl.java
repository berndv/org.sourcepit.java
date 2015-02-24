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
import org.sourcepit.java.type.type.receiverParameter;
import org.sourcepit.java.type.type.unannType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>receiver Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.receiverParameterImpl#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.receiverParameterImpl#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.receiverParameterImpl#getQualifier <em>Qualifier</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.receiverParameterImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class receiverParameterImpl extends MinimalEObjectImpl.Container implements receiverParameter {
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
    * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getQualifier()
    * @generated
    * @ordered
    */
   protected static final String QUALIFIER_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getQualifier()
    * @generated
    * @ordered
    */
   protected String qualifier = QUALIFIER_EDEFAULT;

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
   protected receiverParameterImpl() {
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
      return TypePackage.Literals.RECEIVER_PARAMETER;
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
            TypePackage.RECEIVER_PARAMETER__ANNOTATIONS);
      }
      return annotations;
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
            TypePackage.RECEIVER_PARAMETER__TYPE, oldType, newType);
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
               - TypePackage.RECEIVER_PARAMETER__TYPE, null, msgs);
         if (newType != null)
            msgs = ((InternalEObject) newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.RECEIVER_PARAMETER__TYPE, null, msgs);
         msgs = basicSetType(newType, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.RECEIVER_PARAMETER__TYPE, newType, newType));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getQualifier() {
      return qualifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setQualifier(String newQualifier) {
      String oldQualifier = qualifier;
      qualifier = newQualifier;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.RECEIVER_PARAMETER__QUALIFIER, oldQualifier,
            qualifier));
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
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.RECEIVER_PARAMETER__NAME, oldName, name));
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
         case TypePackage.RECEIVER_PARAMETER__ANNOTATIONS :
            return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
         case TypePackage.RECEIVER_PARAMETER__TYPE :
            return basicSetType(null, msgs);
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
         case TypePackage.RECEIVER_PARAMETER__ANNOTATIONS :
            return getAnnotations();
         case TypePackage.RECEIVER_PARAMETER__TYPE :
            return getType();
         case TypePackage.RECEIVER_PARAMETER__QUALIFIER :
            return getQualifier();
         case TypePackage.RECEIVER_PARAMETER__NAME :
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
         case TypePackage.RECEIVER_PARAMETER__ANNOTATIONS :
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends annotation>) newValue);
            return;
         case TypePackage.RECEIVER_PARAMETER__TYPE :
            setType((unannType) newValue);
            return;
         case TypePackage.RECEIVER_PARAMETER__QUALIFIER :
            setQualifier((String) newValue);
            return;
         case TypePackage.RECEIVER_PARAMETER__NAME :
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
         case TypePackage.RECEIVER_PARAMETER__ANNOTATIONS :
            getAnnotations().clear();
            return;
         case TypePackage.RECEIVER_PARAMETER__TYPE :
            setType((unannType) null);
            return;
         case TypePackage.RECEIVER_PARAMETER__QUALIFIER :
            setQualifier(QUALIFIER_EDEFAULT);
            return;
         case TypePackage.RECEIVER_PARAMETER__NAME :
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
         case TypePackage.RECEIVER_PARAMETER__ANNOTATIONS :
            return annotations != null && !annotations.isEmpty();
         case TypePackage.RECEIVER_PARAMETER__TYPE :
            return type != null;
         case TypePackage.RECEIVER_PARAMETER__QUALIFIER :
            return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
         case TypePackage.RECEIVER_PARAMETER__NAME :
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
      result.append(" (qualifier: ");
      result.append(qualifier);
      result.append(", name: ");
      result.append(name);
      result.append(')');
      return result.toString();
   }

} // receiverParameterImpl
