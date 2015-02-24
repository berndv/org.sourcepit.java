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
import org.sourcepit.java.type.type.compilationUnit;
import org.sourcepit.java.type.type.importDeclaration;
import org.sourcepit.java.type.type.packageDeclaration;
import org.sourcepit.java.type.type.typeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.compilationUnitImpl#getPackage <em>Package</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.compilationUnitImpl#getImports <em>Imports</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.compilationUnitImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class compilationUnitImpl extends MinimalEObjectImpl.Container implements compilationUnit {
   /**
    * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getPackage()
    * @generated
    * @ordered
    */
   protected packageDeclaration package_;

   /**
    * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getImports()
    * @generated
    * @ordered
    */
   protected EList<importDeclaration> imports;

   /**
    * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypes()
    * @generated
    * @ordered
    */
   protected EList<typeDeclaration> types;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected compilationUnitImpl() {
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
      return TypePackage.Literals.COMPILATION_UNIT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public packageDeclaration getPackage() {
      return package_;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetPackage(packageDeclaration newPackage, NotificationChain msgs) {
      packageDeclaration oldPackage = package_;
      package_ = newPackage;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.COMPILATION_UNIT__PACKAGE, oldPackage, newPackage);
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
   public void setPackage(packageDeclaration newPackage) {
      if (newPackage != package_) {
         NotificationChain msgs = null;
         if (package_ != null)
            msgs = ((InternalEObject) package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.COMPILATION_UNIT__PACKAGE, null, msgs);
         if (newPackage != null)
            msgs = ((InternalEObject) newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.COMPILATION_UNIT__PACKAGE, null, msgs);
         msgs = basicSetPackage(newPackage, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.COMPILATION_UNIT__PACKAGE, newPackage,
            newPackage));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<importDeclaration> getImports() {
      if (imports == null) {
         imports = new EObjectContainmentEList<importDeclaration>(importDeclaration.class, this,
            TypePackage.COMPILATION_UNIT__IMPORTS);
      }
      return imports;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<typeDeclaration> getTypes() {
      if (types == null) {
         types = new EObjectContainmentEList<typeDeclaration>(typeDeclaration.class, this,
            TypePackage.COMPILATION_UNIT__TYPES);
      }
      return types;
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
         case TypePackage.COMPILATION_UNIT__PACKAGE :
            return basicSetPackage(null, msgs);
         case TypePackage.COMPILATION_UNIT__IMPORTS :
            return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
         case TypePackage.COMPILATION_UNIT__TYPES :
            return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
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
         case TypePackage.COMPILATION_UNIT__PACKAGE :
            return getPackage();
         case TypePackage.COMPILATION_UNIT__IMPORTS :
            return getImports();
         case TypePackage.COMPILATION_UNIT__TYPES :
            return getTypes();
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
         case TypePackage.COMPILATION_UNIT__PACKAGE :
            setPackage((packageDeclaration) newValue);
            return;
         case TypePackage.COMPILATION_UNIT__IMPORTS :
            getImports().clear();
            getImports().addAll((Collection<? extends importDeclaration>) newValue);
            return;
         case TypePackage.COMPILATION_UNIT__TYPES :
            getTypes().clear();
            getTypes().addAll((Collection<? extends typeDeclaration>) newValue);
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
         case TypePackage.COMPILATION_UNIT__PACKAGE :
            setPackage((packageDeclaration) null);
            return;
         case TypePackage.COMPILATION_UNIT__IMPORTS :
            getImports().clear();
            return;
         case TypePackage.COMPILATION_UNIT__TYPES :
            getTypes().clear();
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
         case TypePackage.COMPILATION_UNIT__PACKAGE :
            return package_ != null;
         case TypePackage.COMPILATION_UNIT__IMPORTS :
            return imports != null && !imports.isEmpty();
         case TypePackage.COMPILATION_UNIT__TYPES :
            return types != null && !types.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // compilationUnitImpl
