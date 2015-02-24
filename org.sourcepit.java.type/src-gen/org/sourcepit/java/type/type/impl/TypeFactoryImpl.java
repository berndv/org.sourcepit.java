/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.java.type.type.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static TypeFactory init() {
      try {
         TypeFactory theTypeFactory = (TypeFactory) EPackage.Registry.INSTANCE.getEFactory(TypePackage.eNS_URI);
         if (theTypeFactory != null) {
            return theTypeFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new TypeFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public TypeFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case TypePackage.MODEL :
            return createModel();
         case TypePackage.TYPE :
            return createtype();
         case TypePackage.PRIMITIVE_TYPE :
            return createprimitiveType();
         case TypePackage.REFERENCE_TYPE :
            return createreferenceType();
         case TypePackage.CLASS_OR_INTERFACE_TYPE :
            return createclassOrInterfaceType();
         case TypePackage.CLASS_OR_INTERFACE_TYPE_SEGMENT :
            return createclassOrInterfaceTypeSegment();
         case TypePackage.CLASS_TYPE :
            return createclassType();
         case TypePackage.CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE :
            return createclassType_lf_classOrInterfaceType();
         case TypePackage.CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE :
            return createclassType_lfno_classOrInterfaceType();
         case TypePackage.INTERFACE_TYPE :
            return createinterfaceType();
         case TypePackage.INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE :
            return createinterfaceType_lf_classOrInterfaceType();
         case TypePackage.INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE :
            return createinterfaceType_lfno_classOrInterfaceType();
         case TypePackage.TYPE_VARIABLE :
            return createtypeVariable();
         case TypePackage.ARRAY_TYPE :
            return createarrayType();
         case TypePackage.DIMS :
            return createdims();
         case TypePackage.DIM :
            return createdim();
         case TypePackage.TYPE_PARAMETER :
            return createtypeParameter();
         case TypePackage.TYPE_PARAMETER_MODIFIER :
            return createtypeParameterModifier();
         case TypePackage.TYPE_BOUND :
            return createtypeBound();
         case TypePackage.ADDITIONAL_BOUND :
            return createadditionalBound();
         case TypePackage.TYPE_ARGUMENTS :
            return createtypeArguments();
         case TypePackage.TYPE_ARGUMENT_LIST :
            return createtypeArgumentList();
         case TypePackage.TYPE_ARGUMENT :
            return createtypeArgument();
         case TypePackage.WILDCARD :
            return createwildcard();
         case TypePackage.WILDCARD_BOUNDS :
            return createwildcardBounds();
         case TypePackage.COMPILATION_UNIT :
            return createcompilationUnit();
         case TypePackage.PACKAGE_DECLARATION :
            return createpackageDeclaration();
         case TypePackage.PACKAGE_MODIFIER :
            return createpackageModifier();
         case TypePackage.IMPORT_DECLARATION :
            return createimportDeclaration();
         case TypePackage.SINGLE_TYPE_IMPORT_DECLARATION :
            return createsingleTypeImportDeclaration();
         case TypePackage.TYPE_IMPORT_ON_DEMAND_DECLARATION :
            return createtypeImportOnDemandDeclaration();
         case TypePackage.SINGLE_STATIC_IMPORT_DECLARATION :
            return createsingleStaticImportDeclaration();
         case TypePackage.STATIC_IMPORT_ON_DEMAND_DECLARATION :
            return createstaticImportOnDemandDeclaration();
         case TypePackage.TYPE_DECLARATION :
            return createtypeDeclaration();
         case TypePackage.CLASS_DECLARATION :
            return createclassDeclaration();
         case TypePackage.NORMAL_CLASS_DECLARATION :
            return createnormalClassDeclaration();
         case TypePackage.CLASS_MODIFIER :
            return createclassModifier();
         case TypePackage.JAVA_CLASS_MODIFIER :
            return createJavaClassModifier();
         case TypePackage.TYPE_PARAMETERS :
            return createtypeParameters();
         case TypePackage.TYPE_PARAMETER_LIST :
            return createtypeParameterList();
         case TypePackage.SUPERCLASS :
            return createsuperclass();
         case TypePackage.SUPERINTERFACES :
            return createsuperinterfaces();
         case TypePackage.INTERFACE_TYPE_LIST :
            return createinterfaceTypeList();
         case TypePackage.CLASS_BODY :
            return createclassBody();
         case TypePackage.CLASS_BODY_DECLARATION :
            return createclassBodyDeclaration();
         case TypePackage.CLASS_MEMBER_DECLARATION :
            return createclassMemberDeclaration();
         case TypePackage.FIELD_DECLARATION :
            return createfieldDeclaration();
         case TypePackage.FIELD_MODIFIER :
            return createfieldModifier();
         case TypePackage.JAVA_FIELD_MODIFIER :
            return createJavaFieldModifier();
         case TypePackage.VARIABLE_DECLARATOR_LIST :
            return createvariableDeclaratorList();
         case TypePackage.VARIABLE_DECLARATOR :
            return createvariableDeclarator();
         case TypePackage.VARIABLE_DECLARATOR_ID :
            return createvariableDeclaratorId();
         case TypePackage.VARIABLE_INITIALIZER :
            return createvariableInitializer();
         case TypePackage.UNANN_TYPE :
            return createunannType();
         case TypePackage.UNANN_PRIMITIVE_TYPE :
            return createunannPrimitiveType();
         case TypePackage.UNANN_REFERENCE_TYPE :
            return createunannReferenceType();
         case TypePackage.UNANN_CLASS_OR_INTERFACE_TYPE :
            return createunannClassOrInterfaceType();
         case TypePackage.UNANN_CLASS_TYPE :
            return createunannClassType();
         case TypePackage.CLASS_TYPE_SEGMENT :
            return createClassTypeSegment();
         case TypePackage.CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS :
            return createClassTypeSegmentWithAnnotations();
         case TypePackage.UNANN_INTERFACE_TYPE :
            return createunannInterfaceType();
         case TypePackage.UNANN_TYPE_VARIABLE :
            return createunannTypeVariable();
         case TypePackage.UNANN_ARRAY_TYPE :
            return createunannArrayType();
         case TypePackage.METHOD_DECLARATION :
            return createmethodDeclaration();
         case TypePackage.METHOD_MODIFIER :
            return createmethodModifier();
         case TypePackage.JAVA_METHOD_MODIFIER :
            return createJavaMethodModifier();
         case TypePackage.METHOD_HEADER :
            return createmethodHeader();
         case TypePackage.RESULT :
            return createresult();
         case TypePackage.VOID_TYPE :
            return createvoidType();
         case TypePackage.METHOD_DECLARATOR :
            return createmethodDeclarator();
         case TypePackage.FORMAL_PARAMETER_LIST :
            return createformalParameterList();
         case TypePackage.FORMAL_PARAMETERS :
            return createformalParameters();
         case TypePackage.FORMAL_PARAMETER :
            return createformalParameter();
         case TypePackage.VARIABLE_MODIFIER :
            return createvariableModifier();
         case TypePackage.JAVA_VARIABLE_MODIFIER :
            return createJavaVariableModifier();
         case TypePackage.LAST_FORMAL_PARAMETER :
            return createlastFormalParameter();
         case TypePackage.RECEIVER_PARAMETER :
            return createreceiverParameter();
         case TypePackage.THROWS_ :
            return createthrows_();
         case TypePackage.EXCEPTION_TYPE_LIST :
            return createexceptionTypeList();
         case TypePackage.EXCEPTION_TYPE :
            return createexceptionType();
         case TypePackage.METHOD_BODY :
            return createmethodBody();
         case TypePackage.INSTANCE_INITIALIZER :
            return createinstanceInitializer();
         case TypePackage.STATIC_INITIALIZER :
            return createstaticInitializer();
         case TypePackage.CONSTRUCTOR_DECLARATION :
            return createconstructorDeclaration();
         case TypePackage.CONSTRUCTOR_MODIFIER :
            return createconstructorModifier();
         case TypePackage.JAVA_CONSTRUCTOR_MODIFIER :
            return createJavaConstructorModifier();
         case TypePackage.CONSTRUCTOR_DECLARATOR :
            return createconstructorDeclarator();
         case TypePackage.ENUM_DECLARATION :
            return createenumDeclaration();
         case TypePackage.ENUM_BODY :
            return createenumBody();
         case TypePackage.ENUM_CONSTANT_LIST :
            return createenumConstantList();
         case TypePackage.ENUM_CONSTANT :
            return createenumConstant();
         case TypePackage.ENUM_CONSTANT_MODIFIER :
            return createenumConstantModifier();
         case TypePackage.ENUM_BODY_DECLARATIONS :
            return createenumBodyDeclarations();
         case TypePackage.INTERFACE_DECLARATION :
            return createinterfaceDeclaration();
         case TypePackage.NORMAL_INTERFACE_DECLARATION :
            return createnormalInterfaceDeclaration();
         case TypePackage.INTERFACE_MODIFIER :
            return createinterfaceModifier();
         case TypePackage.JAVA_INTERFACE_MODIFIER :
            return createJavaInterfaceModifier();
         case TypePackage.EXTENDS_INTERFACES :
            return createextendsInterfaces();
         case TypePackage.INTERFACE_BODY :
            return createinterfaceBody();
         case TypePackage.INTERFACE_MEMBER_DECLARATION :
            return createinterfaceMemberDeclaration();
         case TypePackage.CONSTANT_DECLARATION :
            return createconstantDeclaration();
         case TypePackage.CONSTANT_MODIFIER :
            return createconstantModifier();
         case TypePackage.JAVA_CONSTANT_MODIFIER :
            return createJavaConstantModifier();
         case TypePackage.INTERFACE_METHOD_DECLARATION :
            return createinterfaceMethodDeclaration();
         case TypePackage.INTERFACE_METHOD_MODIFIER :
            return createinterfaceMethodModifier();
         case TypePackage.JAVA_INTERFACE_METHOD_MODIFIERS :
            return createJavaInterfaceMethodModifiers();
         case TypePackage.ANNOTATION_TYPE_DECLARATION :
            return createannotationTypeDeclaration();
         case TypePackage.ANNOTATION_TYPE_BODY :
            return createannotationTypeBody();
         case TypePackage.ANNOTATION_TYPE_MEMBER_DECLARATION :
            return createannotationTypeMemberDeclaration();
         case TypePackage.ANNOTATION_TYPE_ELEMENT_DECLARATION :
            return createannotationTypeElementDeclaration();
         case TypePackage.ANNOTATION_TYPE_ELEMENT_MODIFIER :
            return createannotationTypeElementModifier();
         case TypePackage.JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS :
            return createJavaAnnotationTypeElementModifiers();
         case TypePackage.DEFAULT_VALUE :
            return createdefaultValue();
         case TypePackage.ANNOTATION :
            return createannotation();
         case TypePackage.NORMAL_ANNOTATION :
            return createnormalAnnotation();
         case TypePackage.ELEMENT_VALUE_PAIR_LIST :
            return createelementValuePairList();
         case TypePackage.ELEMENT_VALUE_PAIR :
            return createelementValuePair();
         case TypePackage.ELEMENT_VALUE :
            return createelementValue();
         case TypePackage.ELEMENT_VALUE_ARRAY_INITIALIZER :
            return createelementValueArrayInitializer();
         case TypePackage.ELEMENT_VALUE_LIST :
            return createelementValueList();
         case TypePackage.MARKER_ANNOTATION :
            return createmarkerAnnotation();
         case TypePackage.SINGLE_ELEMENT_ANNOTATION :
            return createsingleElementAnnotation();
         case TypePackage.ARRAY_INITIALIZER :
            return createarrayInitializer();
         case TypePackage.VARIABLE_INITIALIZER_LIST :
            return createvariableInitializerList();
         case TypePackage.BLOCK :
            return createblock();
         case TypePackage.BLOCK_STATEMENTS :
            return createblockStatements();
         case TypePackage.ARGUMENT_LIST :
            return createargumentList();
         case TypePackage.PRIMARY :
            return createprimary();
         case TypePackage.EXPRESSION :
            return createexpression();
         case TypePackage.CONDITIONAL_EXPRESSION :
            return createconditionalExpression();
         case TypePackage.EMPTY_TYPE_DECLARATION :
            return createEmptyTypeDeclaration();
         case TypePackage.EMPTY_CLASS_MEMBER_DECLARATION :
            return createEmptyClassMemberDeclaration();
         default :
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue) {
      switch (eDataType.getClassifierID()) {
         case TypePackage.CLASS_MODIFIERS :
            return createClassModifiersFromString(eDataType, initialValue);
         case TypePackage.FIELD_MODIFIERS :
            return createFieldModifiersFromString(eDataType, initialValue);
         case TypePackage.METHOD_MODIFIERS :
            return createmethodModifiersFromString(eDataType, initialValue);
         case TypePackage.VARIABLE_MODIFIERS :
            return createVariableModifiersFromString(eDataType, initialValue);
         case TypePackage.CONSTRUCTOR_MODIFIERS :
            return createConstructorModifiersFromString(eDataType, initialValue);
         case TypePackage.INTERFACE_MODIFIERS :
            return createInterfaceModifiersFromString(eDataType, initialValue);
         case TypePackage.CONSTANT_MODIFIERS :
            return createConstantModifiersFromString(eDataType, initialValue);
         case TypePackage.INTERFACE_METHOD_MODIFIERS :
            return createInterfaceMethodModifiersFromString(eDataType, initialValue);
         case TypePackage.ANNOTATION_TYPE_ELEMENT_MODIFIERS :
            return createAnnotationTypeElementModifiersFromString(eDataType, initialValue);
         default :
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue) {
      switch (eDataType.getClassifierID()) {
         case TypePackage.CLASS_MODIFIERS :
            return convertClassModifiersToString(eDataType, instanceValue);
         case TypePackage.FIELD_MODIFIERS :
            return convertFieldModifiersToString(eDataType, instanceValue);
         case TypePackage.METHOD_MODIFIERS :
            return convertmethodModifiersToString(eDataType, instanceValue);
         case TypePackage.VARIABLE_MODIFIERS :
            return convertVariableModifiersToString(eDataType, instanceValue);
         case TypePackage.CONSTRUCTOR_MODIFIERS :
            return convertConstructorModifiersToString(eDataType, instanceValue);
         case TypePackage.INTERFACE_MODIFIERS :
            return convertInterfaceModifiersToString(eDataType, instanceValue);
         case TypePackage.CONSTANT_MODIFIERS :
            return convertConstantModifiersToString(eDataType, instanceValue);
         case TypePackage.INTERFACE_METHOD_MODIFIERS :
            return convertInterfaceMethodModifiersToString(eDataType, instanceValue);
         case TypePackage.ANNOTATION_TYPE_ELEMENT_MODIFIERS :
            return convertAnnotationTypeElementModifiersToString(eDataType, instanceValue);
         default :
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Model createModel() {
      ModelImpl model = new ModelImpl();
      return model;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public type createtype() {
      typeImpl type = new typeImpl();
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public primitiveType createprimitiveType() {
      primitiveTypeImpl primitiveType = new primitiveTypeImpl();
      return primitiveType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public referenceType createreferenceType() {
      referenceTypeImpl referenceType = new referenceTypeImpl();
      return referenceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classOrInterfaceType createclassOrInterfaceType() {
      classOrInterfaceTypeImpl classOrInterfaceType = new classOrInterfaceTypeImpl();
      return classOrInterfaceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classOrInterfaceTypeSegment createclassOrInterfaceTypeSegment() {
      classOrInterfaceTypeSegmentImpl classOrInterfaceTypeSegment = new classOrInterfaceTypeSegmentImpl();
      return classOrInterfaceTypeSegment;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classType createclassType() {
      classTypeImpl classType = new classTypeImpl();
      return classType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classType_lf_classOrInterfaceType createclassType_lf_classOrInterfaceType() {
      classType_lf_classOrInterfaceTypeImpl classType_lf_classOrInterfaceType = new classType_lf_classOrInterfaceTypeImpl();
      return classType_lf_classOrInterfaceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classType_lfno_classOrInterfaceType createclassType_lfno_classOrInterfaceType() {
      classType_lfno_classOrInterfaceTypeImpl classType_lfno_classOrInterfaceType = new classType_lfno_classOrInterfaceTypeImpl();
      return classType_lfno_classOrInterfaceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceType createinterfaceType() {
      interfaceTypeImpl interfaceType = new interfaceTypeImpl();
      return interfaceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceType_lf_classOrInterfaceType createinterfaceType_lf_classOrInterfaceType() {
      interfaceType_lf_classOrInterfaceTypeImpl interfaceType_lf_classOrInterfaceType = new interfaceType_lf_classOrInterfaceTypeImpl();
      return interfaceType_lf_classOrInterfaceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceType_lfno_classOrInterfaceType createinterfaceType_lfno_classOrInterfaceType() {
      interfaceType_lfno_classOrInterfaceTypeImpl interfaceType_lfno_classOrInterfaceType = new interfaceType_lfno_classOrInterfaceTypeImpl();
      return interfaceType_lfno_classOrInterfaceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeVariable createtypeVariable() {
      typeVariableImpl typeVariable = new typeVariableImpl();
      return typeVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public arrayType createarrayType() {
      arrayTypeImpl arrayType = new arrayTypeImpl();
      return arrayType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public dims createdims() {
      dimsImpl dims = new dimsImpl();
      return dims;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public dim createdim() {
      dimImpl dim = new dimImpl();
      return dim;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeParameter createtypeParameter() {
      typeParameterImpl typeParameter = new typeParameterImpl();
      return typeParameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeParameterModifier createtypeParameterModifier() {
      typeParameterModifierImpl typeParameterModifier = new typeParameterModifierImpl();
      return typeParameterModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeBound createtypeBound() {
      typeBoundImpl typeBound = new typeBoundImpl();
      return typeBound;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public additionalBound createadditionalBound() {
      additionalBoundImpl additionalBound = new additionalBoundImpl();
      return additionalBound;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeArguments createtypeArguments() {
      typeArgumentsImpl typeArguments = new typeArgumentsImpl();
      return typeArguments;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeArgumentList createtypeArgumentList() {
      typeArgumentListImpl typeArgumentList = new typeArgumentListImpl();
      return typeArgumentList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeArgument createtypeArgument() {
      typeArgumentImpl typeArgument = new typeArgumentImpl();
      return typeArgument;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public wildcard createwildcard() {
      wildcardImpl wildcard = new wildcardImpl();
      return wildcard;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public wildcardBounds createwildcardBounds() {
      wildcardBoundsImpl wildcardBounds = new wildcardBoundsImpl();
      return wildcardBounds;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public compilationUnit createcompilationUnit() {
      compilationUnitImpl compilationUnit = new compilationUnitImpl();
      return compilationUnit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public packageDeclaration createpackageDeclaration() {
      packageDeclarationImpl packageDeclaration = new packageDeclarationImpl();
      return packageDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public packageModifier createpackageModifier() {
      packageModifierImpl packageModifier = new packageModifierImpl();
      return packageModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public importDeclaration createimportDeclaration() {
      importDeclarationImpl importDeclaration = new importDeclarationImpl();
      return importDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public singleTypeImportDeclaration createsingleTypeImportDeclaration() {
      singleTypeImportDeclarationImpl singleTypeImportDeclaration = new singleTypeImportDeclarationImpl();
      return singleTypeImportDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeImportOnDemandDeclaration createtypeImportOnDemandDeclaration() {
      typeImportOnDemandDeclarationImpl typeImportOnDemandDeclaration = new typeImportOnDemandDeclarationImpl();
      return typeImportOnDemandDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public singleStaticImportDeclaration createsingleStaticImportDeclaration() {
      singleStaticImportDeclarationImpl singleStaticImportDeclaration = new singleStaticImportDeclarationImpl();
      return singleStaticImportDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public staticImportOnDemandDeclaration createstaticImportOnDemandDeclaration() {
      staticImportOnDemandDeclarationImpl staticImportOnDemandDeclaration = new staticImportOnDemandDeclarationImpl();
      return staticImportOnDemandDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeDeclaration createtypeDeclaration() {
      typeDeclarationImpl typeDeclaration = new typeDeclarationImpl();
      return typeDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classDeclaration createclassDeclaration() {
      classDeclarationImpl classDeclaration = new classDeclarationImpl();
      return classDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public normalClassDeclaration createnormalClassDeclaration() {
      normalClassDeclarationImpl normalClassDeclaration = new normalClassDeclarationImpl();
      return normalClassDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classModifier createclassModifier() {
      classModifierImpl classModifier = new classModifierImpl();
      return classModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaClassModifier createJavaClassModifier() {
      JavaClassModifierImpl javaClassModifier = new JavaClassModifierImpl();
      return javaClassModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeParameters createtypeParameters() {
      typeParametersImpl typeParameters = new typeParametersImpl();
      return typeParameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public typeParameterList createtypeParameterList() {
      typeParameterListImpl typeParameterList = new typeParameterListImpl();
      return typeParameterList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public superclass createsuperclass() {
      superclassImpl superclass = new superclassImpl();
      return superclass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public superinterfaces createsuperinterfaces() {
      superinterfacesImpl superinterfaces = new superinterfacesImpl();
      return superinterfaces;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceTypeList createinterfaceTypeList() {
      interfaceTypeListImpl interfaceTypeList = new interfaceTypeListImpl();
      return interfaceTypeList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classBody createclassBody() {
      classBodyImpl classBody = new classBodyImpl();
      return classBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classBodyDeclaration createclassBodyDeclaration() {
      classBodyDeclarationImpl classBodyDeclaration = new classBodyDeclarationImpl();
      return classBodyDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public classMemberDeclaration createclassMemberDeclaration() {
      classMemberDeclarationImpl classMemberDeclaration = new classMemberDeclarationImpl();
      return classMemberDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public fieldDeclaration createfieldDeclaration() {
      fieldDeclarationImpl fieldDeclaration = new fieldDeclarationImpl();
      return fieldDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public fieldModifier createfieldModifier() {
      fieldModifierImpl fieldModifier = new fieldModifierImpl();
      return fieldModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaFieldModifier createJavaFieldModifier() {
      JavaFieldModifierImpl javaFieldModifier = new JavaFieldModifierImpl();
      return javaFieldModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableDeclaratorList createvariableDeclaratorList() {
      variableDeclaratorListImpl variableDeclaratorList = new variableDeclaratorListImpl();
      return variableDeclaratorList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableDeclarator createvariableDeclarator() {
      variableDeclaratorImpl variableDeclarator = new variableDeclaratorImpl();
      return variableDeclarator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableDeclaratorId createvariableDeclaratorId() {
      variableDeclaratorIdImpl variableDeclaratorId = new variableDeclaratorIdImpl();
      return variableDeclaratorId;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableInitializer createvariableInitializer() {
      variableInitializerImpl variableInitializer = new variableInitializerImpl();
      return variableInitializer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannType createunannType() {
      unannTypeImpl unannType = new unannTypeImpl();
      return unannType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannPrimitiveType createunannPrimitiveType() {
      unannPrimitiveTypeImpl unannPrimitiveType = new unannPrimitiveTypeImpl();
      return unannPrimitiveType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannReferenceType createunannReferenceType() {
      unannReferenceTypeImpl unannReferenceType = new unannReferenceTypeImpl();
      return unannReferenceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannClassOrInterfaceType createunannClassOrInterfaceType() {
      unannClassOrInterfaceTypeImpl unannClassOrInterfaceType = new unannClassOrInterfaceTypeImpl();
      return unannClassOrInterfaceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannClassType createunannClassType() {
      unannClassTypeImpl unannClassType = new unannClassTypeImpl();
      return unannClassType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ClassTypeSegment createClassTypeSegment() {
      ClassTypeSegmentImpl classTypeSegment = new ClassTypeSegmentImpl();
      return classTypeSegment;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ClassTypeSegmentWithAnnotations createClassTypeSegmentWithAnnotations() {
      ClassTypeSegmentWithAnnotationsImpl classTypeSegmentWithAnnotations = new ClassTypeSegmentWithAnnotationsImpl();
      return classTypeSegmentWithAnnotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannInterfaceType createunannInterfaceType() {
      unannInterfaceTypeImpl unannInterfaceType = new unannInterfaceTypeImpl();
      return unannInterfaceType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannTypeVariable createunannTypeVariable() {
      unannTypeVariableImpl unannTypeVariable = new unannTypeVariableImpl();
      return unannTypeVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public unannArrayType createunannArrayType() {
      unannArrayTypeImpl unannArrayType = new unannArrayTypeImpl();
      return unannArrayType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public methodDeclaration createmethodDeclaration() {
      methodDeclarationImpl methodDeclaration = new methodDeclarationImpl();
      return methodDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public methodModifier createmethodModifier() {
      methodModifierImpl methodModifier = new methodModifierImpl();
      return methodModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaMethodModifier createJavaMethodModifier() {
      JavaMethodModifierImpl javaMethodModifier = new JavaMethodModifierImpl();
      return javaMethodModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public methodHeader createmethodHeader() {
      methodHeaderImpl methodHeader = new methodHeaderImpl();
      return methodHeader;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public result createresult() {
      resultImpl result = new resultImpl();
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public voidType createvoidType() {
      voidTypeImpl voidType = new voidTypeImpl();
      return voidType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public methodDeclarator createmethodDeclarator() {
      methodDeclaratorImpl methodDeclarator = new methodDeclaratorImpl();
      return methodDeclarator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public formalParameterList createformalParameterList() {
      formalParameterListImpl formalParameterList = new formalParameterListImpl();
      return formalParameterList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public formalParameters createformalParameters() {
      formalParametersImpl formalParameters = new formalParametersImpl();
      return formalParameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public formalParameter createformalParameter() {
      formalParameterImpl formalParameter = new formalParameterImpl();
      return formalParameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableModifier createvariableModifier() {
      variableModifierImpl variableModifier = new variableModifierImpl();
      return variableModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaVariableModifier createJavaVariableModifier() {
      JavaVariableModifierImpl javaVariableModifier = new JavaVariableModifierImpl();
      return javaVariableModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public lastFormalParameter createlastFormalParameter() {
      lastFormalParameterImpl lastFormalParameter = new lastFormalParameterImpl();
      return lastFormalParameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public receiverParameter createreceiverParameter() {
      receiverParameterImpl receiverParameter = new receiverParameterImpl();
      return receiverParameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public throws_ createthrows_() {
      throws_Impl throws_ = new throws_Impl();
      return throws_;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public exceptionTypeList createexceptionTypeList() {
      exceptionTypeListImpl exceptionTypeList = new exceptionTypeListImpl();
      return exceptionTypeList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public exceptionType createexceptionType() {
      exceptionTypeImpl exceptionType = new exceptionTypeImpl();
      return exceptionType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public methodBody createmethodBody() {
      methodBodyImpl methodBody = new methodBodyImpl();
      return methodBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public instanceInitializer createinstanceInitializer() {
      instanceInitializerImpl instanceInitializer = new instanceInitializerImpl();
      return instanceInitializer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public staticInitializer createstaticInitializer() {
      staticInitializerImpl staticInitializer = new staticInitializerImpl();
      return staticInitializer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public constructorDeclaration createconstructorDeclaration() {
      constructorDeclarationImpl constructorDeclaration = new constructorDeclarationImpl();
      return constructorDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public constructorModifier createconstructorModifier() {
      constructorModifierImpl constructorModifier = new constructorModifierImpl();
      return constructorModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaConstructorModifier createJavaConstructorModifier() {
      JavaConstructorModifierImpl javaConstructorModifier = new JavaConstructorModifierImpl();
      return javaConstructorModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public constructorDeclarator createconstructorDeclarator() {
      constructorDeclaratorImpl constructorDeclarator = new constructorDeclaratorImpl();
      return constructorDeclarator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public enumDeclaration createenumDeclaration() {
      enumDeclarationImpl enumDeclaration = new enumDeclarationImpl();
      return enumDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public enumBody createenumBody() {
      enumBodyImpl enumBody = new enumBodyImpl();
      return enumBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public enumConstantList createenumConstantList() {
      enumConstantListImpl enumConstantList = new enumConstantListImpl();
      return enumConstantList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public enumConstant createenumConstant() {
      enumConstantImpl enumConstant = new enumConstantImpl();
      return enumConstant;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public enumConstantModifier createenumConstantModifier() {
      enumConstantModifierImpl enumConstantModifier = new enumConstantModifierImpl();
      return enumConstantModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public enumBodyDeclarations createenumBodyDeclarations() {
      enumBodyDeclarationsImpl enumBodyDeclarations = new enumBodyDeclarationsImpl();
      return enumBodyDeclarations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceDeclaration createinterfaceDeclaration() {
      interfaceDeclarationImpl interfaceDeclaration = new interfaceDeclarationImpl();
      return interfaceDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public normalInterfaceDeclaration createnormalInterfaceDeclaration() {
      normalInterfaceDeclarationImpl normalInterfaceDeclaration = new normalInterfaceDeclarationImpl();
      return normalInterfaceDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceModifier createinterfaceModifier() {
      interfaceModifierImpl interfaceModifier = new interfaceModifierImpl();
      return interfaceModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaInterfaceModifier createJavaInterfaceModifier() {
      JavaInterfaceModifierImpl javaInterfaceModifier = new JavaInterfaceModifierImpl();
      return javaInterfaceModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public extendsInterfaces createextendsInterfaces() {
      extendsInterfacesImpl extendsInterfaces = new extendsInterfacesImpl();
      return extendsInterfaces;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceBody createinterfaceBody() {
      interfaceBodyImpl interfaceBody = new interfaceBodyImpl();
      return interfaceBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceMemberDeclaration createinterfaceMemberDeclaration() {
      interfaceMemberDeclarationImpl interfaceMemberDeclaration = new interfaceMemberDeclarationImpl();
      return interfaceMemberDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public constantDeclaration createconstantDeclaration() {
      constantDeclarationImpl constantDeclaration = new constantDeclarationImpl();
      return constantDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public constantModifier createconstantModifier() {
      constantModifierImpl constantModifier = new constantModifierImpl();
      return constantModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaConstantModifier createJavaConstantModifier() {
      JavaConstantModifierImpl javaConstantModifier = new JavaConstantModifierImpl();
      return javaConstantModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceMethodDeclaration createinterfaceMethodDeclaration() {
      interfaceMethodDeclarationImpl interfaceMethodDeclaration = new interfaceMethodDeclarationImpl();
      return interfaceMethodDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public interfaceMethodModifier createinterfaceMethodModifier() {
      interfaceMethodModifierImpl interfaceMethodModifier = new interfaceMethodModifierImpl();
      return interfaceMethodModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaInterfaceMethodModifiers createJavaInterfaceMethodModifiers() {
      JavaInterfaceMethodModifiersImpl javaInterfaceMethodModifiers = new JavaInterfaceMethodModifiersImpl();
      return javaInterfaceMethodModifiers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public annotationTypeDeclaration createannotationTypeDeclaration() {
      annotationTypeDeclarationImpl annotationTypeDeclaration = new annotationTypeDeclarationImpl();
      return annotationTypeDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public annotationTypeBody createannotationTypeBody() {
      annotationTypeBodyImpl annotationTypeBody = new annotationTypeBodyImpl();
      return annotationTypeBody;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public annotationTypeMemberDeclaration createannotationTypeMemberDeclaration() {
      annotationTypeMemberDeclarationImpl annotationTypeMemberDeclaration = new annotationTypeMemberDeclarationImpl();
      return annotationTypeMemberDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public annotationTypeElementDeclaration createannotationTypeElementDeclaration() {
      annotationTypeElementDeclarationImpl annotationTypeElementDeclaration = new annotationTypeElementDeclarationImpl();
      return annotationTypeElementDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public annotationTypeElementModifier createannotationTypeElementModifier() {
      annotationTypeElementModifierImpl annotationTypeElementModifier = new annotationTypeElementModifierImpl();
      return annotationTypeElementModifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaAnnotationTypeElementModifiers createJavaAnnotationTypeElementModifiers() {
      JavaAnnotationTypeElementModifiersImpl javaAnnotationTypeElementModifiers = new JavaAnnotationTypeElementModifiersImpl();
      return javaAnnotationTypeElementModifiers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public defaultValue createdefaultValue() {
      defaultValueImpl defaultValue = new defaultValueImpl();
      return defaultValue;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public annotation createannotation() {
      annotationImpl annotation = new annotationImpl();
      return annotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public normalAnnotation createnormalAnnotation() {
      normalAnnotationImpl normalAnnotation = new normalAnnotationImpl();
      return normalAnnotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public elementValuePairList createelementValuePairList() {
      elementValuePairListImpl elementValuePairList = new elementValuePairListImpl();
      return elementValuePairList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public elementValuePair createelementValuePair() {
      elementValuePairImpl elementValuePair = new elementValuePairImpl();
      return elementValuePair;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public elementValue createelementValue() {
      elementValueImpl elementValue = new elementValueImpl();
      return elementValue;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public elementValueArrayInitializer createelementValueArrayInitializer() {
      elementValueArrayInitializerImpl elementValueArrayInitializer = new elementValueArrayInitializerImpl();
      return elementValueArrayInitializer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public elementValueList createelementValueList() {
      elementValueListImpl elementValueList = new elementValueListImpl();
      return elementValueList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public markerAnnotation createmarkerAnnotation() {
      markerAnnotationImpl markerAnnotation = new markerAnnotationImpl();
      return markerAnnotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public singleElementAnnotation createsingleElementAnnotation() {
      singleElementAnnotationImpl singleElementAnnotation = new singleElementAnnotationImpl();
      return singleElementAnnotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public arrayInitializer createarrayInitializer() {
      arrayInitializerImpl arrayInitializer = new arrayInitializerImpl();
      return arrayInitializer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public variableInitializerList createvariableInitializerList() {
      variableInitializerListImpl variableInitializerList = new variableInitializerListImpl();
      return variableInitializerList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public block createblock() {
      blockImpl block = new blockImpl();
      return block;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public blockStatements createblockStatements() {
      blockStatementsImpl blockStatements = new blockStatementsImpl();
      return blockStatements;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public argumentList createargumentList() {
      argumentListImpl argumentList = new argumentListImpl();
      return argumentList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public primary createprimary() {
      primaryImpl primary = new primaryImpl();
      return primary;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public expression createexpression() {
      expressionImpl expression = new expressionImpl();
      return expression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public conditionalExpression createconditionalExpression() {
      conditionalExpressionImpl conditionalExpression = new conditionalExpressionImpl();
      return conditionalExpression;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EmptyTypeDeclaration createEmptyTypeDeclaration() {
      EmptyTypeDeclarationImpl emptyTypeDeclaration = new EmptyTypeDeclarationImpl();
      return emptyTypeDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EmptyClassMemberDeclaration createEmptyClassMemberDeclaration() {
      EmptyClassMemberDeclarationImpl emptyClassMemberDeclaration = new EmptyClassMemberDeclarationImpl();
      return emptyClassMemberDeclaration;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ClassModifiers createClassModifiersFromString(EDataType eDataType, String initialValue) {
      ClassModifiers result = ClassModifiers.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertClassModifiersToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public FieldModifiers createFieldModifiersFromString(EDataType eDataType, String initialValue) {
      FieldModifiers result = FieldModifiers.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertFieldModifiersToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public methodModifiers createmethodModifiersFromString(EDataType eDataType, String initialValue) {
      methodModifiers result = methodModifiers.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertmethodModifiersToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public VariableModifiers createVariableModifiersFromString(EDataType eDataType, String initialValue) {
      VariableModifiers result = VariableModifiers.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertVariableModifiersToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ConstructorModifiers createConstructorModifiersFromString(EDataType eDataType, String initialValue) {
      ConstructorModifiers result = ConstructorModifiers.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertConstructorModifiersToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public InterfaceModifiers createInterfaceModifiersFromString(EDataType eDataType, String initialValue) {
      InterfaceModifiers result = InterfaceModifiers.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertInterfaceModifiersToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ConstantModifiers createConstantModifiersFromString(EDataType eDataType, String initialValue) {
      ConstantModifiers result = ConstantModifiers.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertConstantModifiersToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public InterfaceMethodModifiers createInterfaceMethodModifiersFromString(EDataType eDataType, String initialValue) {
      InterfaceMethodModifiers result = InterfaceMethodModifiers.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertInterfaceMethodModifiersToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public AnnotationTypeElementModifiers createAnnotationTypeElementModifiersFromString(EDataType eDataType,
      String initialValue) {
      AnnotationTypeElementModifiers result = AnnotationTypeElementModifiers.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertAnnotationTypeElementModifiersToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public TypePackage getTypePackage() {
      return (TypePackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static TypePackage getPackage() {
      return TypePackage.eINSTANCE;
   }

} // TypeFactoryImpl
