/**
 */

package org.sourcepit.java.type.type.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.java.literals.literals.LiteralsPackage;
import org.sourcepit.java.type.type.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TypePackageImpl extends EPackageImpl implements TypePackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass modelEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass primitiveTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass referenceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classOrInterfaceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classOrInterfaceTypeSegmentEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classType_lf_classOrInterfaceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classType_lfno_classOrInterfaceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceType_lf_classOrInterfaceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceType_lfno_classOrInterfaceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeVariableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass arrayTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass dimsEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass dimEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeParameterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeParameterModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeBoundEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass additionalBoundEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeArgumentsEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeArgumentListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeArgumentEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass wildcardEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass wildcardBoundsEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass compilationUnitEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass packageDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass packageModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass importDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass singleTypeImportDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeImportOnDemandDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass singleStaticImportDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass staticImportOnDemandDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass normalClassDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass javaClassModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeParametersEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass typeParameterListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass superclassEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass superinterfacesEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceTypeListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classBodyEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classBodyDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classMemberDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass fieldDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass fieldModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass javaFieldModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass variableDeclaratorListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass variableDeclaratorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass variableDeclaratorIdEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass variableInitializerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass unannTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass unannPrimitiveTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass unannReferenceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass unannClassOrInterfaceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass unannClassTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classTypeSegmentEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classTypeSegmentWithAnnotationsEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass unannInterfaceTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass unannTypeVariableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass unannArrayTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass methodDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass methodModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass javaMethodModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass methodHeaderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass resultEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass voidTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass methodDeclaratorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass formalParameterListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass formalParametersEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass formalParameterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass variableModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass javaVariableModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass lastFormalParameterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass receiverParameterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass throws_EClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass exceptionTypeListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass exceptionTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass methodBodyEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass instanceInitializerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass staticInitializerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass constructorDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass constructorModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass javaConstructorModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass constructorDeclaratorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass enumDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass enumBodyEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass enumConstantListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass enumConstantEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass enumConstantModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass enumBodyDeclarationsEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass normalInterfaceDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass javaInterfaceModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass extendsInterfacesEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceBodyEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceMemberDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass constantDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass constantModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass javaConstantModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceMethodDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass interfaceMethodModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass javaInterfaceMethodModifiersEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass annotationTypeDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass annotationTypeBodyEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass annotationTypeMemberDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass annotationTypeElementDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass annotationTypeElementModifierEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass javaAnnotationTypeElementModifiersEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass defaultValueEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass annotationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass normalAnnotationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass elementValuePairListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass elementValuePairEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass elementValueEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass elementValueArrayInitializerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass elementValueListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass markerAnnotationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass singleElementAnnotationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass arrayInitializerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass variableInitializerListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass blockEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass blockStatementsEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass argumentListEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass primaryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass expressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass conditionalExpressionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass emptyTypeDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass emptyClassMemberDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum classModifiersEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum fieldModifiersEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum methodModifiersEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum variableModifiersEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum constructorModifiersEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum interfaceModifiersEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum constantModifiersEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum interfaceMethodModifiersEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum annotationTypeElementModifiersEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
    * EPackage.Registry} by the package
    * package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
    * performs initialization of the package, or returns the registered package, if one already exists. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.sourcepit.java.type.type.TypePackage#eNS_URI
    * @see #init()
    * @generated
    */
   private TypePackageImpl() {
      super(eNS_URI, TypeFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>
    * This method is used to initialize {@link TypePackage#eINSTANCE} when that field is accessed. Clients should not
    * invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static TypePackage init() {
      if (isInited)
         return (TypePackage) EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

      // Obtain or create and register package
      TypePackageImpl theTypePackage = (TypePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypePackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new TypePackageImpl());

      isInited = true;

      // Initialize simple dependencies
      LiteralsPackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theTypePackage.createPackageContents();

      // Initialize created meta-data
      theTypePackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theTypePackage.freeze();


      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(TypePackage.eNS_URI, theTypePackage);
      return theTypePackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getModel() {
      return modelEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getModel_Type() {
      return (EReference) modelEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettype() {
      return typeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getprimitiveType() {
      return primitiveTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getprimitiveType_Annotations() {
      return (EReference) primitiveTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getprimitiveType_TypeName() {
      return (EAttribute) primitiveTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getreferenceType() {
      return referenceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassOrInterfaceType() {
      return classOrInterfaceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassOrInterfaceType_ClassOrInterfaceTypeSegments() {
      return (EReference) classOrInterfaceTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassOrInterfaceTypeSegment() {
      return classOrInterfaceTypeSegmentEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassOrInterfaceTypeSegment_Annotations() {
      return (EReference) classOrInterfaceTypeSegmentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getclassOrInterfaceTypeSegment_Name() {
      return (EAttribute) classOrInterfaceTypeSegmentEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassOrInterfaceTypeSegment_TypeArguments() {
      return (EReference) classOrInterfaceTypeSegmentEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassType() {
      return classTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassType_TypeArguments() {
      return (EReference) classTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassType_ClassOrInterfaceType() {
      return (EReference) classTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassType_lf_classOrInterfaceType() {
      return classType_lf_classOrInterfaceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassType_lf_classOrInterfaceType_Annotations() {
      return (EReference) classType_lf_classOrInterfaceTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getclassType_lf_classOrInterfaceType_Name() {
      return (EAttribute) classType_lf_classOrInterfaceTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassType_lf_classOrInterfaceType_TypeArguments() {
      return (EReference) classType_lf_classOrInterfaceTypeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassType_lfno_classOrInterfaceType() {
      return classType_lfno_classOrInterfaceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassType_lfno_classOrInterfaceType_Annotations() {
      return (EReference) classType_lfno_classOrInterfaceTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getclassType_lfno_classOrInterfaceType_Name() {
      return (EAttribute) classType_lfno_classOrInterfaceTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassType_lfno_classOrInterfaceType_TypeArguments() {
      return (EReference) classType_lfno_classOrInterfaceTypeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceType() {
      return interfaceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceType_lf_classOrInterfaceType() {
      return interfaceType_lf_classOrInterfaceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceType_lfno_classOrInterfaceType() {
      return interfaceType_lfno_classOrInterfaceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeVariable() {
      return typeVariableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getarrayType() {
      return arrayTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getarrayType_Type() {
      return (EReference) arrayTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getarrayType_Dims() {
      return (EReference) arrayTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getdims() {
      return dimsEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getdims_Dims() {
      return (EReference) dimsEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getdim() {
      return dimEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getdim_Annotations() {
      return (EReference) dimEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeParameter() {
      return typeParameterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference gettypeParameter_TypeParameterModifiers() {
      return (EReference) typeParameterEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute gettypeParameter_Name() {
      return (EAttribute) typeParameterEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference gettypeParameter_TypeBound() {
      return (EReference) typeParameterEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeParameterModifier() {
      return typeParameterModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeBound() {
      return typeBoundEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference gettypeBound_TypeVariable() {
      return (EReference) typeBoundEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference gettypeBound_ClassOrInterfaceType() {
      return (EReference) typeBoundEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference gettypeBound_AdditionalBound() {
      return (EReference) typeBoundEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getadditionalBound() {
      return additionalBoundEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeArguments() {
      return typeArgumentsEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeArgumentList() {
      return typeArgumentListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference gettypeArgumentList_TypeArguments() {
      return (EReference) typeArgumentListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeArgument() {
      return typeArgumentEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getwildcard() {
      return wildcardEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getwildcard_Annotations() {
      return (EReference) wildcardEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getwildcard_WildcardBounds() {
      return (EReference) wildcardEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getwildcardBounds() {
      return wildcardBoundsEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getcompilationUnit() {
      return compilationUnitEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getcompilationUnit_Package() {
      return (EReference) compilationUnitEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getcompilationUnit_Imports() {
      return (EReference) compilationUnitEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getcompilationUnit_Types() {
      return (EReference) compilationUnitEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getpackageDeclaration() {
      return packageDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getpackageDeclaration_Modifiers() {
      return (EReference) packageDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getpackageDeclaration_Name() {
      return (EAttribute) packageDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getpackageModifier() {
      return packageModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getimportDeclaration() {
      return importDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getimportDeclaration_Name() {
      return (EAttribute) importDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getsingleTypeImportDeclaration() {
      return singleTypeImportDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeImportOnDemandDeclaration() {
      return typeImportOnDemandDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getsingleStaticImportDeclaration() {
      return singleStaticImportDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getstaticImportOnDemandDeclaration() {
      return staticImportOnDemandDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeDeclaration() {
      return typeDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassDeclaration() {
      return classDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassDeclaration_Modifiers() {
      return (EReference) classDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getclassDeclaration_Name() {
      return (EAttribute) classDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassDeclaration_Superinterfaces() {
      return (EReference) classDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getnormalClassDeclaration() {
      return normalClassDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getnormalClassDeclaration_TypeParameters() {
      return (EReference) normalClassDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getnormalClassDeclaration_Superclass() {
      return (EReference) normalClassDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getnormalClassDeclaration_ClassBody() {
      return (EReference) normalClassDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassModifier() {
      return classModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJavaClassModifier() {
      return javaClassModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getJavaClassModifier_Modifier() {
      return (EAttribute) javaClassModifierEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeParameters() {
      return typeParametersEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass gettypeParameterList() {
      return typeParameterListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference gettypeParameterList_TypeParameters() {
      return (EReference) typeParameterListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getsuperclass() {
      return superclassEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getsuperinterfaces() {
      return superinterfacesEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceTypeList() {
      return interfaceTypeListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getinterfaceTypeList_InterfaceTypes() {
      return (EReference) interfaceTypeListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassBody() {
      return classBodyEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getclassBody_Declarations() {
      return (EReference) classBodyEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassBodyDeclaration() {
      return classBodyDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getclassMemberDeclaration() {
      return classMemberDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getfieldDeclaration() {
      return fieldDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getfieldDeclaration_FieldModifiers() {
      return (EReference) fieldDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getfieldDeclaration_UnannType() {
      return (EReference) fieldDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getfieldDeclaration_VariableDeclaratorList() {
      return (EReference) fieldDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getfieldModifier() {
      return fieldModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJavaFieldModifier() {
      return javaFieldModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getJavaFieldModifier_Modifier() {
      return (EAttribute) javaFieldModifierEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getvariableDeclaratorList() {
      return variableDeclaratorListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getvariableDeclaratorList_VariableDeclarators() {
      return (EReference) variableDeclaratorListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getvariableDeclarator() {
      return variableDeclaratorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getvariableDeclarator_Id() {
      return (EReference) variableDeclaratorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getvariableDeclarator_Initializer() {
      return (EReference) variableDeclaratorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getvariableDeclaratorId() {
      return variableDeclaratorIdEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getvariableDeclaratorId_Id() {
      return (EAttribute) variableDeclaratorIdEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getvariableDeclaratorId_Dims() {
      return (EReference) variableDeclaratorIdEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getvariableInitializer() {
      return variableInitializerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getunannType() {
      return unannTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getunannPrimitiveType() {
      return unannPrimitiveTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getunannPrimitiveType_Name() {
      return (EAttribute) unannPrimitiveTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getunannReferenceType() {
      return unannReferenceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getunannClassOrInterfaceType() {
      return unannClassOrInterfaceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getunannClassType() {
      return unannClassTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getunannClassType_ClassTypeSegment() {
      return (EReference) unannClassTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getClassTypeSegment() {
      return classTypeSegmentEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getClassTypeSegment_Name() {
      return (EAttribute) classTypeSegmentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getClassTypeSegment_TypeArguments() {
      return (EReference) classTypeSegmentEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getClassTypeSegmentWithAnnotations() {
      return classTypeSegmentWithAnnotationsEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getClassTypeSegmentWithAnnotations_Annotations() {
      return (EReference) classTypeSegmentWithAnnotationsEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getClassTypeSegmentWithAnnotations_Name() {
      return (EAttribute) classTypeSegmentWithAnnotationsEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getClassTypeSegmentWithAnnotations_TypeArguments() {
      return (EReference) classTypeSegmentWithAnnotationsEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getunannInterfaceType() {
      return unannInterfaceTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getunannTypeVariable() {
      return unannTypeVariableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getunannTypeVariable_Name() {
      return (EAttribute) unannTypeVariableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getunannArrayType() {
      return unannArrayTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getunannArrayType_Dims() {
      return (EReference) unannArrayTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getmethodDeclaration() {
      return methodDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodDeclaration_MethodModifiers() {
      return (EReference) methodDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodDeclaration_MethodHeader() {
      return (EReference) methodDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodDeclaration_MethodBody() {
      return (EReference) methodDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getmethodModifier() {
      return methodModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJavaMethodModifier() {
      return javaMethodModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getJavaMethodModifier_Modifier() {
      return (EAttribute) javaMethodModifierEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getmethodHeader() {
      return methodHeaderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodHeader_Result() {
      return (EReference) methodHeaderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodHeader_MethodDeclarator() {
      return (EReference) methodHeaderEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodHeader_Throws_() {
      return (EReference) methodHeaderEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodHeader_TypeParameters() {
      return (EReference) methodHeaderEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodHeader_Annotations() {
      return (EReference) methodHeaderEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getresult() {
      return resultEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getvoidType() {
      return voidTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getvoidType_Name() {
      return (EAttribute) voidTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getmethodDeclarator() {
      return methodDeclaratorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getmethodDeclarator_Name() {
      return (EAttribute) methodDeclaratorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodDeclarator_Parameters() {
      return (EReference) methodDeclaratorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getmethodDeclarator_Dims_() {
      return (EReference) methodDeclaratorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getformalParameterList() {
      return formalParameterListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getformalParameterList_Parameters() {
      return (EReference) formalParameterListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getformalParameters() {
      return formalParametersEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getformalParameters_Parameters() {
      return (EReference) formalParametersEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getformalParameter() {
      return formalParameterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getvariableModifier() {
      return variableModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJavaVariableModifier() {
      return javaVariableModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getJavaVariableModifier_Modifier() {
      return (EAttribute) javaVariableModifierEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getlastFormalParameter() {
      return lastFormalParameterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getlastFormalParameter_Modifiers() {
      return (EReference) lastFormalParameterEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getlastFormalParameter_Type() {
      return (EReference) lastFormalParameterEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getlastFormalParameter_Annotations() {
      return (EReference) lastFormalParameterEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getlastFormalParameter_Varargs() {
      return (EAttribute) lastFormalParameterEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getlastFormalParameter_Name() {
      return (EReference) lastFormalParameterEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getreceiverParameter() {
      return receiverParameterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getreceiverParameter_Annotations() {
      return (EReference) receiverParameterEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getreceiverParameter_Type() {
      return (EReference) receiverParameterEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getreceiverParameter_Qualifier() {
      return (EAttribute) receiverParameterEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getreceiverParameter_Name() {
      return (EAttribute) receiverParameterEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getthrows_() {
      return throws_EClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getexceptionTypeList() {
      return exceptionTypeListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getexceptionTypeList_ExceptionTypes() {
      return (EReference) exceptionTypeListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getexceptionType() {
      return exceptionTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getexceptionType_Annotations() {
      return (EReference) exceptionTypeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getexceptionType_Name() {
      return (EAttribute) exceptionTypeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getmethodBody() {
      return methodBodyEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinstanceInitializer() {
      return instanceInitializerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getstaticInitializer() {
      return staticInitializerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getconstructorDeclaration() {
      return constructorDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getconstructorDeclaration_ConstructorModifiers() {
      return (EReference) constructorDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getconstructorDeclaration_ConstructorDeclarator() {
      return (EReference) constructorDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getconstructorDeclaration_Throws_() {
      return (EReference) constructorDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getconstructorModifier() {
      return constructorModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJavaConstructorModifier() {
      return javaConstructorModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getJavaConstructorModifier_Modifier() {
      return (EAttribute) javaConstructorModifierEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getconstructorDeclarator() {
      return constructorDeclaratorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getconstructorDeclarator_TypeParameters() {
      return (EReference) constructorDeclaratorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getconstructorDeclarator_SimpleTypeName() {
      return (EAttribute) constructorDeclaratorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getconstructorDeclarator_FormalParameterList() {
      return (EReference) constructorDeclaratorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getenumDeclaration() {
      return enumDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getenumDeclaration_EnumBody() {
      return (EReference) enumDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getenumBody() {
      return enumBodyEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getenumBody_EnumConstantList() {
      return (EReference) enumBodyEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getenumBody_EnumBodyDeclarations() {
      return (EReference) enumBodyEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getenumConstantList() {
      return enumConstantListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getenumConstantList_EnumConstants() {
      return (EReference) enumConstantListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getenumConstant() {
      return enumConstantEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getenumConstant_EnumConstantModifiers() {
      return (EReference) enumConstantEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getenumConstant_Name() {
      return (EAttribute) enumConstantEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getenumConstant_ArgumentList() {
      return (EReference) enumConstantEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getenumConstant_ClassBody() {
      return (EReference) enumConstantEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getenumConstantModifier() {
      return enumConstantModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getenumBodyDeclarations() {
      return enumBodyDeclarationsEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getenumBodyDeclarations_ClassBodyDeclarations() {
      return (EReference) enumBodyDeclarationsEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceDeclaration() {
      return interfaceDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getinterfaceDeclaration_InterfaceModifiers() {
      return (EReference) interfaceDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getinterfaceDeclaration_Name() {
      return (EAttribute) interfaceDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getnormalInterfaceDeclaration() {
      return normalInterfaceDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getnormalInterfaceDeclaration_TypeParameters() {
      return (EReference) normalInterfaceDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getnormalInterfaceDeclaration_ExtendsInterfaces() {
      return (EReference) normalInterfaceDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getnormalInterfaceDeclaration_InterfaceBody() {
      return (EReference) normalInterfaceDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceModifier() {
      return interfaceModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJavaInterfaceModifier() {
      return javaInterfaceModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getJavaInterfaceModifier_Modifier() {
      return (EAttribute) javaInterfaceModifierEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getextendsInterfaces() {
      return extendsInterfacesEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceBody() {
      return interfaceBodyEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getinterfaceBody_InterfaceMemberDeclarations() {
      return (EReference) interfaceBodyEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceMemberDeclaration() {
      return interfaceMemberDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getconstantDeclaration() {
      return constantDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getconstantDeclaration_ConstantModifiers() {
      return (EReference) constantDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getconstantDeclaration_UnannType() {
      return (EReference) constantDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getconstantDeclaration_VariableDeclaratorList() {
      return (EReference) constantDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getconstantModifier() {
      return constantModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJavaConstantModifier() {
      return javaConstantModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getJavaConstantModifier_Modifier() {
      return (EAttribute) javaConstantModifierEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceMethodDeclaration() {
      return interfaceMethodDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getinterfaceMethodDeclaration_InterfaceMethodModifiers() {
      return (EReference) interfaceMethodDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getinterfaceMethodDeclaration_MethodHeader() {
      return (EReference) interfaceMethodDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getinterfaceMethodDeclaration_MethodBody() {
      return (EReference) interfaceMethodDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getinterfaceMethodModifier() {
      return interfaceMethodModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJavaInterfaceMethodModifiers() {
      return javaInterfaceMethodModifiersEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getJavaInterfaceMethodModifiers_Modifiers() {
      return (EAttribute) javaInterfaceMethodModifiersEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getannotationTypeDeclaration() {
      return annotationTypeDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getannotationTypeDeclaration_AnnotationTypeBody() {
      return (EReference) annotationTypeDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getannotationTypeBody() {
      return annotationTypeBodyEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getannotationTypeBody_AnnotationTypeMemberDeclarations() {
      return (EReference) annotationTypeBodyEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getannotationTypeMemberDeclaration() {
      return annotationTypeMemberDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getannotationTypeElementDeclaration() {
      return annotationTypeElementDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getannotationTypeElementDeclaration_AnnotationTypeElementModifiers() {
      return (EReference) annotationTypeElementDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getannotationTypeElementDeclaration_UnannType() {
      return (EReference) annotationTypeElementDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getannotationTypeElementDeclaration_Name() {
      return (EAttribute) annotationTypeElementDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getannotationTypeElementDeclaration_Dims() {
      return (EReference) annotationTypeElementDeclarationEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getannotationTypeElementDeclaration_DefaultValue() {
      return (EReference) annotationTypeElementDeclarationEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getannotationTypeElementModifier() {
      return annotationTypeElementModifierEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getJavaAnnotationTypeElementModifiers() {
      return javaAnnotationTypeElementModifiersEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getJavaAnnotationTypeElementModifiers_Modifier() {
      return (EAttribute) javaAnnotationTypeElementModifiersEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getdefaultValue() {
      return defaultValueEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getannotation() {
      return annotationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getannotation_TypeName() {
      return (EAttribute) annotationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getnormalAnnotation() {
      return normalAnnotationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getnormalAnnotation_ElementValuePairList() {
      return (EReference) normalAnnotationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getelementValuePairList() {
      return elementValuePairListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getelementValuePairList_ElementValuePairs() {
      return (EReference) elementValuePairListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getelementValuePair() {
      return elementValuePairEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getelementValuePair_Name() {
      return (EAttribute) elementValuePairEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getelementValuePair_ElementValue() {
      return (EReference) elementValuePairEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getelementValue() {
      return elementValueEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getelementValueArrayInitializer() {
      return elementValueArrayInitializerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getelementValueArrayInitializer_ElementValueList() {
      return (EReference) elementValueArrayInitializerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getelementValueList() {
      return elementValueListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getelementValueList_ElementValues() {
      return (EReference) elementValueListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getmarkerAnnotation() {
      return markerAnnotationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getsingleElementAnnotation() {
      return singleElementAnnotationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getsingleElementAnnotation_ElementValue() {
      return (EReference) singleElementAnnotationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getarrayInitializer() {
      return arrayInitializerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getarrayInitializer_VariableInitializerList() {
      return (EReference) arrayInitializerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getvariableInitializerList() {
      return variableInitializerListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getvariableInitializerList_VariableInitializer() {
      return (EReference) variableInitializerListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getblock() {
      return blockEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getblock_Dummy() {
      return (EAttribute) blockEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getblockStatements() {
      return blockStatementsEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getblockStatements_Dummy() {
      return (EAttribute) blockStatementsEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getargumentList() {
      return argumentListEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getargumentList_Dummy() {
      return (EAttribute) argumentListEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getprimary() {
      return primaryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getprimary_Dummy() {
      return (EAttribute) primaryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getexpression() {
      return expressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getexpression_Dummy() {
      return (EAttribute) expressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getconditionalExpression() {
      return conditionalExpressionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getconditionalExpression_Dummy() {
      return (EAttribute) conditionalExpressionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getEmptyTypeDeclaration() {
      return emptyTypeDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getEmptyClassMemberDeclaration() {
      return emptyClassMemberDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getClassModifiers() {
      return classModifiersEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getFieldModifiers() {
      return fieldModifiersEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getmethodModifiers() {
      return methodModifiersEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getVariableModifiers() {
      return variableModifiersEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getConstructorModifiers() {
      return constructorModifiersEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getInterfaceModifiers() {
      return interfaceModifiersEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getConstantModifiers() {
      return constantModifiersEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getInterfaceMethodModifiers() {
      return interfaceMethodModifiersEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getAnnotationTypeElementModifiers() {
      return annotationTypeElementModifiersEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public TypeFactory getTypeFactory() {
      return (TypeFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package. This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void createPackageContents() {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      modelEClass = createEClass(MODEL);
      createEReference(modelEClass, MODEL__TYPE);

      typeEClass = createEClass(TYPE);

      primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
      createEReference(primitiveTypeEClass, PRIMITIVE_TYPE__ANNOTATIONS);
      createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__TYPE_NAME);

      referenceTypeEClass = createEClass(REFERENCE_TYPE);

      classOrInterfaceTypeEClass = createEClass(CLASS_OR_INTERFACE_TYPE);
      createEReference(classOrInterfaceTypeEClass, CLASS_OR_INTERFACE_TYPE__CLASS_OR_INTERFACE_TYPE_SEGMENTS);

      classOrInterfaceTypeSegmentEClass = createEClass(CLASS_OR_INTERFACE_TYPE_SEGMENT);
      createEReference(classOrInterfaceTypeSegmentEClass, CLASS_OR_INTERFACE_TYPE_SEGMENT__ANNOTATIONS);
      createEAttribute(classOrInterfaceTypeSegmentEClass, CLASS_OR_INTERFACE_TYPE_SEGMENT__NAME);
      createEReference(classOrInterfaceTypeSegmentEClass, CLASS_OR_INTERFACE_TYPE_SEGMENT__TYPE_ARGUMENTS);

      classTypeEClass = createEClass(CLASS_TYPE);
      createEReference(classTypeEClass, CLASS_TYPE__TYPE_ARGUMENTS);
      createEReference(classTypeEClass, CLASS_TYPE__CLASS_OR_INTERFACE_TYPE);

      classType_lf_classOrInterfaceTypeEClass = createEClass(CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE);
      createEReference(classType_lf_classOrInterfaceTypeEClass, CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS);
      createEAttribute(classType_lf_classOrInterfaceTypeEClass, CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE__NAME);
      createEReference(classType_lf_classOrInterfaceTypeEClass, CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS);

      classType_lfno_classOrInterfaceTypeEClass = createEClass(CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE);
      createEReference(classType_lfno_classOrInterfaceTypeEClass, CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS);
      createEAttribute(classType_lfno_classOrInterfaceTypeEClass, CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__NAME);
      createEReference(classType_lfno_classOrInterfaceTypeEClass,
         CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS);

      interfaceTypeEClass = createEClass(INTERFACE_TYPE);

      interfaceType_lf_classOrInterfaceTypeEClass = createEClass(INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE);

      interfaceType_lfno_classOrInterfaceTypeEClass = createEClass(INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE);

      typeVariableEClass = createEClass(TYPE_VARIABLE);

      arrayTypeEClass = createEClass(ARRAY_TYPE);
      createEReference(arrayTypeEClass, ARRAY_TYPE__TYPE);
      createEReference(arrayTypeEClass, ARRAY_TYPE__DIMS);

      dimsEClass = createEClass(DIMS);
      createEReference(dimsEClass, DIMS__DIMS);

      dimEClass = createEClass(DIM);
      createEReference(dimEClass, DIM__ANNOTATIONS);

      typeParameterEClass = createEClass(TYPE_PARAMETER);
      createEReference(typeParameterEClass, TYPE_PARAMETER__TYPE_PARAMETER_MODIFIERS);
      createEAttribute(typeParameterEClass, TYPE_PARAMETER__NAME);
      createEReference(typeParameterEClass, TYPE_PARAMETER__TYPE_BOUND);

      typeParameterModifierEClass = createEClass(TYPE_PARAMETER_MODIFIER);

      typeBoundEClass = createEClass(TYPE_BOUND);
      createEReference(typeBoundEClass, TYPE_BOUND__TYPE_VARIABLE);
      createEReference(typeBoundEClass, TYPE_BOUND__CLASS_OR_INTERFACE_TYPE);
      createEReference(typeBoundEClass, TYPE_BOUND__ADDITIONAL_BOUND);

      additionalBoundEClass = createEClass(ADDITIONAL_BOUND);

      typeArgumentsEClass = createEClass(TYPE_ARGUMENTS);

      typeArgumentListEClass = createEClass(TYPE_ARGUMENT_LIST);
      createEReference(typeArgumentListEClass, TYPE_ARGUMENT_LIST__TYPE_ARGUMENTS);

      typeArgumentEClass = createEClass(TYPE_ARGUMENT);

      wildcardEClass = createEClass(WILDCARD);
      createEReference(wildcardEClass, WILDCARD__ANNOTATIONS);
      createEReference(wildcardEClass, WILDCARD__WILDCARD_BOUNDS);

      wildcardBoundsEClass = createEClass(WILDCARD_BOUNDS);

      compilationUnitEClass = createEClass(COMPILATION_UNIT);
      createEReference(compilationUnitEClass, COMPILATION_UNIT__PACKAGE);
      createEReference(compilationUnitEClass, COMPILATION_UNIT__IMPORTS);
      createEReference(compilationUnitEClass, COMPILATION_UNIT__TYPES);

      packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
      createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__MODIFIERS);
      createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);

      packageModifierEClass = createEClass(PACKAGE_MODIFIER);

      importDeclarationEClass = createEClass(IMPORT_DECLARATION);
      createEAttribute(importDeclarationEClass, IMPORT_DECLARATION__NAME);

      singleTypeImportDeclarationEClass = createEClass(SINGLE_TYPE_IMPORT_DECLARATION);

      typeImportOnDemandDeclarationEClass = createEClass(TYPE_IMPORT_ON_DEMAND_DECLARATION);

      singleStaticImportDeclarationEClass = createEClass(SINGLE_STATIC_IMPORT_DECLARATION);

      staticImportOnDemandDeclarationEClass = createEClass(STATIC_IMPORT_ON_DEMAND_DECLARATION);

      typeDeclarationEClass = createEClass(TYPE_DECLARATION);

      classDeclarationEClass = createEClass(CLASS_DECLARATION);
      createEReference(classDeclarationEClass, CLASS_DECLARATION__MODIFIERS);
      createEAttribute(classDeclarationEClass, CLASS_DECLARATION__NAME);
      createEReference(classDeclarationEClass, CLASS_DECLARATION__SUPERINTERFACES);

      normalClassDeclarationEClass = createEClass(NORMAL_CLASS_DECLARATION);
      createEReference(normalClassDeclarationEClass, NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS);
      createEReference(normalClassDeclarationEClass, NORMAL_CLASS_DECLARATION__SUPERCLASS);
      createEReference(normalClassDeclarationEClass, NORMAL_CLASS_DECLARATION__CLASS_BODY);

      classModifierEClass = createEClass(CLASS_MODIFIER);

      javaClassModifierEClass = createEClass(JAVA_CLASS_MODIFIER);
      createEAttribute(javaClassModifierEClass, JAVA_CLASS_MODIFIER__MODIFIER);

      typeParametersEClass = createEClass(TYPE_PARAMETERS);

      typeParameterListEClass = createEClass(TYPE_PARAMETER_LIST);
      createEReference(typeParameterListEClass, TYPE_PARAMETER_LIST__TYPE_PARAMETERS);

      superclassEClass = createEClass(SUPERCLASS);

      superinterfacesEClass = createEClass(SUPERINTERFACES);

      interfaceTypeListEClass = createEClass(INTERFACE_TYPE_LIST);
      createEReference(interfaceTypeListEClass, INTERFACE_TYPE_LIST__INTERFACE_TYPES);

      classBodyEClass = createEClass(CLASS_BODY);
      createEReference(classBodyEClass, CLASS_BODY__DECLARATIONS);

      classBodyDeclarationEClass = createEClass(CLASS_BODY_DECLARATION);

      classMemberDeclarationEClass = createEClass(CLASS_MEMBER_DECLARATION);

      fieldDeclarationEClass = createEClass(FIELD_DECLARATION);
      createEReference(fieldDeclarationEClass, FIELD_DECLARATION__FIELD_MODIFIERS);
      createEReference(fieldDeclarationEClass, FIELD_DECLARATION__UNANN_TYPE);
      createEReference(fieldDeclarationEClass, FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST);

      fieldModifierEClass = createEClass(FIELD_MODIFIER);

      javaFieldModifierEClass = createEClass(JAVA_FIELD_MODIFIER);
      createEAttribute(javaFieldModifierEClass, JAVA_FIELD_MODIFIER__MODIFIER);

      variableDeclaratorListEClass = createEClass(VARIABLE_DECLARATOR_LIST);
      createEReference(variableDeclaratorListEClass, VARIABLE_DECLARATOR_LIST__VARIABLE_DECLARATORS);

      variableDeclaratorEClass = createEClass(VARIABLE_DECLARATOR);
      createEReference(variableDeclaratorEClass, VARIABLE_DECLARATOR__ID);
      createEReference(variableDeclaratorEClass, VARIABLE_DECLARATOR__INITIALIZER);

      variableDeclaratorIdEClass = createEClass(VARIABLE_DECLARATOR_ID);
      createEAttribute(variableDeclaratorIdEClass, VARIABLE_DECLARATOR_ID__ID);
      createEReference(variableDeclaratorIdEClass, VARIABLE_DECLARATOR_ID__DIMS);

      variableInitializerEClass = createEClass(VARIABLE_INITIALIZER);

      unannTypeEClass = createEClass(UNANN_TYPE);

      unannPrimitiveTypeEClass = createEClass(UNANN_PRIMITIVE_TYPE);
      createEAttribute(unannPrimitiveTypeEClass, UNANN_PRIMITIVE_TYPE__NAME);

      unannReferenceTypeEClass = createEClass(UNANN_REFERENCE_TYPE);

      unannClassOrInterfaceTypeEClass = createEClass(UNANN_CLASS_OR_INTERFACE_TYPE);

      unannClassTypeEClass = createEClass(UNANN_CLASS_TYPE);
      createEReference(unannClassTypeEClass, UNANN_CLASS_TYPE__CLASS_TYPE_SEGMENT);

      classTypeSegmentEClass = createEClass(CLASS_TYPE_SEGMENT);
      createEAttribute(classTypeSegmentEClass, CLASS_TYPE_SEGMENT__NAME);
      createEReference(classTypeSegmentEClass, CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS);

      classTypeSegmentWithAnnotationsEClass = createEClass(CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS);
      createEReference(classTypeSegmentWithAnnotationsEClass, CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS__ANNOTATIONS);
      createEAttribute(classTypeSegmentWithAnnotationsEClass, CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS__NAME);
      createEReference(classTypeSegmentWithAnnotationsEClass, CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS__TYPE_ARGUMENTS);

      unannInterfaceTypeEClass = createEClass(UNANN_INTERFACE_TYPE);

      unannTypeVariableEClass = createEClass(UNANN_TYPE_VARIABLE);
      createEAttribute(unannTypeVariableEClass, UNANN_TYPE_VARIABLE__NAME);

      unannArrayTypeEClass = createEClass(UNANN_ARRAY_TYPE);
      createEReference(unannArrayTypeEClass, UNANN_ARRAY_TYPE__DIMS);

      methodDeclarationEClass = createEClass(METHOD_DECLARATION);
      createEReference(methodDeclarationEClass, METHOD_DECLARATION__METHOD_MODIFIERS);
      createEReference(methodDeclarationEClass, METHOD_DECLARATION__METHOD_HEADER);
      createEReference(methodDeclarationEClass, METHOD_DECLARATION__METHOD_BODY);

      methodModifierEClass = createEClass(METHOD_MODIFIER);

      javaMethodModifierEClass = createEClass(JAVA_METHOD_MODIFIER);
      createEAttribute(javaMethodModifierEClass, JAVA_METHOD_MODIFIER__MODIFIER);

      methodHeaderEClass = createEClass(METHOD_HEADER);
      createEReference(methodHeaderEClass, METHOD_HEADER__RESULT);
      createEReference(methodHeaderEClass, METHOD_HEADER__METHOD_DECLARATOR);
      createEReference(methodHeaderEClass, METHOD_HEADER__THROWS_);
      createEReference(methodHeaderEClass, METHOD_HEADER__TYPE_PARAMETERS);
      createEReference(methodHeaderEClass, METHOD_HEADER__ANNOTATIONS);

      resultEClass = createEClass(RESULT);

      voidTypeEClass = createEClass(VOID_TYPE);
      createEAttribute(voidTypeEClass, VOID_TYPE__NAME);

      methodDeclaratorEClass = createEClass(METHOD_DECLARATOR);
      createEAttribute(methodDeclaratorEClass, METHOD_DECLARATOR__NAME);
      createEReference(methodDeclaratorEClass, METHOD_DECLARATOR__PARAMETERS);
      createEReference(methodDeclaratorEClass, METHOD_DECLARATOR__DIMS_);

      formalParameterListEClass = createEClass(FORMAL_PARAMETER_LIST);
      createEReference(formalParameterListEClass, FORMAL_PARAMETER_LIST__PARAMETERS);

      formalParametersEClass = createEClass(FORMAL_PARAMETERS);
      createEReference(formalParametersEClass, FORMAL_PARAMETERS__PARAMETERS);

      formalParameterEClass = createEClass(FORMAL_PARAMETER);

      variableModifierEClass = createEClass(VARIABLE_MODIFIER);

      javaVariableModifierEClass = createEClass(JAVA_VARIABLE_MODIFIER);
      createEAttribute(javaVariableModifierEClass, JAVA_VARIABLE_MODIFIER__MODIFIER);

      lastFormalParameterEClass = createEClass(LAST_FORMAL_PARAMETER);
      createEReference(lastFormalParameterEClass, LAST_FORMAL_PARAMETER__MODIFIERS);
      createEReference(lastFormalParameterEClass, LAST_FORMAL_PARAMETER__TYPE);
      createEReference(lastFormalParameterEClass, LAST_FORMAL_PARAMETER__ANNOTATIONS);
      createEAttribute(lastFormalParameterEClass, LAST_FORMAL_PARAMETER__VARARGS);
      createEReference(lastFormalParameterEClass, LAST_FORMAL_PARAMETER__NAME);

      receiverParameterEClass = createEClass(RECEIVER_PARAMETER);
      createEReference(receiverParameterEClass, RECEIVER_PARAMETER__ANNOTATIONS);
      createEReference(receiverParameterEClass, RECEIVER_PARAMETER__TYPE);
      createEAttribute(receiverParameterEClass, RECEIVER_PARAMETER__QUALIFIER);
      createEAttribute(receiverParameterEClass, RECEIVER_PARAMETER__NAME);

      throws_EClass = createEClass(THROWS_);

      exceptionTypeListEClass = createEClass(EXCEPTION_TYPE_LIST);
      createEReference(exceptionTypeListEClass, EXCEPTION_TYPE_LIST__EXCEPTION_TYPES);

      exceptionTypeEClass = createEClass(EXCEPTION_TYPE);
      createEReference(exceptionTypeEClass, EXCEPTION_TYPE__ANNOTATIONS);
      createEAttribute(exceptionTypeEClass, EXCEPTION_TYPE__NAME);

      methodBodyEClass = createEClass(METHOD_BODY);

      instanceInitializerEClass = createEClass(INSTANCE_INITIALIZER);

      staticInitializerEClass = createEClass(STATIC_INITIALIZER);

      constructorDeclarationEClass = createEClass(CONSTRUCTOR_DECLARATION);
      createEReference(constructorDeclarationEClass, CONSTRUCTOR_DECLARATION__CONSTRUCTOR_MODIFIERS);
      createEReference(constructorDeclarationEClass, CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR);
      createEReference(constructorDeclarationEClass, CONSTRUCTOR_DECLARATION__THROWS_);

      constructorModifierEClass = createEClass(CONSTRUCTOR_MODIFIER);

      javaConstructorModifierEClass = createEClass(JAVA_CONSTRUCTOR_MODIFIER);
      createEAttribute(javaConstructorModifierEClass, JAVA_CONSTRUCTOR_MODIFIER__MODIFIER);

      constructorDeclaratorEClass = createEClass(CONSTRUCTOR_DECLARATOR);
      createEReference(constructorDeclaratorEClass, CONSTRUCTOR_DECLARATOR__TYPE_PARAMETERS);
      createEAttribute(constructorDeclaratorEClass, CONSTRUCTOR_DECLARATOR__SIMPLE_TYPE_NAME);
      createEReference(constructorDeclaratorEClass, CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST);

      enumDeclarationEClass = createEClass(ENUM_DECLARATION);
      createEReference(enumDeclarationEClass, ENUM_DECLARATION__ENUM_BODY);

      enumBodyEClass = createEClass(ENUM_BODY);
      createEReference(enumBodyEClass, ENUM_BODY__ENUM_CONSTANT_LIST);
      createEReference(enumBodyEClass, ENUM_BODY__ENUM_BODY_DECLARATIONS);

      enumConstantListEClass = createEClass(ENUM_CONSTANT_LIST);
      createEReference(enumConstantListEClass, ENUM_CONSTANT_LIST__ENUM_CONSTANTS);

      enumConstantEClass = createEClass(ENUM_CONSTANT);
      createEReference(enumConstantEClass, ENUM_CONSTANT__ENUM_CONSTANT_MODIFIERS);
      createEAttribute(enumConstantEClass, ENUM_CONSTANT__NAME);
      createEReference(enumConstantEClass, ENUM_CONSTANT__ARGUMENT_LIST);
      createEReference(enumConstantEClass, ENUM_CONSTANT__CLASS_BODY);

      enumConstantModifierEClass = createEClass(ENUM_CONSTANT_MODIFIER);

      enumBodyDeclarationsEClass = createEClass(ENUM_BODY_DECLARATIONS);
      createEReference(enumBodyDeclarationsEClass, ENUM_BODY_DECLARATIONS__CLASS_BODY_DECLARATIONS);

      interfaceDeclarationEClass = createEClass(INTERFACE_DECLARATION);
      createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__INTERFACE_MODIFIERS);
      createEAttribute(interfaceDeclarationEClass, INTERFACE_DECLARATION__NAME);

      normalInterfaceDeclarationEClass = createEClass(NORMAL_INTERFACE_DECLARATION);
      createEReference(normalInterfaceDeclarationEClass, NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS);
      createEReference(normalInterfaceDeclarationEClass, NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES);
      createEReference(normalInterfaceDeclarationEClass, NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY);

      interfaceModifierEClass = createEClass(INTERFACE_MODIFIER);

      javaInterfaceModifierEClass = createEClass(JAVA_INTERFACE_MODIFIER);
      createEAttribute(javaInterfaceModifierEClass, JAVA_INTERFACE_MODIFIER__MODIFIER);

      extendsInterfacesEClass = createEClass(EXTENDS_INTERFACES);

      interfaceBodyEClass = createEClass(INTERFACE_BODY);
      createEReference(interfaceBodyEClass, INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS);

      interfaceMemberDeclarationEClass = createEClass(INTERFACE_MEMBER_DECLARATION);

      constantDeclarationEClass = createEClass(CONSTANT_DECLARATION);
      createEReference(constantDeclarationEClass, CONSTANT_DECLARATION__CONSTANT_MODIFIERS);
      createEReference(constantDeclarationEClass, CONSTANT_DECLARATION__UNANN_TYPE);
      createEReference(constantDeclarationEClass, CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST);

      constantModifierEClass = createEClass(CONSTANT_MODIFIER);

      javaConstantModifierEClass = createEClass(JAVA_CONSTANT_MODIFIER);
      createEAttribute(javaConstantModifierEClass, JAVA_CONSTANT_MODIFIER__MODIFIER);

      interfaceMethodDeclarationEClass = createEClass(INTERFACE_METHOD_DECLARATION);
      createEReference(interfaceMethodDeclarationEClass, INTERFACE_METHOD_DECLARATION__INTERFACE_METHOD_MODIFIERS);
      createEReference(interfaceMethodDeclarationEClass, INTERFACE_METHOD_DECLARATION__METHOD_HEADER);
      createEReference(interfaceMethodDeclarationEClass, INTERFACE_METHOD_DECLARATION__METHOD_BODY);

      interfaceMethodModifierEClass = createEClass(INTERFACE_METHOD_MODIFIER);

      javaInterfaceMethodModifiersEClass = createEClass(JAVA_INTERFACE_METHOD_MODIFIERS);
      createEAttribute(javaInterfaceMethodModifiersEClass, JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS);

      annotationTypeDeclarationEClass = createEClass(ANNOTATION_TYPE_DECLARATION);
      createEReference(annotationTypeDeclarationEClass, ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY);

      annotationTypeBodyEClass = createEClass(ANNOTATION_TYPE_BODY);
      createEReference(annotationTypeBodyEClass, ANNOTATION_TYPE_BODY__ANNOTATION_TYPE_MEMBER_DECLARATIONS);

      annotationTypeMemberDeclarationEClass = createEClass(ANNOTATION_TYPE_MEMBER_DECLARATION);

      annotationTypeElementDeclarationEClass = createEClass(ANNOTATION_TYPE_ELEMENT_DECLARATION);
      createEReference(annotationTypeElementDeclarationEClass,
         ANNOTATION_TYPE_ELEMENT_DECLARATION__ANNOTATION_TYPE_ELEMENT_MODIFIERS);
      createEReference(annotationTypeElementDeclarationEClass, ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE);
      createEAttribute(annotationTypeElementDeclarationEClass, ANNOTATION_TYPE_ELEMENT_DECLARATION__NAME);
      createEReference(annotationTypeElementDeclarationEClass, ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS);
      createEReference(annotationTypeElementDeclarationEClass, ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE);

      annotationTypeElementModifierEClass = createEClass(ANNOTATION_TYPE_ELEMENT_MODIFIER);

      javaAnnotationTypeElementModifiersEClass = createEClass(JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS);
      createEAttribute(javaAnnotationTypeElementModifiersEClass, JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS__MODIFIER);

      defaultValueEClass = createEClass(DEFAULT_VALUE);

      annotationEClass = createEClass(ANNOTATION);
      createEAttribute(annotationEClass, ANNOTATION__TYPE_NAME);

      normalAnnotationEClass = createEClass(NORMAL_ANNOTATION);
      createEReference(normalAnnotationEClass, NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST);

      elementValuePairListEClass = createEClass(ELEMENT_VALUE_PAIR_LIST);
      createEReference(elementValuePairListEClass, ELEMENT_VALUE_PAIR_LIST__ELEMENT_VALUE_PAIRS);

      elementValuePairEClass = createEClass(ELEMENT_VALUE_PAIR);
      createEAttribute(elementValuePairEClass, ELEMENT_VALUE_PAIR__NAME);
      createEReference(elementValuePairEClass, ELEMENT_VALUE_PAIR__ELEMENT_VALUE);

      elementValueEClass = createEClass(ELEMENT_VALUE);

      elementValueArrayInitializerEClass = createEClass(ELEMENT_VALUE_ARRAY_INITIALIZER);
      createEReference(elementValueArrayInitializerEClass, ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST);

      elementValueListEClass = createEClass(ELEMENT_VALUE_LIST);
      createEReference(elementValueListEClass, ELEMENT_VALUE_LIST__ELEMENT_VALUES);

      markerAnnotationEClass = createEClass(MARKER_ANNOTATION);

      singleElementAnnotationEClass = createEClass(SINGLE_ELEMENT_ANNOTATION);
      createEReference(singleElementAnnotationEClass, SINGLE_ELEMENT_ANNOTATION__ELEMENT_VALUE);

      arrayInitializerEClass = createEClass(ARRAY_INITIALIZER);
      createEReference(arrayInitializerEClass, ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST);

      variableInitializerListEClass = createEClass(VARIABLE_INITIALIZER_LIST);
      createEReference(variableInitializerListEClass, VARIABLE_INITIALIZER_LIST__VARIABLE_INITIALIZER);

      blockEClass = createEClass(BLOCK);
      createEAttribute(blockEClass, BLOCK__DUMMY);

      blockStatementsEClass = createEClass(BLOCK_STATEMENTS);
      createEAttribute(blockStatementsEClass, BLOCK_STATEMENTS__DUMMY);

      argumentListEClass = createEClass(ARGUMENT_LIST);
      createEAttribute(argumentListEClass, ARGUMENT_LIST__DUMMY);

      primaryEClass = createEClass(PRIMARY);
      createEAttribute(primaryEClass, PRIMARY__DUMMY);

      expressionEClass = createEClass(EXPRESSION);
      createEAttribute(expressionEClass, EXPRESSION__DUMMY);

      conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);
      createEAttribute(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__DUMMY);

      emptyTypeDeclarationEClass = createEClass(EMPTY_TYPE_DECLARATION);

      emptyClassMemberDeclarationEClass = createEClass(EMPTY_CLASS_MEMBER_DECLARATION);

      // Create enums
      classModifiersEEnum = createEEnum(CLASS_MODIFIERS);
      fieldModifiersEEnum = createEEnum(FIELD_MODIFIERS);
      methodModifiersEEnum = createEEnum(METHOD_MODIFIERS);
      variableModifiersEEnum = createEEnum(VARIABLE_MODIFIERS);
      constructorModifiersEEnum = createEEnum(CONSTRUCTOR_MODIFIERS);
      interfaceModifiersEEnum = createEEnum(INTERFACE_MODIFIERS);
      constantModifiersEEnum = createEEnum(CONSTANT_MODIFIERS);
      interfaceMethodModifiersEEnum = createEEnum(INTERFACE_METHOD_MODIFIERS);
      annotationTypeElementModifiersEEnum = createEEnum(ANNOTATION_TYPE_ELEMENT_MODIFIERS);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model. This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void initializePackageContents() {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      LiteralsPackage theLiteralsPackage = (LiteralsPackage) EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      primitiveTypeEClass.getESuperTypes().add(this.gettype());
      referenceTypeEClass.getESuperTypes().add(this.gettype());
      referenceTypeEClass.getESuperTypes().add(this.gettypeArgument());
      referenceTypeEClass.getESuperTypes().add(this.getwildcardBounds());
      classOrInterfaceTypeEClass.getESuperTypes().add(this.getreferenceType());
      classTypeEClass.getESuperTypes().add(this.getinterfaceType());
      classTypeEClass.getESuperTypes().add(this.getsuperclass());
      classTypeEClass.getESuperTypes().add(this.getexceptionType());
      classType_lf_classOrInterfaceTypeEClass.getESuperTypes().add(this.getinterfaceType_lf_classOrInterfaceType());
      classType_lfno_classOrInterfaceTypeEClass.getESuperTypes().add(this.getinterfaceType_lfno_classOrInterfaceType());
      interfaceTypeEClass.getESuperTypes().add(this.getadditionalBound());
      typeVariableEClass.getESuperTypes().add(this.getreferenceType());
      typeVariableEClass.getESuperTypes().add(this.getexceptionType());
      arrayTypeEClass.getESuperTypes().add(this.getreferenceType());
      typeArgumentListEClass.getESuperTypes().add(this.gettypeArguments());
      wildcardEClass.getESuperTypes().add(this.gettypeArgument());
      singleTypeImportDeclarationEClass.getESuperTypes().add(this.getimportDeclaration());
      typeImportOnDemandDeclarationEClass.getESuperTypes().add(this.getimportDeclaration());
      singleStaticImportDeclarationEClass.getESuperTypes().add(this.getimportDeclaration());
      staticImportOnDemandDeclarationEClass.getESuperTypes().add(this.getimportDeclaration());
      classDeclarationEClass.getESuperTypes().add(this.gettypeDeclaration());
      classDeclarationEClass.getESuperTypes().add(this.getclassMemberDeclaration());
      classDeclarationEClass.getESuperTypes().add(this.getinterfaceMemberDeclaration());
      classDeclarationEClass.getESuperTypes().add(this.getannotationTypeMemberDeclaration());
      normalClassDeclarationEClass.getESuperTypes().add(this.getclassDeclaration());
      javaClassModifierEClass.getESuperTypes().add(this.getclassModifier());
      typeParameterListEClass.getESuperTypes().add(this.gettypeParameters());
      interfaceTypeListEClass.getESuperTypes().add(this.getsuperinterfaces());
      interfaceTypeListEClass.getESuperTypes().add(this.getextendsInterfaces());
      classMemberDeclarationEClass.getESuperTypes().add(this.getclassBodyDeclaration());
      fieldDeclarationEClass.getESuperTypes().add(this.getclassMemberDeclaration());
      javaFieldModifierEClass.getESuperTypes().add(this.getfieldModifier());
      unannTypeEClass.getESuperTypes().add(this.getresult());
      unannPrimitiveTypeEClass.getESuperTypes().add(this.getunannType());
      unannPrimitiveTypeEClass.getESuperTypes().add(this.getunannArrayType());
      unannReferenceTypeEClass.getESuperTypes().add(this.getunannType());
      unannClassOrInterfaceTypeEClass.getESuperTypes().add(this.getunannReferenceType());
      unannClassOrInterfaceTypeEClass.getESuperTypes().add(this.getunannArrayType());
      unannClassTypeEClass.getESuperTypes().add(this.getunannClassOrInterfaceType());
      unannClassTypeEClass.getESuperTypes().add(this.getunannInterfaceType());
      unannInterfaceTypeEClass.getESuperTypes().add(this.getunannClassOrInterfaceType());
      unannTypeVariableEClass.getESuperTypes().add(this.getunannReferenceType());
      unannTypeVariableEClass.getESuperTypes().add(this.getunannArrayType());
      unannArrayTypeEClass.getESuperTypes().add(this.getunannReferenceType());
      methodDeclarationEClass.getESuperTypes().add(this.getclassMemberDeclaration());
      javaMethodModifierEClass.getESuperTypes().add(this.getmethodModifier());
      voidTypeEClass.getESuperTypes().add(this.getresult());
      formalParameterEClass.getESuperTypes().add(this.getlastFormalParameter());
      javaVariableModifierEClass.getESuperTypes().add(this.getvariableModifier());
      exceptionTypeListEClass.getESuperTypes().add(this.getthrows_());
      instanceInitializerEClass.getESuperTypes().add(this.getclassBodyDeclaration());
      staticInitializerEClass.getESuperTypes().add(this.getclassBodyDeclaration());
      constructorDeclarationEClass.getESuperTypes().add(this.getclassBodyDeclaration());
      javaConstructorModifierEClass.getESuperTypes().add(this.getconstructorModifier());
      enumDeclarationEClass.getESuperTypes().add(this.getclassDeclaration());
      interfaceDeclarationEClass.getESuperTypes().add(this.gettypeDeclaration());
      interfaceDeclarationEClass.getESuperTypes().add(this.getclassMemberDeclaration());
      interfaceDeclarationEClass.getESuperTypes().add(this.getinterfaceMemberDeclaration());
      interfaceDeclarationEClass.getESuperTypes().add(this.getannotationTypeMemberDeclaration());
      normalInterfaceDeclarationEClass.getESuperTypes().add(this.getinterfaceDeclaration());
      javaInterfaceModifierEClass.getESuperTypes().add(this.getinterfaceModifier());
      constantDeclarationEClass.getESuperTypes().add(this.getinterfaceMemberDeclaration());
      constantDeclarationEClass.getESuperTypes().add(this.getannotationTypeMemberDeclaration());
      javaConstantModifierEClass.getESuperTypes().add(this.getconstantModifier());
      interfaceMethodDeclarationEClass.getESuperTypes().add(this.getinterfaceMemberDeclaration());
      javaInterfaceMethodModifiersEClass.getESuperTypes().add(this.getinterfaceMethodModifier());
      annotationTypeDeclarationEClass.getESuperTypes().add(this.getinterfaceDeclaration());
      annotationTypeElementDeclarationEClass.getESuperTypes().add(this.getannotationTypeMemberDeclaration());
      javaAnnotationTypeElementModifiersEClass.getESuperTypes().add(this.getannotationTypeElementModifier());
      annotationEClass.getESuperTypes().add(this.gettypeParameterModifier());
      annotationEClass.getESuperTypes().add(this.getpackageModifier());
      annotationEClass.getESuperTypes().add(this.getclassModifier());
      annotationEClass.getESuperTypes().add(this.getfieldModifier());
      annotationEClass.getESuperTypes().add(this.getmethodModifier());
      annotationEClass.getESuperTypes().add(this.getvariableModifier());
      annotationEClass.getESuperTypes().add(this.getconstructorModifier());
      annotationEClass.getESuperTypes().add(this.getenumConstantModifier());
      annotationEClass.getESuperTypes().add(this.getinterfaceModifier());
      annotationEClass.getESuperTypes().add(this.getconstantModifier());
      annotationEClass.getESuperTypes().add(this.getinterfaceMethodModifier());
      annotationEClass.getESuperTypes().add(this.getannotationTypeElementModifier());
      annotationEClass.getESuperTypes().add(this.getelementValue());
      normalAnnotationEClass.getESuperTypes().add(this.getannotation());
      elementValueEClass.getESuperTypes().add(this.getdefaultValue());
      elementValueArrayInitializerEClass.getESuperTypes().add(this.getelementValue());
      markerAnnotationEClass.getESuperTypes().add(this.getannotation());
      singleElementAnnotationEClass.getESuperTypes().add(this.getannotation());
      arrayInitializerEClass.getESuperTypes().add(this.getvariableInitializer());
      blockEClass.getESuperTypes().add(this.getmethodBody());
      blockEClass.getESuperTypes().add(this.getinstanceInitializer());
      blockEClass.getESuperTypes().add(this.getstaticInitializer());
      expressionEClass.getESuperTypes().add(this.getvariableInitializer());
      conditionalExpressionEClass.getESuperTypes().add(this.getelementValue());
      emptyTypeDeclarationEClass.getESuperTypes().add(this.gettypeDeclaration());
      emptyClassMemberDeclarationEClass.getESuperTypes().add(this.getclassMemberDeclaration());

      // Initialize classes and features; add operations and parameters
      initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getModel_Type(), theLiteralsPackage.getliteral(), null, "type", null, 0, 1, Model.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(typeEClass, type.class, "type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(primitiveTypeEClass, primitiveType.class, "primitiveType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getprimitiveType_Annotations(), this.getannotation(), null, "annotations", null, 0, -1,
         primitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getprimitiveType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1,
         primitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(referenceTypeEClass, referenceType.class, "referenceType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(classOrInterfaceTypeEClass, classOrInterfaceType.class, "classOrInterfaceType", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getclassOrInterfaceType_ClassOrInterfaceTypeSegments(), this.getclassOrInterfaceTypeSegment(),
         null, "classOrInterfaceTypeSegments", null, 0, -1, classOrInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(classOrInterfaceTypeSegmentEClass, classOrInterfaceTypeSegment.class, "classOrInterfaceTypeSegment",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getclassOrInterfaceTypeSegment_Annotations(), this.getannotation(), null, "annotations", null, 0,
         -1, classOrInterfaceTypeSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getclassOrInterfaceTypeSegment_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         classOrInterfaceTypeSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getclassOrInterfaceTypeSegment_TypeArguments(), this.gettypeArguments(), null, "typeArguments",
         null, 0, 1, classOrInterfaceTypeSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(classTypeEClass, classType.class, "classType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getclassType_TypeArguments(), this.gettypeArguments(), null, "typeArguments", null, 0, 1,
         classType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getclassType_ClassOrInterfaceType(), this.getclassOrInterfaceType(), null, "classOrInterfaceType",
         null, 0, 1, classType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(classType_lf_classOrInterfaceTypeEClass, classType_lf_classOrInterfaceType.class,
         "classType_lf_classOrInterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getclassType_lf_classOrInterfaceType_Annotations(), this.getannotation(), null, "annotations",
         null, 0, -1, classType_lf_classOrInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getclassType_lf_classOrInterfaceType_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         classType_lf_classOrInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getclassType_lf_classOrInterfaceType_TypeArguments(), this.gettypeArguments(), null,
         "typeArguments", null, 0, 1, classType_lf_classOrInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(classType_lfno_classOrInterfaceTypeEClass, classType_lfno_classOrInterfaceType.class,
         "classType_lfno_classOrInterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getclassType_lfno_classOrInterfaceType_Annotations(), this.getannotation(), null, "annotations",
         null, 0, -1, classType_lfno_classOrInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getclassType_lfno_classOrInterfaceType_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         classType_lfno_classOrInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getclassType_lfno_classOrInterfaceType_TypeArguments(), this.gettypeArguments(), null,
         "typeArguments", null, 0, 1, classType_lfno_classOrInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(interfaceTypeEClass, interfaceType.class, "interfaceType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(interfaceType_lf_classOrInterfaceTypeEClass, interfaceType_lf_classOrInterfaceType.class,
         "interfaceType_lf_classOrInterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(interfaceType_lfno_classOrInterfaceTypeEClass, interfaceType_lfno_classOrInterfaceType.class,
         "interfaceType_lfno_classOrInterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(typeVariableEClass, typeVariable.class, "typeVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(arrayTypeEClass, arrayType.class, "arrayType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getarrayType_Type(), this.gettype(), null, "type", null, 0, 1, arrayType.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEReference(getarrayType_Dims(), this.getdims(), null, "dims", null, 0, 1, arrayType.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);

      initEClass(dimsEClass, dims.class, "dims", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getdims_Dims(), this.getdim(), null, "dims", null, 0, -1, dims.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(dimEClass, dim.class, "dim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getdim_Annotations(), this.getannotation(), null, "annotations", null, 0, -1, dim.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(typeParameterEClass, typeParameter.class, "typeParameter", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(gettypeParameter_TypeParameterModifiers(), this.gettypeParameterModifier(), null,
         "typeParameterModifiers", null, 0, -1, typeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(gettypeParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, typeParameter.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(gettypeParameter_TypeBound(), this.gettypeBound(), null, "typeBound", null, 0, 1,
         typeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(typeParameterModifierEClass, typeParameterModifier.class, "typeParameterModifier", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(typeBoundEClass, typeBound.class, "typeBound", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(gettypeBound_TypeVariable(), this.gettypeVariable(), null, "typeVariable", null, 0, 1,
         typeBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(gettypeBound_ClassOrInterfaceType(), this.getclassOrInterfaceType(), null, "classOrInterfaceType",
         null, 0, 1, typeBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(gettypeBound_AdditionalBound(), this.getadditionalBound(), null, "additionalBound", null, 0, -1,
         typeBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(additionalBoundEClass, additionalBound.class, "additionalBound", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(typeArgumentsEClass, typeArguments.class, "typeArguments", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(typeArgumentListEClass, typeArgumentList.class, "typeArgumentList", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(gettypeArgumentList_TypeArguments(), this.gettypeArgument(), null, "typeArguments", null, 0, -1,
         typeArgumentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(typeArgumentEClass, typeArgument.class, "typeArgument", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(wildcardEClass, wildcard.class, "wildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getwildcard_Annotations(), this.getannotation(), null, "annotations", null, 0, -1, wildcard.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getwildcard_WildcardBounds(), this.getwildcardBounds(), null, "wildcardBounds", null, 0, 1,
         wildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(wildcardBoundsEClass, wildcardBounds.class, "wildcardBounds", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(compilationUnitEClass, compilationUnit.class, "compilationUnit", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getcompilationUnit_Package(), this.getpackageDeclaration(), null, "package", null, 0, 1,
         compilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getcompilationUnit_Imports(), this.getimportDeclaration(), null, "imports", null, 0, -1,
         compilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getcompilationUnit_Types(), this.gettypeDeclaration(), null, "types", null, 0, -1,
         compilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(packageDeclarationEClass, packageDeclaration.class, "packageDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getpackageDeclaration_Modifiers(), this.getpackageModifier(), null, "modifiers", null, 0, -1,
         packageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getpackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         packageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(packageModifierEClass, packageModifier.class, "packageModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(importDeclarationEClass, importDeclaration.class, "importDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getimportDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         importDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(singleTypeImportDeclarationEClass, singleTypeImportDeclaration.class, "singleTypeImportDeclaration",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(typeImportOnDemandDeclarationEClass, typeImportOnDemandDeclaration.class,
         "typeImportOnDemandDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(singleStaticImportDeclarationEClass, singleStaticImportDeclaration.class,
         "singleStaticImportDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(staticImportOnDemandDeclarationEClass, staticImportOnDemandDeclaration.class,
         "staticImportOnDemandDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(typeDeclarationEClass, typeDeclaration.class, "typeDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(classDeclarationEClass, classDeclaration.class, "classDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getclassDeclaration_Modifiers(), this.getclassModifier(), null, "modifiers", null, 0, -1,
         classDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getclassDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, classDeclaration.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getclassDeclaration_Superinterfaces(), this.getsuperinterfaces(), null, "superinterfaces", null,
         0, 1, classDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(normalClassDeclarationEClass, normalClassDeclaration.class, "normalClassDeclaration", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getnormalClassDeclaration_TypeParameters(), this.gettypeParameters(), null, "typeParameters",
         null, 0, 1, normalClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getnormalClassDeclaration_Superclass(), this.getsuperclass(), null, "superclass", null, 0, 1,
         normalClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getnormalClassDeclaration_ClassBody(), this.getclassBody(), null, "classBody", null, 0, 1,
         normalClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(classModifierEClass, classModifier.class, "classModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(javaClassModifierEClass, JavaClassModifier.class, "JavaClassModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getJavaClassModifier_Modifier(), this.getClassModifiers(), "modifier", null, 0, 1,
         JavaClassModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(typeParametersEClass, typeParameters.class, "typeParameters", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(typeParameterListEClass, typeParameterList.class, "typeParameterList", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(gettypeParameterList_TypeParameters(), this.gettypeParameter(), null, "typeParameters", null, 0,
         -1, typeParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(superclassEClass, superclass.class, "superclass", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(superinterfacesEClass, superinterfaces.class, "superinterfaces", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(interfaceTypeListEClass, interfaceTypeList.class, "interfaceTypeList", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getinterfaceTypeList_InterfaceTypes(), this.getinterfaceType(), null, "interfaceTypes", null, 0,
         -1, interfaceTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(classBodyEClass, classBody.class, "classBody", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getclassBody_Declarations(), this.getclassBodyDeclaration(), null, "declarations", null, 0, -1,
         classBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(classBodyDeclarationEClass, classBodyDeclaration.class, "classBodyDeclaration", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(classMemberDeclarationEClass, classMemberDeclaration.class, "classMemberDeclaration", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(fieldDeclarationEClass, fieldDeclaration.class, "fieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getfieldDeclaration_FieldModifiers(), this.getfieldModifier(), null, "fieldModifiers", null, 0,
         -1, fieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getfieldDeclaration_UnannType(), this.getunannType(), null, "unannType", null, 0, 1,
         fieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getfieldDeclaration_VariableDeclaratorList(), this.getvariableDeclaratorList(), null,
         "variableDeclaratorList", null, 0, 1, fieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(fieldModifierEClass, fieldModifier.class, "fieldModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(javaFieldModifierEClass, JavaFieldModifier.class, "JavaFieldModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getJavaFieldModifier_Modifier(), this.getFieldModifiers(), "modifier", null, 0, 1,
         JavaFieldModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(variableDeclaratorListEClass, variableDeclaratorList.class, "variableDeclaratorList", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getvariableDeclaratorList_VariableDeclarators(), this.getvariableDeclarator(), null,
         "variableDeclarators", null, 0, -1, variableDeclaratorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(variableDeclaratorEClass, variableDeclarator.class, "variableDeclarator", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getvariableDeclarator_Id(), this.getvariableDeclaratorId(), null, "id", null, 0, 1,
         variableDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getvariableDeclarator_Initializer(), this.getvariableInitializer(), null, "initializer", null, 0,
         1, variableDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(variableDeclaratorIdEClass, variableDeclaratorId.class, "variableDeclaratorId", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getvariableDeclaratorId_Id(), ecorePackage.getEString(), "id", null, 0, 1,
         variableDeclaratorId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getvariableDeclaratorId_Dims(), this.getdims(), null, "dims", null, 0, 1,
         variableDeclaratorId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(variableInitializerEClass, variableInitializer.class, "variableInitializer", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(unannTypeEClass, unannType.class, "unannType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(unannPrimitiveTypeEClass, unannPrimitiveType.class, "unannPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getunannPrimitiveType_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         unannPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(unannReferenceTypeEClass, unannReferenceType.class, "unannReferenceType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(unannClassOrInterfaceTypeEClass, unannClassOrInterfaceType.class, "unannClassOrInterfaceType",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(unannClassTypeEClass, unannClassType.class, "unannClassType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getunannClassType_ClassTypeSegment(), ecorePackage.getEObject(), null, "classTypeSegment", null,
         0, -1, unannClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(classTypeSegmentEClass, ClassTypeSegment.class, "ClassTypeSegment", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getClassTypeSegment_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassTypeSegment.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getClassTypeSegment_TypeArguments(), this.gettypeArguments(), null, "typeArguments", null, 0, 1,
         ClassTypeSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(classTypeSegmentWithAnnotationsEClass, ClassTypeSegmentWithAnnotations.class,
         "ClassTypeSegmentWithAnnotations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getClassTypeSegmentWithAnnotations_Annotations(), this.getannotation(), null, "annotations", null,
         0, -1, ClassTypeSegmentWithAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getClassTypeSegmentWithAnnotations_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         ClassTypeSegmentWithAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getClassTypeSegmentWithAnnotations_TypeArguments(), this.gettypeArguments(), null,
         "typeArguments", null, 0, 1, ClassTypeSegmentWithAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(unannInterfaceTypeEClass, unannInterfaceType.class, "unannInterfaceType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(unannTypeVariableEClass, unannTypeVariable.class, "unannTypeVariable", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getunannTypeVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         unannTypeVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(unannArrayTypeEClass, unannArrayType.class, "unannArrayType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getunannArrayType_Dims(), this.getdims(), null, "dims", null, 0, 1, unannArrayType.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(methodDeclarationEClass, methodDeclaration.class, "methodDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getmethodDeclaration_MethodModifiers(), this.getmethodModifier(), null, "methodModifiers", null,
         0, -1, methodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getmethodDeclaration_MethodHeader(), this.getmethodHeader(), null, "methodHeader", null, 0, 1,
         methodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getmethodDeclaration_MethodBody(), this.getmethodBody(), null, "methodBody", null, 0, 1,
         methodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(methodModifierEClass, methodModifier.class, "methodModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(javaMethodModifierEClass, JavaMethodModifier.class, "JavaMethodModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getJavaMethodModifier_Modifier(), this.getmethodModifiers(), "modifier", null, 0, 1,
         JavaMethodModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(methodHeaderEClass, methodHeader.class, "methodHeader", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getmethodHeader_Result(), this.getresult(), null, "result", null, 0, 1, methodHeader.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getmethodHeader_MethodDeclarator(), this.getmethodDeclarator(), null, "methodDeclarator", null, 0,
         1, methodHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getmethodHeader_Throws_(), this.getthrows_(), null, "throws_", null, 0, 1, methodHeader.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getmethodHeader_TypeParameters(), this.gettypeParameters(), null, "typeParameters", null, 0, 1,
         methodHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getmethodHeader_Annotations(), this.getannotation(), null, "annotations", null, 0, -1,
         methodHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(resultEClass, result.class, "result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(voidTypeEClass, voidType.class, "voidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getvoidType_Name(), ecorePackage.getEString(), "name", null, 0, 1, voidType.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(methodDeclaratorEClass, methodDeclarator.class, "methodDeclarator", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getmethodDeclarator_Name(), ecorePackage.getEString(), "name", null, 0, 1, methodDeclarator.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getmethodDeclarator_Parameters(), this.getformalParameterList(), null, "parameters", null, 0, -1,
         methodDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getmethodDeclarator_Dims_(), this.getdims(), null, "dims_", null, 0, 1, methodDeclarator.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(formalParameterListEClass, formalParameterList.class, "formalParameterList", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getformalParameterList_Parameters(), ecorePackage.getEObject(), null, "parameters", null, 0, -1,
         formalParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(formalParametersEClass, formalParameters.class, "formalParameters", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getformalParameters_Parameters(), ecorePackage.getEObject(), null, "parameters", null, 0, -1,
         formalParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(formalParameterEClass, formalParameter.class, "formalParameter", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(variableModifierEClass, variableModifier.class, "variableModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(javaVariableModifierEClass, JavaVariableModifier.class, "JavaVariableModifier", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getJavaVariableModifier_Modifier(), this.getVariableModifiers(), "modifier", null, 0, 1,
         JavaVariableModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(lastFormalParameterEClass, lastFormalParameter.class, "lastFormalParameter", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getlastFormalParameter_Modifiers(), this.getvariableModifier(), null, "modifiers", null, 0, -1,
         lastFormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getlastFormalParameter_Type(), this.getunannType(), null, "type", null, 0, 1,
         lastFormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getlastFormalParameter_Annotations(), this.getannotation(), null, "annotations", null, 0, -1,
         lastFormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getlastFormalParameter_Varargs(), ecorePackage.getEBoolean(), "varargs", null, 0, 1,
         lastFormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getlastFormalParameter_Name(), this.getvariableDeclaratorId(), null, "name", null, 0, 1,
         lastFormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(receiverParameterEClass, receiverParameter.class, "receiverParameter", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getreceiverParameter_Annotations(), this.getannotation(), null, "annotations", null, 0, -1,
         receiverParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getreceiverParameter_Type(), this.getunannType(), null, "type", null, 0, 1,
         receiverParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getreceiverParameter_Qualifier(), ecorePackage.getEString(), "qualifier", null, 0, 1,
         receiverParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getreceiverParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         receiverParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(throws_EClass, throws_.class, "throws_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(exceptionTypeListEClass, exceptionTypeList.class, "exceptionTypeList", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getexceptionTypeList_ExceptionTypes(), this.getexceptionType(), null, "exceptionTypes", null, 0,
         -1, exceptionTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(exceptionTypeEClass, exceptionType.class, "exceptionType", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getexceptionType_Annotations(), this.getannotation(), null, "annotations", null, 0, -1,
         exceptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getexceptionType_Name(), ecorePackage.getEString(), "name", null, 0, 1, exceptionType.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(methodBodyEClass, methodBody.class, "methodBody", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(instanceInitializerEClass, instanceInitializer.class, "instanceInitializer", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(staticInitializerEClass, staticInitializer.class, "staticInitializer", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(constructorDeclarationEClass, constructorDeclaration.class, "constructorDeclaration", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getconstructorDeclaration_ConstructorModifiers(), this.getconstructorModifier(), null,
         "constructorModifiers", null, 0, -1, constructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getconstructorDeclaration_ConstructorDeclarator(), this.getconstructorDeclarator(), null,
         "constructorDeclarator", null, 0, 1, constructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getconstructorDeclaration_Throws_(), this.getthrows_(), null, "throws_", null, 0, 1,
         constructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(constructorModifierEClass, constructorModifier.class, "constructorModifier", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(javaConstructorModifierEClass, JavaConstructorModifier.class, "JavaConstructorModifier", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getJavaConstructorModifier_Modifier(), this.getConstructorModifiers(), "modifier", null, 0, 1,
         JavaConstructorModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(constructorDeclaratorEClass, constructorDeclarator.class, "constructorDeclarator", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getconstructorDeclarator_TypeParameters(), this.gettypeParameters(), null, "typeParameters", null,
         0, -1, constructorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getconstructorDeclarator_SimpleTypeName(), ecorePackage.getEString(), "simpleTypeName", null, 0,
         1, constructorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getconstructorDeclarator_FormalParameterList(), this.getformalParameterList(), null,
         "formalParameterList", null, 0, 1, constructorDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(enumDeclarationEClass, enumDeclaration.class, "enumDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getenumDeclaration_EnumBody(), this.getenumBody(), null, "enumBody", null, 0, 1,
         enumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(enumBodyEClass, enumBody.class, "enumBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getenumBody_EnumConstantList(), this.getenumConstantList(), null, "enumConstantList", null, 0, 1,
         enumBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getenumBody_EnumBodyDeclarations(), this.getenumBodyDeclarations(), null, "enumBodyDeclarations",
         null, 0, 1, enumBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(enumConstantListEClass, enumConstantList.class, "enumConstantList", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getenumConstantList_EnumConstants(), this.getenumConstant(), null, "enumConstants", null, 0, -1,
         enumConstantList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(enumConstantEClass, enumConstant.class, "enumConstant", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getenumConstant_EnumConstantModifiers(), this.getenumConstantModifier(), null,
         "enumConstantModifiers", null, 0, -1, enumConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getenumConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, enumConstant.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getenumConstant_ArgumentList(), this.getargumentList(), null, "argumentList", null, 0, 1,
         enumConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getenumConstant_ClassBody(), this.getclassBody(), null, "classBody", null, 0, 1,
         enumConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(enumConstantModifierEClass, enumConstantModifier.class, "enumConstantModifier", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(enumBodyDeclarationsEClass, enumBodyDeclarations.class, "enumBodyDeclarations", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getenumBodyDeclarations_ClassBodyDeclarations(), this.getclassBodyDeclaration(), null,
         "classBodyDeclarations", null, 0, -1, enumBodyDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(interfaceDeclarationEClass, interfaceDeclaration.class, "interfaceDeclaration", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getinterfaceDeclaration_InterfaceModifiers(), this.getinterfaceModifier(), null,
         "interfaceModifiers", null, 0, -1, interfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getinterfaceDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         interfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(normalInterfaceDeclarationEClass, normalInterfaceDeclaration.class, "normalInterfaceDeclaration",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getnormalInterfaceDeclaration_TypeParameters(), this.gettypeParameters(), null, "typeParameters",
         null, 0, 1, normalInterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getnormalInterfaceDeclaration_ExtendsInterfaces(), this.getextendsInterfaces(), null,
         "extendsInterfaces", null, 0, 1, normalInterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getnormalInterfaceDeclaration_InterfaceBody(), this.getinterfaceBody(), null, "interfaceBody",
         null, 0, 1, normalInterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(interfaceModifierEClass, interfaceModifier.class, "interfaceModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(javaInterfaceModifierEClass, JavaInterfaceModifier.class, "JavaInterfaceModifier", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getJavaInterfaceModifier_Modifier(), this.getInterfaceModifiers(), "modifier", null, 0, 1,
         JavaInterfaceModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(extendsInterfacesEClass, extendsInterfaces.class, "extendsInterfaces", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(interfaceBodyEClass, interfaceBody.class, "interfaceBody", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getinterfaceBody_InterfaceMemberDeclarations(), this.getinterfaceMemberDeclaration(), null,
         "interfaceMemberDeclarations", null, 0, -1, interfaceBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(interfaceMemberDeclarationEClass, interfaceMemberDeclaration.class, "interfaceMemberDeclaration",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(constantDeclarationEClass, constantDeclaration.class, "constantDeclaration", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getconstantDeclaration_ConstantModifiers(), this.getconstantModifier(), null, "constantModifiers",
         null, 0, -1, constantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getconstantDeclaration_UnannType(), this.getunannType(), null, "unannType", null, 0, 1,
         constantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getconstantDeclaration_VariableDeclaratorList(), this.getvariableDeclaratorList(), null,
         "variableDeclaratorList", null, 0, 1, constantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(constantModifierEClass, constantModifier.class, "constantModifier", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(javaConstantModifierEClass, JavaConstantModifier.class, "JavaConstantModifier", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getJavaConstantModifier_Modifier(), this.getConstantModifiers(), "modifier", null, 0, 1,
         JavaConstantModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(interfaceMethodDeclarationEClass, interfaceMethodDeclaration.class, "interfaceMethodDeclaration",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getinterfaceMethodDeclaration_InterfaceMethodModifiers(), this.getinterfaceMethodModifier(), null,
         "interfaceMethodModifiers", null, 0, -1, interfaceMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getinterfaceMethodDeclaration_MethodHeader(), this.getmethodHeader(), null, "methodHeader", null,
         0, 1, interfaceMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getinterfaceMethodDeclaration_MethodBody(), this.getmethodBody(), null, "methodBody", null, 0, 1,
         interfaceMethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(interfaceMethodModifierEClass, interfaceMethodModifier.class, "interfaceMethodModifier", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(javaInterfaceMethodModifiersEClass, JavaInterfaceMethodModifiers.class,
         "JavaInterfaceMethodModifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getJavaInterfaceMethodModifiers_Modifiers(), this.getInterfaceMethodModifiers(), "modifiers",
         null, 0, 1, JavaInterfaceMethodModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(annotationTypeDeclarationEClass, annotationTypeDeclaration.class, "annotationTypeDeclaration",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getannotationTypeDeclaration_AnnotationTypeBody(), this.getannotationTypeBody(), null,
         "annotationTypeBody", null, 0, 1, annotationTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(annotationTypeBodyEClass, annotationTypeBody.class, "annotationTypeBody", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getannotationTypeBody_AnnotationTypeMemberDeclarations(),
         this.getannotationTypeMemberDeclaration(), null, "annotationTypeMemberDeclarations", null, 0, -1,
         annotationTypeBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(annotationTypeMemberDeclarationEClass, annotationTypeMemberDeclaration.class,
         "annotationTypeMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(annotationTypeElementDeclarationEClass, annotationTypeElementDeclaration.class,
         "annotationTypeElementDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getannotationTypeElementDeclaration_AnnotationTypeElementModifiers(),
         this.getannotationTypeElementModifier(), null, "annotationTypeElementModifiers", null, 0, -1,
         annotationTypeElementDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getannotationTypeElementDeclaration_UnannType(), this.getunannType(), null, "unannType", null, 0,
         1, annotationTypeElementDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getannotationTypeElementDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
         annotationTypeElementDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getannotationTypeElementDeclaration_Dims(), this.getdims(), null, "dims", null, 0, 1,
         annotationTypeElementDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getannotationTypeElementDeclaration_DefaultValue(), this.getdefaultValue(), null, "defaultValue",
         null, 0, 1, annotationTypeElementDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(annotationTypeElementModifierEClass, annotationTypeElementModifier.class,
         "annotationTypeElementModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(javaAnnotationTypeElementModifiersEClass, JavaAnnotationTypeElementModifiers.class,
         "JavaAnnotationTypeElementModifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getJavaAnnotationTypeElementModifiers_Modifier(), this.getAnnotationTypeElementModifiers(),
         "modifier", null, 0, 1, JavaAnnotationTypeElementModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(defaultValueEClass, defaultValue.class, "defaultValue", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(annotationEClass, annotation.class, "annotation", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getannotation_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, annotation.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(normalAnnotationEClass, normalAnnotation.class, "normalAnnotation", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getnormalAnnotation_ElementValuePairList(), this.getelementValuePairList(), null,
         "elementValuePairList", null, 0, 1, normalAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(elementValuePairListEClass, elementValuePairList.class, "elementValuePairList", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getelementValuePairList_ElementValuePairs(), this.getelementValuePair(), null,
         "elementValuePairs", null, 0, -1, elementValuePairList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(elementValuePairEClass, elementValuePair.class, "elementValuePair", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getelementValuePair_Name(), ecorePackage.getEString(), "name", null, 0, 1, elementValuePair.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getelementValuePair_ElementValue(), this.getelementValue(), null, "elementValue", null, 0, 1,
         elementValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(elementValueEClass, elementValue.class, "elementValue", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(elementValueArrayInitializerEClass, elementValueArrayInitializer.class,
         "elementValueArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getelementValueArrayInitializer_ElementValueList(), this.getelementValueList(), null,
         "elementValueList", null, 0, 1, elementValueArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE,
         IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(elementValueListEClass, elementValueList.class, "elementValueList", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getelementValueList_ElementValues(), this.getelementValue(), null, "elementValues", null, 0, -1,
         elementValueList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(markerAnnotationEClass, markerAnnotation.class, "markerAnnotation", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(singleElementAnnotationEClass, singleElementAnnotation.class, "singleElementAnnotation", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getsingleElementAnnotation_ElementValue(), this.getelementValue(), null, "elementValue", null, 0,
         1, singleElementAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(arrayInitializerEClass, arrayInitializer.class, "arrayInitializer", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getarrayInitializer_VariableInitializerList(), this.getvariableInitializerList(), null,
         "variableInitializerList", null, 0, 1, arrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(variableInitializerListEClass, variableInitializerList.class, "variableInitializerList", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getvariableInitializerList_VariableInitializer(), this.getvariableInitializer(), null,
         "variableInitializer", null, 0, -1, variableInitializerList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(blockEClass, block.class, "block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getblock_Dummy(), ecorePackage.getEString(), "dummy", null, 0, 1, block.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(blockStatementsEClass, blockStatements.class, "blockStatements", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getblockStatements_Dummy(), ecorePackage.getEString(), "dummy", null, 0, 1, blockStatements.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(argumentListEClass, argumentList.class, "argumentList", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getargumentList_Dummy(), ecorePackage.getEString(), "dummy", null, 0, 1, argumentList.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(primaryEClass, primary.class, "primary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getprimary_Dummy(), ecorePackage.getEString(), "dummy", null, 0, 1, primary.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getexpression_Dummy(), ecorePackage.getEString(), "dummy", null, 0, 1, expression.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(conditionalExpressionEClass, conditionalExpression.class, "conditionalExpression", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getconditionalExpression_Dummy(), ecorePackage.getEString(), "dummy", null, 0, 1,
         conditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(emptyTypeDeclarationEClass, EmptyTypeDeclaration.class, "EmptyTypeDeclaration", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(emptyClassMemberDeclarationEClass, EmptyClassMemberDeclaration.class, "EmptyClassMemberDeclaration",
         !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      // Initialize enums and add enum literals
      initEEnum(classModifiersEEnum, ClassModifiers.class, "ClassModifiers");
      addEEnumLiteral(classModifiersEEnum, ClassModifiers.PUBLIC);
      addEEnumLiteral(classModifiersEEnum, ClassModifiers.PROTECTED);
      addEEnumLiteral(classModifiersEEnum, ClassModifiers.PRIVATE);
      addEEnumLiteral(classModifiersEEnum, ClassModifiers.ABSTRACT);
      addEEnumLiteral(classModifiersEEnum, ClassModifiers.STATIC);
      addEEnumLiteral(classModifiersEEnum, ClassModifiers.FINAL);
      addEEnumLiteral(classModifiersEEnum, ClassModifiers.STRICTFP);

      initEEnum(fieldModifiersEEnum, FieldModifiers.class, "FieldModifiers");
      addEEnumLiteral(fieldModifiersEEnum, FieldModifiers.PUBLIC);
      addEEnumLiteral(fieldModifiersEEnum, FieldModifiers.PROTECTED);
      addEEnumLiteral(fieldModifiersEEnum, FieldModifiers.PRIVATE);
      addEEnumLiteral(fieldModifiersEEnum, FieldModifiers.STATIC);
      addEEnumLiteral(fieldModifiersEEnum, FieldModifiers.FINAL);
      addEEnumLiteral(fieldModifiersEEnum, FieldModifiers.TRANSIENT);
      addEEnumLiteral(fieldModifiersEEnum, FieldModifiers.VOLATILE);

      initEEnum(methodModifiersEEnum, methodModifiers.class, "methodModifiers");
      addEEnumLiteral(methodModifiersEEnum, methodModifiers.PUBLIC);
      addEEnumLiteral(methodModifiersEEnum, methodModifiers.PROTECTED);
      addEEnumLiteral(methodModifiersEEnum, methodModifiers.PRIVATE);
      addEEnumLiteral(methodModifiersEEnum, methodModifiers.ABSTRACT);
      addEEnumLiteral(methodModifiersEEnum, methodModifiers.STATIC);
      addEEnumLiteral(methodModifiersEEnum, methodModifiers.FINAL);
      addEEnumLiteral(methodModifiersEEnum, methodModifiers.SYNCHRONIZED);
      addEEnumLiteral(methodModifiersEEnum, methodModifiers.NATIVE);
      addEEnumLiteral(methodModifiersEEnum, methodModifiers.STRICTFP);

      initEEnum(variableModifiersEEnum, VariableModifiers.class, "VariableModifiers");
      addEEnumLiteral(variableModifiersEEnum, VariableModifiers.PUBLIC);

      initEEnum(constructorModifiersEEnum, ConstructorModifiers.class, "ConstructorModifiers");
      addEEnumLiteral(constructorModifiersEEnum, ConstructorModifiers.PUBLIC);
      addEEnumLiteral(constructorModifiersEEnum, ConstructorModifiers.PROTECTED);
      addEEnumLiteral(constructorModifiersEEnum, ConstructorModifiers.PRIVATE);

      initEEnum(interfaceModifiersEEnum, InterfaceModifiers.class, "InterfaceModifiers");
      addEEnumLiteral(interfaceModifiersEEnum, InterfaceModifiers.PUBLIC);
      addEEnumLiteral(interfaceModifiersEEnum, InterfaceModifiers.PROTECTED);
      addEEnumLiteral(interfaceModifiersEEnum, InterfaceModifiers.PRIVATE);
      addEEnumLiteral(interfaceModifiersEEnum, InterfaceModifiers.ABSTRACT);
      addEEnumLiteral(interfaceModifiersEEnum, InterfaceModifiers.STATIC);
      addEEnumLiteral(interfaceModifiersEEnum, InterfaceModifiers.STRICTFP);

      initEEnum(constantModifiersEEnum, ConstantModifiers.class, "ConstantModifiers");
      addEEnumLiteral(constantModifiersEEnum, ConstantModifiers.PUBLIC);
      addEEnumLiteral(constantModifiersEEnum, ConstantModifiers.STATIC);
      addEEnumLiteral(constantModifiersEEnum, ConstantModifiers.FINAL);

      initEEnum(interfaceMethodModifiersEEnum, InterfaceMethodModifiers.class, "InterfaceMethodModifiers");
      addEEnumLiteral(interfaceMethodModifiersEEnum, InterfaceMethodModifiers.PUBLIC);
      addEEnumLiteral(interfaceMethodModifiersEEnum, InterfaceMethodModifiers.ABSTRACT);
      addEEnumLiteral(interfaceMethodModifiersEEnum, InterfaceMethodModifiers.DEFAULT);
      addEEnumLiteral(interfaceMethodModifiersEEnum, InterfaceMethodModifiers.STATIC);
      addEEnumLiteral(interfaceMethodModifiersEEnum, InterfaceMethodModifiers.STRICTFP);

      initEEnum(annotationTypeElementModifiersEEnum, AnnotationTypeElementModifiers.class,
         "AnnotationTypeElementModifiers");
      addEEnumLiteral(annotationTypeElementModifiersEEnum, AnnotationTypeElementModifiers.PUBLIC);
      addEEnumLiteral(annotationTypeElementModifiersEEnum, AnnotationTypeElementModifiers.STATIC);

      // Create resource
      createResource(eNS_URI);
   }

} // TypePackageImpl
