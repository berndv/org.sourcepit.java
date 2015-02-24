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
import org.sourcepit.java.type.type.constructorDeclarator;
import org.sourcepit.java.type.type.formalParameterList;
import org.sourcepit.java.type.type.typeParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constructor Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.constructorDeclaratorImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.constructorDeclaratorImpl#getSimpleTypeName <em>Simple Type Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.constructorDeclaratorImpl#getFormalParameterList <em>Formal Parameter
 * List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constructorDeclaratorImpl extends MinimalEObjectImpl.Container implements constructorDeclarator {
   /**
    * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeParameters()
    * @generated
    * @ordered
    */
   protected EList<typeParameters> typeParameters;

   /**
    * The default value of the '{@link #getSimpleTypeName() <em>Simple Type Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSimpleTypeName()
    * @generated
    * @ordered
    */
   protected static final String SIMPLE_TYPE_NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getSimpleTypeName() <em>Simple Type Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSimpleTypeName()
    * @generated
    * @ordered
    */
   protected String simpleTypeName = SIMPLE_TYPE_NAME_EDEFAULT;

   /**
    * The cached value of the '{@link #getFormalParameterList() <em>Formal Parameter List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getFormalParameterList()
    * @generated
    * @ordered
    */
   protected formalParameterList formalParameterList;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected constructorDeclaratorImpl() {
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
      return TypePackage.Literals.CONSTRUCTOR_DECLARATOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<typeParameters> getTypeParameters() {
      if (typeParameters == null) {
         typeParameters = new EObjectContainmentEList<typeParameters>(typeParameters.class, this,
            TypePackage.CONSTRUCTOR_DECLARATOR__TYPE_PARAMETERS);
      }
      return typeParameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getSimpleTypeName() {
      return simpleTypeName;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setSimpleTypeName(String newSimpleTypeName) {
      String oldSimpleTypeName = simpleTypeName;
      simpleTypeName = newSimpleTypeName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CONSTRUCTOR_DECLARATOR__SIMPLE_TYPE_NAME,
            oldSimpleTypeName, simpleTypeName));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public formalParameterList getFormalParameterList() {
      return formalParameterList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetFormalParameterList(formalParameterList newFormalParameterList,
      NotificationChain msgs) {
      formalParameterList oldFormalParameterList = formalParameterList;
      formalParameterList = newFormalParameterList;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST, oldFormalParameterList, newFormalParameterList);
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
   public void setFormalParameterList(formalParameterList newFormalParameterList) {
      if (newFormalParameterList != formalParameterList) {
         NotificationChain msgs = null;
         if (formalParameterList != null)
            msgs = ((InternalEObject) formalParameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST, null, msgs);
         if (newFormalParameterList != null)
            msgs = ((InternalEObject) newFormalParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST, null, msgs);
         msgs = basicSetFormalParameterList(newFormalParameterList, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST, newFormalParameterList, newFormalParameterList));
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
         case TypePackage.CONSTRUCTOR_DECLARATOR__TYPE_PARAMETERS :
            return ((InternalEList<?>) getTypeParameters()).basicRemove(otherEnd, msgs);
         case TypePackage.CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST :
            return basicSetFormalParameterList(null, msgs);
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
         case TypePackage.CONSTRUCTOR_DECLARATOR__TYPE_PARAMETERS :
            return getTypeParameters();
         case TypePackage.CONSTRUCTOR_DECLARATOR__SIMPLE_TYPE_NAME :
            return getSimpleTypeName();
         case TypePackage.CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST :
            return getFormalParameterList();
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
         case TypePackage.CONSTRUCTOR_DECLARATOR__TYPE_PARAMETERS :
            getTypeParameters().clear();
            getTypeParameters().addAll((Collection<? extends typeParameters>) newValue);
            return;
         case TypePackage.CONSTRUCTOR_DECLARATOR__SIMPLE_TYPE_NAME :
            setSimpleTypeName((String) newValue);
            return;
         case TypePackage.CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST :
            setFormalParameterList((formalParameterList) newValue);
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
         case TypePackage.CONSTRUCTOR_DECLARATOR__TYPE_PARAMETERS :
            getTypeParameters().clear();
            return;
         case TypePackage.CONSTRUCTOR_DECLARATOR__SIMPLE_TYPE_NAME :
            setSimpleTypeName(SIMPLE_TYPE_NAME_EDEFAULT);
            return;
         case TypePackage.CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST :
            setFormalParameterList((formalParameterList) null);
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
         case TypePackage.CONSTRUCTOR_DECLARATOR__TYPE_PARAMETERS :
            return typeParameters != null && !typeParameters.isEmpty();
         case TypePackage.CONSTRUCTOR_DECLARATOR__SIMPLE_TYPE_NAME :
            return SIMPLE_TYPE_NAME_EDEFAULT == null
               ? simpleTypeName != null
               : !SIMPLE_TYPE_NAME_EDEFAULT.equals(simpleTypeName);
         case TypePackage.CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST :
            return formalParameterList != null;
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
      result.append(" (simpleTypeName: ");
      result.append(simpleTypeName);
      result.append(')');
      return result.toString();
   }

} // constructorDeclaratorImpl
