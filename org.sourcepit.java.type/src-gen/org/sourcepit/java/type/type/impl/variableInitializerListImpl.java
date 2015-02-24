/**
 */

package org.sourcepit.java.type.type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.variableInitializer;
import org.sourcepit.java.type.type.variableInitializerList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable Initializer List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.variableInitializerListImpl#getVariableInitializer <em>Variable
 * Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variableInitializerListImpl extends MinimalEObjectImpl.Container implements variableInitializerList {
   /**
    * The cached value of the '{@link #getVariableInitializer() <em>Variable Initializer</em>}' containment reference
    * list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVariableInitializer()
    * @generated
    * @ordered
    */
   protected EList<variableInitializer> variableInitializer;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected variableInitializerListImpl() {
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
      return TypePackage.Literals.VARIABLE_INITIALIZER_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<variableInitializer> getVariableInitializer() {
      if (variableInitializer == null) {
         variableInitializer = new EObjectContainmentEList<variableInitializer>(variableInitializer.class, this,
            TypePackage.VARIABLE_INITIALIZER_LIST__VARIABLE_INITIALIZER);
      }
      return variableInitializer;
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
         case TypePackage.VARIABLE_INITIALIZER_LIST__VARIABLE_INITIALIZER :
            return ((InternalEList<?>) getVariableInitializer()).basicRemove(otherEnd, msgs);
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
         case TypePackage.VARIABLE_INITIALIZER_LIST__VARIABLE_INITIALIZER :
            return getVariableInitializer();
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
         case TypePackage.VARIABLE_INITIALIZER_LIST__VARIABLE_INITIALIZER :
            getVariableInitializer().clear();
            getVariableInitializer().addAll((Collection<? extends variableInitializer>) newValue);
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
         case TypePackage.VARIABLE_INITIALIZER_LIST__VARIABLE_INITIALIZER :
            getVariableInitializer().clear();
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
         case TypePackage.VARIABLE_INITIALIZER_LIST__VARIABLE_INITIALIZER :
            return variableInitializer != null && !variableInitializer.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // variableInitializerListImpl
