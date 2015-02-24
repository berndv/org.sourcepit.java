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
import org.sourcepit.java.type.type.constructorDeclaration;
import org.sourcepit.java.type.type.constructorDeclarator;
import org.sourcepit.java.type.type.constructorModifier;
import org.sourcepit.java.type.type.throws_;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constructor Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.constructorDeclarationImpl#getConstructorModifiers <em>Constructor
 * Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.constructorDeclarationImpl#getConstructorDeclarator <em>Constructor
 * Declarator</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.constructorDeclarationImpl#getThrows_ <em>Throws </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constructorDeclarationImpl extends classBodyDeclarationImpl implements constructorDeclaration {
   /**
    * The cached value of the '{@link #getConstructorModifiers() <em>Constructor Modifiers</em>}' containment reference
    * list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getConstructorModifiers()
    * @generated
    * @ordered
    */
   protected EList<constructorModifier> constructorModifiers;

   /**
    * The cached value of the '{@link #getConstructorDeclarator() <em>Constructor Declarator</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getConstructorDeclarator()
    * @generated
    * @ordered
    */
   protected constructorDeclarator constructorDeclarator;

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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected constructorDeclarationImpl() {
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
      return TypePackage.Literals.CONSTRUCTOR_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<constructorModifier> getConstructorModifiers() {
      if (constructorModifiers == null) {
         constructorModifiers = new EObjectContainmentEList<constructorModifier>(constructorModifier.class, this,
            TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_MODIFIERS);
      }
      return constructorModifiers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public constructorDeclarator getConstructorDeclarator() {
      return constructorDeclarator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetConstructorDeclarator(constructorDeclarator newConstructorDeclarator,
      NotificationChain msgs) {
      constructorDeclarator oldConstructorDeclarator = constructorDeclarator;
      constructorDeclarator = newConstructorDeclarator;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR, oldConstructorDeclarator,
            newConstructorDeclarator);
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
   public void setConstructorDeclarator(constructorDeclarator newConstructorDeclarator) {
      if (newConstructorDeclarator != constructorDeclarator) {
         NotificationChain msgs = null;
         if (constructorDeclarator != null)
            msgs = ((InternalEObject) constructorDeclarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR, null, msgs);
         if (newConstructorDeclarator != null)
            msgs = ((InternalEObject) newConstructorDeclarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR, null, msgs);
         msgs = basicSetConstructorDeclarator(newConstructorDeclarator, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR, newConstructorDeclarator,
            newConstructorDeclarator));
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
            TypePackage.CONSTRUCTOR_DECLARATION__THROWS_, oldThrows_, newThrows_);
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
               - TypePackage.CONSTRUCTOR_DECLARATION__THROWS_, null, msgs);
         if (newThrows_ != null)
            msgs = ((InternalEObject) newThrows_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.CONSTRUCTOR_DECLARATION__THROWS_, null, msgs);
         msgs = basicSetThrows_(newThrows_, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CONSTRUCTOR_DECLARATION__THROWS_,
            newThrows_, newThrows_));
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
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_MODIFIERS :
            return ((InternalEList<?>) getConstructorModifiers()).basicRemove(otherEnd, msgs);
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR :
            return basicSetConstructorDeclarator(null, msgs);
         case TypePackage.CONSTRUCTOR_DECLARATION__THROWS_ :
            return basicSetThrows_(null, msgs);
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
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_MODIFIERS :
            return getConstructorModifiers();
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR :
            return getConstructorDeclarator();
         case TypePackage.CONSTRUCTOR_DECLARATION__THROWS_ :
            return getThrows_();
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
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_MODIFIERS :
            getConstructorModifiers().clear();
            getConstructorModifiers().addAll((Collection<? extends constructorModifier>) newValue);
            return;
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR :
            setConstructorDeclarator((constructorDeclarator) newValue);
            return;
         case TypePackage.CONSTRUCTOR_DECLARATION__THROWS_ :
            setThrows_((throws_) newValue);
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
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_MODIFIERS :
            getConstructorModifiers().clear();
            return;
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR :
            setConstructorDeclarator((constructorDeclarator) null);
            return;
         case TypePackage.CONSTRUCTOR_DECLARATION__THROWS_ :
            setThrows_((throws_) null);
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
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_MODIFIERS :
            return constructorModifiers != null && !constructorModifiers.isEmpty();
         case TypePackage.CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR :
            return constructorDeclarator != null;
         case TypePackage.CONSTRUCTOR_DECLARATION__THROWS_ :
            return throws_ != null;
      }
      return super.eIsSet(featureID);
   }

} // constructorDeclarationImpl
