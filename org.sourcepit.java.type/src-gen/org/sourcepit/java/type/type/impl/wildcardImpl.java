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
import org.sourcepit.java.type.type.wildcard;
import org.sourcepit.java.type.type.wildcardBounds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.wildcardImpl#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.wildcardImpl#getWildcardBounds <em>Wildcard Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class wildcardImpl extends typeArgumentImpl implements wildcard {
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
    * The cached value of the '{@link #getWildcardBounds() <em>Wildcard Bounds</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getWildcardBounds()
    * @generated
    * @ordered
    */
   protected wildcardBounds wildcardBounds;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected wildcardImpl() {
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
      return TypePackage.Literals.WILDCARD;
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
            TypePackage.WILDCARD__ANNOTATIONS);
      }
      return annotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public wildcardBounds getWildcardBounds() {
      return wildcardBounds;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetWildcardBounds(wildcardBounds newWildcardBounds, NotificationChain msgs) {
      wildcardBounds oldWildcardBounds = wildcardBounds;
      wildcardBounds = newWildcardBounds;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.WILDCARD__WILDCARD_BOUNDS, oldWildcardBounds, newWildcardBounds);
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
   public void setWildcardBounds(wildcardBounds newWildcardBounds) {
      if (newWildcardBounds != wildcardBounds) {
         NotificationChain msgs = null;
         if (wildcardBounds != null)
            msgs = ((InternalEObject) wildcardBounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.WILDCARD__WILDCARD_BOUNDS, null, msgs);
         if (newWildcardBounds != null)
            msgs = ((InternalEObject) newWildcardBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.WILDCARD__WILDCARD_BOUNDS, null, msgs);
         msgs = basicSetWildcardBounds(newWildcardBounds, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.WILDCARD__WILDCARD_BOUNDS,
            newWildcardBounds, newWildcardBounds));
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
         case TypePackage.WILDCARD__ANNOTATIONS :
            return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
         case TypePackage.WILDCARD__WILDCARD_BOUNDS :
            return basicSetWildcardBounds(null, msgs);
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
         case TypePackage.WILDCARD__ANNOTATIONS :
            return getAnnotations();
         case TypePackage.WILDCARD__WILDCARD_BOUNDS :
            return getWildcardBounds();
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
         case TypePackage.WILDCARD__ANNOTATIONS :
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends annotation>) newValue);
            return;
         case TypePackage.WILDCARD__WILDCARD_BOUNDS :
            setWildcardBounds((wildcardBounds) newValue);
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
         case TypePackage.WILDCARD__ANNOTATIONS :
            getAnnotations().clear();
            return;
         case TypePackage.WILDCARD__WILDCARD_BOUNDS :
            setWildcardBounds((wildcardBounds) null);
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
         case TypePackage.WILDCARD__ANNOTATIONS :
            return annotations != null && !annotations.isEmpty();
         case TypePackage.WILDCARD__WILDCARD_BOUNDS :
            return wildcardBounds != null;
      }
      return super.eIsSet(featureID);
   }

} // wildcardImpl
