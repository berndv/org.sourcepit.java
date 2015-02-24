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
import org.sourcepit.java.type.type.dims;
import org.sourcepit.java.type.type.formalParameterList;
import org.sourcepit.java.type.type.methodDeclarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>method Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.methodDeclaratorImpl#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.methodDeclaratorImpl#getParameters <em>Parameters</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.methodDeclaratorImpl#getDims_ <em>Dims </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class methodDeclaratorImpl extends MinimalEObjectImpl.Container implements methodDeclarator {
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
    * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getParameters()
    * @generated
    * @ordered
    */
   protected EList<formalParameterList> parameters;

   /**
    * The cached value of the '{@link #getDims_() <em>Dims </em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getDims_()
    * @generated
    * @ordered
    */
   protected dims dims_;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected methodDeclaratorImpl() {
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
      return TypePackage.Literals.METHOD_DECLARATOR;
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
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.METHOD_DECLARATOR__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<formalParameterList> getParameters() {
      if (parameters == null) {
         parameters = new EObjectContainmentEList<formalParameterList>(formalParameterList.class, this,
            TypePackage.METHOD_DECLARATOR__PARAMETERS);
      }
      return parameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public dims getDims_() {
      return dims_;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetDims_(dims newDims_, NotificationChain msgs) {
      dims oldDims_ = dims_;
      dims_ = newDims_;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.METHOD_DECLARATOR__DIMS_, oldDims_, newDims_);
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
   public void setDims_(dims newDims_) {
      if (newDims_ != dims_) {
         NotificationChain msgs = null;
         if (dims_ != null)
            msgs = ((InternalEObject) dims_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_DECLARATOR__DIMS_, null, msgs);
         if (newDims_ != null)
            msgs = ((InternalEObject) newDims_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_DECLARATOR__DIMS_, null, msgs);
         msgs = basicSetDims_(newDims_, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.METHOD_DECLARATOR__DIMS_, newDims_, newDims_));
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
         case TypePackage.METHOD_DECLARATOR__PARAMETERS :
            return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
         case TypePackage.METHOD_DECLARATOR__DIMS_ :
            return basicSetDims_(null, msgs);
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
         case TypePackage.METHOD_DECLARATOR__NAME :
            return getName();
         case TypePackage.METHOD_DECLARATOR__PARAMETERS :
            return getParameters();
         case TypePackage.METHOD_DECLARATOR__DIMS_ :
            return getDims_();
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
         case TypePackage.METHOD_DECLARATOR__NAME :
            setName((String) newValue);
            return;
         case TypePackage.METHOD_DECLARATOR__PARAMETERS :
            getParameters().clear();
            getParameters().addAll((Collection<? extends formalParameterList>) newValue);
            return;
         case TypePackage.METHOD_DECLARATOR__DIMS_ :
            setDims_((dims) newValue);
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
         case TypePackage.METHOD_DECLARATOR__NAME :
            setName(NAME_EDEFAULT);
            return;
         case TypePackage.METHOD_DECLARATOR__PARAMETERS :
            getParameters().clear();
            return;
         case TypePackage.METHOD_DECLARATOR__DIMS_ :
            setDims_((dims) null);
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
         case TypePackage.METHOD_DECLARATOR__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case TypePackage.METHOD_DECLARATOR__PARAMETERS :
            return parameters != null && !parameters.isEmpty();
         case TypePackage.METHOD_DECLARATOR__DIMS_ :
            return dims_ != null;
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
      result.append(" (name: ");
      result.append(name);
      result.append(')');
      return result.toString();
   }

} // methodDeclaratorImpl
