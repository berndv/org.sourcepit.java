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
import org.sourcepit.java.type.type.annotationTypeElementDeclaration;
import org.sourcepit.java.type.type.annotationTypeElementModifier;
import org.sourcepit.java.type.type.defaultValue;
import org.sourcepit.java.type.type.dims;
import org.sourcepit.java.type.type.unannType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>annotation Type Element Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.annotationTypeElementDeclarationImpl#getAnnotationTypeElementModifiers
 * <em>Annotation Type Element Modifiers</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.annotationTypeElementDeclarationImpl#getUnannType <em>Unann Type</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.annotationTypeElementDeclarationImpl#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.annotationTypeElementDeclarationImpl#getDims <em>Dims</em>}</li>
 * <li>{@link org.sourcepit.java.type.type.impl.annotationTypeElementDeclarationImpl#getDefaultValue <em>Default Value
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class annotationTypeElementDeclarationImpl extends annotationTypeMemberDeclarationImpl
   implements
      annotationTypeElementDeclaration {
   /**
    * The cached value of the '{@link #getAnnotationTypeElementModifiers() <em>Annotation Type Element Modifiers</em>}'
    * containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getAnnotationTypeElementModifiers()
    * @generated
    * @ordered
    */
   protected EList<annotationTypeElementModifier> annotationTypeElementModifiers;

   /**
    * The cached value of the '{@link #getUnannType() <em>Unann Type</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getUnannType()
    * @generated
    * @ordered
    */
   protected unannType unannType;

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
    * The cached value of the '{@link #getDims() <em>Dims</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getDims()
    * @generated
    * @ordered
    */
   protected dims dims;

   /**
    * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getDefaultValue()
    * @generated
    * @ordered
    */
   protected defaultValue defaultValue;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected annotationTypeElementDeclarationImpl() {
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
      return TypePackage.Literals.ANNOTATION_TYPE_ELEMENT_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<annotationTypeElementModifier> getAnnotationTypeElementModifiers() {
      if (annotationTypeElementModifiers == null) {
         annotationTypeElementModifiers = new EObjectContainmentEList<annotationTypeElementModifier>(
            annotationTypeElementModifier.class, this,
            TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__ANNOTATION_TYPE_ELEMENT_MODIFIERS);
      }
      return annotationTypeElementModifiers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannType getUnannType() {
      return unannType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetUnannType(unannType newUnannType, NotificationChain msgs) {
      unannType oldUnannType = unannType;
      unannType = newUnannType;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE, oldUnannType, newUnannType);
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
   public void setUnannType(unannType newUnannType) {
      if (newUnannType != unannType) {
         NotificationChain msgs = null;
         if (unannType != null)
            msgs = ((InternalEObject) unannType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE, null, msgs);
         if (newUnannType != null)
            msgs = ((InternalEObject) newUnannType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE, null, msgs);
         msgs = basicSetUnannType(newUnannType, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE, newUnannType, newUnannType));
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
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__NAME,
            oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public dims getDims() {
      return dims;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetDims(dims newDims, NotificationChain msgs) {
      dims oldDims = dims;
      dims = newDims;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS, oldDims, newDims);
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
   public void setDims(dims newDims) {
      if (newDims != dims) {
         NotificationChain msgs = null;
         if (dims != null)
            msgs = ((InternalEObject) dims).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS, null, msgs);
         if (newDims != null)
            msgs = ((InternalEObject) newDims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS, null, msgs);
         msgs = basicSetDims(newDims, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS,
            newDims, newDims));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public defaultValue getDefaultValue() {
      return defaultValue;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetDefaultValue(defaultValue newDefaultValue, NotificationChain msgs) {
      defaultValue oldDefaultValue = defaultValue;
      defaultValue = newDefaultValue;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
   public void setDefaultValue(defaultValue newDefaultValue) {
      if (newDefaultValue != defaultValue) {
         NotificationChain msgs = null;
         if (defaultValue != null)
            msgs = ((InternalEObject) defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE, null, msgs);
         if (newDefaultValue != null)
            msgs = ((InternalEObject) newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE, null, msgs);
         msgs = basicSetDefaultValue(newDefaultValue, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__ANNOTATION_TYPE_ELEMENT_MODIFIERS :
            return ((InternalEList<?>) getAnnotationTypeElementModifiers()).basicRemove(otherEnd, msgs);
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE :
            return basicSetUnannType(null, msgs);
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS :
            return basicSetDims(null, msgs);
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE :
            return basicSetDefaultValue(null, msgs);
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
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__ANNOTATION_TYPE_ELEMENT_MODIFIERS :
            return getAnnotationTypeElementModifiers();
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE :
            return getUnannType();
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__NAME :
            return getName();
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS :
            return getDims();
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE :
            return getDefaultValue();
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
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__ANNOTATION_TYPE_ELEMENT_MODIFIERS :
            getAnnotationTypeElementModifiers().clear();
            getAnnotationTypeElementModifiers().addAll((Collection<? extends annotationTypeElementModifier>) newValue);
            return;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE :
            setUnannType((unannType) newValue);
            return;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__NAME :
            setName((String) newValue);
            return;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS :
            setDims((dims) newValue);
            return;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE :
            setDefaultValue((defaultValue) newValue);
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
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__ANNOTATION_TYPE_ELEMENT_MODIFIERS :
            getAnnotationTypeElementModifiers().clear();
            return;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE :
            setUnannType((unannType) null);
            return;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__NAME :
            setName(NAME_EDEFAULT);
            return;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS :
            setDims((dims) null);
            return;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE :
            setDefaultValue((defaultValue) null);
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
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__ANNOTATION_TYPE_ELEMENT_MODIFIERS :
            return annotationTypeElementModifiers != null && !annotationTypeElementModifiers.isEmpty();
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE :
            return unannType != null;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS :
            return dims != null;
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE :
            return defaultValue != null;
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

} // annotationTypeElementDeclarationImpl
