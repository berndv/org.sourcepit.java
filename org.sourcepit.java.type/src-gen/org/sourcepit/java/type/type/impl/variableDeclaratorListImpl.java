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
import org.sourcepit.java.type.type.variableDeclarator;
import org.sourcepit.java.type.type.variableDeclaratorList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable Declarator List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.variableDeclaratorListImpl#getVariableDeclarators <em>Variable
 * Declarators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variableDeclaratorListImpl extends MinimalEObjectImpl.Container implements variableDeclaratorList {
   /**
    * The cached value of the '{@link #getVariableDeclarators() <em>Variable Declarators</em>}' containment reference
    * list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVariableDeclarators()
    * @generated
    * @ordered
    */
   protected EList<variableDeclarator> variableDeclarators;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected variableDeclaratorListImpl() {
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
      return TypePackage.Literals.VARIABLE_DECLARATOR_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<variableDeclarator> getVariableDeclarators() {
      if (variableDeclarators == null) {
         variableDeclarators = new EObjectContainmentEList<variableDeclarator>(variableDeclarator.class, this,
            TypePackage.VARIABLE_DECLARATOR_LIST__VARIABLE_DECLARATORS);
      }
      return variableDeclarators;
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
         case TypePackage.VARIABLE_DECLARATOR_LIST__VARIABLE_DECLARATORS :
            return ((InternalEList<?>) getVariableDeclarators()).basicRemove(otherEnd, msgs);
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
         case TypePackage.VARIABLE_DECLARATOR_LIST__VARIABLE_DECLARATORS :
            return getVariableDeclarators();
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
         case TypePackage.VARIABLE_DECLARATOR_LIST__VARIABLE_DECLARATORS :
            getVariableDeclarators().clear();
            getVariableDeclarators().addAll((Collection<? extends variableDeclarator>) newValue);
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
         case TypePackage.VARIABLE_DECLARATOR_LIST__VARIABLE_DECLARATORS :
            getVariableDeclarators().clear();
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
         case TypePackage.VARIABLE_DECLARATOR_LIST__VARIABLE_DECLARATORS :
            return variableDeclarators != null && !variableDeclarators.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // variableDeclaratorListImpl
