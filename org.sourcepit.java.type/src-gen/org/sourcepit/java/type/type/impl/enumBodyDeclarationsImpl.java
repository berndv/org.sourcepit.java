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
import org.sourcepit.java.type.type.classBodyDeclaration;
import org.sourcepit.java.type.type.enumBodyDeclarations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>enum Body Declarations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.enumBodyDeclarationsImpl#getClassBodyDeclarations <em>Class Body
 * Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class enumBodyDeclarationsImpl extends MinimalEObjectImpl.Container implements enumBodyDeclarations {
   /**
    * The cached value of the '{@link #getClassBodyDeclarations() <em>Class Body Declarations</em>}' containment
    * reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getClassBodyDeclarations()
    * @generated
    * @ordered
    */
   protected EList<classBodyDeclaration> classBodyDeclarations;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected enumBodyDeclarationsImpl() {
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
      return TypePackage.Literals.ENUM_BODY_DECLARATIONS;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<classBodyDeclaration> getClassBodyDeclarations() {
      if (classBodyDeclarations == null) {
         classBodyDeclarations = new EObjectContainmentEList<classBodyDeclaration>(classBodyDeclaration.class, this,
            TypePackage.ENUM_BODY_DECLARATIONS__CLASS_BODY_DECLARATIONS);
      }
      return classBodyDeclarations;
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
         case TypePackage.ENUM_BODY_DECLARATIONS__CLASS_BODY_DECLARATIONS :
            return ((InternalEList<?>) getClassBodyDeclarations()).basicRemove(otherEnd, msgs);
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
         case TypePackage.ENUM_BODY_DECLARATIONS__CLASS_BODY_DECLARATIONS :
            return getClassBodyDeclarations();
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
         case TypePackage.ENUM_BODY_DECLARATIONS__CLASS_BODY_DECLARATIONS :
            getClassBodyDeclarations().clear();
            getClassBodyDeclarations().addAll((Collection<? extends classBodyDeclaration>) newValue);
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
         case TypePackage.ENUM_BODY_DECLARATIONS__CLASS_BODY_DECLARATIONS :
            getClassBodyDeclarations().clear();
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
         case TypePackage.ENUM_BODY_DECLARATIONS__CLASS_BODY_DECLARATIONS :
            return classBodyDeclarations != null && !classBodyDeclarations.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // enumBodyDeclarationsImpl
