/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.extendsInterfaces;
import org.sourcepit.java.type.type.interfaceBody;
import org.sourcepit.java.type.type.normalInterfaceDeclaration;
import org.sourcepit.java.type.type.typeParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>normal Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.normalInterfaceDeclarationImpl#getTypeParameters <em>Type Parameters
 * </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.normalInterfaceDeclarationImpl#getExtendsInterfaces <em>Extends
 * Interfaces</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.normalInterfaceDeclarationImpl#getInterfaceBody <em>Interface Body</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class normalInterfaceDeclarationImpl extends interfaceDeclarationImpl implements normalInterfaceDeclaration {
   /**
    * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypeParameters()
    * @generated
    * @ordered
    */
   protected typeParameters typeParameters;

   /**
    * The cached value of the '{@link #getExtendsInterfaces() <em>Extends Interfaces</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getExtendsInterfaces()
    * @generated
    * @ordered
    */
   protected extendsInterfaces extendsInterfaces;

   /**
    * The cached value of the '{@link #getInterfaceBody() <em>Interface Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getInterfaceBody()
    * @generated
    * @ordered
    */
   protected interfaceBody interfaceBody;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected normalInterfaceDeclarationImpl() {
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
      return TypePackage.Literals.NORMAL_INTERFACE_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeParameters getTypeParameters() {
      return typeParameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetTypeParameters(typeParameters newTypeParameters, NotificationChain msgs) {
      typeParameters oldTypeParameters = typeParameters;
      typeParameters = newTypeParameters;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS, oldTypeParameters, newTypeParameters);
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
   public void setTypeParameters(typeParameters newTypeParameters) {
      if (newTypeParameters != typeParameters) {
         NotificationChain msgs = null;
         if (typeParameters != null)
            msgs = ((InternalEObject) typeParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS, null, msgs);
         if (newTypeParameters != null)
            msgs = ((InternalEObject) newTypeParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS, null, msgs);
         msgs = basicSetTypeParameters(newTypeParameters, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS, newTypeParameters, newTypeParameters));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public extendsInterfaces getExtendsInterfaces() {
      return extendsInterfaces;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetExtendsInterfaces(extendsInterfaces newExtendsInterfaces, NotificationChain msgs) {
      extendsInterfaces oldExtendsInterfaces = extendsInterfaces;
      extendsInterfaces = newExtendsInterfaces;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES, oldExtendsInterfaces, newExtendsInterfaces);
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
   public void setExtendsInterfaces(extendsInterfaces newExtendsInterfaces) {
      if (newExtendsInterfaces != extendsInterfaces) {
         NotificationChain msgs = null;
         if (extendsInterfaces != null)
            msgs = ((InternalEObject) extendsInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES, null, msgs);
         if (newExtendsInterfaces != null)
            msgs = ((InternalEObject) newExtendsInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES, null, msgs);
         msgs = basicSetExtendsInterfaces(newExtendsInterfaces, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES, newExtendsInterfaces, newExtendsInterfaces));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceBody getInterfaceBody() {
      return interfaceBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetInterfaceBody(interfaceBody newInterfaceBody, NotificationChain msgs) {
      interfaceBody oldInterfaceBody = interfaceBody;
      interfaceBody = newInterfaceBody;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY, oldInterfaceBody, newInterfaceBody);
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
   public void setInterfaceBody(interfaceBody newInterfaceBody) {
      if (newInterfaceBody != interfaceBody) {
         NotificationChain msgs = null;
         if (interfaceBody != null)
            msgs = ((InternalEObject) interfaceBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY, null, msgs);
         if (newInterfaceBody != null)
            msgs = ((InternalEObject) newInterfaceBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY, null, msgs);
         msgs = basicSetInterfaceBody(newInterfaceBody, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY, newInterfaceBody, newInterfaceBody));
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
         case TypePackage.NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS :
            return basicSetTypeParameters(null, msgs);
         case TypePackage.NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES :
            return basicSetExtendsInterfaces(null, msgs);
         case TypePackage.NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY :
            return basicSetInterfaceBody(null, msgs);
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
         case TypePackage.NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS :
            return getTypeParameters();
         case TypePackage.NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES :
            return getExtendsInterfaces();
         case TypePackage.NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY :
            return getInterfaceBody();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case TypePackage.NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS :
            setTypeParameters((typeParameters) newValue);
            return;
         case TypePackage.NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES :
            setExtendsInterfaces((extendsInterfaces) newValue);
            return;
         case TypePackage.NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY :
            setInterfaceBody((interfaceBody) newValue);
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
         case TypePackage.NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS :
            setTypeParameters((typeParameters) null);
            return;
         case TypePackage.NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES :
            setExtendsInterfaces((extendsInterfaces) null);
            return;
         case TypePackage.NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY :
            setInterfaceBody((interfaceBody) null);
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
         case TypePackage.NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS :
            return typeParameters != null;
         case TypePackage.NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES :
            return extendsInterfaces != null;
         case TypePackage.NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY :
            return interfaceBody != null;
      }
      return super.eIsSet(featureID);
   }

} // normalInterfaceDeclarationImpl
