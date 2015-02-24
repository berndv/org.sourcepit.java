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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.methodBody;
import org.sourcepit.java.type.type.methodDeclaration;
import org.sourcepit.java.type.type.methodHeader;
import org.sourcepit.java.type.type.methodModifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.methodDeclarationImpl#getMethodModifiers <em>Method Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.methodDeclarationImpl#getMethodHeader <em>Method Header</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.methodDeclarationImpl#getMethodBody <em>Method Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class methodDeclarationImpl extends classMemberDeclarationImpl implements methodDeclaration {
   /**
    * The cached value of the '{@link #getMethodModifiers() <em>Method Modifiers</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getMethodModifiers()
    * @generated
    * @ordered
    */
   protected EList<methodModifier> methodModifiers;

   /**
    * The cached value of the '{@link #getMethodHeader() <em>Method Header</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getMethodHeader()
    * @generated
    * @ordered
    */
   protected methodHeader methodHeader;

   /**
    * The cached value of the '{@link #getMethodBody() <em>Method Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getMethodBody()
    * @generated
    * @ordered
    */
   protected methodBody methodBody;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected methodDeclarationImpl() {
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
      return TypePackage.Literals.METHOD_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<methodModifier> getMethodModifiers() {
      if (methodModifiers == null) {
         methodModifiers = new EObjectContainmentEList<methodModifier>(methodModifier.class, this,
            TypePackage.METHOD_DECLARATION__METHOD_MODIFIERS);
      }
      return methodModifiers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public methodHeader getMethodHeader() {
      return methodHeader;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetMethodHeader(methodHeader newMethodHeader, NotificationChain msgs) {
      methodHeader oldMethodHeader = methodHeader;
      methodHeader = newMethodHeader;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.METHOD_DECLARATION__METHOD_HEADER, oldMethodHeader, newMethodHeader);
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
   public void setMethodHeader(methodHeader newMethodHeader) {
      if (newMethodHeader != methodHeader) {
         NotificationChain msgs = null;
         if (methodHeader != null)
            msgs = ((InternalEObject) methodHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_DECLARATION__METHOD_HEADER, null, msgs);
         if (newMethodHeader != null)
            msgs = ((InternalEObject) newMethodHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_DECLARATION__METHOD_HEADER, null, msgs);
         msgs = basicSetMethodHeader(newMethodHeader, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.METHOD_DECLARATION__METHOD_HEADER,
            newMethodHeader, newMethodHeader));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public methodBody getMethodBody() {
      return methodBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetMethodBody(methodBody newMethodBody, NotificationChain msgs) {
      methodBody oldMethodBody = methodBody;
      methodBody = newMethodBody;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.METHOD_DECLARATION__METHOD_BODY, oldMethodBody, newMethodBody);
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
   public void setMethodBody(methodBody newMethodBody) {
      if (newMethodBody != methodBody) {
         NotificationChain msgs = null;
         if (methodBody != null)
            msgs = ((InternalEObject) methodBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_DECLARATION__METHOD_BODY, null, msgs);
         if (newMethodBody != null)
            msgs = ((InternalEObject) newMethodBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_DECLARATION__METHOD_BODY, null, msgs);
         msgs = basicSetMethodBody(newMethodBody, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.METHOD_DECLARATION__METHOD_BODY,
            newMethodBody, newMethodBody));
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
         case TypePackage.METHOD_DECLARATION__METHOD_MODIFIERS :
            return ((InternalEList<?>) getMethodModifiers()).basicRemove(otherEnd, msgs);
         case TypePackage.METHOD_DECLARATION__METHOD_HEADER :
            return basicSetMethodHeader(null, msgs);
         case TypePackage.METHOD_DECLARATION__METHOD_BODY :
            return basicSetMethodBody(null, msgs);
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
         case TypePackage.METHOD_DECLARATION__METHOD_MODIFIERS :
            return getMethodModifiers();
         case TypePackage.METHOD_DECLARATION__METHOD_HEADER :
            return getMethodHeader();
         case TypePackage.METHOD_DECLARATION__METHOD_BODY :
            return getMethodBody();
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
         case TypePackage.METHOD_DECLARATION__METHOD_MODIFIERS :
            getMethodModifiers().clear();
            getMethodModifiers().addAll((Collection<? extends methodModifier>) newValue);
            return;
         case TypePackage.METHOD_DECLARATION__METHOD_HEADER :
            setMethodHeader((methodHeader) newValue);
            return;
         case TypePackage.METHOD_DECLARATION__METHOD_BODY :
            setMethodBody((methodBody) newValue);
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
         case TypePackage.METHOD_DECLARATION__METHOD_MODIFIERS :
            getMethodModifiers().clear();
            return;
         case TypePackage.METHOD_DECLARATION__METHOD_HEADER :
            setMethodHeader((methodHeader) null);
            return;
         case TypePackage.METHOD_DECLARATION__METHOD_BODY :
            setMethodBody((methodBody) null);
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
         case TypePackage.METHOD_DECLARATION__METHOD_MODIFIERS :
            return methodModifiers != null && !methodModifiers.isEmpty();
         case TypePackage.METHOD_DECLARATION__METHOD_HEADER :
            return methodHeader != null;
         case TypePackage.METHOD_DECLARATION__METHOD_BODY :
            return methodBody != null;
      }
      return super.eIsSet(featureID);
   }

} // methodDeclarationImpl
