/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.type.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   TypeFactory eINSTANCE = org.sourcepit.java.type.type.impl.TypeFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Model</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Model</em>'.
    * @generated
    */
   Model createModel();

   /**
    * Returns a new object of class '<em>type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type</em>'.
    * @generated
    */
   type createtype();

   /**
    * Returns a new object of class '<em>primitive Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>primitive Type</em>'.
    * @generated
    */
   primitiveType createprimitiveType();

   /**
    * Returns a new object of class '<em>reference Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>reference Type</em>'.
    * @generated
    */
   referenceType createreferenceType();

   /**
    * Returns a new object of class '<em>class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Or Interface Type</em>'.
    * @generated
    */
   classOrInterfaceType createclassOrInterfaceType();

   /**
    * Returns a new object of class '<em>class Or Interface Type Segment</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Or Interface Type Segment</em>'.
    * @generated
    */
   classOrInterfaceTypeSegment createclassOrInterfaceTypeSegment();

   /**
    * Returns a new object of class '<em>class Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Type</em>'.
    * @generated
    */
   classType createclassType();

   /**
    * Returns a new object of class '<em>class Type lf class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Type lf class Or Interface Type</em>'.
    * @generated
    */
   classType_lf_classOrInterfaceType createclassType_lf_classOrInterfaceType();

   /**
    * Returns a new object of class '<em>class Type lfno class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Type lfno class Or Interface Type</em>'.
    * @generated
    */
   classType_lfno_classOrInterfaceType createclassType_lfno_classOrInterfaceType();

   /**
    * Returns a new object of class '<em>interface Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Type</em>'.
    * @generated
    */
   interfaceType createinterfaceType();

   /**
    * Returns a new object of class '<em>interface Type lf class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Type lf class Or Interface Type</em>'.
    * @generated
    */
   interfaceType_lf_classOrInterfaceType createinterfaceType_lf_classOrInterfaceType();

   /**
    * Returns a new object of class '<em>interface Type lfno class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Type lfno class Or Interface Type</em>'.
    * @generated
    */
   interfaceType_lfno_classOrInterfaceType createinterfaceType_lfno_classOrInterfaceType();

   /**
    * Returns a new object of class '<em>type Variable</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Variable</em>'.
    * @generated
    */
   typeVariable createtypeVariable();

   /**
    * Returns a new object of class '<em>array Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>array Type</em>'.
    * @generated
    */
   arrayType createarrayType();

   /**
    * Returns a new object of class '<em>dims</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>dims</em>'.
    * @generated
    */
   dims createdims();

   /**
    * Returns a new object of class '<em>dim</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>dim</em>'.
    * @generated
    */
   dim createdim();

   /**
    * Returns a new object of class '<em>type Parameter</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Parameter</em>'.
    * @generated
    */
   typeParameter createtypeParameter();

   /**
    * Returns a new object of class '<em>type Parameter Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Parameter Modifier</em>'.
    * @generated
    */
   typeParameterModifier createtypeParameterModifier();

   /**
    * Returns a new object of class '<em>type Bound</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Bound</em>'.
    * @generated
    */
   typeBound createtypeBound();

   /**
    * Returns a new object of class '<em>additional Bound</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>additional Bound</em>'.
    * @generated
    */
   additionalBound createadditionalBound();

   /**
    * Returns a new object of class '<em>type Arguments</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Arguments</em>'.
    * @generated
    */
   typeArguments createtypeArguments();

   /**
    * Returns a new object of class '<em>type Argument List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Argument List</em>'.
    * @generated
    */
   typeArgumentList createtypeArgumentList();

   /**
    * Returns a new object of class '<em>type Argument</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Argument</em>'.
    * @generated
    */
   typeArgument createtypeArgument();

   /**
    * Returns a new object of class '<em>wildcard</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>wildcard</em>'.
    * @generated
    */
   wildcard createwildcard();

   /**
    * Returns a new object of class '<em>wildcard Bounds</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>wildcard Bounds</em>'.
    * @generated
    */
   wildcardBounds createwildcardBounds();

   /**
    * Returns a new object of class '<em>compilation Unit</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>compilation Unit</em>'.
    * @generated
    */
   compilationUnit createcompilationUnit();

   /**
    * Returns a new object of class '<em>package Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>package Declaration</em>'.
    * @generated
    */
   packageDeclaration createpackageDeclaration();

   /**
    * Returns a new object of class '<em>package Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>package Modifier</em>'.
    * @generated
    */
   packageModifier createpackageModifier();

   /**
    * Returns a new object of class '<em>import Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>import Declaration</em>'.
    * @generated
    */
   importDeclaration createimportDeclaration();

   /**
    * Returns a new object of class '<em>single Type Import Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>single Type Import Declaration</em>'.
    * @generated
    */
   singleTypeImportDeclaration createsingleTypeImportDeclaration();

   /**
    * Returns a new object of class '<em>type Import On Demand Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Import On Demand Declaration</em>'.
    * @generated
    */
   typeImportOnDemandDeclaration createtypeImportOnDemandDeclaration();

   /**
    * Returns a new object of class '<em>single Static Import Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>single Static Import Declaration</em>'.
    * @generated
    */
   singleStaticImportDeclaration createsingleStaticImportDeclaration();

   /**
    * Returns a new object of class '<em>static Import On Demand Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>static Import On Demand Declaration</em>'.
    * @generated
    */
   staticImportOnDemandDeclaration createstaticImportOnDemandDeclaration();

   /**
    * Returns a new object of class '<em>type Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Declaration</em>'.
    * @generated
    */
   typeDeclaration createtypeDeclaration();

   /**
    * Returns a new object of class '<em>class Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Declaration</em>'.
    * @generated
    */
   classDeclaration createclassDeclaration();

   /**
    * Returns a new object of class '<em>normal Class Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>normal Class Declaration</em>'.
    * @generated
    */
   normalClassDeclaration createnormalClassDeclaration();

   /**
    * Returns a new object of class '<em>class Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Modifier</em>'.
    * @generated
    */
   classModifier createclassModifier();

   /**
    * Returns a new object of class '<em>Java Class Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Java Class Modifier</em>'.
    * @generated
    */
   JavaClassModifier createJavaClassModifier();

   /**
    * Returns a new object of class '<em>type Parameters</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Parameters</em>'.
    * @generated
    */
   typeParameters createtypeParameters();

   /**
    * Returns a new object of class '<em>type Parameter List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>type Parameter List</em>'.
    * @generated
    */
   typeParameterList createtypeParameterList();

   /**
    * Returns a new object of class '<em>superclass</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>superclass</em>'.
    * @generated
    */
   superclass createsuperclass();

   /**
    * Returns a new object of class '<em>superinterfaces</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>superinterfaces</em>'.
    * @generated
    */
   superinterfaces createsuperinterfaces();

   /**
    * Returns a new object of class '<em>interface Type List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Type List</em>'.
    * @generated
    */
   interfaceTypeList createinterfaceTypeList();

   /**
    * Returns a new object of class '<em>class Body</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Body</em>'.
    * @generated
    */
   classBody createclassBody();

   /**
    * Returns a new object of class '<em>class Body Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Body Declaration</em>'.
    * @generated
    */
   classBodyDeclaration createclassBodyDeclaration();

   /**
    * Returns a new object of class '<em>class Member Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>class Member Declaration</em>'.
    * @generated
    */
   classMemberDeclaration createclassMemberDeclaration();

   /**
    * Returns a new object of class '<em>field Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>field Declaration</em>'.
    * @generated
    */
   fieldDeclaration createfieldDeclaration();

   /**
    * Returns a new object of class '<em>field Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>field Modifier</em>'.
    * @generated
    */
   fieldModifier createfieldModifier();

   /**
    * Returns a new object of class '<em>Java Field Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Java Field Modifier</em>'.
    * @generated
    */
   JavaFieldModifier createJavaFieldModifier();

   /**
    * Returns a new object of class '<em>variable Declarator List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>variable Declarator List</em>'.
    * @generated
    */
   variableDeclaratorList createvariableDeclaratorList();

   /**
    * Returns a new object of class '<em>variable Declarator</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>variable Declarator</em>'.
    * @generated
    */
   variableDeclarator createvariableDeclarator();

   /**
    * Returns a new object of class '<em>variable Declarator Id</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>variable Declarator Id</em>'.
    * @generated
    */
   variableDeclaratorId createvariableDeclaratorId();

   /**
    * Returns a new object of class '<em>variable Initializer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>variable Initializer</em>'.
    * @generated
    */
   variableInitializer createvariableInitializer();

   /**
    * Returns a new object of class '<em>unann Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>unann Type</em>'.
    * @generated
    */
   unannType createunannType();

   /**
    * Returns a new object of class '<em>unann Primitive Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>unann Primitive Type</em>'.
    * @generated
    */
   unannPrimitiveType createunannPrimitiveType();

   /**
    * Returns a new object of class '<em>unann Reference Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>unann Reference Type</em>'.
    * @generated
    */
   unannReferenceType createunannReferenceType();

   /**
    * Returns a new object of class '<em>unann Class Or Interface Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>unann Class Or Interface Type</em>'.
    * @generated
    */
   unannClassOrInterfaceType createunannClassOrInterfaceType();

   /**
    * Returns a new object of class '<em>unann Class Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>unann Class Type</em>'.
    * @generated
    */
   unannClassType createunannClassType();

   /**
    * Returns a new object of class '<em>Class Type Segment</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Class Type Segment</em>'.
    * @generated
    */
   ClassTypeSegment createClassTypeSegment();

   /**
    * Returns a new object of class '<em>Class Type Segment With Annotations</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Class Type Segment With Annotations</em>'.
    * @generated
    */
   ClassTypeSegmentWithAnnotations createClassTypeSegmentWithAnnotations();

   /**
    * Returns a new object of class '<em>unann Interface Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>unann Interface Type</em>'.
    * @generated
    */
   unannInterfaceType createunannInterfaceType();

   /**
    * Returns a new object of class '<em>unann Type Variable</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>unann Type Variable</em>'.
    * @generated
    */
   unannTypeVariable createunannTypeVariable();

   /**
    * Returns a new object of class '<em>unann Array Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>unann Array Type</em>'.
    * @generated
    */
   unannArrayType createunannArrayType();

   /**
    * Returns a new object of class '<em>method Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>method Declaration</em>'.
    * @generated
    */
   methodDeclaration createmethodDeclaration();

   /**
    * Returns a new object of class '<em>method Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>method Modifier</em>'.
    * @generated
    */
   methodModifier createmethodModifier();

   /**
    * Returns a new object of class '<em>Java Method Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Java Method Modifier</em>'.
    * @generated
    */
   JavaMethodModifier createJavaMethodModifier();

   /**
    * Returns a new object of class '<em>method Header</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>method Header</em>'.
    * @generated
    */
   methodHeader createmethodHeader();

   /**
    * Returns a new object of class '<em>result</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>result</em>'.
    * @generated
    */
   result createresult();

   /**
    * Returns a new object of class '<em>void Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>void Type</em>'.
    * @generated
    */
   voidType createvoidType();

   /**
    * Returns a new object of class '<em>method Declarator</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>method Declarator</em>'.
    * @generated
    */
   methodDeclarator createmethodDeclarator();

   /**
    * Returns a new object of class '<em>formal Parameter List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>formal Parameter List</em>'.
    * @generated
    */
   formalParameterList createformalParameterList();

   /**
    * Returns a new object of class '<em>formal Parameters</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>formal Parameters</em>'.
    * @generated
    */
   formalParameters createformalParameters();

   /**
    * Returns a new object of class '<em>formal Parameter</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>formal Parameter</em>'.
    * @generated
    */
   formalParameter createformalParameter();

   /**
    * Returns a new object of class '<em>variable Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>variable Modifier</em>'.
    * @generated
    */
   variableModifier createvariableModifier();

   /**
    * Returns a new object of class '<em>Java Variable Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Java Variable Modifier</em>'.
    * @generated
    */
   JavaVariableModifier createJavaVariableModifier();

   /**
    * Returns a new object of class '<em>last Formal Parameter</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>last Formal Parameter</em>'.
    * @generated
    */
   lastFormalParameter createlastFormalParameter();

   /**
    * Returns a new object of class '<em>receiver Parameter</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>receiver Parameter</em>'.
    * @generated
    */
   receiverParameter createreceiverParameter();

   /**
    * Returns a new object of class '<em>throws </em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>throws </em>'.
    * @generated
    */
   throws_ createthrows_();

   /**
    * Returns a new object of class '<em>exception Type List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>exception Type List</em>'.
    * @generated
    */
   exceptionTypeList createexceptionTypeList();

   /**
    * Returns a new object of class '<em>exception Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>exception Type</em>'.
    * @generated
    */
   exceptionType createexceptionType();

   /**
    * Returns a new object of class '<em>method Body</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>method Body</em>'.
    * @generated
    */
   methodBody createmethodBody();

   /**
    * Returns a new object of class '<em>instance Initializer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>instance Initializer</em>'.
    * @generated
    */
   instanceInitializer createinstanceInitializer();

   /**
    * Returns a new object of class '<em>static Initializer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>static Initializer</em>'.
    * @generated
    */
   staticInitializer createstaticInitializer();

   /**
    * Returns a new object of class '<em>constructor Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>constructor Declaration</em>'.
    * @generated
    */
   constructorDeclaration createconstructorDeclaration();

   /**
    * Returns a new object of class '<em>constructor Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>constructor Modifier</em>'.
    * @generated
    */
   constructorModifier createconstructorModifier();

   /**
    * Returns a new object of class '<em>Java Constructor Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Java Constructor Modifier</em>'.
    * @generated
    */
   JavaConstructorModifier createJavaConstructorModifier();

   /**
    * Returns a new object of class '<em>constructor Declarator</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>constructor Declarator</em>'.
    * @generated
    */
   constructorDeclarator createconstructorDeclarator();

   /**
    * Returns a new object of class '<em>enum Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>enum Declaration</em>'.
    * @generated
    */
   enumDeclaration createenumDeclaration();

   /**
    * Returns a new object of class '<em>enum Body</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>enum Body</em>'.
    * @generated
    */
   enumBody createenumBody();

   /**
    * Returns a new object of class '<em>enum Constant List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>enum Constant List</em>'.
    * @generated
    */
   enumConstantList createenumConstantList();

   /**
    * Returns a new object of class '<em>enum Constant</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>enum Constant</em>'.
    * @generated
    */
   enumConstant createenumConstant();

   /**
    * Returns a new object of class '<em>enum Constant Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>enum Constant Modifier</em>'.
    * @generated
    */
   enumConstantModifier createenumConstantModifier();

   /**
    * Returns a new object of class '<em>enum Body Declarations</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>enum Body Declarations</em>'.
    * @generated
    */
   enumBodyDeclarations createenumBodyDeclarations();

   /**
    * Returns a new object of class '<em>interface Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Declaration</em>'.
    * @generated
    */
   interfaceDeclaration createinterfaceDeclaration();

   /**
    * Returns a new object of class '<em>normal Interface Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>normal Interface Declaration</em>'.
    * @generated
    */
   normalInterfaceDeclaration createnormalInterfaceDeclaration();

   /**
    * Returns a new object of class '<em>interface Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Modifier</em>'.
    * @generated
    */
   interfaceModifier createinterfaceModifier();

   /**
    * Returns a new object of class '<em>Java Interface Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Java Interface Modifier</em>'.
    * @generated
    */
   JavaInterfaceModifier createJavaInterfaceModifier();

   /**
    * Returns a new object of class '<em>extends Interfaces</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>extends Interfaces</em>'.
    * @generated
    */
   extendsInterfaces createextendsInterfaces();

   /**
    * Returns a new object of class '<em>interface Body</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Body</em>'.
    * @generated
    */
   interfaceBody createinterfaceBody();

   /**
    * Returns a new object of class '<em>interface Member Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Member Declaration</em>'.
    * @generated
    */
   interfaceMemberDeclaration createinterfaceMemberDeclaration();

   /**
    * Returns a new object of class '<em>constant Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>constant Declaration</em>'.
    * @generated
    */
   constantDeclaration createconstantDeclaration();

   /**
    * Returns a new object of class '<em>constant Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>constant Modifier</em>'.
    * @generated
    */
   constantModifier createconstantModifier();

   /**
    * Returns a new object of class '<em>Java Constant Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Java Constant Modifier</em>'.
    * @generated
    */
   JavaConstantModifier createJavaConstantModifier();

   /**
    * Returns a new object of class '<em>interface Method Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Method Declaration</em>'.
    * @generated
    */
   interfaceMethodDeclaration createinterfaceMethodDeclaration();

   /**
    * Returns a new object of class '<em>interface Method Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>interface Method Modifier</em>'.
    * @generated
    */
   interfaceMethodModifier createinterfaceMethodModifier();

   /**
    * Returns a new object of class '<em>Java Interface Method Modifiers</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Java Interface Method Modifiers</em>'.
    * @generated
    */
   JavaInterfaceMethodModifiers createJavaInterfaceMethodModifiers();

   /**
    * Returns a new object of class '<em>annotation Type Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>annotation Type Declaration</em>'.
    * @generated
    */
   annotationTypeDeclaration createannotationTypeDeclaration();

   /**
    * Returns a new object of class '<em>annotation Type Body</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>annotation Type Body</em>'.
    * @generated
    */
   annotationTypeBody createannotationTypeBody();

   /**
    * Returns a new object of class '<em>annotation Type Member Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>annotation Type Member Declaration</em>'.
    * @generated
    */
   annotationTypeMemberDeclaration createannotationTypeMemberDeclaration();

   /**
    * Returns a new object of class '<em>annotation Type Element Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>annotation Type Element Declaration</em>'.
    * @generated
    */
   annotationTypeElementDeclaration createannotationTypeElementDeclaration();

   /**
    * Returns a new object of class '<em>annotation Type Element Modifier</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>annotation Type Element Modifier</em>'.
    * @generated
    */
   annotationTypeElementModifier createannotationTypeElementModifier();

   /**
    * Returns a new object of class '<em>Java Annotation Type Element Modifiers</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Java Annotation Type Element Modifiers</em>'.
    * @generated
    */
   JavaAnnotationTypeElementModifiers createJavaAnnotationTypeElementModifiers();

   /**
    * Returns a new object of class '<em>default Value</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>default Value</em>'.
    * @generated
    */
   defaultValue createdefaultValue();

   /**
    * Returns a new object of class '<em>annotation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>annotation</em>'.
    * @generated
    */
   annotation createannotation();

   /**
    * Returns a new object of class '<em>normal Annotation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>normal Annotation</em>'.
    * @generated
    */
   normalAnnotation createnormalAnnotation();

   /**
    * Returns a new object of class '<em>element Value Pair List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>element Value Pair List</em>'.
    * @generated
    */
   elementValuePairList createelementValuePairList();

   /**
    * Returns a new object of class '<em>element Value Pair</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>element Value Pair</em>'.
    * @generated
    */
   elementValuePair createelementValuePair();

   /**
    * Returns a new object of class '<em>element Value</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>element Value</em>'.
    * @generated
    */
   elementValue createelementValue();

   /**
    * Returns a new object of class '<em>element Value Array Initializer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>element Value Array Initializer</em>'.
    * @generated
    */
   elementValueArrayInitializer createelementValueArrayInitializer();

   /**
    * Returns a new object of class '<em>element Value List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>element Value List</em>'.
    * @generated
    */
   elementValueList createelementValueList();

   /**
    * Returns a new object of class '<em>marker Annotation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>marker Annotation</em>'.
    * @generated
    */
   markerAnnotation createmarkerAnnotation();

   /**
    * Returns a new object of class '<em>single Element Annotation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>single Element Annotation</em>'.
    * @generated
    */
   singleElementAnnotation createsingleElementAnnotation();

   /**
    * Returns a new object of class '<em>array Initializer</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>array Initializer</em>'.
    * @generated
    */
   arrayInitializer createarrayInitializer();

   /**
    * Returns a new object of class '<em>variable Initializer List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>variable Initializer List</em>'.
    * @generated
    */
   variableInitializerList createvariableInitializerList();

   /**
    * Returns a new object of class '<em>block</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>block</em>'.
    * @generated
    */
   block createblock();

   /**
    * Returns a new object of class '<em>block Statements</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>block Statements</em>'.
    * @generated
    */
   blockStatements createblockStatements();

   /**
    * Returns a new object of class '<em>argument List</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>argument List</em>'.
    * @generated
    */
   argumentList createargumentList();

   /**
    * Returns a new object of class '<em>primary</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>primary</em>'.
    * @generated
    */
   primary createprimary();

   /**
    * Returns a new object of class '<em>expression</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>expression</em>'.
    * @generated
    */
   expression createexpression();

   /**
    * Returns a new object of class '<em>conditional Expression</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>conditional Expression</em>'.
    * @generated
    */
   conditionalExpression createconditionalExpression();

   /**
    * Returns a new object of class '<em>Empty Type Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Empty Type Declaration</em>'.
    * @generated
    */
   EmptyTypeDeclaration createEmptyTypeDeclaration();

   /**
    * Returns a new object of class '<em>Empty Class Member Declaration</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Empty Class Member Declaration</em>'.
    * @generated
    */
   EmptyClassMemberDeclaration createEmptyClassMemberDeclaration();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the package supported by this factory.
    * @generated
    */
   TypePackage getTypePackage();

} // TypeFactory
