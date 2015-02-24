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
import org.sourcepit.java.type.type.annotation;
import org.sourcepit.java.type.type.methodDeclarator;
import org.sourcepit.java.type.type.methodHeader;
import org.sourcepit.java.type.type.result;
import org.sourcepit.java.type.type.throws_;
import org.sourcepit.java.type.type.typeParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>method Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.methodHeaderImpl#getResult <em>Result</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.methodHeaderImpl#getMethodDeclarator <em>Method Declarator</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.methodHeaderImpl#getThrows_ <em>Throws </em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.methodHeaderImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.methodHeaderImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class methodHeaderImpl extends MinimalEObjectImpl.Container implements methodHeader {
   /**
    * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getResult()
    * @generated
    * @ordered
    */
   protected result result;

   /**
    * The cached value of the '{@link #getMethodDeclarator() <em>Method Declarator</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getMethodDeclarator()
    * @generated
    * @ordered
    */
   protected methodDeclarator methodDeclarator;

   /**
    * The cached value of the '{@link #getThrows_() <em>Throws </em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getThrows_()
    * @generated
    * @ordered
    */
   protected throws_ throws_;

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
    * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getAnnotations()
    * @generated
    * @ordered
    */
   protected EList<annotation> annotations;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected methodHeaderImpl() {
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
      return TypePackage.Literals.METHOD_HEADER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public result getResult() {
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetResult(result newResult, NotificationChain msgs) {
      result oldResult = result;
      result = newResult;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.METHOD_HEADER__RESULT, oldResult, newResult);
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
   public void setResult(result newResult) {
      if (newResult != result) {
         NotificationChain msgs = null;
         if (result != null)
            msgs = ((InternalEObject) result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_HEADER__RESULT, null, msgs);
         if (newResult != null)
            msgs = ((InternalEObject) newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_HEADER__RESULT, null, msgs);
         msgs = basicSetResult(newResult, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.METHOD_HEADER__RESULT, newResult, newResult));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public methodDeclarator getMethodDeclarator() {
      return methodDeclarator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetMethodDeclarator(methodDeclarator newMethodDeclarator, NotificationChain msgs) {
      methodDeclarator oldMethodDeclarator = methodDeclarator;
      methodDeclarator = newMethodDeclarator;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.METHOD_HEADER__METHOD_DECLARATOR, oldMethodDeclarator, newMethodDeclarator);
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
   public void setMethodDeclarator(methodDeclarator newMethodDeclarator) {
      if (newMethodDeclarator != methodDeclarator) {
         NotificationChain msgs = null;
         if (methodDeclarator != null)
            msgs = ((InternalEObject) methodDeclarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_HEADER__METHOD_DECLARATOR, null, msgs);
         if (newMethodDeclarator != null)
            msgs = ((InternalEObject) newMethodDeclarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_HEADER__METHOD_DECLARATOR, null, msgs);
         msgs = basicSetMethodDeclarator(newMethodDeclarator, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.METHOD_HEADER__METHOD_DECLARATOR,
            newMethodDeclarator, newMethodDeclarator));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public throws_ getThrows_() {
      return throws_;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetThrows_(throws_ newThrows_, NotificationChain msgs) {
      throws_ oldThrows_ = throws_;
      throws_ = newThrows_;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.METHOD_HEADER__THROWS_, oldThrows_, newThrows_);
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
   public void setThrows_(throws_ newThrows_) {
      if (newThrows_ != throws_) {
         NotificationChain msgs = null;
         if (throws_ != null)
            msgs = ((InternalEObject) throws_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_HEADER__THROWS_, null, msgs);
         if (newThrows_ != null)
            msgs = ((InternalEObject) newThrows_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_HEADER__THROWS_, null, msgs);
         msgs = basicSetThrows_(newThrows_, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.METHOD_HEADER__THROWS_, newThrows_,
            newThrows_));
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
            TypePackage.METHOD_HEADER__TYPE_PARAMETERS, oldTypeParameters, newTypeParameters);
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
               - TypePackage.METHOD_HEADER__TYPE_PARAMETERS, null, msgs);
         if (newTypeParameters != null)
            msgs = ((InternalEObject) newTypeParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.METHOD_HEADER__TYPE_PARAMETERS, null, msgs);
         msgs = basicSetTypeParameters(newTypeParameters, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.METHOD_HEADER__TYPE_PARAMETERS,
            newTypeParameters, newTypeParameters));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<annotation> getAnnotations() {
      if (annotations == null) {
         annotations = new EObjectContainmentEList<annotation>(annotation.class, this,
            TypePackage.METHOD_HEADER__ANNOTATIONS);
      }
      return annotations;
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
         case TypePackage.METHOD_HEADER__RESULT :
            return basicSetResult(null, msgs);
         case TypePackage.METHOD_HEADER__METHOD_DECLARATOR :
            return basicSetMethodDeclarator(null, msgs);
         case TypePackage.METHOD_HEADER__THROWS_ :
            return basicSetThrows_(null, msgs);
         case TypePackage.METHOD_HEADER__TYPE_PARAMETERS :
            return basicSetTypeParameters(null, msgs);
         case TypePackage.METHOD_HEADER__ANNOTATIONS :
            return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
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
         case TypePackage.METHOD_HEADER__RESULT :
            return getResult();
         case TypePackage.METHOD_HEADER__METHOD_DECLARATOR :
            return getMethodDeclarator();
         case TypePackage.METHOD_HEADER__THROWS_ :
            return getThrows_();
         case TypePackage.METHOD_HEADER__TYPE_PARAMETERS :
            return getTypeParameters();
         case TypePackage.METHOD_HEADER__ANNOTATIONS :
            return getAnnotations();
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
         case TypePackage.METHOD_HEADER__RESULT :
            setResult((result) newValue);
            return;
         case TypePackage.METHOD_HEADER__METHOD_DECLARATOR :
            setMethodDeclarator((methodDeclarator) newValue);
            return;
         case TypePackage.METHOD_HEADER__THROWS_ :
            setThrows_((throws_) newValue);
            return;
         case TypePackage.METHOD_HEADER__TYPE_PARAMETERS :
            setTypeParameters((typeParameters) newValue);
            return;
         case TypePackage.METHOD_HEADER__ANNOTATIONS :
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends annotation>) newValue);
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
         case TypePackage.METHOD_HEADER__RESULT :
            setResult((result) null);
            return;
         case TypePackage.METHOD_HEADER__METHOD_DECLARATOR :
            setMethodDeclarator((methodDeclarator) null);
            return;
         case TypePackage.METHOD_HEADER__THROWS_ :
            setThrows_((throws_) null);
            return;
         case TypePackage.METHOD_HEADER__TYPE_PARAMETERS :
            setTypeParameters((typeParameters) null);
            return;
         case TypePackage.METHOD_HEADER__ANNOTATIONS :
            getAnnotations().clear();
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
         case TypePackage.METHOD_HEADER__RESULT :
            return result != null;
         case TypePackage.METHOD_HEADER__METHOD_DECLARATOR :
            return methodDeclarator != null;
         case TypePackage.METHOD_HEADER__THROWS_ :
            return throws_ != null;
         case TypePackage.METHOD_HEADER__TYPE_PARAMETERS :
            return typeParameters != null;
         case TypePackage.METHOD_HEADER__ANNOTATIONS :
            return annotations != null && !annotations.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // methodHeaderImpl
