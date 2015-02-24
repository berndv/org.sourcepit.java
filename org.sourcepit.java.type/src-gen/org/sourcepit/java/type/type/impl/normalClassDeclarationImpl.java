/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.classBody;
import org.sourcepit.java.type.type.normalClassDeclaration;
import org.sourcepit.java.type.type.superclass;
import org.sourcepit.java.type.type.typeParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>normal Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.normalClassDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.normalClassDeclarationImpl#getSuperclass <em>Superclass</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.normalClassDeclarationImpl#getClassBody <em>Class Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class normalClassDeclarationImpl extends classDeclarationImpl implements normalClassDeclaration {
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
    * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSuperclass()
    * @generated
    * @ordered
    */
   protected superclass superclass;

   /**
    * The cached value of the '{@link #getClassBody() <em>Class Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getClassBody()
    * @generated
    * @ordered
    */
   protected classBody classBody;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected normalClassDeclarationImpl() {
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
      return TypePackage.Literals.NORMAL_CLASS_DECLARATION;
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
            TypePackage.NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS, oldTypeParameters, newTypeParameters);
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
               - TypePackage.NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS, null, msgs);
         if (newTypeParameters != null)
            msgs = ((InternalEObject) newTypeParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS, null, msgs);
         msgs = basicSetTypeParameters(newTypeParameters, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS,
            newTypeParameters, newTypeParameters));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public superclass getSuperclass() {
      return superclass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetSuperclass(superclass newSuperclass, NotificationChain msgs) {
      superclass oldSuperclass = superclass;
      superclass = newSuperclass;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.NORMAL_CLASS_DECLARATION__SUPERCLASS, oldSuperclass, newSuperclass);
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
   public void setSuperclass(superclass newSuperclass) {
      if (newSuperclass != superclass) {
         NotificationChain msgs = null;
         if (superclass != null)
            msgs = ((InternalEObject) superclass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_CLASS_DECLARATION__SUPERCLASS, null, msgs);
         if (newSuperclass != null)
            msgs = ((InternalEObject) newSuperclass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_CLASS_DECLARATION__SUPERCLASS, null, msgs);
         msgs = basicSetSuperclass(newSuperclass, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.NORMAL_CLASS_DECLARATION__SUPERCLASS,
            newSuperclass, newSuperclass));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classBody getClassBody() {
      return classBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetClassBody(classBody newClassBody, NotificationChain msgs) {
      classBody oldClassBody = classBody;
      classBody = newClassBody;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.NORMAL_CLASS_DECLARATION__CLASS_BODY, oldClassBody, newClassBody);
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
   public void setClassBody(classBody newClassBody) {
      if (newClassBody != classBody) {
         NotificationChain msgs = null;
         if (classBody != null)
            msgs = ((InternalEObject) classBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_CLASS_DECLARATION__CLASS_BODY, null, msgs);
         if (newClassBody != null)
            msgs = ((InternalEObject) newClassBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.NORMAL_CLASS_DECLARATION__CLASS_BODY, null, msgs);
         msgs = basicSetClassBody(newClassBody, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.NORMAL_CLASS_DECLARATION__CLASS_BODY,
            newClassBody, newClassBody));
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
         case TypePackage.NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS :
            return basicSetTypeParameters(null, msgs);
         case TypePackage.NORMAL_CLASS_DECLARATION__SUPERCLASS :
            return basicSetSuperclass(null, msgs);
         case TypePackage.NORMAL_CLASS_DECLARATION__CLASS_BODY :
            return basicSetClassBody(null, msgs);
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
         case TypePackage.NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS :
            return getTypeParameters();
         case TypePackage.NORMAL_CLASS_DECLARATION__SUPERCLASS :
            return getSuperclass();
         case TypePackage.NORMAL_CLASS_DECLARATION__CLASS_BODY :
            return getClassBody();
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
         case TypePackage.NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS :
            setTypeParameters((typeParameters) newValue);
            return;
         case TypePackage.NORMAL_CLASS_DECLARATION__SUPERCLASS :
            setSuperclass((superclass) newValue);
            return;
         case TypePackage.NORMAL_CLASS_DECLARATION__CLASS_BODY :
            setClassBody((classBody) newValue);
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
         case TypePackage.NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS :
            setTypeParameters((typeParameters) null);
            return;
         case TypePackage.NORMAL_CLASS_DECLARATION__SUPERCLASS :
            setSuperclass((superclass) null);
            return;
         case TypePackage.NORMAL_CLASS_DECLARATION__CLASS_BODY :
            setClassBody((classBody) null);
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
         case TypePackage.NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS :
            return typeParameters != null;
         case TypePackage.NORMAL_CLASS_DECLARATION__SUPERCLASS :
            return superclass != null;
         case TypePackage.NORMAL_CLASS_DECLARATION__CLASS_BODY :
            return classBody != null;
      }
      return super.eIsSet(featureID);
   }

} // normalClassDeclarationImpl
