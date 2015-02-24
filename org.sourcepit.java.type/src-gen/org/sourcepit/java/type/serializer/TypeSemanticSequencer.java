
package org.sourcepit.java.type.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.sourcepit.java.literals.literals.BooleanLiteral;
import org.sourcepit.java.literals.literals.CharacterLiteral;
import org.sourcepit.java.literals.literals.FloatingPointLiteral;
import org.sourcepit.java.literals.literals.IntegerLiteral;
import org.sourcepit.java.literals.literals.LiteralsPackage;
import org.sourcepit.java.literals.literals.NullLiteral;
import org.sourcepit.java.literals.literals.StringLiteral;
import org.sourcepit.java.literals.serializer.LiteralsSemanticSequencer;
import org.sourcepit.java.type.services.TypeGrammarAccess;
import org.sourcepit.java.type.type.ClassTypeSegment;
import org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations;
import org.sourcepit.java.type.type.EmptyClassMemberDeclaration;
import org.sourcepit.java.type.type.EmptyTypeDeclaration;
import org.sourcepit.java.type.type.JavaAnnotationTypeElementModifiers;
import org.sourcepit.java.type.type.JavaClassModifier;
import org.sourcepit.java.type.type.JavaConstantModifier;
import org.sourcepit.java.type.type.JavaConstructorModifier;
import org.sourcepit.java.type.type.JavaFieldModifier;
import org.sourcepit.java.type.type.JavaInterfaceMethodModifiers;
import org.sourcepit.java.type.type.JavaInterfaceModifier;
import org.sourcepit.java.type.type.JavaMethodModifier;
import org.sourcepit.java.type.type.JavaVariableModifier;
import org.sourcepit.java.type.type.Model;
import org.sourcepit.java.type.type.TypePackage;
import org.sourcepit.java.type.type.annotationTypeBody;
import org.sourcepit.java.type.type.annotationTypeDeclaration;
import org.sourcepit.java.type.type.annotationTypeElementDeclaration;
import org.sourcepit.java.type.type.annotationTypeMemberDeclaration;
import org.sourcepit.java.type.type.argumentList;
import org.sourcepit.java.type.type.arrayInitializer;
import org.sourcepit.java.type.type.arrayType;
import org.sourcepit.java.type.type.block;
import org.sourcepit.java.type.type.blockStatements;
import org.sourcepit.java.type.type.classBody;
import org.sourcepit.java.type.type.classOrInterfaceType;
import org.sourcepit.java.type.type.classOrInterfaceTypeSegment;
import org.sourcepit.java.type.type.classType;
import org.sourcepit.java.type.type.classType_lf_classOrInterfaceType;
import org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType;
import org.sourcepit.java.type.type.compilationUnit;
import org.sourcepit.java.type.type.conditionalExpression;
import org.sourcepit.java.type.type.constantDeclaration;
import org.sourcepit.java.type.type.constructorDeclaration;
import org.sourcepit.java.type.type.constructorDeclarator;
import org.sourcepit.java.type.type.dim;
import org.sourcepit.java.type.type.dims;
import org.sourcepit.java.type.type.elementValueArrayInitializer;
import org.sourcepit.java.type.type.elementValueList;
import org.sourcepit.java.type.type.elementValuePair;
import org.sourcepit.java.type.type.elementValuePairList;
import org.sourcepit.java.type.type.enumBody;
import org.sourcepit.java.type.type.enumBodyDeclarations;
import org.sourcepit.java.type.type.enumConstant;
import org.sourcepit.java.type.type.enumConstantList;
import org.sourcepit.java.type.type.enumDeclaration;
import org.sourcepit.java.type.type.exceptionTypeList;
import org.sourcepit.java.type.type.expression;
import org.sourcepit.java.type.type.fieldDeclaration;
import org.sourcepit.java.type.type.formalParameter;
import org.sourcepit.java.type.type.formalParameterList;
import org.sourcepit.java.type.type.formalParameters;
import org.sourcepit.java.type.type.interfaceBody;
import org.sourcepit.java.type.type.interfaceMemberDeclaration;
import org.sourcepit.java.type.type.interfaceMethodDeclaration;
import org.sourcepit.java.type.type.interfaceTypeList;
import org.sourcepit.java.type.type.lastFormalParameter;
import org.sourcepit.java.type.type.markerAnnotation;
import org.sourcepit.java.type.type.methodBody;
import org.sourcepit.java.type.type.methodDeclaration;
import org.sourcepit.java.type.type.methodDeclarator;
import org.sourcepit.java.type.type.methodHeader;
import org.sourcepit.java.type.type.normalAnnotation;
import org.sourcepit.java.type.type.normalClassDeclaration;
import org.sourcepit.java.type.type.normalInterfaceDeclaration;
import org.sourcepit.java.type.type.packageDeclaration;
import org.sourcepit.java.type.type.primary;
import org.sourcepit.java.type.type.primitiveType;
import org.sourcepit.java.type.type.receiverParameter;
import org.sourcepit.java.type.type.singleElementAnnotation;
import org.sourcepit.java.type.type.singleStaticImportDeclaration;
import org.sourcepit.java.type.type.singleTypeImportDeclaration;
import org.sourcepit.java.type.type.staticImportOnDemandDeclaration;
import org.sourcepit.java.type.type.typeArgumentList;
import org.sourcepit.java.type.type.typeBound;
import org.sourcepit.java.type.type.typeImportOnDemandDeclaration;
import org.sourcepit.java.type.type.typeParameter;
import org.sourcepit.java.type.type.typeParameterList;
import org.sourcepit.java.type.type.typeVariable;
import org.sourcepit.java.type.type.unannClassType;
import org.sourcepit.java.type.type.unannPrimitiveType;
import org.sourcepit.java.type.type.unannTypeVariable;
import org.sourcepit.java.type.type.variableDeclarator;
import org.sourcepit.java.type.type.variableDeclaratorId;
import org.sourcepit.java.type.type.variableDeclaratorList;
import org.sourcepit.java.type.type.variableInitializerList;
import org.sourcepit.java.type.type.voidType;
import org.sourcepit.java.type.type.wildcard;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class TypeSemanticSequencer extends LiteralsSemanticSequencer {

   @Inject
   private TypeGrammarAccess grammarAccess;

   public void createSequence(EObject context, EObject semanticObject) {
      if (semanticObject.eClass().getEPackage() == LiteralsPackage.eINSTANCE)
         switch (semanticObject.eClass().getClassifierID()) {
            case LiteralsPackage.BOOLEAN_LITERAL :
               if (context == grammarAccess.getBooleanLiteralRule() || context == grammarAccess.getFooRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.CHARACTER_LITERAL :
               if (context == grammarAccess.getCharacterLiteralRule() || context == grammarAccess.getFooRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_CharacterLiteral(context, (CharacterLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.FLOATING_POINT_LITERAL :
               if (context == grammarAccess.getFloatingPointLiteralRule() || context == grammarAccess.getFooRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_FloatingPointLiteral(context, (FloatingPointLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.INTEGER_LITERAL :
               if (context == grammarAccess.getFooRule() || context == grammarAccess.getIntegerLiteralRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.NULL_LITERAL :
               if (context == grammarAccess.getFooRule() || context == grammarAccess.getNullLiteralRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_NullLiteral(context, (NullLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.STRING_LITERAL :
               if (context == grammarAccess.getFooRule() || context == grammarAccess.getStringLiteralRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_StringLiteral(context, (StringLiteral) semanticObject);
                  return;
               }
               else
                  break;
         }
      else if (semanticObject.eClass().getEPackage() == TypePackage.eINSTANCE)
         switch (semanticObject.eClass().getClassifierID()) {
            case TypePackage.CLASS_TYPE_SEGMENT :
               if (context == grammarAccess.getClassTypeSegmentRule()) {
                  sequence_ClassTypeSegment(context, (ClassTypeSegment) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS :
               if (context == grammarAccess.getClassTypeSegmentWithAnnotationsRule()) {
                  sequence_ClassTypeSegmentWithAnnotations(context, (ClassTypeSegmentWithAnnotations) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.EMPTY_CLASS_MEMBER_DECLARATION :
               if (context == grammarAccess.getClassBodyDeclarationRule()
                  || context == grammarAccess.getClassMemberDeclarationRule()) {
                  sequence_classMemberDeclaration(context, (EmptyClassMemberDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.EMPTY_TYPE_DECLARATION :
               if (context == grammarAccess.getTypeDeclarationRule()) {
                  sequence_typeDeclaration(context, (EmptyTypeDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS :
               if (context == grammarAccess.getJavaAnnotationTypeElementModifiersRule()
                  || context == grammarAccess.getAnnotationTypeElementModifierRule()) {
                  sequence_JavaAnnotationTypeElementModifiers(context,
                     (JavaAnnotationTypeElementModifiers) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.JAVA_CLASS_MODIFIER :
               if (context == grammarAccess.getJavaClassModifierRule()
                  || context == grammarAccess.getClassModifierRule()) {
                  sequence_JavaClassModifier(context, (JavaClassModifier) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.JAVA_CONSTANT_MODIFIER :
               if (context == grammarAccess.getJavaConstantModifierRule()
                  || context == grammarAccess.getConstantModifierRule()) {
                  sequence_JavaConstantModifier(context, (JavaConstantModifier) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.JAVA_CONSTRUCTOR_MODIFIER :
               if (context == grammarAccess.getJavaConstructorModifierRule()
                  || context == grammarAccess.getConstructorModifierRule()) {
                  sequence_JavaConstructorModifier(context, (JavaConstructorModifier) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.JAVA_FIELD_MODIFIER :
               if (context == grammarAccess.getJavaFieldModifierRule()
                  || context == grammarAccess.getFieldModifierRule()) {
                  sequence_JavaFieldModifier(context, (JavaFieldModifier) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.JAVA_INTERFACE_METHOD_MODIFIERS :
               if (context == grammarAccess.getJavaInterfaceMethodModifiersRule()
                  || context == grammarAccess.getInterfaceMethodModifierRule()) {
                  sequence_JavaInterfaceMethodModifiers(context, (JavaInterfaceMethodModifiers) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.JAVA_INTERFACE_MODIFIER :
               if (context == grammarAccess.getJavaInterfaceModifierRule()
                  || context == grammarAccess.getInterfaceModifierRule()) {
                  sequence_JavaInterfaceModifier(context, (JavaInterfaceModifier) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.JAVA_METHOD_MODIFIER :
               if (context == grammarAccess.getJavaMethodModifierRule()
                  || context == grammarAccess.getMethodModifierRule()) {
                  sequence_JavaMethodModifier(context, (JavaMethodModifier) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.JAVA_VARIABLE_MODIFIER :
               if (context == grammarAccess.getJavaVariableModifierRule()
                  || context == grammarAccess.getVariableModifierRule()) {
                  sequence_JavaVariableModifier(context, (JavaVariableModifier) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.MODEL :
               if (context == grammarAccess.getModelRule()) {
                  sequence_Model(context, (Model) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ANNOTATION_TYPE_BODY :
               if (context == grammarAccess.getAnnotationTypeBodyRule()) {
                  sequence_annotationTypeBody(context, (annotationTypeBody) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ANNOTATION_TYPE_DECLARATION :
               if (context == grammarAccess.getAnnotationTypeDeclarationRule()
                  || context == grammarAccess.getAnnotationTypeMemberDeclarationRule()
                  || context == grammarAccess.getClassBodyDeclarationRule()
                  || context == grammarAccess.getClassMemberDeclarationRule()
                  || context == grammarAccess.getInterfaceDeclarationRule()
                  || context == grammarAccess.getInterfaceMemberDeclarationRule()
                  || context == grammarAccess.getTypeDeclarationRule()) {
                  sequence_annotationTypeDeclaration(context, (annotationTypeDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION :
               if (context == grammarAccess.getAnnotationTypeElementDeclarationRule()
                  || context == grammarAccess.getAnnotationTypeMemberDeclarationRule()) {
                  sequence_annotationTypeElementDeclaration(context, (annotationTypeElementDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ANNOTATION_TYPE_MEMBER_DECLARATION :
               if (context == grammarAccess.getAnnotationTypeMemberDeclarationRule()) {
                  sequence_annotationTypeMemberDeclaration(context, (annotationTypeMemberDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ARGUMENT_LIST :
               if (context == grammarAccess.getArgumentListRule()) {
                  sequence_argumentList(context, (argumentList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ARRAY_INITIALIZER :
               if (context == grammarAccess.getArrayInitializerRule()
                  || context == grammarAccess.getVariableInitializerRule()) {
                  sequence_arrayInitializer(context, (arrayInitializer) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ARRAY_TYPE :
               if (context == grammarAccess.getArrayTypeRule() || context == grammarAccess.getReferenceTypeRule()
                  || context == grammarAccess.getTypeRule() || context == grammarAccess.getTypeArgumentRule()
                  || context == grammarAccess.getWildcardBoundsRule()) {
                  sequence_arrayType(context, (arrayType) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.BLOCK :
               if (context == grammarAccess.getBlockRule() || context == grammarAccess.getClassBodyDeclarationRule()
                  || context == grammarAccess.getInstanceInitializerRule()
                  || context == grammarAccess.getMethodBodyRule()
                  || context == grammarAccess.getStaticInitializerRule()) {
                  sequence_block(context, (block) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.BLOCK_STATEMENTS :
               if (context == grammarAccess.getBlockStatementsRule()) {
                  sequence_blockStatements(context, (blockStatements) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CLASS_BODY :
               if (context == grammarAccess.getClassBodyRule()) {
                  sequence_classBody(context, (classBody) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CLASS_OR_INTERFACE_TYPE :
               if (context == grammarAccess.getClassOrInterfaceTypeRule()
                  || context == grammarAccess.getReferenceTypeRule() || context == grammarAccess.getTypeRule()
                  || context == grammarAccess.getTypeArgumentRule() || context == grammarAccess.getWildcardBoundsRule()) {
                  sequence_classOrInterfaceType(context, (classOrInterfaceType) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CLASS_OR_INTERFACE_TYPE_SEGMENT :
               if (context == grammarAccess.getClassOrInterfaceTypeSegmentRule()) {
                  sequence_classOrInterfaceTypeSegment(context, (classOrInterfaceTypeSegment) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CLASS_TYPE :
               if (context == grammarAccess.getAdditionalBoundRule() || context == grammarAccess.getClassTypeRule()
                  || context == grammarAccess.getExceptionTypeRule() || context == grammarAccess.getInterfaceTypeRule()
                  || context == grammarAccess.getSuperclassRule()) {
                  sequence_classType(context, (classType) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE :
               if (context == grammarAccess.getClassType_lf_classOrInterfaceTypeRule()
                  || context == grammarAccess.getInterfaceType_lf_classOrInterfaceTypeRule()) {
                  sequence_classType_lf_classOrInterfaceType(context,
                     (classType_lf_classOrInterfaceType) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE :
               if (context == grammarAccess.getClassType_lfno_classOrInterfaceTypeRule()
                  || context == grammarAccess.getInterfaceType_lfno_classOrInterfaceTypeRule()) {
                  sequence_classType_lfno_classOrInterfaceType(context,
                     (classType_lfno_classOrInterfaceType) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.COMPILATION_UNIT :
               if (context == grammarAccess.getCompilationUnitRule()) {
                  sequence_compilationUnit(context, (compilationUnit) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CONDITIONAL_EXPRESSION :
               if (context == grammarAccess.getConditionalExpressionRule()
                  || context == grammarAccess.getDefaultValueRule() || context == grammarAccess.getElementValueRule()) {
                  sequence_conditionalExpression(context, (conditionalExpression) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CONSTANT_DECLARATION :
               if (context == grammarAccess.getAnnotationTypeMemberDeclarationRule()
                  || context == grammarAccess.getConstantDeclarationRule()
                  || context == grammarAccess.getInterfaceMemberDeclarationRule()) {
                  sequence_constantDeclaration(context, (constantDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CONSTRUCTOR_DECLARATION :
               if (context == grammarAccess.getClassBodyDeclarationRule()
                  || context == grammarAccess.getConstructorDeclarationRule()) {
                  sequence_constructorDeclaration(context, (constructorDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.CONSTRUCTOR_DECLARATOR :
               if (context == grammarAccess.getConstructorDeclaratorRule()) {
                  sequence_constructorDeclarator(context, (constructorDeclarator) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.DIM :
               if (context == grammarAccess.getDimRule()) {
                  sequence_dim(context, (dim) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.DIMS :
               if (context == grammarAccess.getDimsRule()) {
                  sequence_dims(context, (dims) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER :
               if (context == grammarAccess.getDefaultValueRule() || context == grammarAccess.getElementValueRule()
                  || context == grammarAccess.getElementValueArrayInitializerRule()) {
                  sequence_elementValueArrayInitializer(context, (elementValueArrayInitializer) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ELEMENT_VALUE_LIST :
               if (context == grammarAccess.getElementValueListRule()) {
                  sequence_elementValueList(context, (elementValueList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ELEMENT_VALUE_PAIR :
               if (context == grammarAccess.getElementValuePairRule()) {
                  sequence_elementValuePair(context, (elementValuePair) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ELEMENT_VALUE_PAIR_LIST :
               if (context == grammarAccess.getElementValuePairListRule()) {
                  sequence_elementValuePairList(context, (elementValuePairList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ENUM_BODY :
               if (context == grammarAccess.getEnumBodyRule()) {
                  sequence_enumBody(context, (enumBody) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ENUM_BODY_DECLARATIONS :
               if (context == grammarAccess.getEnumBodyDeclarationsRule()) {
                  sequence_enumBodyDeclarations(context, (enumBodyDeclarations) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ENUM_CONSTANT :
               if (context == grammarAccess.getEnumConstantRule()) {
                  sequence_enumConstant(context, (enumConstant) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ENUM_CONSTANT_LIST :
               if (context == grammarAccess.getEnumConstantListRule()) {
                  sequence_enumConstantList(context, (enumConstantList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.ENUM_DECLARATION :
               if (context == grammarAccess.getAnnotationTypeMemberDeclarationRule()
                  || context == grammarAccess.getClassBodyDeclarationRule()
                  || context == grammarAccess.getClassDeclarationRule()
                  || context == grammarAccess.getClassMemberDeclarationRule()
                  || context == grammarAccess.getEnumDeclarationRule()
                  || context == grammarAccess.getInterfaceMemberDeclarationRule()
                  || context == grammarAccess.getTypeDeclarationRule()) {
                  sequence_enumDeclaration(context, (enumDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.EXCEPTION_TYPE_LIST :
               if (context == grammarAccess.getExceptionTypeListRule() || context == grammarAccess.getThrows_Rule()) {
                  sequence_exceptionTypeList(context, (exceptionTypeList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.EXPRESSION :
               if (context == grammarAccess.getExpressionRule()
                  || context == grammarAccess.getVariableInitializerRule()) {
                  sequence_expression(context, (expression) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.FIELD_DECLARATION :
               if (context == grammarAccess.getClassBodyDeclarationRule()
                  || context == grammarAccess.getClassMemberDeclarationRule()
                  || context == grammarAccess.getFieldDeclarationRule()) {
                  sequence_fieldDeclaration(context, (fieldDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.FORMAL_PARAMETER :
               if (context == grammarAccess.getFormalParameterRule()
                  || context == grammarAccess.getLastFormalParameterRule()) {
                  sequence_formalParameter(context, (formalParameter) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.FORMAL_PARAMETER_LIST :
               if (context == grammarAccess.getFormalParameterListRule()) {
                  sequence_formalParameterList(context, (formalParameterList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.FORMAL_PARAMETERS :
               if (context == grammarAccess.getFormalParametersRule()) {
                  sequence_formalParameters(context, (formalParameters) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.INTERFACE_BODY :
               if (context == grammarAccess.getInterfaceBodyRule()) {
                  sequence_interfaceBody(context, (interfaceBody) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.INTERFACE_MEMBER_DECLARATION :
               if (context == grammarAccess.getInterfaceMemberDeclarationRule()) {
                  sequence_interfaceMemberDeclaration(context, (interfaceMemberDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.INTERFACE_METHOD_DECLARATION :
               if (context == grammarAccess.getInterfaceMemberDeclarationRule()
                  || context == grammarAccess.getInterfaceMethodDeclarationRule()) {
                  sequence_interfaceMethodDeclaration(context, (interfaceMethodDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.INTERFACE_TYPE_LIST :
               if (context == grammarAccess.getExtendsInterfacesRule()
                  || context == grammarAccess.getInterfaceTypeListRule()
                  || context == grammarAccess.getSuperinterfacesRule()) {
                  sequence_interfaceTypeList(context, (interfaceTypeList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.LAST_FORMAL_PARAMETER :
               if (context == grammarAccess.getLastFormalParameterRule()) {
                  sequence_lastFormalParameter(context, (lastFormalParameter) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.MARKER_ANNOTATION :
               if (context == grammarAccess.getAnnotationRule()
                  || context == grammarAccess.getAnnotationTypeElementModifierRule()
                  || context == grammarAccess.getClassModifierRule()
                  || context == grammarAccess.getConstantModifierRule()
                  || context == grammarAccess.getConstructorModifierRule()
                  || context == grammarAccess.getDefaultValueRule() || context == grammarAccess.getElementValueRule()
                  || context == grammarAccess.getEnumConstantModifierRule()
                  || context == grammarAccess.getFieldModifierRule()
                  || context == grammarAccess.getInterfaceMethodModifierRule()
                  || context == grammarAccess.getInterfaceModifierRule()
                  || context == grammarAccess.getMarkerAnnotationRule()
                  || context == grammarAccess.getMethodModifierRule()
                  || context == grammarAccess.getPackageModifierRule()
                  || context == grammarAccess.getTypeParameterModifierRule()
                  || context == grammarAccess.getVariableModifierRule()) {
                  sequence_markerAnnotation(context, (markerAnnotation) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.METHOD_BODY :
               if (context == grammarAccess.getMethodBodyRule()) {
                  sequence_methodBody(context, (methodBody) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.METHOD_DECLARATION :
               if (context == grammarAccess.getClassBodyDeclarationRule()
                  || context == grammarAccess.getClassMemberDeclarationRule()
                  || context == grammarAccess.getMethodDeclarationRule()) {
                  sequence_methodDeclaration(context, (methodDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.METHOD_DECLARATOR :
               if (context == grammarAccess.getMethodDeclaratorRule()) {
                  sequence_methodDeclarator(context, (methodDeclarator) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.METHOD_HEADER :
               if (context == grammarAccess.getMethodHeaderRule()) {
                  sequence_methodHeader(context, (methodHeader) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.NORMAL_ANNOTATION :
               if (context == grammarAccess.getAnnotationRule()
                  || context == grammarAccess.getAnnotationTypeElementModifierRule()
                  || context == grammarAccess.getClassModifierRule()
                  || context == grammarAccess.getConstantModifierRule()
                  || context == grammarAccess.getConstructorModifierRule()
                  || context == grammarAccess.getDefaultValueRule() || context == grammarAccess.getElementValueRule()
                  || context == grammarAccess.getEnumConstantModifierRule()
                  || context == grammarAccess.getFieldModifierRule()
                  || context == grammarAccess.getInterfaceMethodModifierRule()
                  || context == grammarAccess.getInterfaceModifierRule()
                  || context == grammarAccess.getMethodModifierRule()
                  || context == grammarAccess.getNormalAnnotationRule()
                  || context == grammarAccess.getPackageModifierRule()
                  || context == grammarAccess.getTypeParameterModifierRule()
                  || context == grammarAccess.getVariableModifierRule()) {
                  sequence_normalAnnotation(context, (normalAnnotation) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.NORMAL_CLASS_DECLARATION :
               if (context == grammarAccess.getAnnotationTypeMemberDeclarationRule()
                  || context == grammarAccess.getClassBodyDeclarationRule()
                  || context == grammarAccess.getClassDeclarationRule()
                  || context == grammarAccess.getClassMemberDeclarationRule()
                  || context == grammarAccess.getInterfaceMemberDeclarationRule()
                  || context == grammarAccess.getNormalClassDeclarationRule()
                  || context == grammarAccess.getTypeDeclarationRule()) {
                  sequence_normalClassDeclaration(context, (normalClassDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.NORMAL_INTERFACE_DECLARATION :
               if (context == grammarAccess.getAnnotationTypeMemberDeclarationRule()
                  || context == grammarAccess.getClassBodyDeclarationRule()
                  || context == grammarAccess.getClassMemberDeclarationRule()
                  || context == grammarAccess.getInterfaceDeclarationRule()
                  || context == grammarAccess.getInterfaceMemberDeclarationRule()
                  || context == grammarAccess.getNormalInterfaceDeclarationRule()
                  || context == grammarAccess.getTypeDeclarationRule()) {
                  sequence_normalInterfaceDeclaration(context, (normalInterfaceDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.PACKAGE_DECLARATION :
               if (context == grammarAccess.getPackageDeclarationRule()) {
                  sequence_packageDeclaration(context, (packageDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.PRIMARY :
               if (context == grammarAccess.getPrimaryRule()) {
                  sequence_primary(context, (primary) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.PRIMITIVE_TYPE :
               if (context == grammarAccess.getPrimitiveTypeRule() || context == grammarAccess.getTypeRule()) {
                  sequence_primitiveType(context, (primitiveType) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.RECEIVER_PARAMETER :
               if (context == grammarAccess.getReceiverParameterRule()) {
                  sequence_receiverParameter(context, (receiverParameter) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.SINGLE_ELEMENT_ANNOTATION :
               if (context == grammarAccess.getAnnotationRule()
                  || context == grammarAccess.getAnnotationTypeElementModifierRule()
                  || context == grammarAccess.getClassModifierRule()
                  || context == grammarAccess.getConstantModifierRule()
                  || context == grammarAccess.getConstructorModifierRule()
                  || context == grammarAccess.getDefaultValueRule() || context == grammarAccess.getElementValueRule()
                  || context == grammarAccess.getEnumConstantModifierRule()
                  || context == grammarAccess.getFieldModifierRule()
                  || context == grammarAccess.getInterfaceMethodModifierRule()
                  || context == grammarAccess.getInterfaceModifierRule()
                  || context == grammarAccess.getMethodModifierRule()
                  || context == grammarAccess.getPackageModifierRule()
                  || context == grammarAccess.getSingleElementAnnotationRule()
                  || context == grammarAccess.getTypeParameterModifierRule()
                  || context == grammarAccess.getVariableModifierRule()) {
                  sequence_singleElementAnnotation(context, (singleElementAnnotation) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.SINGLE_STATIC_IMPORT_DECLARATION :
               if (context == grammarAccess.getImportDeclarationRule()
                  || context == grammarAccess.getSingleStaticImportDeclarationRule()) {
                  sequence_singleStaticImportDeclaration(context, (singleStaticImportDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.SINGLE_TYPE_IMPORT_DECLARATION :
               if (context == grammarAccess.getImportDeclarationRule()
                  || context == grammarAccess.getSingleTypeImportDeclarationRule()) {
                  sequence_singleTypeImportDeclaration(context, (singleTypeImportDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.STATIC_IMPORT_ON_DEMAND_DECLARATION :
               if (context == grammarAccess.getImportDeclarationRule()
                  || context == grammarAccess.getStaticImportOnDemandDeclarationRule()) {
                  sequence_staticImportOnDemandDeclaration(context, (staticImportOnDemandDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.TYPE_ARGUMENT_LIST :
               if (context == grammarAccess.getTypeArgumentListRule()
                  || context == grammarAccess.getTypeArgumentsRule()) {
                  sequence_typeArgumentList(context, (typeArgumentList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.TYPE_BOUND :
               if (context == grammarAccess.getTypeBoundRule()) {
                  sequence_typeBound(context, (typeBound) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.TYPE_IMPORT_ON_DEMAND_DECLARATION :
               if (context == grammarAccess.getImportDeclarationRule()
                  || context == grammarAccess.getTypeImportOnDemandDeclarationRule()) {
                  sequence_typeImportOnDemandDeclaration(context, (typeImportOnDemandDeclaration) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.TYPE_PARAMETER :
               if (context == grammarAccess.getTypeParameterRule()) {
                  sequence_typeParameter(context, (typeParameter) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.TYPE_PARAMETER_LIST :
               if (context == grammarAccess.getTypeParameterListRule()
                  || context == grammarAccess.getTypeParametersRule()) {
                  sequence_typeParameterList(context, (typeParameterList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.TYPE_VARIABLE :
               if (context == grammarAccess.getExceptionTypeRule() || context == grammarAccess.getReferenceTypeRule()
                  || context == grammarAccess.getTypeRule() || context == grammarAccess.getTypeArgumentRule()
                  || context == grammarAccess.getTypeVariableRule() || context == grammarAccess.getWildcardBoundsRule()) {
                  sequence_typeVariable(context, (typeVariable) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.UNANN_CLASS_TYPE :
               if (context == grammarAccess.getUnannArrayTypeRule()) {
                  sequence_unannArrayType_unannClassType(context, (unannClassType) semanticObject);
                  return;
               }
               else if (context == grammarAccess.getResultRule()
                  || context == grammarAccess.getUnannClassOrInterfaceTypeRule()
                  || context == grammarAccess.getUnannClassTypeRule()
                  || context == grammarAccess.getUnannInterfaceTypeRule()
                  || context == grammarAccess.getUnannReferenceTypeRule()
                  || context == grammarAccess.getUnannTypeRule()) {
                  sequence_unannClassType(context, (unannClassType) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.UNANN_PRIMITIVE_TYPE :
               if (context == grammarAccess.getUnannArrayTypeRule()
                  || context == grammarAccess.getUnannReferenceTypeRule()) {
                  sequence_unannArrayType_unannPrimitiveType(context, (unannPrimitiveType) semanticObject);
                  return;
               }
               else if (context == grammarAccess.getResultRule()
                  || context == grammarAccess.getUnannPrimitiveTypeRule()
                  || context == grammarAccess.getUnannTypeRule()) {
                  sequence_unannPrimitiveType(context, (unannPrimitiveType) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.UNANN_TYPE_VARIABLE :
               if (context == grammarAccess.getUnannArrayTypeRule()) {
                  sequence_unannArrayType_unannTypeVariable(context, (unannTypeVariable) semanticObject);
                  return;
               }
               else if (context == grammarAccess.getResultRule()
                  || context == grammarAccess.getUnannReferenceTypeRule()
                  || context == grammarAccess.getUnannTypeRule() || context == grammarAccess.getUnannTypeVariableRule()) {
                  sequence_unannTypeVariable(context, (unannTypeVariable) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.VARIABLE_DECLARATOR :
               if (context == grammarAccess.getVariableDeclaratorRule()) {
                  sequence_variableDeclarator(context, (variableDeclarator) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.VARIABLE_DECLARATOR_ID :
               if (context == grammarAccess.getVariableDeclaratorIdRule()) {
                  sequence_variableDeclaratorId(context, (variableDeclaratorId) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.VARIABLE_DECLARATOR_LIST :
               if (context == grammarAccess.getVariableDeclaratorListRule()) {
                  sequence_variableDeclaratorList(context, (variableDeclaratorList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.VARIABLE_INITIALIZER_LIST :
               if (context == grammarAccess.getVariableInitializerListRule()) {
                  sequence_variableInitializerList(context, (variableInitializerList) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.VOID_TYPE :
               if (context == grammarAccess.getResultRule() || context == grammarAccess.getVoidTypeRule()) {
                  sequence_voidType(context, (voidType) semanticObject);
                  return;
               }
               else
                  break;
            case TypePackage.WILDCARD :
               if (context == grammarAccess.getTypeArgumentRule() || context == grammarAccess.getWildcardRule()) {
                  sequence_wildcard(context, (wildcard) semanticObject);
                  return;
               }
               else
                  break;
         }
      if (errorAcceptor != null)
         errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
   }

   /**
    * Constraint:
    * (annotations+=annotation* name=Identifier typeArguments=typeArguments?)
    */
   protected void sequence_ClassTypeSegmentWithAnnotations(EObject context,
      ClassTypeSegmentWithAnnotations semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (name=Identifier typeArguments=typeArguments?)
    */
   protected void sequence_ClassTypeSegment(EObject context, ClassTypeSegment semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * modifier=AnnotationTypeElementModifiers
    */
   protected void sequence_JavaAnnotationTypeElementModifiers(EObject context,
      JavaAnnotationTypeElementModifiers semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject,
            TypePackage.Literals.JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS__MODIFIER) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS__MODIFIER));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getJavaAnnotationTypeElementModifiersAccess()
         .getModifierAnnotationTypeElementModifiersEnumRuleCall_0(), semanticObject.getModifier());
      feeder.finish();
   }


   /**
    * Constraint:
    * modifier=ClassModifiers
    */
   protected void sequence_JavaClassModifier(EObject context, JavaClassModifier semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.JAVA_CLASS_MODIFIER__MODIFIER) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.JAVA_CLASS_MODIFIER__MODIFIER));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getJavaClassModifierAccess().getModifierClassModifiersEnumRuleCall_0(),
         semanticObject.getModifier());
      feeder.finish();
   }


   /**
    * Constraint:
    * modifier=ConstantModifiers
    */
   protected void sequence_JavaConstantModifier(EObject context, JavaConstantModifier semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.JAVA_CONSTANT_MODIFIER__MODIFIER) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.JAVA_CONSTANT_MODIFIER__MODIFIER));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getJavaConstantModifierAccess().getModifierConstantModifiersEnumRuleCall_0(),
         semanticObject.getModifier());
      feeder.finish();
   }


   /**
    * Constraint:
    * modifier=ConstructorModifiers
    */
   protected void sequence_JavaConstructorModifier(EObject context, JavaConstructorModifier semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.JAVA_CONSTRUCTOR_MODIFIER__MODIFIER) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.JAVA_CONSTRUCTOR_MODIFIER__MODIFIER));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getJavaConstructorModifierAccess().getModifierConstructorModifiersEnumRuleCall_0(),
         semanticObject.getModifier());
      feeder.finish();
   }


   /**
    * Constraint:
    * modifier=FieldModifiers
    */
   protected void sequence_JavaFieldModifier(EObject context, JavaFieldModifier semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.JAVA_FIELD_MODIFIER__MODIFIER) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.JAVA_FIELD_MODIFIER__MODIFIER));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getJavaFieldModifierAccess().getModifierFieldModifiersEnumRuleCall_0(),
         semanticObject.getModifier());
      feeder.finish();
   }


   /**
    * Constraint:
    * modifiers=InterfaceMethodModifiers
    */
   protected void sequence_JavaInterfaceMethodModifiers(EObject context, JavaInterfaceMethodModifiers semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject,
            TypePackage.Literals.JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getJavaInterfaceMethodModifiersAccess()
         .getModifiersInterfaceMethodModifiersEnumRuleCall_0(), semanticObject.getModifiers());
      feeder.finish();
   }


   /**
    * Constraint:
    * modifier=InterfaceModifiers
    */
   protected void sequence_JavaInterfaceModifier(EObject context, JavaInterfaceModifier semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.JAVA_INTERFACE_MODIFIER__MODIFIER) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.JAVA_INTERFACE_MODIFIER__MODIFIER));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getJavaInterfaceModifierAccess().getModifierInterfaceModifiersEnumRuleCall_0(),
         semanticObject.getModifier());
      feeder.finish();
   }


   /**
    * Constraint:
    * modifier=methodModifiers
    */
   protected void sequence_JavaMethodModifier(EObject context, JavaMethodModifier semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.JAVA_METHOD_MODIFIER__MODIFIER) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.JAVA_METHOD_MODIFIER__MODIFIER));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getJavaMethodModifierAccess().getModifierMethodModifiersEnumRuleCall_0(),
         semanticObject.getModifier());
      feeder.finish();
   }


   /**
    * Constraint:
    * modifier=VariableModifiers
    */
   protected void sequence_JavaVariableModifier(EObject context, JavaVariableModifier semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.JAVA_VARIABLE_MODIFIER__MODIFIER) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.JAVA_VARIABLE_MODIFIER__MODIFIER));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getJavaVariableModifierAccess().getModifierVariableModifiersEnumRuleCall_0(),
         semanticObject.getModifier());
      feeder.finish();
   }


   /**
    * Constraint:
    * type=literal
    */
   protected void sequence_Model(EObject context, Model semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.MODEL__TYPE) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.MODEL__TYPE));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getModelAccess().getTypeLiteralParserRuleCall_0(), semanticObject.getType());
      feeder.finish();
   }


   /**
    * Constraint:
    * (annotationTypeMemberDeclarations+=annotationTypeMemberDeclaration*)
    */
   protected void sequence_annotationTypeBody(EObject context, annotationTypeBody semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (interfaceModifiers+=interfaceModifier* name=Identifier annotationTypeBody=annotationTypeBody)
    */
   protected void sequence_annotationTypeDeclaration(EObject context, annotationTypeDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (annotationTypeElementModifiers+=annotationTypeElementModifier* unannType=unannType name=Identifier dims=dims?
    * defaultValue=defaultValue?)
    */
   protected void sequence_annotationTypeElementDeclaration(EObject context,
      annotationTypeElementDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * {annotationTypeMemberDeclaration}
    */
   protected void sequence_annotationTypeMemberDeclaration(EObject context,
      annotationTypeMemberDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * dummy='argumentList'
    */
   protected void sequence_argumentList(EObject context, argumentList semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.ARGUMENT_LIST__DUMMY) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.ARGUMENT_LIST__DUMMY));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getArgumentListAccess().getDummyArgumentListKeyword_0(), semanticObject.getDummy());
      feeder.finish();
   }


   /**
    * Constraint:
    * (variableInitializerList=variableInitializerList?)
    */
   protected void sequence_arrayInitializer(EObject context, arrayInitializer semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * ((type=primitiveType | type=classOrInterfaceType | type=typeVariable) dims=dims)
    */
   protected void sequence_arrayType(EObject context, arrayType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * dummy='blockStatements'
    */
   protected void sequence_blockStatements(EObject context, blockStatements semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.BLOCK_STATEMENTS__DUMMY) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.BLOCK_STATEMENTS__DUMMY));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getBlockStatementsAccess().getDummyBlockStatementsKeyword_0(),
         semanticObject.getDummy());
      feeder.finish();
   }


   /**
    * Constraint:
    * dummy='block'
    */
   protected void sequence_block(EObject context, block semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.BLOCK__DUMMY) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.BLOCK__DUMMY));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getBlockAccess().getDummyBlockKeyword_0(), semanticObject.getDummy());
      feeder.finish();
   }


   /**
    * Constraint:
    * (declarations+=classBodyDeclaration*)
    */
   protected void sequence_classBody(EObject context, classBody semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * {EmptyClassMemberDeclaration}
    */
   protected void sequence_classMemberDeclaration(EObject context, EmptyClassMemberDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (annotations+=annotation* name=Identifier typeArguments=typeArguments?)
    */
   protected void sequence_classOrInterfaceTypeSegment(EObject context, classOrInterfaceTypeSegment semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (classOrInterfaceTypeSegments+=classOrInterfaceTypeSegment
    * classOrInterfaceTypeSegments+=classOrInterfaceTypeSegment*)
    */
   protected void sequence_classOrInterfaceType(EObject context, classOrInterfaceType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (
    * (annotations+=annotation* name=Identifier typeArguments=typeArguments?) |
    * (classOrInterfaceType=classOrInterfaceType annotations+=annotation* name=Identifier typeArguments=typeArguments?)
    * )
    */
   protected void sequence_classType(EObject context, classType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (annotations+=annotation* name=Identifier typeArguments=typeArguments?)
    */
   protected void sequence_classType_lf_classOrInterfaceType(EObject context,
      classType_lf_classOrInterfaceType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (annotations+=annotation* name=Identifier typeArguments=typeArguments?)
    */
   protected void sequence_classType_lfno_classOrInterfaceType(EObject context,
      classType_lfno_classOrInterfaceType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (package=packageDeclaration? imports+=importDeclaration* types+=typeDeclaration*)
    */
   protected void sequence_compilationUnit(EObject context, compilationUnit semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * dummy='conditionalExpression'
    */
   protected void sequence_conditionalExpression(EObject context, conditionalExpression semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.CONDITIONAL_EXPRESSION__DUMMY) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.CONDITIONAL_EXPRESSION__DUMMY));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getConditionalExpressionAccess().getDummyConditionalExpressionKeyword_0(),
         semanticObject.getDummy());
      feeder.finish();
   }


   /**
    * Constraint:
    * (constantModifiers+=constantModifier* unannType=unannType variableDeclaratorList=variableDeclaratorList)
    */
   protected void sequence_constantDeclaration(EObject context, constantDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (constructorModifiers+=constructorModifier* constructorDeclarator=constructorDeclarator throws_=throws_?)
    */
   protected void sequence_constructorDeclaration(EObject context, constructorDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (typeParameters+=typeParameters? simpleTypeName=simpleTypeName formalParameterList=formalParameterList?)
    */
   protected void sequence_constructorDeclarator(EObject context, constructorDeclarator semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (annotations+=annotation*)
    */
   protected void sequence_dim(EObject context, dim semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (dims+=dim dims+=dim*)
    */
   protected void sequence_dims(EObject context, dims semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (elementValueList=elementValueList?)
    */
   protected void sequence_elementValueArrayInitializer(EObject context, elementValueArrayInitializer semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (elementValues+=elementValue elementValues+=elementValue*)
    */
   protected void sequence_elementValueList(EObject context, elementValueList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (elementValuePairs+=elementValuePair elementValuePairs+=elementValuePair*)
    */
   protected void sequence_elementValuePairList(EObject context, elementValuePairList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (name=Identifier elementValue=elementValue)
    */
   protected void sequence_elementValuePair(EObject context, elementValuePair semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.ELEMENT_VALUE_PAIR__NAME) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.ELEMENT_VALUE_PAIR__NAME));
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.ELEMENT_VALUE_PAIR__ELEMENT_VALUE) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.ELEMENT_VALUE_PAIR__ELEMENT_VALUE));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getElementValuePairAccess().getNameIdentifierTerminalRuleCall_0_0(),
         semanticObject.getName());
      feeder.accept(grammarAccess.getElementValuePairAccess().getElementValueElementValueParserRuleCall_2_0(),
         semanticObject.getElementValue());
      feeder.finish();
   }


   /**
    * Constraint:
    * (classBodyDeclarations+=classBodyDeclaration*)
    */
   protected void sequence_enumBodyDeclarations(EObject context, enumBodyDeclarations semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (enumConstantList=enumConstantList? enumBodyDeclarations=enumBodyDeclarations?)
    */
   protected void sequence_enumBody(EObject context, enumBody semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (enumConstants+=enumConstant enumConstants+=enumConstant*)
    */
   protected void sequence_enumConstantList(EObject context, enumConstantList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (enumConstantModifiers+=enumConstantModifier* name=Identifier argumentList=argumentList? classBody=classBody?)
    */
   protected void sequence_enumConstant(EObject context, enumConstant semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (modifiers+=classModifier* name=Identifier superinterfaces=superinterfaces? enumBody=enumBody)
    */
   protected void sequence_enumDeclaration(EObject context, enumDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (exceptionTypes+=exceptionType exceptionTypes+=exceptionType*)
    */
   protected void sequence_exceptionTypeList(EObject context, exceptionTypeList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * dummy='expression'
    */
   protected void sequence_expression(EObject context, expression semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.EXPRESSION__DUMMY) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.EXPRESSION__DUMMY));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getExpressionAccess().getDummyExpressionKeyword_0(), semanticObject.getDummy());
      feeder.finish();
   }


   /**
    * Constraint:
    * (fieldModifiers+=fieldModifier* unannType=unannType variableDeclaratorList=variableDeclaratorList)
    */
   protected void sequence_fieldDeclaration(EObject context, fieldDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * ((parameters+=formalParameters parameters+=lastFormalParameter) | parameters+=lastFormalParameter)
    */
   protected void sequence_formalParameterList(EObject context, formalParameterList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (modifiers+=variableModifier* type=unannType name=variableDeclaratorId)
    */
   protected void sequence_formalParameter(EObject context, formalParameter semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * ((parameters+=formalParameter parameters+=formalParameter*) | (parameters+=receiverParameter
    * parameters+=formalParameter*))
    */
   protected void sequence_formalParameters(EObject context, formalParameters semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (interfaceMemberDeclarations+=interfaceMemberDeclaration*)
    */
   protected void sequence_interfaceBody(EObject context, interfaceBody semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * {interfaceMemberDeclaration}
    */
   protected void sequence_interfaceMemberDeclaration(EObject context, interfaceMemberDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (interfaceMethodModifiers+=interfaceMethodModifier* methodHeader=methodHeader methodBody=methodBody)
    */
   protected void sequence_interfaceMethodDeclaration(EObject context, interfaceMethodDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (interfaceTypes+=interfaceType interfaceTypes+=interfaceType*)
    */
   protected void sequence_interfaceTypeList(EObject context, interfaceTypeList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (modifiers+=variableModifier* type=unannType annotations+=annotation* varargs?='...' name=variableDeclaratorId)
    */
   protected void sequence_lastFormalParameter(EObject context, lastFormalParameter semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * typeName=typeName
    */
   protected void sequence_markerAnnotation(EObject context, markerAnnotation semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.ANNOTATION__TYPE_NAME) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.ANNOTATION__TYPE_NAME));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getMarkerAnnotationAccess().getTypeNameTypeNameParserRuleCall_1_0(),
         semanticObject.getTypeName());
      feeder.finish();
   }


   /**
    * Constraint:
    * {methodBody}
    */
   protected void sequence_methodBody(EObject context, methodBody semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (methodModifiers+=methodModifier* methodHeader=methodHeader methodBody=methodBody)
    */
   protected void sequence_methodDeclaration(EObject context, methodDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (name=Identifier parameters+=formalParameterList? dims_=dims?)
    */
   protected void sequence_methodDeclarator(EObject context, methodDeclarator semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (
    * (result=result methodDeclarator=methodDeclarator throws_=throws_?) |
    * (typeParameters=typeParameters annotations+=annotation* result=result methodDeclarator=methodDeclarator
    * throws_=throws_?)
    * )
    */
   protected void sequence_methodHeader(EObject context, methodHeader semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (typeName=typeName elementValuePairList=elementValuePairList?)
    */
   protected void sequence_normalAnnotation(EObject context, normalAnnotation semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (
    * modifiers+=classModifier*
    * name=Identifier
    * typeParameters=typeParameters?
    * superclass=superclass?
    * superinterfaces=superinterfaces?
    * classBody=classBody
    * )
    */
   protected void sequence_normalClassDeclaration(EObject context, normalClassDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (
    * interfaceModifiers+=interfaceModifier*
    * name=Identifier
    * typeParameters=typeParameters?
    * extendsInterfaces=extendsInterfaces?
    * interfaceBody=interfaceBody
    * )
    */
   protected void sequence_normalInterfaceDeclaration(EObject context, normalInterfaceDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (modifiers+=packageModifier* name=packageName)
    */
   protected void sequence_packageDeclaration(EObject context, packageDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * dummy='primary'
    */
   protected void sequence_primary(EObject context, primary semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.PRIMARY__DUMMY) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.PRIMARY__DUMMY));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getPrimaryAccess().getDummyPrimaryKeyword_0(), semanticObject.getDummy());
      feeder.finish();
   }


   /**
    * Constraint:
    * (annotations+=annotation* (typeName=numericType | typeName=booleanType))
    */
   protected void sequence_primitiveType(EObject context, primitiveType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (annotations+=annotation* type=unannType qualifier=Identifier? name='this')
    */
   protected void sequence_receiverParameter(EObject context, receiverParameter semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (typeName=typeName elementValue=elementValue)
    */
   protected void sequence_singleElementAnnotation(EObject context, singleElementAnnotation semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.ANNOTATION__TYPE_NAME) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.ANNOTATION__TYPE_NAME));
         if (transientValues.isValueTransient(semanticObject,
            TypePackage.Literals.SINGLE_ELEMENT_ANNOTATION__ELEMENT_VALUE) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.SINGLE_ELEMENT_ANNOTATION__ELEMENT_VALUE));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getSingleElementAnnotationAccess().getTypeNameTypeNameParserRuleCall_1_0(),
         semanticObject.getTypeName());
      feeder.accept(grammarAccess.getSingleElementAnnotationAccess().getElementValueElementValueParserRuleCall_3_0(),
         semanticObject.getElementValue());
      feeder.finish();
   }


   /**
    * Constraint:
    * name=typeName
    */
   protected void sequence_singleStaticImportDeclaration(EObject context, singleStaticImportDeclaration semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.IMPORT_DECLARATION__NAME) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.IMPORT_DECLARATION__NAME));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getSingleStaticImportDeclarationAccess().getNameTypeNameParserRuleCall_2_0(),
         semanticObject.getName());
      feeder.finish();
   }


   /**
    * Constraint:
    * name=typeName
    */
   protected void sequence_singleTypeImportDeclaration(EObject context, singleTypeImportDeclaration semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.IMPORT_DECLARATION__NAME) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.IMPORT_DECLARATION__NAME));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getSingleTypeImportDeclarationAccess().getNameTypeNameParserRuleCall_1_0(),
         semanticObject.getName());
      feeder.finish();
   }


   /**
    * Constraint:
    * name=typeName
    */
   protected void sequence_staticImportOnDemandDeclaration(EObject context,
      staticImportOnDemandDeclaration semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.IMPORT_DECLARATION__NAME) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.IMPORT_DECLARATION__NAME));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getStaticImportOnDemandDeclarationAccess().getNameTypeNameParserRuleCall_2_0(),
         semanticObject.getName());
      feeder.finish();
   }


   /**
    * Constraint:
    * (typeArguments+=typeArgument typeArguments+=typeArgument*)
    */
   protected void sequence_typeArgumentList(EObject context, typeArgumentList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (typeVariable=typeVariable | (classOrInterfaceType=classOrInterfaceType additionalBound+=additionalBound*))
    */
   protected void sequence_typeBound(EObject context, typeBound semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * {EmptyTypeDeclaration}
    */
   protected void sequence_typeDeclaration(EObject context, EmptyTypeDeclaration semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * name=packageOrTypeName
    */
   protected void sequence_typeImportOnDemandDeclaration(EObject context, typeImportOnDemandDeclaration semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.IMPORT_DECLARATION__NAME) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.IMPORT_DECLARATION__NAME));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(
         grammarAccess.getTypeImportOnDemandDeclarationAccess().getNamePackageOrTypeNameParserRuleCall_1_0(),
         semanticObject.getName());
      feeder.finish();
   }


   /**
    * Constraint:
    * (typeParameters+=typeParameter typeParameters+=typeParameter*)
    */
   protected void sequence_typeParameterList(EObject context, typeParameterList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (typeParameterModifiers+=typeParameterModifier* name=Identifier typeBound=typeBound?)
    */
   protected void sequence_typeParameter(EObject context, typeParameter semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (annotations+=annotation* name=Identifier)
    */
   protected void sequence_typeVariable(EObject context, typeVariable semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (classTypeSegment+=ClassTypeSegment classTypeSegment+=ClassTypeSegment*
    * classTypeSegment+=ClassTypeSegmentWithAnnotations? dims=dims)
    */
   protected void sequence_unannArrayType_unannClassType(EObject context, unannClassType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * ((name=numericType | name=booleanType) dims=dims)
    */
   protected void sequence_unannArrayType_unannPrimitiveType(EObject context, unannPrimitiveType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (name=Identifier dims=dims)
    */
   protected void sequence_unannArrayType_unannTypeVariable(EObject context, unannTypeVariable semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.UNANN_ARRAY_TYPE__DIMS) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.UNANN_ARRAY_TYPE__DIMS));
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.UNANN_TYPE_VARIABLE__NAME) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.UNANN_TYPE_VARIABLE__NAME));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getUnannTypeVariableAccess().getNameIdentifierTerminalRuleCall_0(),
         semanticObject.getName());
      feeder.accept(grammarAccess.getUnannArrayTypeAccess().getDimsDimsParserRuleCall_1_0(), semanticObject.getDims());
      feeder.finish();
   }


   /**
    * Constraint:
    * (classTypeSegment+=ClassTypeSegment classTypeSegment+=ClassTypeSegment*
    * classTypeSegment+=ClassTypeSegmentWithAnnotations?)
    */
   protected void sequence_unannClassType(EObject context, unannClassType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (name=numericType | name=booleanType)
    */
   protected void sequence_unannPrimitiveType(EObject context, unannPrimitiveType semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * name=Identifier
    */
   protected void sequence_unannTypeVariable(EObject context, unannTypeVariable semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (id=Identifier dims=dims?)
    */
   protected void sequence_variableDeclaratorId(EObject context, variableDeclaratorId semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (variableDeclarators+=variableDeclarator variableDeclarators+=variableDeclarator*)
    */
   protected void sequence_variableDeclaratorList(EObject context, variableDeclaratorList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (id=variableDeclaratorId initializer=variableInitializer?)
    */
   protected void sequence_variableDeclarator(EObject context, variableDeclarator semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (variableInitializer+=variableInitializer variableInitializer+=variableInitializer*)
    */
   protected void sequence_variableInitializerList(EObject context, variableInitializerList semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * name='void'
    */
   protected void sequence_voidType(EObject context, voidType semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, TypePackage.Literals.VOID_TYPE__NAME) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               TypePackage.Literals.VOID_TYPE__NAME));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getVoidTypeAccess().getNameVoidKeyword_0(), semanticObject.getName());
      feeder.finish();
   }


   /**
    * Constraint:
    * (annotations+=annotation* wildcardBounds=wildcardBounds?)
    */
   protected void sequence_wildcard(EObject context, wildcard semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }
}
