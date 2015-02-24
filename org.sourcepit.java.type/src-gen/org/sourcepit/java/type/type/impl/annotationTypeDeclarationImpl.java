/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.annotationTypeBody;
import org.sourcepit.java.type.type.annotationTypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>annotation Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.java.type.type.impl.annotationTypeDeclarationImpl#getAnnotationTypeBody <em>Annotation Type
 * Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class annotationTypeDeclarationImpl extends interfaceDeclarationImpl implements annotationTypeDeclaration {
   /**
    * The cached value of the '{@link #getAnnotationTypeBody() <em>Annotation Type Body</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getAnnotationTypeBody()
    * @generated
    * @ordered
    */
   protected annotationTypeBody annotationTypeBody;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected annotationTypeDeclarationImpl() {
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
      return TypePackage.Literals.ANNOTATION_TYPE_DECLARATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public annotationTypeBody getAnnotationTypeBody() {
      return annotationTypeBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetAnnotationTypeBody(annotationTypeBody newAnnotationTypeBody, NotificationChain msgs) {
      annotationTypeBody oldAnnotationTypeBody = annotationTypeBody;
      annotationTypeBody = newAnnotationTypeBody;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TypePackage.ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY, oldAnnotationTypeBody, newAnnotationTypeBody);
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
   public void setAnnotationTypeBody(annotationTypeBody newAnnotationTypeBody) {
      if (newAnnotationTypeBody != annotationTypeBody) {
         NotificationChain msgs = null;
         if (annotationTypeBody != null)
            msgs = ((InternalEObject) annotationTypeBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY, null, msgs);
         if (newAnnotationTypeBody != null)
            msgs = ((InternalEObject) newAnnotationTypeBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TypePackage.ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY, null, msgs);
         msgs = basicSetAnnotationTypeBody(newAnnotationTypeBody, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            TypePackage.ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY, newAnnotationTypeBody, newAnnotationTypeBody));
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
         case TypePackage.ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY :
            return basicSetAnnotationTypeBody(null, msgs);
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
         case TypePackage.ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY :
            return getAnnotationTypeBody();
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
         case TypePackage.ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY :
            setAnnotationTypeBody((annotationTypeBody) newValue);
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
         case TypePackage.ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY :
            setAnnotationTypeBody((annotationTypeBody) null);
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
         case TypePackage.ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY :
            return annotationTypeBody != null;
      }
      return super.eIsSet(featureID);
   }

} // annotationTypeDeclarationImpl
