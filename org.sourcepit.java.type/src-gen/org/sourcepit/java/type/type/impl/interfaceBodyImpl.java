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
import org.sourcepit.java.type.type.interfaceBody;
import org.sourcepit.java.type.type.interfaceMemberDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interface Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.interfaceBodyImpl#getInterfaceMemberDeclarations <em>Interface Member
 * Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class interfaceBodyImpl extends MinimalEObjectImpl.Container implements interfaceBody {
   /**
    * The cached value of the '{@link #getInterfaceMemberDeclarations() <em>Interface Member Declarations</em>}'
    * containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getInterfaceMemberDeclarations()
    * @generated
    * @ordered
    */
   protected EList<interfaceMemberDeclaration> interfaceMemberDeclarations;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected interfaceBodyImpl() {
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
      return TypePackage.Literals.INTERFACE_BODY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<interfaceMemberDeclaration> getInterfaceMemberDeclarations() {
      if (interfaceMemberDeclarations == null) {
         interfaceMemberDeclarations = new EObjectContainmentEList<interfaceMemberDeclaration>(
            interfaceMemberDeclaration.class, this, TypePackage.INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS);
      }
      return interfaceMemberDeclarations;
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
         case TypePackage.INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS :
            return ((InternalEList<?>) getInterfaceMemberDeclarations()).basicRemove(otherEnd, msgs);
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
         case TypePackage.INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS :
            return getInterfaceMemberDeclarations();
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
         case TypePackage.INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS :
            getInterfaceMemberDeclarations().clear();
            getInterfaceMemberDeclarations().addAll((Collection<? extends interfaceMemberDeclaration>) newValue);
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
         case TypePackage.INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS :
            getInterfaceMemberDeclarations().clear();
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
         case TypePackage.INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS :
            return interfaceMemberDeclarations != null && !interfaceMemberDeclarations.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // interfaceBodyImpl
