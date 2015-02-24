/**
 */

package org.sourcepit.java.type.type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.typeParameter;
import org.sourcepit.java.type.type.typeParameterList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.typeParameterListImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeParameterListImpl extends typeParametersImpl implements typeParameterList {
   /**
    * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeParameters()
    * @generated
    * @ordered
    */
   protected EList<typeParameter> typeParameters;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected typeParameterListImpl() {
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
      return TypePackage.Literals.TYPE_PARAMETER_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<typeParameter> getTypeParameters() {
      if (typeParameters == null) {
         typeParameters = new EObjectContainmentEList<typeParameter>(typeParameter.class, this,
            TypePackage.TYPE_PARAMETER_LIST__TYPE_PARAMETERS);
      }
      return typeParameters;
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
         case TypePackage.TYPE_PARAMETER_LIST__TYPE_PARAMETERS :
            return ((InternalEList<?>) getTypeParameters()).basicRemove(otherEnd, msgs);
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
         case TypePackage.TYPE_PARAMETER_LIST__TYPE_PARAMETERS :
            return getTypeParameters();
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
         case TypePackage.TYPE_PARAMETER_LIST__TYPE_PARAMETERS :
            getTypeParameters().clear();
            getTypeParameters().addAll((Collection<? extends typeParameter>) newValue);
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
         case TypePackage.TYPE_PARAMETER_LIST__TYPE_PARAMETERS :
            getTypeParameters().clear();
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
         case TypePackage.TYPE_PARAMETER_LIST__TYPE_PARAMETERS :
            return typeParameters != null && !typeParameters.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // typeParameterListImpl
