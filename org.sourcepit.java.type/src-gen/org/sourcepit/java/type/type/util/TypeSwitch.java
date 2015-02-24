/**
 */

package org.sourcepit.java.type.type.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.sourcepit.java.type.type.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each
 * class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.type.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static TypePackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public TypeSwitch() {
      if (modelPackage == null) {
         modelPackage = TypePackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case TypePackage.MODEL : {
            Model model = (Model) theEObject;
            T result = caseModel(model);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE : {
            type type = (type) theEObject;
            T result = casetype(type);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.PRIMITIVE_TYPE : {
            primitiveType primitiveType = (primitiveType) theEObject;
            T result = caseprimitiveType(primitiveType);
            if (result == null)
               result = casetype(primitiveType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.REFERENCE_TYPE : {
            referenceType referenceType = (referenceType) theEObject;
            T result = casereferenceType(referenceType);
            if (result == null)
               result = casetype(referenceType);
            if (result == null)
               result = casetypeArgument(referenceType);
            if (result == null)
               result = casewildcardBounds(referenceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_OR_INTERFACE_TYPE : {
            classOrInterfaceType classOrInterfaceType = (classOrInterfaceType) theEObject;
            T result = caseclassOrInterfaceType(classOrInterfaceType);
            if (result == null)
               result = casereferenceType(classOrInterfaceType);
            if (result == null)
               result = casetype(classOrInterfaceType);
            if (result == null)
               result = casetypeArgument(classOrInterfaceType);
            if (result == null)
               result = casewildcardBounds(classOrInterfaceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_OR_INTERFACE_TYPE_SEGMENT : {
            classOrInterfaceTypeSegment classOrInterfaceTypeSegment = (classOrInterfaceTypeSegment) theEObject;
            T result = caseclassOrInterfaceTypeSegment(classOrInterfaceTypeSegment);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_TYPE : {
            classType classType = (classType) theEObject;
            T result = caseclassType(classType);
            if (result == null)
               result = caseinterfaceType(classType);
            if (result == null)
               result = casesuperclass(classType);
            if (result == null)
               result = caseexceptionType(classType);
            if (result == null)
               result = caseadditionalBound(classType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE : {
            classType_lf_classOrInterfaceType classType_lf_classOrInterfaceType = (classType_lf_classOrInterfaceType) theEObject;
            T result = caseclassType_lf_classOrInterfaceType(classType_lf_classOrInterfaceType);
            if (result == null)
               result = caseinterfaceType_lf_classOrInterfaceType(classType_lf_classOrInterfaceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE : {
            classType_lfno_classOrInterfaceType classType_lfno_classOrInterfaceType = (classType_lfno_classOrInterfaceType) theEObject;
            T result = caseclassType_lfno_classOrInterfaceType(classType_lfno_classOrInterfaceType);
            if (result == null)
               result = caseinterfaceType_lfno_classOrInterfaceType(classType_lfno_classOrInterfaceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_TYPE : {
            interfaceType interfaceType = (interfaceType) theEObject;
            T result = caseinterfaceType(interfaceType);
            if (result == null)
               result = caseadditionalBound(interfaceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE : {
            interfaceType_lf_classOrInterfaceType interfaceType_lf_classOrInterfaceType = (interfaceType_lf_classOrInterfaceType) theEObject;
            T result = caseinterfaceType_lf_classOrInterfaceType(interfaceType_lf_classOrInterfaceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE : {
            interfaceType_lfno_classOrInterfaceType interfaceType_lfno_classOrInterfaceType = (interfaceType_lfno_classOrInterfaceType) theEObject;
            T result = caseinterfaceType_lfno_classOrInterfaceType(interfaceType_lfno_classOrInterfaceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_VARIABLE : {
            typeVariable typeVariable = (typeVariable) theEObject;
            T result = casetypeVariable(typeVariable);
            if (result == null)
               result = casereferenceType(typeVariable);
            if (result == null)
               result = caseexceptionType(typeVariable);
            if (result == null)
               result = casetype(typeVariable);
            if (result == null)
               result = casetypeArgument(typeVariable);
            if (result == null)
               result = casewildcardBounds(typeVariable);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ARRAY_TYPE : {
            arrayType arrayType = (arrayType) theEObject;
            T result = casearrayType(arrayType);
            if (result == null)
               result = casereferenceType(arrayType);
            if (result == null)
               result = casetype(arrayType);
            if (result == null)
               result = casetypeArgument(arrayType);
            if (result == null)
               result = casewildcardBounds(arrayType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.DIMS : {
            dims dims = (dims) theEObject;
            T result = casedims(dims);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.DIM : {
            dim dim = (dim) theEObject;
            T result = casedim(dim);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_PARAMETER : {
            typeParameter typeParameter = (typeParameter) theEObject;
            T result = casetypeParameter(typeParameter);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_PARAMETER_MODIFIER : {
            typeParameterModifier typeParameterModifier = (typeParameterModifier) theEObject;
            T result = casetypeParameterModifier(typeParameterModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_BOUND : {
            typeBound typeBound = (typeBound) theEObject;
            T result = casetypeBound(typeBound);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ADDITIONAL_BOUND : {
            additionalBound additionalBound = (additionalBound) theEObject;
            T result = caseadditionalBound(additionalBound);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_ARGUMENTS : {
            typeArguments typeArguments = (typeArguments) theEObject;
            T result = casetypeArguments(typeArguments);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_ARGUMENT_LIST : {
            typeArgumentList typeArgumentList = (typeArgumentList) theEObject;
            T result = casetypeArgumentList(typeArgumentList);
            if (result == null)
               result = casetypeArguments(typeArgumentList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_ARGUMENT : {
            typeArgument typeArgument = (typeArgument) theEObject;
            T result = casetypeArgument(typeArgument);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.WILDCARD : {
            wildcard wildcard = (wildcard) theEObject;
            T result = casewildcard(wildcard);
            if (result == null)
               result = casetypeArgument(wildcard);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.WILDCARD_BOUNDS : {
            wildcardBounds wildcardBounds = (wildcardBounds) theEObject;
            T result = casewildcardBounds(wildcardBounds);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.COMPILATION_UNIT : {
            compilationUnit compilationUnit = (compilationUnit) theEObject;
            T result = casecompilationUnit(compilationUnit);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.PACKAGE_DECLARATION : {
            packageDeclaration packageDeclaration = (packageDeclaration) theEObject;
            T result = casepackageDeclaration(packageDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.PACKAGE_MODIFIER : {
            packageModifier packageModifier = (packageModifier) theEObject;
            T result = casepackageModifier(packageModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.IMPORT_DECLARATION : {
            importDeclaration importDeclaration = (importDeclaration) theEObject;
            T result = caseimportDeclaration(importDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.SINGLE_TYPE_IMPORT_DECLARATION : {
            singleTypeImportDeclaration singleTypeImportDeclaration = (singleTypeImportDeclaration) theEObject;
            T result = casesingleTypeImportDeclaration(singleTypeImportDeclaration);
            if (result == null)
               result = caseimportDeclaration(singleTypeImportDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_IMPORT_ON_DEMAND_DECLARATION : {
            typeImportOnDemandDeclaration typeImportOnDemandDeclaration = (typeImportOnDemandDeclaration) theEObject;
            T result = casetypeImportOnDemandDeclaration(typeImportOnDemandDeclaration);
            if (result == null)
               result = caseimportDeclaration(typeImportOnDemandDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.SINGLE_STATIC_IMPORT_DECLARATION : {
            singleStaticImportDeclaration singleStaticImportDeclaration = (singleStaticImportDeclaration) theEObject;
            T result = casesingleStaticImportDeclaration(singleStaticImportDeclaration);
            if (result == null)
               result = caseimportDeclaration(singleStaticImportDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.STATIC_IMPORT_ON_DEMAND_DECLARATION : {
            staticImportOnDemandDeclaration staticImportOnDemandDeclaration = (staticImportOnDemandDeclaration) theEObject;
            T result = casestaticImportOnDemandDeclaration(staticImportOnDemandDeclaration);
            if (result == null)
               result = caseimportDeclaration(staticImportOnDemandDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_DECLARATION : {
            typeDeclaration typeDeclaration = (typeDeclaration) theEObject;
            T result = casetypeDeclaration(typeDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_DECLARATION : {
            classDeclaration classDeclaration = (classDeclaration) theEObject;
            T result = caseclassDeclaration(classDeclaration);
            if (result == null)
               result = casetypeDeclaration(classDeclaration);
            if (result == null)
               result = caseclassMemberDeclaration(classDeclaration);
            if (result == null)
               result = caseinterfaceMemberDeclaration(classDeclaration);
            if (result == null)
               result = caseannotationTypeMemberDeclaration(classDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(classDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.NORMAL_CLASS_DECLARATION : {
            normalClassDeclaration normalClassDeclaration = (normalClassDeclaration) theEObject;
            T result = casenormalClassDeclaration(normalClassDeclaration);
            if (result == null)
               result = caseclassDeclaration(normalClassDeclaration);
            if (result == null)
               result = casetypeDeclaration(normalClassDeclaration);
            if (result == null)
               result = caseclassMemberDeclaration(normalClassDeclaration);
            if (result == null)
               result = caseinterfaceMemberDeclaration(normalClassDeclaration);
            if (result == null)
               result = caseannotationTypeMemberDeclaration(normalClassDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(normalClassDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_MODIFIER : {
            classModifier classModifier = (classModifier) theEObject;
            T result = caseclassModifier(classModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.JAVA_CLASS_MODIFIER : {
            JavaClassModifier javaClassModifier = (JavaClassModifier) theEObject;
            T result = caseJavaClassModifier(javaClassModifier);
            if (result == null)
               result = caseclassModifier(javaClassModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_PARAMETERS : {
            typeParameters typeParameters = (typeParameters) theEObject;
            T result = casetypeParameters(typeParameters);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.TYPE_PARAMETER_LIST : {
            typeParameterList typeParameterList = (typeParameterList) theEObject;
            T result = casetypeParameterList(typeParameterList);
            if (result == null)
               result = casetypeParameters(typeParameterList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.SUPERCLASS : {
            superclass superclass = (superclass) theEObject;
            T result = casesuperclass(superclass);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.SUPERINTERFACES : {
            superinterfaces superinterfaces = (superinterfaces) theEObject;
            T result = casesuperinterfaces(superinterfaces);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_TYPE_LIST : {
            interfaceTypeList interfaceTypeList = (interfaceTypeList) theEObject;
            T result = caseinterfaceTypeList(interfaceTypeList);
            if (result == null)
               result = casesuperinterfaces(interfaceTypeList);
            if (result == null)
               result = caseextendsInterfaces(interfaceTypeList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_BODY : {
            classBody classBody = (classBody) theEObject;
            T result = caseclassBody(classBody);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_BODY_DECLARATION : {
            classBodyDeclaration classBodyDeclaration = (classBodyDeclaration) theEObject;
            T result = caseclassBodyDeclaration(classBodyDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_MEMBER_DECLARATION : {
            classMemberDeclaration classMemberDeclaration = (classMemberDeclaration) theEObject;
            T result = caseclassMemberDeclaration(classMemberDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(classMemberDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.FIELD_DECLARATION : {
            fieldDeclaration fieldDeclaration = (fieldDeclaration) theEObject;
            T result = casefieldDeclaration(fieldDeclaration);
            if (result == null)
               result = caseclassMemberDeclaration(fieldDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(fieldDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.FIELD_MODIFIER : {
            fieldModifier fieldModifier = (fieldModifier) theEObject;
            T result = casefieldModifier(fieldModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.JAVA_FIELD_MODIFIER : {
            JavaFieldModifier javaFieldModifier = (JavaFieldModifier) theEObject;
            T result = caseJavaFieldModifier(javaFieldModifier);
            if (result == null)
               result = casefieldModifier(javaFieldModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.VARIABLE_DECLARATOR_LIST : {
            variableDeclaratorList variableDeclaratorList = (variableDeclaratorList) theEObject;
            T result = casevariableDeclaratorList(variableDeclaratorList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.VARIABLE_DECLARATOR : {
            variableDeclarator variableDeclarator = (variableDeclarator) theEObject;
            T result = casevariableDeclarator(variableDeclarator);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.VARIABLE_DECLARATOR_ID : {
            variableDeclaratorId variableDeclaratorId = (variableDeclaratorId) theEObject;
            T result = casevariableDeclaratorId(variableDeclaratorId);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.VARIABLE_INITIALIZER : {
            variableInitializer variableInitializer = (variableInitializer) theEObject;
            T result = casevariableInitializer(variableInitializer);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.UNANN_TYPE : {
            unannType unannType = (unannType) theEObject;
            T result = caseunannType(unannType);
            if (result == null)
               result = caseresult(unannType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.UNANN_PRIMITIVE_TYPE : {
            unannPrimitiveType unannPrimitiveType = (unannPrimitiveType) theEObject;
            T result = caseunannPrimitiveType(unannPrimitiveType);
            if (result == null)
               result = caseunannArrayType(unannPrimitiveType);
            if (result == null)
               result = caseresult(unannPrimitiveType);
            if (result == null)
               result = caseunannReferenceType(unannPrimitiveType);
            if (result == null)
               result = caseunannType(unannPrimitiveType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.UNANN_REFERENCE_TYPE : {
            unannReferenceType unannReferenceType = (unannReferenceType) theEObject;
            T result = caseunannReferenceType(unannReferenceType);
            if (result == null)
               result = caseunannType(unannReferenceType);
            if (result == null)
               result = caseresult(unannReferenceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE : {
            unannClassOrInterfaceType unannClassOrInterfaceType = (unannClassOrInterfaceType) theEObject;
            T result = caseunannClassOrInterfaceType(unannClassOrInterfaceType);
            if (result == null)
               result = caseunannArrayType(unannClassOrInterfaceType);
            if (result == null)
               result = caseunannReferenceType(unannClassOrInterfaceType);
            if (result == null)
               result = caseunannType(unannClassOrInterfaceType);
            if (result == null)
               result = caseresult(unannClassOrInterfaceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.UNANN_CLASS_TYPE : {
            unannClassType unannClassType = (unannClassType) theEObject;
            T result = caseunannClassType(unannClassType);
            if (result == null)
               result = caseunannInterfaceType(unannClassType);
            if (result == null)
               result = caseunannClassOrInterfaceType(unannClassType);
            if (result == null)
               result = caseunannArrayType(unannClassType);
            if (result == null)
               result = caseunannReferenceType(unannClassType);
            if (result == null)
               result = caseunannType(unannClassType);
            if (result == null)
               result = caseresult(unannClassType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_TYPE_SEGMENT : {
            ClassTypeSegment classTypeSegment = (ClassTypeSegment) theEObject;
            T result = caseClassTypeSegment(classTypeSegment);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS : {
            ClassTypeSegmentWithAnnotations classTypeSegmentWithAnnotations = (ClassTypeSegmentWithAnnotations) theEObject;
            T result = caseClassTypeSegmentWithAnnotations(classTypeSegmentWithAnnotations);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.UNANN_INTERFACE_TYPE : {
            unannInterfaceType unannInterfaceType = (unannInterfaceType) theEObject;
            T result = caseunannInterfaceType(unannInterfaceType);
            if (result == null)
               result = caseunannClassOrInterfaceType(unannInterfaceType);
            if (result == null)
               result = caseunannArrayType(unannInterfaceType);
            if (result == null)
               result = caseunannReferenceType(unannInterfaceType);
            if (result == null)
               result = caseunannType(unannInterfaceType);
            if (result == null)
               result = caseresult(unannInterfaceType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.UNANN_TYPE_VARIABLE : {
            unannTypeVariable unannTypeVariable = (unannTypeVariable) theEObject;
            T result = caseunannTypeVariable(unannTypeVariable);
            if (result == null)
               result = caseunannArrayType(unannTypeVariable);
            if (result == null)
               result = caseunannReferenceType(unannTypeVariable);
            if (result == null)
               result = caseunannType(unannTypeVariable);
            if (result == null)
               result = caseresult(unannTypeVariable);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.UNANN_ARRAY_TYPE : {
            unannArrayType unannArrayType = (unannArrayType) theEObject;
            T result = caseunannArrayType(unannArrayType);
            if (result == null)
               result = caseunannReferenceType(unannArrayType);
            if (result == null)
               result = caseunannType(unannArrayType);
            if (result == null)
               result = caseresult(unannArrayType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.METHOD_DECLARATION : {
            methodDeclaration methodDeclaration = (methodDeclaration) theEObject;
            T result = casemethodDeclaration(methodDeclaration);
            if (result == null)
               result = caseclassMemberDeclaration(methodDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(methodDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.METHOD_MODIFIER : {
            methodModifier methodModifier = (methodModifier) theEObject;
            T result = casemethodModifier(methodModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.JAVA_METHOD_MODIFIER : {
            JavaMethodModifier javaMethodModifier = (JavaMethodModifier) theEObject;
            T result = caseJavaMethodModifier(javaMethodModifier);
            if (result == null)
               result = casemethodModifier(javaMethodModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.METHOD_HEADER : {
            methodHeader methodHeader = (methodHeader) theEObject;
            T result = casemethodHeader(methodHeader);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.RESULT : {
            result result = (result) theEObject;
            T theResult = caseresult(result);
            if (theResult == null)
               theResult = defaultCase(theEObject);
            return theResult;
         }
         case TypePackage.VOID_TYPE : {
            voidType voidType = (voidType) theEObject;
            T result = casevoidType(voidType);
            if (result == null)
               result = caseresult(voidType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.METHOD_DECLARATOR : {
            methodDeclarator methodDeclarator = (methodDeclarator) theEObject;
            T result = casemethodDeclarator(methodDeclarator);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.FORMAL_PARAMETER_LIST : {
            formalParameterList formalParameterList = (formalParameterList) theEObject;
            T result = caseformalParameterList(formalParameterList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.FORMAL_PARAMETERS : {
            formalParameters formalParameters = (formalParameters) theEObject;
            T result = caseformalParameters(formalParameters);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.FORMAL_PARAMETER : {
            formalParameter formalParameter = (formalParameter) theEObject;
            T result = caseformalParameter(formalParameter);
            if (result == null)
               result = caselastFormalParameter(formalParameter);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.VARIABLE_MODIFIER : {
            variableModifier variableModifier = (variableModifier) theEObject;
            T result = casevariableModifier(variableModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.JAVA_VARIABLE_MODIFIER : {
            JavaVariableModifier javaVariableModifier = (JavaVariableModifier) theEObject;
            T result = caseJavaVariableModifier(javaVariableModifier);
            if (result == null)
               result = casevariableModifier(javaVariableModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.LAST_FORMAL_PARAMETER : {
            lastFormalParameter lastFormalParameter = (lastFormalParameter) theEObject;
            T result = caselastFormalParameter(lastFormalParameter);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.RECEIVER_PARAMETER : {
            receiverParameter receiverParameter = (receiverParameter) theEObject;
            T result = casereceiverParameter(receiverParameter);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.THROWS_ : {
            throws_ throws_ = (throws_) theEObject;
            T result = casethrows_(throws_);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.EXCEPTION_TYPE_LIST : {
            exceptionTypeList exceptionTypeList = (exceptionTypeList) theEObject;
            T result = caseexceptionTypeList(exceptionTypeList);
            if (result == null)
               result = casethrows_(exceptionTypeList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.EXCEPTION_TYPE : {
            exceptionType exceptionType = (exceptionType) theEObject;
            T result = caseexceptionType(exceptionType);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.METHOD_BODY : {
            methodBody methodBody = (methodBody) theEObject;
            T result = casemethodBody(methodBody);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INSTANCE_INITIALIZER : {
            instanceInitializer instanceInitializer = (instanceInitializer) theEObject;
            T result = caseinstanceInitializer(instanceInitializer);
            if (result == null)
               result = caseclassBodyDeclaration(instanceInitializer);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.STATIC_INITIALIZER : {
            staticInitializer staticInitializer = (staticInitializer) theEObject;
            T result = casestaticInitializer(staticInitializer);
            if (result == null)
               result = caseclassBodyDeclaration(staticInitializer);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CONSTRUCTOR_DECLARATION : {
            constructorDeclaration constructorDeclaration = (constructorDeclaration) theEObject;
            T result = caseconstructorDeclaration(constructorDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(constructorDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CONSTRUCTOR_MODIFIER : {
            constructorModifier constructorModifier = (constructorModifier) theEObject;
            T result = caseconstructorModifier(constructorModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.JAVA_CONSTRUCTOR_MODIFIER : {
            JavaConstructorModifier javaConstructorModifier = (JavaConstructorModifier) theEObject;
            T result = caseJavaConstructorModifier(javaConstructorModifier);
            if (result == null)
               result = caseconstructorModifier(javaConstructorModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CONSTRUCTOR_DECLARATOR : {
            constructorDeclarator constructorDeclarator = (constructorDeclarator) theEObject;
            T result = caseconstructorDeclarator(constructorDeclarator);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ENUM_DECLARATION : {
            enumDeclaration enumDeclaration = (enumDeclaration) theEObject;
            T result = caseenumDeclaration(enumDeclaration);
            if (result == null)
               result = caseclassDeclaration(enumDeclaration);
            if (result == null)
               result = casetypeDeclaration(enumDeclaration);
            if (result == null)
               result = caseclassMemberDeclaration(enumDeclaration);
            if (result == null)
               result = caseinterfaceMemberDeclaration(enumDeclaration);
            if (result == null)
               result = caseannotationTypeMemberDeclaration(enumDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(enumDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ENUM_BODY : {
            enumBody enumBody = (enumBody) theEObject;
            T result = caseenumBody(enumBody);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ENUM_CONSTANT_LIST : {
            enumConstantList enumConstantList = (enumConstantList) theEObject;
            T result = caseenumConstantList(enumConstantList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ENUM_CONSTANT : {
            enumConstant enumConstant = (enumConstant) theEObject;
            T result = caseenumConstant(enumConstant);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ENUM_CONSTANT_MODIFIER : {
            enumConstantModifier enumConstantModifier = (enumConstantModifier) theEObject;
            T result = caseenumConstantModifier(enumConstantModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ENUM_BODY_DECLARATIONS : {
            enumBodyDeclarations enumBodyDeclarations = (enumBodyDeclarations) theEObject;
            T result = caseenumBodyDeclarations(enumBodyDeclarations);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_DECLARATION : {
            interfaceDeclaration interfaceDeclaration = (interfaceDeclaration) theEObject;
            T result = caseinterfaceDeclaration(interfaceDeclaration);
            if (result == null)
               result = casetypeDeclaration(interfaceDeclaration);
            if (result == null)
               result = caseclassMemberDeclaration(interfaceDeclaration);
            if (result == null)
               result = caseinterfaceMemberDeclaration(interfaceDeclaration);
            if (result == null)
               result = caseannotationTypeMemberDeclaration(interfaceDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(interfaceDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.NORMAL_INTERFACE_DECLARATION : {
            normalInterfaceDeclaration normalInterfaceDeclaration = (normalInterfaceDeclaration) theEObject;
            T result = casenormalInterfaceDeclaration(normalInterfaceDeclaration);
            if (result == null)
               result = caseinterfaceDeclaration(normalInterfaceDeclaration);
            if (result == null)
               result = casetypeDeclaration(normalInterfaceDeclaration);
            if (result == null)
               result = caseclassMemberDeclaration(normalInterfaceDeclaration);
            if (result == null)
               result = caseinterfaceMemberDeclaration(normalInterfaceDeclaration);
            if (result == null)
               result = caseannotationTypeMemberDeclaration(normalInterfaceDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(normalInterfaceDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_MODIFIER : {
            interfaceModifier interfaceModifier = (interfaceModifier) theEObject;
            T result = caseinterfaceModifier(interfaceModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.JAVA_INTERFACE_MODIFIER : {
            JavaInterfaceModifier javaInterfaceModifier = (JavaInterfaceModifier) theEObject;
            T result = caseJavaInterfaceModifier(javaInterfaceModifier);
            if (result == null)
               result = caseinterfaceModifier(javaInterfaceModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.EXTENDS_INTERFACES : {
            extendsInterfaces extendsInterfaces = (extendsInterfaces) theEObject;
            T result = caseextendsInterfaces(extendsInterfaces);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_BODY : {
            interfaceBody interfaceBody = (interfaceBody) theEObject;
            T result = caseinterfaceBody(interfaceBody);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_MEMBER_DECLARATION : {
            interfaceMemberDeclaration interfaceMemberDeclaration = (interfaceMemberDeclaration) theEObject;
            T result = caseinterfaceMemberDeclaration(interfaceMemberDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CONSTANT_DECLARATION : {
            constantDeclaration constantDeclaration = (constantDeclaration) theEObject;
            T result = caseconstantDeclaration(constantDeclaration);
            if (result == null)
               result = caseinterfaceMemberDeclaration(constantDeclaration);
            if (result == null)
               result = caseannotationTypeMemberDeclaration(constantDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CONSTANT_MODIFIER : {
            constantModifier constantModifier = (constantModifier) theEObject;
            T result = caseconstantModifier(constantModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.JAVA_CONSTANT_MODIFIER : {
            JavaConstantModifier javaConstantModifier = (JavaConstantModifier) theEObject;
            T result = caseJavaConstantModifier(javaConstantModifier);
            if (result == null)
               result = caseconstantModifier(javaConstantModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_METHOD_DECLARATION : {
            interfaceMethodDeclaration interfaceMethodDeclaration = (interfaceMethodDeclaration) theEObject;
            T result = caseinterfaceMethodDeclaration(interfaceMethodDeclaration);
            if (result == null)
               result = caseinterfaceMemberDeclaration(interfaceMethodDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.INTERFACE_METHOD_MODIFIER : {
            interfaceMethodModifier interfaceMethodModifier = (interfaceMethodModifier) theEObject;
            T result = caseinterfaceMethodModifier(interfaceMethodModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.JAVA_INTERFACE_METHOD_MODIFIERS : {
            JavaInterfaceMethodModifiers javaInterfaceMethodModifiers = (JavaInterfaceMethodModifiers) theEObject;
            T result = caseJavaInterfaceMethodModifiers(javaInterfaceMethodModifiers);
            if (result == null)
               result = caseinterfaceMethodModifier(javaInterfaceMethodModifiers);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ANNOTATION_TYPE_DECLARATION : {
            annotationTypeDeclaration annotationTypeDeclaration = (annotationTypeDeclaration) theEObject;
            T result = caseannotationTypeDeclaration(annotationTypeDeclaration);
            if (result == null)
               result = caseinterfaceDeclaration(annotationTypeDeclaration);
            if (result == null)
               result = casetypeDeclaration(annotationTypeDeclaration);
            if (result == null)
               result = caseclassMemberDeclaration(annotationTypeDeclaration);
            if (result == null)
               result = caseinterfaceMemberDeclaration(annotationTypeDeclaration);
            if (result == null)
               result = caseannotationTypeMemberDeclaration(annotationTypeDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(annotationTypeDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ANNOTATION_TYPE_BODY : {
            annotationTypeBody annotationTypeBody = (annotationTypeBody) theEObject;
            T result = caseannotationTypeBody(annotationTypeBody);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ANNOTATION_TYPE_MEMBER_DECLARATION : {
            annotationTypeMemberDeclaration annotationTypeMemberDeclaration = (annotationTypeMemberDeclaration) theEObject;
            T result = caseannotationTypeMemberDeclaration(annotationTypeMemberDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION : {
            annotationTypeElementDeclaration annotationTypeElementDeclaration = (annotationTypeElementDeclaration) theEObject;
            T result = caseannotationTypeElementDeclaration(annotationTypeElementDeclaration);
            if (result == null)
               result = caseannotationTypeMemberDeclaration(annotationTypeElementDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ANNOTATION_TYPE_ELEMENT_MODIFIER : {
            annotationTypeElementModifier annotationTypeElementModifier = (annotationTypeElementModifier) theEObject;
            T result = caseannotationTypeElementModifier(annotationTypeElementModifier);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS : {
            JavaAnnotationTypeElementModifiers javaAnnotationTypeElementModifiers = (JavaAnnotationTypeElementModifiers) theEObject;
            T result = caseJavaAnnotationTypeElementModifiers(javaAnnotationTypeElementModifiers);
            if (result == null)
               result = caseannotationTypeElementModifier(javaAnnotationTypeElementModifiers);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.DEFAULT_VALUE : {
            defaultValue defaultValue = (defaultValue) theEObject;
            T result = casedefaultValue(defaultValue);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ANNOTATION : {
            annotation annotation = (annotation) theEObject;
            T result = caseannotation(annotation);
            if (result == null)
               result = casetypeParameterModifier(annotation);
            if (result == null)
               result = casepackageModifier(annotation);
            if (result == null)
               result = caseclassModifier(annotation);
            if (result == null)
               result = casefieldModifier(annotation);
            if (result == null)
               result = casemethodModifier(annotation);
            if (result == null)
               result = casevariableModifier(annotation);
            if (result == null)
               result = caseconstructorModifier(annotation);
            if (result == null)
               result = caseenumConstantModifier(annotation);
            if (result == null)
               result = caseinterfaceModifier(annotation);
            if (result == null)
               result = caseconstantModifier(annotation);
            if (result == null)
               result = caseinterfaceMethodModifier(annotation);
            if (result == null)
               result = caseannotationTypeElementModifier(annotation);
            if (result == null)
               result = caseelementValue(annotation);
            if (result == null)
               result = casedefaultValue(annotation);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.NORMAL_ANNOTATION : {
            normalAnnotation normalAnnotation = (normalAnnotation) theEObject;
            T result = casenormalAnnotation(normalAnnotation);
            if (result == null)
               result = caseannotation(normalAnnotation);
            if (result == null)
               result = casetypeParameterModifier(normalAnnotation);
            if (result == null)
               result = casepackageModifier(normalAnnotation);
            if (result == null)
               result = caseclassModifier(normalAnnotation);
            if (result == null)
               result = casefieldModifier(normalAnnotation);
            if (result == null)
               result = casemethodModifier(normalAnnotation);
            if (result == null)
               result = casevariableModifier(normalAnnotation);
            if (result == null)
               result = caseconstructorModifier(normalAnnotation);
            if (result == null)
               result = caseenumConstantModifier(normalAnnotation);
            if (result == null)
               result = caseinterfaceModifier(normalAnnotation);
            if (result == null)
               result = caseconstantModifier(normalAnnotation);
            if (result == null)
               result = caseinterfaceMethodModifier(normalAnnotation);
            if (result == null)
               result = caseannotationTypeElementModifier(normalAnnotation);
            if (result == null)
               result = caseelementValue(normalAnnotation);
            if (result == null)
               result = casedefaultValue(normalAnnotation);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ELEMENT_VALUE_PAIR_LIST : {
            elementValuePairList elementValuePairList = (elementValuePairList) theEObject;
            T result = caseelementValuePairList(elementValuePairList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ELEMENT_VALUE_PAIR : {
            elementValuePair elementValuePair = (elementValuePair) theEObject;
            T result = caseelementValuePair(elementValuePair);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ELEMENT_VALUE : {
            elementValue elementValue = (elementValue) theEObject;
            T result = caseelementValue(elementValue);
            if (result == null)
               result = casedefaultValue(elementValue);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER : {
            elementValueArrayInitializer elementValueArrayInitializer = (elementValueArrayInitializer) theEObject;
            T result = caseelementValueArrayInitializer(elementValueArrayInitializer);
            if (result == null)
               result = caseelementValue(elementValueArrayInitializer);
            if (result == null)
               result = casedefaultValue(elementValueArrayInitializer);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ELEMENT_VALUE_LIST : {
            elementValueList elementValueList = (elementValueList) theEObject;
            T result = caseelementValueList(elementValueList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.MARKER_ANNOTATION : {
            markerAnnotation markerAnnotation = (markerAnnotation) theEObject;
            T result = casemarkerAnnotation(markerAnnotation);
            if (result == null)
               result = caseannotation(markerAnnotation);
            if (result == null)
               result = casetypeParameterModifier(markerAnnotation);
            if (result == null)
               result = casepackageModifier(markerAnnotation);
            if (result == null)
               result = caseclassModifier(markerAnnotation);
            if (result == null)
               result = casefieldModifier(markerAnnotation);
            if (result == null)
               result = casemethodModifier(markerAnnotation);
            if (result == null)
               result = casevariableModifier(markerAnnotation);
            if (result == null)
               result = caseconstructorModifier(markerAnnotation);
            if (result == null)
               result = caseenumConstantModifier(markerAnnotation);
            if (result == null)
               result = caseinterfaceModifier(markerAnnotation);
            if (result == null)
               result = caseconstantModifier(markerAnnotation);
            if (result == null)
               result = caseinterfaceMethodModifier(markerAnnotation);
            if (result == null)
               result = caseannotationTypeElementModifier(markerAnnotation);
            if (result == null)
               result = caseelementValue(markerAnnotation);
            if (result == null)
               result = casedefaultValue(markerAnnotation);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.SINGLE_ELEMENT_ANNOTATION : {
            singleElementAnnotation singleElementAnnotation = (singleElementAnnotation) theEObject;
            T result = casesingleElementAnnotation(singleElementAnnotation);
            if (result == null)
               result = caseannotation(singleElementAnnotation);
            if (result == null)
               result = casetypeParameterModifier(singleElementAnnotation);
            if (result == null)
               result = casepackageModifier(singleElementAnnotation);
            if (result == null)
               result = caseclassModifier(singleElementAnnotation);
            if (result == null)
               result = casefieldModifier(singleElementAnnotation);
            if (result == null)
               result = casemethodModifier(singleElementAnnotation);
            if (result == null)
               result = casevariableModifier(singleElementAnnotation);
            if (result == null)
               result = caseconstructorModifier(singleElementAnnotation);
            if (result == null)
               result = caseenumConstantModifier(singleElementAnnotation);
            if (result == null)
               result = caseinterfaceModifier(singleElementAnnotation);
            if (result == null)
               result = caseconstantModifier(singleElementAnnotation);
            if (result == null)
               result = caseinterfaceMethodModifier(singleElementAnnotation);
            if (result == null)
               result = caseannotationTypeElementModifier(singleElementAnnotation);
            if (result == null)
               result = caseelementValue(singleElementAnnotation);
            if (result == null)
               result = casedefaultValue(singleElementAnnotation);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ARRAY_INITIALIZER : {
            arrayInitializer arrayInitializer = (arrayInitializer) theEObject;
            T result = casearrayInitializer(arrayInitializer);
            if (result == null)
               result = casevariableInitializer(arrayInitializer);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.VARIABLE_INITIALIZER_LIST : {
            variableInitializerList variableInitializerList = (variableInitializerList) theEObject;
            T result = casevariableInitializerList(variableInitializerList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.BLOCK : {
            block block = (block) theEObject;
            T result = caseblock(block);
            if (result == null)
               result = casemethodBody(block);
            if (result == null)
               result = caseinstanceInitializer(block);
            if (result == null)
               result = casestaticInitializer(block);
            if (result == null)
               result = caseclassBodyDeclaration(block);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.BLOCK_STATEMENTS : {
            blockStatements blockStatements = (blockStatements) theEObject;
            T result = caseblockStatements(blockStatements);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.ARGUMENT_LIST : {
            argumentList argumentList = (argumentList) theEObject;
            T result = caseargumentList(argumentList);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.PRIMARY : {
            primary primary = (primary) theEObject;
            T result = caseprimary(primary);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.EXPRESSION : {
            expression expression = (expression) theEObject;
            T result = caseexpression(expression);
            if (result == null)
               result = casevariableInitializer(expression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.CONDITIONAL_EXPRESSION : {
            conditionalExpression conditionalExpression = (conditionalExpression) theEObject;
            T result = caseconditionalExpression(conditionalExpression);
            if (result == null)
               result = caseelementValue(conditionalExpression);
            if (result == null)
               result = casedefaultValue(conditionalExpression);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.EMPTY_TYPE_DECLARATION : {
            EmptyTypeDeclaration emptyTypeDeclaration = (EmptyTypeDeclaration) theEObject;
            T result = caseEmptyTypeDeclaration(emptyTypeDeclaration);
            if (result == null)
               result = casetypeDeclaration(emptyTypeDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case TypePackage.EMPTY_CLASS_MEMBER_DECLARATION : {
            EmptyClassMemberDeclaration emptyClassMemberDeclaration = (EmptyClassMemberDeclaration) theEObject;
            T result = caseEmptyClassMemberDeclaration(emptyClassMemberDeclaration);
            if (result == null)
               result = caseclassMemberDeclaration(emptyClassMemberDeclaration);
            if (result == null)
               result = caseclassBodyDeclaration(emptyClassMemberDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default :
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Model</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseModel(Model object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetype(type object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>primitive Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>primitive Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseprimitiveType(primitiveType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>reference Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>reference Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casereferenceType(referenceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Or Interface Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassOrInterfaceType(classOrInterfaceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Or Interface Type Segment</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Or Interface Type Segment</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassOrInterfaceTypeSegment(classOrInterfaceTypeSegment object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassType(classType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Type lf class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Type lf class Or Interface Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassType_lf_classOrInterfaceType(classType_lf_classOrInterfaceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Type lfno class Or Interface Type</em>
    * '.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Type lfno class Or Interface Type</em>
    *         '.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassType_lfno_classOrInterfaceType(classType_lfno_classOrInterfaceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>interface Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>interface Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceType(interfaceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '
    * <em>interface Type lf class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '
    *         <em>interface Type lf class Or Interface Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceType_lf_classOrInterfaceType(interfaceType_lf_classOrInterfaceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '
    * <em>interface Type lfno class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '
    *         <em>interface Type lfno class Or Interface Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceType_lfno_classOrInterfaceType(interfaceType_lfno_classOrInterfaceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Variable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Variable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeVariable(typeVariable object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>array Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>array Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casearrayType(arrayType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>dims</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>dims</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casedims(dims object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>dim</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>dim</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casedim(dim object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Parameter</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Parameter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeParameter(typeParameter object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Parameter Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Parameter Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeParameterModifier(typeParameterModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Bound</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Bound</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeBound(typeBound object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>additional Bound</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>additional Bound</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseadditionalBound(additionalBound object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Arguments</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Arguments</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeArguments(typeArguments object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Argument List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Argument List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeArgumentList(typeArgumentList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Argument</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Argument</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeArgument(typeArgument object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>wildcard</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>wildcard</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casewildcard(wildcard object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>wildcard Bounds</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>wildcard Bounds</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casewildcardBounds(wildcardBounds object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>compilation Unit</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>compilation Unit</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casecompilationUnit(compilationUnit object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>package Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>package Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casepackageDeclaration(packageDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>package Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>package Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casepackageModifier(packageModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>import Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>import Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseimportDeclaration(importDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>single Type Import Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>single Type Import Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casesingleTypeImportDeclaration(singleTypeImportDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Import On Demand Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Import On Demand Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeImportOnDemandDeclaration(typeImportOnDemandDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>single Static Import Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>single Static Import Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casesingleStaticImportDeclaration(singleStaticImportDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>static Import On Demand Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>static Import On Demand Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casestaticImportOnDemandDeclaration(staticImportOnDemandDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeDeclaration(typeDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassDeclaration(classDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>normal Class Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>normal Class Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casenormalClassDeclaration(normalClassDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassModifier(classModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Java Class Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Java Class Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJavaClassModifier(JavaClassModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Parameters</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Parameters</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeParameters(typeParameters object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>type Parameter List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>type Parameter List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casetypeParameterList(typeParameterList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>superclass</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>superclass</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casesuperclass(superclass object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>superinterfaces</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>superinterfaces</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casesuperinterfaces(superinterfaces object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>interface Type List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>interface Type List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceTypeList(interfaceTypeList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Body</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Body</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassBody(classBody object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Body Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Body Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassBodyDeclaration(classBodyDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>class Member Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>class Member Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseclassMemberDeclaration(classMemberDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>field Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>field Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casefieldDeclaration(fieldDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>field Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>field Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casefieldModifier(fieldModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Java Field Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Java Field Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJavaFieldModifier(JavaFieldModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>variable Declarator List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>variable Declarator List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casevariableDeclaratorList(variableDeclaratorList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>variable Declarator</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>variable Declarator</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casevariableDeclarator(variableDeclarator object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>variable Declarator Id</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>variable Declarator Id</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casevariableDeclaratorId(variableDeclaratorId object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>variable Initializer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>variable Initializer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casevariableInitializer(variableInitializer object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>unann Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>unann Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseunannType(unannType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>unann Primitive Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>unann Primitive Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseunannPrimitiveType(unannPrimitiveType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>unann Reference Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>unann Reference Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseunannReferenceType(unannReferenceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>unann Class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>unann Class Or Interface Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseunannClassOrInterfaceType(unannClassOrInterfaceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>unann Class Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>unann Class Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseunannClassType(unannClassType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Class Type Segment</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Class Type Segment</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseClassTypeSegment(ClassTypeSegment object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Class Type Segment With Annotations</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Class Type Segment With Annotations</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseClassTypeSegmentWithAnnotations(ClassTypeSegmentWithAnnotations object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>unann Interface Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>unann Interface Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseunannInterfaceType(unannInterfaceType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>unann Type Variable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>unann Type Variable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseunannTypeVariable(unannTypeVariable object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>unann Array Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>unann Array Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseunannArrayType(unannArrayType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>method Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>method Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casemethodDeclaration(methodDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>method Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>method Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casemethodModifier(methodModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Java Method Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Java Method Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJavaMethodModifier(JavaMethodModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>method Header</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>method Header</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casemethodHeader(methodHeader object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>result</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>result</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseresult(result object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>void Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>void Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casevoidType(voidType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>method Declarator</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>method Declarator</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casemethodDeclarator(methodDeclarator object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>formal Parameter List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>formal Parameter List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseformalParameterList(formalParameterList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>formal Parameters</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>formal Parameters</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseformalParameters(formalParameters object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>formal Parameter</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>formal Parameter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseformalParameter(formalParameter object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>variable Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>variable Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casevariableModifier(variableModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Java Variable Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Java Variable Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJavaVariableModifier(JavaVariableModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>last Formal Parameter</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>last Formal Parameter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caselastFormalParameter(lastFormalParameter object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>receiver Parameter</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>receiver Parameter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casereceiverParameter(receiverParameter object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>throws </em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>throws </em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casethrows_(throws_ object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>exception Type List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>exception Type List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseexceptionTypeList(exceptionTypeList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>exception Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>exception Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseexceptionType(exceptionType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>method Body</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>method Body</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casemethodBody(methodBody object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>instance Initializer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>instance Initializer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinstanceInitializer(instanceInitializer object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>static Initializer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>static Initializer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casestaticInitializer(staticInitializer object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>constructor Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>constructor Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseconstructorDeclaration(constructorDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>constructor Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>constructor Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseconstructorModifier(constructorModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Java Constructor Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Java Constructor Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJavaConstructorModifier(JavaConstructorModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>constructor Declarator</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>constructor Declarator</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseconstructorDeclarator(constructorDeclarator object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>enum Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>enum Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseenumDeclaration(enumDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>enum Body</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>enum Body</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseenumBody(enumBody object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>enum Constant List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>enum Constant List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseenumConstantList(enumConstantList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>enum Constant</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>enum Constant</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseenumConstant(enumConstant object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>enum Constant Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>enum Constant Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseenumConstantModifier(enumConstantModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>enum Body Declarations</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>enum Body Declarations</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseenumBodyDeclarations(enumBodyDeclarations object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>interface Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>interface Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceDeclaration(interfaceDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>normal Interface Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>normal Interface Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casenormalInterfaceDeclaration(normalInterfaceDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>interface Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>interface Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceModifier(interfaceModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Java Interface Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Java Interface Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJavaInterfaceModifier(JavaInterfaceModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>extends Interfaces</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>extends Interfaces</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseextendsInterfaces(extendsInterfaces object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>interface Body</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>interface Body</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceBody(interfaceBody object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>interface Member Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>interface Member Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceMemberDeclaration(interfaceMemberDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>constant Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>constant Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseconstantDeclaration(constantDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>constant Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>constant Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseconstantModifier(constantModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Java Constant Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Java Constant Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJavaConstantModifier(JavaConstantModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>interface Method Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>interface Method Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceMethodDeclaration(interfaceMethodDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>interface Method Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>interface Method Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseinterfaceMethodModifier(interfaceMethodModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Java Interface Method Modifiers</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Java Interface Method Modifiers</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJavaInterfaceMethodModifiers(JavaInterfaceMethodModifiers object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>annotation Type Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>annotation Type Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseannotationTypeDeclaration(annotationTypeDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>annotation Type Body</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>annotation Type Body</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseannotationTypeBody(annotationTypeBody object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>annotation Type Member Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>annotation Type Member Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseannotationTypeMemberDeclaration(annotationTypeMemberDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>annotation Type Element Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>annotation Type Element Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseannotationTypeElementDeclaration(annotationTypeElementDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>annotation Type Element Modifier</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>annotation Type Element Modifier</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseannotationTypeElementModifier(annotationTypeElementModifier object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Java Annotation Type Element Modifiers</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Java Annotation Type Element Modifiers</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJavaAnnotationTypeElementModifiers(JavaAnnotationTypeElementModifiers object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>default Value</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>default Value</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casedefaultValue(defaultValue object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>annotation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>annotation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseannotation(annotation object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>normal Annotation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>normal Annotation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casenormalAnnotation(normalAnnotation object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>element Value Pair List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>element Value Pair List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseelementValuePairList(elementValuePairList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>element Value Pair</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>element Value Pair</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseelementValuePair(elementValuePair object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>element Value</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>element Value</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseelementValue(elementValue object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>element Value Array Initializer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>element Value Array Initializer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseelementValueArrayInitializer(elementValueArrayInitializer object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>element Value List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>element Value List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseelementValueList(elementValueList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>marker Annotation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>marker Annotation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casemarkerAnnotation(markerAnnotation object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>single Element Annotation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>single Element Annotation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casesingleElementAnnotation(singleElementAnnotation object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>array Initializer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>array Initializer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casearrayInitializer(arrayInitializer object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>variable Initializer List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>variable Initializer List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casevariableInitializerList(variableInitializerList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>block</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>block</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseblock(block object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>block Statements</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>block Statements</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseblockStatements(blockStatements object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>argument List</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>argument List</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseargumentList(argumentList object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>primary</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>primary</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseprimary(primary object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>expression</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseexpression(expression object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>conditional Expression</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>conditional Expression</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseconditionalExpression(conditionalExpression object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Empty Type Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Empty Type Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEmptyTypeDeclaration(EmptyTypeDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Empty Class Member Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Empty Class Member Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEmptyClassMemberDeclaration(EmptyClassMemberDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} // TypeSwitch
