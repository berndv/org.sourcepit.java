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
import org.sourcepit.java.type.type.typeArgument;
import org.sourcepit.java.type.type.typeArgumentList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Argument List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.typeArgumentListImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeArgumentListImpl extends typeArgumentsImpl implements typeArgumentList {
   /**
    * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeArguments()
    * @generated
    * @ordered
    */
   protected EList<typeArgument> typeArguments;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected typeArgumentListImpl() {
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
      return TypePackage.Literals.TYPE_ARGUMENT_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<typeArgument> getTypeArguments() {
      if (typeArguments == null) {
         typeArguments = new EObjectContainmentEList<typeArgument>(typeArgument.class, this,
            TypePackage.TYPE_ARGUMENT_LIST__TYPE_ARGUMENTS);
      }
      return typeArguments;
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
         case TypePackage.TYPE_ARGUMENT_LIST__TYPE_ARGUMENTS :
            return ((InternalEList<?>) getTypeArguments()).basicRemove(otherEnd, msgs);
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
         case TypePackage.TYPE_ARGUMENT_LIST__TYPE_ARGUMENTS :
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
         case TypePackage.TYPE_ARGUMENT_LIST__TYPE_ARGUMENTS :
            getTypeArguments().clear();
            getTypeArguments().addAll((Collection<? extends typeArgument>) newValue);
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
         case TypePackage.TYPE_ARGUMENT_LIST__TYPE_ARGUMENTS :
            getTypeArguments().clear();
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
         case TypePackage.TYPE_ARGUMENT_LIST__TYPE_ARGUMENTS :
            return typeArguments != null && !typeArguments.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // typeArgumentListImpl
