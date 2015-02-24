/**
 */

package org.sourcepit.java.type.type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.unannClassType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unann Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.unannClassTypeImpl#getClassTypeSegment <em>Class Type Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unannClassTypeImpl extends unannClassOrInterfaceTypeImpl implements unannClassType {
   /**
    * The cached value of the '{@link #getClassTypeSegment() <em>Class Type Segment</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getClassTypeSegment()
    * @generated
    * @ordered
    */
   protected EList<EObject> classTypeSegment;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected unannClassTypeImpl() {
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
      return TypePackage.Literals.UNANN_CLASS_TYPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<EObject> getClassTypeSegment() {
      if (classTypeSegment == null) {
         classTypeSegment = new EObjectContainmentEList<EObject>(EObject.class, this,
            TypePackage.UNANN_CLASS_TYPE__CLASS_TYPE_SEGMENT);
      }
      return classTypeSegment;
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
         case TypePackage.UNANN_CLASS_TYPE__CLASS_TYPE_SEGMENT :
            return ((InternalEList<?>) getClassTypeSegment()).basicRemove(otherEnd, msgs);
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
         case TypePackage.UNANN_CLASS_TYPE__CLASS_TYPE_SEGMENT :
            return getClassTypeSegment();
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
         case TypePackage.UNANN_CLASS_TYPE__CLASS_TYPE_SEGMENT :
            getClassTypeSegment().clear();
            getClassTypeSegment().addAll((Collection<? extends EObject>) newValue);
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
         case TypePackage.UNANN_CLASS_TYPE__CLASS_TYPE_SEGMENT :
            getClassTypeSegment().clear();
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
         case TypePackage.UNANN_CLASS_TYPE__CLASS_TYPE_SEGMENT :
            return classTypeSegment != null && !classTypeSegment.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // unannClassTypeImpl
