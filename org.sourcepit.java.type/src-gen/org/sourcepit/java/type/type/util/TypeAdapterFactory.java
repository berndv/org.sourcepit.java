/**
 */

package org.sourcepit.java.type.type.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.java.type.type.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.type.type.TypePackage
 * @generated
 */
public class TypeAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static TypePackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public TypeAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = TypePackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object
    * of the model.
    * <!-- end-user-doc -->
    * 
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected TypeSwitch<Adapter> modelSwitch = new TypeSwitch<Adapter>() {
      @Override
      public Adapter caseModel(Model object) {
         return createModelAdapter();
      }

      @Override
      public Adapter casetype(type object) {
         return createtypeAdapter();
      }

      @Override
      public Adapter caseprimitiveType(primitiveType object) {
         return createprimitiveTypeAdapter();
      }

      @Override
      public Adapter casereferenceType(referenceType object) {
         return createreferenceTypeAdapter();
      }

      @Override
      public Adapter caseclassOrInterfaceType(classOrInterfaceType object) {
         return createclassOrInterfaceTypeAdapter();
      }

      @Override
      public Adapter caseclassOrInterfaceTypeSegment(classOrInterfaceTypeSegment object) {
         return createclassOrInterfaceTypeSegmentAdapter();
      }

      @Override
      public Adapter caseclassType(classType object) {
         return createclassTypeAdapter();
      }

      @Override
      public Adapter caseclassType_lf_classOrInterfaceType(classType_lf_classOrInterfaceType object) {
         return createclassType_lf_classOrInterfaceTypeAdapter();
      }

      @Override
      public Adapter caseclassType_lfno_classOrInterfaceType(classType_lfno_classOrInterfaceType object) {
         return createclassType_lfno_classOrInterfaceTypeAdapter();
      }

      @Override
      public Adapter caseinterfaceType(interfaceType object) {
         return createinterfaceTypeAdapter();
      }

      @Override
      public Adapter caseinterfaceType_lf_classOrInterfaceType(interfaceType_lf_classOrInterfaceType object) {
         return createinterfaceType_lf_classOrInterfaceTypeAdapter();
      }

      @Override
      public Adapter caseinterfaceType_lfno_classOrInterfaceType(interfaceType_lfno_classOrInterfaceType object) {
         return createinterfaceType_lfno_classOrInterfaceTypeAdapter();
      }

      @Override
      public Adapter casetypeVariable(typeVariable object) {
         return createtypeVariableAdapter();
      }

      @Override
      public Adapter casearrayType(arrayType object) {
         return createarrayTypeAdapter();
      }

      @Override
      public Adapter casedims(dims object) {
         return createdimsAdapter();
      }

      @Override
      public Adapter casedim(dim object) {
         return createdimAdapter();
      }

      @Override
      public Adapter casetypeParameter(typeParameter object) {
         return createtypeParameterAdapter();
      }

      @Override
      public Adapter casetypeParameterModifier(typeParameterModifier object) {
         return createtypeParameterModifierAdapter();
      }

      @Override
      public Adapter casetypeBound(typeBound object) {
         return createtypeBoundAdapter();
      }

      @Override
      public Adapter caseadditionalBound(additionalBound object) {
         return createadditionalBoundAdapter();
      }

      @Override
      public Adapter casetypeArguments(typeArguments object) {
         return createtypeArgumentsAdapter();
      }

      @Override
      public Adapter casetypeArgumentList(typeArgumentList object) {
         return createtypeArgumentListAdapter();
      }

      @Override
      public Adapter casetypeArgument(typeArgument object) {
         return createtypeArgumentAdapter();
      }

      @Override
      public Adapter casewildcard(wildcard object) {
         return createwildcardAdapter();
      }

      @Override
      public Adapter casewildcardBounds(wildcardBounds object) {
         return createwildcardBoundsAdapter();
      }

      @Override
      public Adapter casecompilationUnit(compilationUnit object) {
         return createcompilationUnitAdapter();
      }

      @Override
      public Adapter casepackageDeclaration(packageDeclaration object) {
         return createpackageDeclarationAdapter();
      }

      @Override
      public Adapter casepackageModifier(packageModifier object) {
         return createpackageModifierAdapter();
      }

      @Override
      public Adapter caseimportDeclaration(importDeclaration object) {
         return createimportDeclarationAdapter();
      }

      @Override
      public Adapter casesingleTypeImportDeclaration(singleTypeImportDeclaration object) {
         return createsingleTypeImportDeclarationAdapter();
      }

      @Override
      public Adapter casetypeImportOnDemandDeclaration(typeImportOnDemandDeclaration object) {
         return createtypeImportOnDemandDeclarationAdapter();
      }

      @Override
      public Adapter casesingleStaticImportDeclaration(singleStaticImportDeclaration object) {
         return createsingleStaticImportDeclarationAdapter();
      }

      @Override
      public Adapter casestaticImportOnDemandDeclaration(staticImportOnDemandDeclaration object) {
         return createstaticImportOnDemandDeclarationAdapter();
      }

      @Override
      public Adapter casetypeDeclaration(typeDeclaration object) {
         return createtypeDeclarationAdapter();
      }

      @Override
      public Adapter caseclassDeclaration(classDeclaration object) {
         return createclassDeclarationAdapter();
      }

      @Override
      public Adapter casenormalClassDeclaration(normalClassDeclaration object) {
         return createnormalClassDeclarationAdapter();
      }

      @Override
      public Adapter caseclassModifier(classModifier object) {
         return createclassModifierAdapter();
      }

      @Override
      public Adapter caseJavaClassModifier(JavaClassModifier object) {
         return createJavaClassModifierAdapter();
      }

      @Override
      public Adapter casetypeParameters(typeParameters object) {
         return createtypeParametersAdapter();
      }

      @Override
      public Adapter casetypeParameterList(typeParameterList object) {
         return createtypeParameterListAdapter();
      }

      @Override
      public Adapter casesuperclass(superclass object) {
         return createsuperclassAdapter();
      }

      @Override
      public Adapter casesuperinterfaces(superinterfaces object) {
         return createsuperinterfacesAdapter();
      }

      @Override
      public Adapter caseinterfaceTypeList(interfaceTypeList object) {
         return createinterfaceTypeListAdapter();
      }

      @Override
      public Adapter caseclassBody(classBody object) {
         return createclassBodyAdapter();
      }

      @Override
      public Adapter caseclassBodyDeclaration(classBodyDeclaration object) {
         return createclassBodyDeclarationAdapter();
      }

      @Override
      public Adapter caseclassMemberDeclaration(classMemberDeclaration object) {
         return createclassMemberDeclarationAdapter();
      }

      @Override
      public Adapter casefieldDeclaration(fieldDeclaration object) {
         return createfieldDeclarationAdapter();
      }

      @Override
      public Adapter casefieldModifier(fieldModifier object) {
         return createfieldModifierAdapter();
      }

      @Override
      public Adapter caseJavaFieldModifier(JavaFieldModifier object) {
         return createJavaFieldModifierAdapter();
      }

      @Override
      public Adapter casevariableDeclaratorList(variableDeclaratorList object) {
         return createvariableDeclaratorListAdapter();
      }

      @Override
      public Adapter casevariableDeclarator(variableDeclarator object) {
         return createvariableDeclaratorAdapter();
      }

      @Override
      public Adapter casevariableDeclaratorId(variableDeclaratorId object) {
         return createvariableDeclaratorIdAdapter();
      }

      @Override
      public Adapter casevariableInitializer(variableInitializer object) {
         return createvariableInitializerAdapter();
      }

      @Override
      public Adapter caseunannType(unannType object) {
         return createunannTypeAdapter();
      }

      @Override
      public Adapter caseunannPrimitiveType(unannPrimitiveType object) {
         return createunannPrimitiveTypeAdapter();
      }

      @Override
      public Adapter caseunannReferenceType(unannReferenceType object) {
         return createunannReferenceTypeAdapter();
      }

      @Override
      public Adapter caseunannClassOrInterfaceType(unannClassOrInterfaceType object) {
         return createunannClassOrInterfaceTypeAdapter();
      }

      @Override
      public Adapter caseunannClassType(unannClassType object) {
         return createunannClassTypeAdapter();
      }

      @Override
      public Adapter caseClassTypeSegment(ClassTypeSegment object) {
         return createClassTypeSegmentAdapter();
      }

      @Override
      public Adapter caseClassTypeSegmentWithAnnotations(ClassTypeSegmentWithAnnotations object) {
         return createClassTypeSegmentWithAnnotationsAdapter();
      }

      @Override
      public Adapter caseunannInterfaceType(unannInterfaceType object) {
         return createunannInterfaceTypeAdapter();
      }

      @Override
      public Adapter caseunannTypeVariable(unannTypeVariable object) {
         return createunannTypeVariableAdapter();
      }

      @Override
      public Adapter caseunannArrayType(unannArrayType object) {
         return createunannArrayTypeAdapter();
      }

      @Override
      public Adapter casemethodDeclaration(methodDeclaration object) {
         return createmethodDeclarationAdapter();
      }

      @Override
      public Adapter casemethodModifier(methodModifier object) {
         return createmethodModifierAdapter();
      }

      @Override
      public Adapter caseJavaMethodModifier(JavaMethodModifier object) {
         return createJavaMethodModifierAdapter();
      }

      @Override
      public Adapter casemethodHeader(methodHeader object) {
         return createmethodHeaderAdapter();
      }

      @Override
      public Adapter caseresult(result object) {
         return createresultAdapter();
      }

      @Override
      public Adapter casevoidType(voidType object) {
         return createvoidTypeAdapter();
      }

      @Override
      public Adapter casemethodDeclarator(methodDeclarator object) {
         return createmethodDeclaratorAdapter();
      }

      @Override
      public Adapter caseformalParameterList(formalParameterList object) {
         return createformalParameterListAdapter();
      }

      @Override
      public Adapter caseformalParameters(formalParameters object) {
         return createformalParametersAdapter();
      }

      @Override
      public Adapter caseformalParameter(formalParameter object) {
         return createformalParameterAdapter();
      }

      @Override
      public Adapter casevariableModifier(variableModifier object) {
         return createvariableModifierAdapter();
      }

      @Override
      public Adapter caseJavaVariableModifier(JavaVariableModifier object) {
         return createJavaVariableModifierAdapter();
      }

      @Override
      public Adapter caselastFormalParameter(lastFormalParameter object) {
         return createlastFormalParameterAdapter();
      }

      @Override
      public Adapter casereceiverParameter(receiverParameter object) {
         return createreceiverParameterAdapter();
      }

      @Override
      public Adapter casethrows_(throws_ object) {
         return createthrows_Adapter();
      }

      @Override
      public Adapter caseexceptionTypeList(exceptionTypeList object) {
         return createexceptionTypeListAdapter();
      }

      @Override
      public Adapter caseexceptionType(exceptionType object) {
         return createexceptionTypeAdapter();
      }

      @Override
      public Adapter casemethodBody(methodBody object) {
         return createmethodBodyAdapter();
      }

      @Override
      public Adapter caseinstanceInitializer(instanceInitializer object) {
         return createinstanceInitializerAdapter();
      }

      @Override
      public Adapter casestaticInitializer(staticInitializer object) {
         return createstaticInitializerAdapter();
      }

      @Override
      public Adapter caseconstructorDeclaration(constructorDeclaration object) {
         return createconstructorDeclarationAdapter();
      }

      @Override
      public Adapter caseconstructorModifier(constructorModifier object) {
         return createconstructorModifierAdapter();
      }

      @Override
      public Adapter caseJavaConstructorModifier(JavaConstructorModifier object) {
         return createJavaConstructorModifierAdapter();
      }

      @Override
      public Adapter caseconstructorDeclarator(constructorDeclarator object) {
         return createconstructorDeclaratorAdapter();
      }

      @Override
      public Adapter caseenumDeclaration(enumDeclaration object) {
         return createenumDeclarationAdapter();
      }

      @Override
      public Adapter caseenumBody(enumBody object) {
         return createenumBodyAdapter();
      }

      @Override
      public Adapter caseenumConstantList(enumConstantList object) {
         return createenumConstantListAdapter();
      }

      @Override
      public Adapter caseenumConstant(enumConstant object) {
         return createenumConstantAdapter();
      }

      @Override
      public Adapter caseenumConstantModifier(enumConstantModifier object) {
         return createenumConstantModifierAdapter();
      }

      @Override
      public Adapter caseenumBodyDeclarations(enumBodyDeclarations object) {
         return createenumBodyDeclarationsAdapter();
      }

      @Override
      public Adapter caseinterfaceDeclaration(interfaceDeclaration object) {
         return createinterfaceDeclarationAdapter();
      }

      @Override
      public Adapter casenormalInterfaceDeclaration(normalInterfaceDeclaration object) {
         return createnormalInterfaceDeclarationAdapter();
      }

      @Override
      public Adapter caseinterfaceModifier(interfaceModifier object) {
         return createinterfaceModifierAdapter();
      }

      @Override
      public Adapter caseJavaInterfaceModifier(JavaInterfaceModifier object) {
         return createJavaInterfaceModifierAdapter();
      }

      @Override
      public Adapter caseextendsInterfaces(extendsInterfaces object) {
         return createextendsInterfacesAdapter();
      }

      @Override
      public Adapter caseinterfaceBody(interfaceBody object) {
         return createinterfaceBodyAdapter();
      }

      @Override
      public Adapter caseinterfaceMemberDeclaration(interfaceMemberDeclaration object) {
         return createinterfaceMemberDeclarationAdapter();
      }

      @Override
      public Adapter caseconstantDeclaration(constantDeclaration object) {
         return createconstantDeclarationAdapter();
      }

      @Override
      public Adapter caseconstantModifier(constantModifier object) {
         return createconstantModifierAdapter();
      }

      @Override
      public Adapter caseJavaConstantModifier(JavaConstantModifier object) {
         return createJavaConstantModifierAdapter();
      }

      @Override
      public Adapter caseinterfaceMethodDeclaration(interfaceMethodDeclaration object) {
         return createinterfaceMethodDeclarationAdapter();
      }

      @Override
      public Adapter caseinterfaceMethodModifier(interfaceMethodModifier object) {
         return createinterfaceMethodModifierAdapter();
      }

      @Override
      public Adapter caseJavaInterfaceMethodModifiers(JavaInterfaceMethodModifiers object) {
         return createJavaInterfaceMethodModifiersAdapter();
      }

      @Override
      public Adapter caseannotationTypeDeclaration(annotationTypeDeclaration object) {
         return createannotationTypeDeclarationAdapter();
      }

      @Override
      public Adapter caseannotationTypeBody(annotationTypeBody object) {
         return createannotationTypeBodyAdapter();
      }

      @Override
      public Adapter caseannotationTypeMemberDeclaration(annotationTypeMemberDeclaration object) {
         return createannotationTypeMemberDeclarationAdapter();
      }

      @Override
      public Adapter caseannotationTypeElementDeclaration(annotationTypeElementDeclaration object) {
         return createannotationTypeElementDeclarationAdapter();
      }

      @Override
      public Adapter caseannotationTypeElementModifier(annotationTypeElementModifier object) {
         return createannotationTypeElementModifierAdapter();
      }

      @Override
      public Adapter caseJavaAnnotationTypeElementModifiers(JavaAnnotationTypeElementModifiers object) {
         return createJavaAnnotationTypeElementModifiersAdapter();
      }

      @Override
      public Adapter casedefaultValue(defaultValue object) {
         return createdefaultValueAdapter();
      }

      @Override
      public Adapter caseannotation(annotation object) {
         return createannotationAdapter();
      }

      @Override
      public Adapter casenormalAnnotation(normalAnnotation object) {
         return createnormalAnnotationAdapter();
      }

      @Override
      public Adapter caseelementValuePairList(elementValuePairList object) {
         return createelementValuePairListAdapter();
      }

      @Override
      public Adapter caseelementValuePair(elementValuePair object) {
         return createelementValuePairAdapter();
      }

      @Override
      public Adapter caseelementValue(elementValue object) {
         return createelementValueAdapter();
      }

      @Override
      public Adapter caseelementValueArrayInitializer(elementValueArrayInitializer object) {
         return createelementValueArrayInitializerAdapter();
      }

      @Override
      public Adapter caseelementValueList(elementValueList object) {
         return createelementValueListAdapter();
      }

      @Override
      public Adapter casemarkerAnnotation(markerAnnotation object) {
         return createmarkerAnnotationAdapter();
      }

      @Override
      public Adapter casesingleElementAnnotation(singleElementAnnotation object) {
         return createsingleElementAnnotationAdapter();
      }

      @Override
      public Adapter casearrayInitializer(arrayInitializer object) {
         return createarrayInitializerAdapter();
      }

      @Override
      public Adapter casevariableInitializerList(variableInitializerList object) {
         return createvariableInitializerListAdapter();
      }

      @Override
      public Adapter caseblock(block object) {
         return createblockAdapter();
      }

      @Override
      public Adapter caseblockStatements(blockStatements object) {
         return createblockStatementsAdapter();
      }

      @Override
      public Adapter caseargumentList(argumentList object) {
         return createargumentListAdapter();
      }

      @Override
      public Adapter caseprimary(primary object) {
         return createprimaryAdapter();
      }

      @Override
      public Adapter caseexpression(expression object) {
         return createexpressionAdapter();
      }

      @Override
      public Adapter caseconditionalExpression(conditionalExpression object) {
         return createconditionalExpressionAdapter();
      }

      @Override
      public Adapter caseEmptyTypeDeclaration(EmptyTypeDeclaration object) {
         return createEmptyTypeDeclarationAdapter();
      }

      @Override
      public Adapter caseEmptyClassMemberDeclaration(EmptyClassMemberDeclaration object) {
         return createEmptyClassMemberDeclarationAdapter();
      }

      @Override
      public Adapter defaultCase(EObject object) {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject) target);
   }


   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.Model <em>Model</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.Model
    * @generated
    */
   public Adapter createModelAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.type <em>type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.type
    * @generated
    */
   public Adapter createtypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.primitiveType
    * <em>primitive Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.primitiveType
    * @generated
    */
   public Adapter createprimitiveTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.referenceType
    * <em>reference Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.referenceType
    * @generated
    */
   public Adapter createreferenceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.classOrInterfaceType
    * <em>class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classOrInterfaceType
    * @generated
    */
   public Adapter createclassOrInterfaceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment
    * <em>class Or Interface Type Segment</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classOrInterfaceTypeSegment
    * @generated
    */
   public Adapter createclassOrInterfaceTypeSegmentAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.classType <em>class Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classType
    * @generated
    */
   public Adapter createclassTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '
    * {@link org.sourcepit.java.type.type.classType_lf_classOrInterfaceType
    * <em>class Type lf class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classType_lf_classOrInterfaceType
    * @generated
    */
   public Adapter createclassType_lf_classOrInterfaceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '
    * {@link org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType
    * <em>class Type lfno class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType
    * @generated
    */
   public Adapter createclassType_lfno_classOrInterfaceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.interfaceType
    * <em>interface Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceType
    * @generated
    */
   public Adapter createinterfaceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '
    * {@link org.sourcepit.java.type.type.interfaceType_lf_classOrInterfaceType
    * <em>interface Type lf class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceType_lf_classOrInterfaceType
    * @generated
    */
   public Adapter createinterfaceType_lf_classOrInterfaceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '
    * {@link org.sourcepit.java.type.type.interfaceType_lfno_classOrInterfaceType
    * <em>interface Type lfno class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceType_lfno_classOrInterfaceType
    * @generated
    */
   public Adapter createinterfaceType_lfno_classOrInterfaceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeVariable
    * <em>type Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeVariable
    * @generated
    */
   public Adapter createtypeVariableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.arrayType <em>array Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.arrayType
    * @generated
    */
   public Adapter createarrayTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.dims <em>dims</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.dims
    * @generated
    */
   public Adapter createdimsAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.dim <em>dim</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.dim
    * @generated
    */
   public Adapter createdimAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeParameter
    * <em>type Parameter</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeParameter
    * @generated
    */
   public Adapter createtypeParameterAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeParameterModifier
    * <em>type Parameter Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeParameterModifier
    * @generated
    */
   public Adapter createtypeParameterModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeBound <em>type Bound</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeBound
    * @generated
    */
   public Adapter createtypeBoundAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.additionalBound
    * <em>additional Bound</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.additionalBound
    * @generated
    */
   public Adapter createadditionalBoundAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeArguments
    * <em>type Arguments</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeArguments
    * @generated
    */
   public Adapter createtypeArgumentsAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeArgumentList
    * <em>type Argument List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeArgumentList
    * @generated
    */
   public Adapter createtypeArgumentListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeArgument
    * <em>type Argument</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeArgument
    * @generated
    */
   public Adapter createtypeArgumentAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.wildcard <em>wildcard</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.wildcard
    * @generated
    */
   public Adapter createwildcardAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.wildcardBounds
    * <em>wildcard Bounds</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.wildcardBounds
    * @generated
    */
   public Adapter createwildcardBoundsAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.compilationUnit
    * <em>compilation Unit</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.compilationUnit
    * @generated
    */
   public Adapter createcompilationUnitAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.packageDeclaration
    * <em>package Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.packageDeclaration
    * @generated
    */
   public Adapter createpackageDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.packageModifier
    * <em>package Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.packageModifier
    * @generated
    */
   public Adapter createpackageModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.importDeclaration
    * <em>import Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.importDeclaration
    * @generated
    */
   public Adapter createimportDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.singleTypeImportDeclaration
    * <em>single Type Import Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.singleTypeImportDeclaration
    * @generated
    */
   public Adapter createsingleTypeImportDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeImportOnDemandDeclaration
    * <em>type Import On Demand Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeImportOnDemandDeclaration
    * @generated
    */
   public Adapter createtypeImportOnDemandDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.singleStaticImportDeclaration
    * <em>single Static Import Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.singleStaticImportDeclaration
    * @generated
    */
   public Adapter createsingleStaticImportDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.staticImportOnDemandDeclaration
    * <em>static Import On Demand Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.staticImportOnDemandDeclaration
    * @generated
    */
   public Adapter createstaticImportOnDemandDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeDeclaration
    * <em>type Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeDeclaration
    * @generated
    */
   public Adapter createtypeDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.classDeclaration
    * <em>class Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classDeclaration
    * @generated
    */
   public Adapter createclassDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.normalClassDeclaration
    * <em>normal Class Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.normalClassDeclaration
    * @generated
    */
   public Adapter createnormalClassDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.classModifier
    * <em>class Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classModifier
    * @generated
    */
   public Adapter createclassModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.JavaClassModifier
    * <em>Java Class Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.JavaClassModifier
    * @generated
    */
   public Adapter createJavaClassModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeParameters
    * <em>type Parameters</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeParameters
    * @generated
    */
   public Adapter createtypeParametersAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.typeParameterList
    * <em>type Parameter List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.typeParameterList
    * @generated
    */
   public Adapter createtypeParameterListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.superclass <em>superclass</em>}
    * '.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.superclass
    * @generated
    */
   public Adapter createsuperclassAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.superinterfaces
    * <em>superinterfaces</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.superinterfaces
    * @generated
    */
   public Adapter createsuperinterfacesAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.interfaceTypeList
    * <em>interface Type List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceTypeList
    * @generated
    */
   public Adapter createinterfaceTypeListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.classBody <em>class Body</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classBody
    * @generated
    */
   public Adapter createclassBodyAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.classBodyDeclaration
    * <em>class Body Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classBodyDeclaration
    * @generated
    */
   public Adapter createclassBodyDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.classMemberDeclaration
    * <em>class Member Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.classMemberDeclaration
    * @generated
    */
   public Adapter createclassMemberDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.fieldDeclaration
    * <em>field Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.fieldDeclaration
    * @generated
    */
   public Adapter createfieldDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.fieldModifier
    * <em>field Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.fieldModifier
    * @generated
    */
   public Adapter createfieldModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.JavaFieldModifier
    * <em>Java Field Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.JavaFieldModifier
    * @generated
    */
   public Adapter createJavaFieldModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.variableDeclaratorList
    * <em>variable Declarator List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.variableDeclaratorList
    * @generated
    */
   public Adapter createvariableDeclaratorListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.variableDeclarator
    * <em>variable Declarator</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.variableDeclarator
    * @generated
    */
   public Adapter createvariableDeclaratorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.variableDeclaratorId
    * <em>variable Declarator Id</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.variableDeclaratorId
    * @generated
    */
   public Adapter createvariableDeclaratorIdAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.variableInitializer
    * <em>variable Initializer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.variableInitializer
    * @generated
    */
   public Adapter createvariableInitializerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.unannType <em>unann Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.unannType
    * @generated
    */
   public Adapter createunannTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.unannPrimitiveType
    * <em>unann Primitive Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.unannPrimitiveType
    * @generated
    */
   public Adapter createunannPrimitiveTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.unannReferenceType
    * <em>unann Reference Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.unannReferenceType
    * @generated
    */
   public Adapter createunannReferenceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.unannClassOrInterfaceType
    * <em>unann Class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.unannClassOrInterfaceType
    * @generated
    */
   public Adapter createunannClassOrInterfaceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.unannClassType
    * <em>unann Class Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.unannClassType
    * @generated
    */
   public Adapter createunannClassTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.ClassTypeSegment
    * <em>Class Type Segment</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.ClassTypeSegment
    * @generated
    */
   public Adapter createClassTypeSegmentAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations
    * <em>Class Type Segment With Annotations</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations
    * @generated
    */
   public Adapter createClassTypeSegmentWithAnnotationsAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.unannInterfaceType
    * <em>unann Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.unannInterfaceType
    * @generated
    */
   public Adapter createunannInterfaceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.unannTypeVariable
    * <em>unann Type Variable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.unannTypeVariable
    * @generated
    */
   public Adapter createunannTypeVariableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.unannArrayType
    * <em>unann Array Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.unannArrayType
    * @generated
    */
   public Adapter createunannArrayTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.methodDeclaration
    * <em>method Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.methodDeclaration
    * @generated
    */
   public Adapter createmethodDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.methodModifier
    * <em>method Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.methodModifier
    * @generated
    */
   public Adapter createmethodModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.JavaMethodModifier
    * <em>Java Method Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.JavaMethodModifier
    * @generated
    */
   public Adapter createJavaMethodModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.methodHeader
    * <em>method Header</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.methodHeader
    * @generated
    */
   public Adapter createmethodHeaderAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.result <em>result</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.result
    * @generated
    */
   public Adapter createresultAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.voidType <em>void Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.voidType
    * @generated
    */
   public Adapter createvoidTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.methodDeclarator
    * <em>method Declarator</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.methodDeclarator
    * @generated
    */
   public Adapter createmethodDeclaratorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.formalParameterList
    * <em>formal Parameter List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.formalParameterList
    * @generated
    */
   public Adapter createformalParameterListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.formalParameters
    * <em>formal Parameters</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.formalParameters
    * @generated
    */
   public Adapter createformalParametersAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.formalParameter
    * <em>formal Parameter</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.formalParameter
    * @generated
    */
   public Adapter createformalParameterAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.variableModifier
    * <em>variable Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.variableModifier
    * @generated
    */
   public Adapter createvariableModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.JavaVariableModifier
    * <em>Java Variable Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.JavaVariableModifier
    * @generated
    */
   public Adapter createJavaVariableModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.lastFormalParameter
    * <em>last Formal Parameter</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.lastFormalParameter
    * @generated
    */
   public Adapter createlastFormalParameterAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.receiverParameter
    * <em>receiver Parameter</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.receiverParameter
    * @generated
    */
   public Adapter createreceiverParameterAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.throws_ <em>throws </em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.throws_
    * @generated
    */
   public Adapter createthrows_Adapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.exceptionTypeList
    * <em>exception Type List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.exceptionTypeList
    * @generated
    */
   public Adapter createexceptionTypeListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.exceptionType
    * <em>exception Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.exceptionType
    * @generated
    */
   public Adapter createexceptionTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.methodBody <em>method Body</em>}
    * '.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.methodBody
    * @generated
    */
   public Adapter createmethodBodyAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.instanceInitializer
    * <em>instance Initializer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.instanceInitializer
    * @generated
    */
   public Adapter createinstanceInitializerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.staticInitializer
    * <em>static Initializer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.staticInitializer
    * @generated
    */
   public Adapter createstaticInitializerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.constructorDeclaration
    * <em>constructor Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.constructorDeclaration
    * @generated
    */
   public Adapter createconstructorDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.constructorModifier
    * <em>constructor Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.constructorModifier
    * @generated
    */
   public Adapter createconstructorModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.JavaConstructorModifier
    * <em>Java Constructor Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.JavaConstructorModifier
    * @generated
    */
   public Adapter createJavaConstructorModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.constructorDeclarator
    * <em>constructor Declarator</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.constructorDeclarator
    * @generated
    */
   public Adapter createconstructorDeclaratorAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.enumDeclaration
    * <em>enum Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.enumDeclaration
    * @generated
    */
   public Adapter createenumDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.enumBody <em>enum Body</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.enumBody
    * @generated
    */
   public Adapter createenumBodyAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.enumConstantList
    * <em>enum Constant List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.enumConstantList
    * @generated
    */
   public Adapter createenumConstantListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.enumConstant
    * <em>enum Constant</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.enumConstant
    * @generated
    */
   public Adapter createenumConstantAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.enumConstantModifier
    * <em>enum Constant Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.enumConstantModifier
    * @generated
    */
   public Adapter createenumConstantModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.enumBodyDeclarations
    * <em>enum Body Declarations</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.enumBodyDeclarations
    * @generated
    */
   public Adapter createenumBodyDeclarationsAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.interfaceDeclaration
    * <em>interface Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceDeclaration
    * @generated
    */
   public Adapter createinterfaceDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.normalInterfaceDeclaration
    * <em>normal Interface Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.normalInterfaceDeclaration
    * @generated
    */
   public Adapter createnormalInterfaceDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.interfaceModifier
    * <em>interface Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceModifier
    * @generated
    */
   public Adapter createinterfaceModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.JavaInterfaceModifier
    * <em>Java Interface Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.JavaInterfaceModifier
    * @generated
    */
   public Adapter createJavaInterfaceModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.extendsInterfaces
    * <em>extends Interfaces</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.extendsInterfaces
    * @generated
    */
   public Adapter createextendsInterfacesAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.interfaceBody
    * <em>interface Body</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceBody
    * @generated
    */
   public Adapter createinterfaceBodyAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.interfaceMemberDeclaration
    * <em>interface Member Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceMemberDeclaration
    * @generated
    */
   public Adapter createinterfaceMemberDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.constantDeclaration
    * <em>constant Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.constantDeclaration
    * @generated
    */
   public Adapter createconstantDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.constantModifier
    * <em>constant Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.constantModifier
    * @generated
    */
   public Adapter createconstantModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.JavaConstantModifier
    * <em>Java Constant Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.JavaConstantModifier
    * @generated
    */
   public Adapter createJavaConstantModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.interfaceMethodDeclaration
    * <em>interface Method Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceMethodDeclaration
    * @generated
    */
   public Adapter createinterfaceMethodDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.interfaceMethodModifier
    * <em>interface Method Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.interfaceMethodModifier
    * @generated
    */
   public Adapter createinterfaceMethodModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.JavaInterfaceMethodModifiers
    * <em>Java Interface Method Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.JavaInterfaceMethodModifiers
    * @generated
    */
   public Adapter createJavaInterfaceMethodModifiersAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.annotationTypeDeclaration
    * <em>annotation Type Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.annotationTypeDeclaration
    * @generated
    */
   public Adapter createannotationTypeDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.annotationTypeBody
    * <em>annotation Type Body</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.annotationTypeBody
    * @generated
    */
   public Adapter createannotationTypeBodyAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.annotationTypeMemberDeclaration
    * <em>annotation Type Member Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.annotationTypeMemberDeclaration
    * @generated
    */
   public Adapter createannotationTypeMemberDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '
    * {@link org.sourcepit.java.type.type.annotationTypeElementDeclaration <em>annotation Type Element Declaration</em>}
    * '.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.annotationTypeElementDeclaration
    * @generated
    */
   public Adapter createannotationTypeElementDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.annotationTypeElementModifier
    * <em>annotation Type Element Modifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.annotationTypeElementModifier
    * @generated
    */
   public Adapter createannotationTypeElementModifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '
    * {@link org.sourcepit.java.type.type.JavaAnnotationTypeElementModifiers
    * <em>Java Annotation Type Element Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.JavaAnnotationTypeElementModifiers
    * @generated
    */
   public Adapter createJavaAnnotationTypeElementModifiersAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.defaultValue
    * <em>default Value</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.defaultValue
    * @generated
    */
   public Adapter createdefaultValueAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.annotation <em>annotation</em>}
    * '.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.annotation
    * @generated
    */
   public Adapter createannotationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.normalAnnotation
    * <em>normal Annotation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.normalAnnotation
    * @generated
    */
   public Adapter createnormalAnnotationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.elementValuePairList
    * <em>element Value Pair List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.elementValuePairList
    * @generated
    */
   public Adapter createelementValuePairListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.elementValuePair
    * <em>element Value Pair</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.elementValuePair
    * @generated
    */
   public Adapter createelementValuePairAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.elementValue
    * <em>element Value</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.elementValue
    * @generated
    */
   public Adapter createelementValueAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.elementValueArrayInitializer
    * <em>element Value Array Initializer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.elementValueArrayInitializer
    * @generated
    */
   public Adapter createelementValueArrayInitializerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.elementValueList
    * <em>element Value List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.elementValueList
    * @generated
    */
   public Adapter createelementValueListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.markerAnnotation
    * <em>marker Annotation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.markerAnnotation
    * @generated
    */
   public Adapter createmarkerAnnotationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.singleElementAnnotation
    * <em>single Element Annotation</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.singleElementAnnotation
    * @generated
    */
   public Adapter createsingleElementAnnotationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.arrayInitializer
    * <em>array Initializer</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.arrayInitializer
    * @generated
    */
   public Adapter createarrayInitializerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.variableInitializerList
    * <em>variable Initializer List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.variableInitializerList
    * @generated
    */
   public Adapter createvariableInitializerListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.block <em>block</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.block
    * @generated
    */
   public Adapter createblockAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.blockStatements
    * <em>block Statements</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.blockStatements
    * @generated
    */
   public Adapter createblockStatementsAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.argumentList
    * <em>argument List</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.argumentList
    * @generated
    */
   public Adapter createargumentListAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.primary <em>primary</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.primary
    * @generated
    */
   public Adapter createprimaryAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.expression <em>expression</em>}
    * '.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.expression
    * @generated
    */
   public Adapter createexpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.conditionalExpression
    * <em>conditional Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.conditionalExpression
    * @generated
    */
   public Adapter createconditionalExpressionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.EmptyTypeDeclaration
    * <em>Empty Type Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.EmptyTypeDeclaration
    * @generated
    */
   public Adapter createEmptyTypeDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.type.type.EmptyClassMemberDeclaration
    * <em>Empty Class Member Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.type.type.EmptyClassMemberDeclaration
    * @generated
    */
   public Adapter createEmptyClassMemberDeclarationAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} // TypeAdapterFactory
