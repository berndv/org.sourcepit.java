/**
 */

package org.sourcepit.java.type.type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.type.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "type";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/java/type/Type";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "type";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   TypePackage eINSTANCE = org.sourcepit.java.type.type.impl.TypePackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.ModelImpl <em>Model</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.ModelImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getModel()
    * @generated
    */
   int MODEL = 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MODEL__TYPE = 0;

   /**
    * The number of structural features of the '<em>Model</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MODEL_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeImpl <em>type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettype()
    * @generated
    */
   int TYPE = 1;

   /**
    * The number of structural features of the '<em>type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.primitiveTypeImpl <em>primitive Type</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.primitiveTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getprimitiveType()
    * @generated
    */
   int PRIMITIVE_TYPE = 2;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PRIMITIVE_TYPE__ANNOTATIONS = TYPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Type Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PRIMITIVE_TYPE__TYPE_NAME = TYPE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>primitive Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.referenceTypeImpl <em>reference Type</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.referenceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getreferenceType()
    * @generated
    */
   int REFERENCE_TYPE = 3;

   /**
    * The number of structural features of the '<em>reference Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int REFERENCE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classOrInterfaceTypeImpl
    * <em>class Or Interface Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classOrInterfaceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassOrInterfaceType()
    * @generated
    */
   int CLASS_OR_INTERFACE_TYPE = 4;

   /**
    * The feature id for the '<em><b>Class Or Interface Type Segments</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_OR_INTERFACE_TYPE__CLASS_OR_INTERFACE_TYPE_SEGMENTS = REFERENCE_TYPE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>class Or Interface Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classOrInterfaceTypeSegmentImpl
    * <em>class Or Interface Type Segment</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classOrInterfaceTypeSegmentImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassOrInterfaceTypeSegment()
    * @generated
    */
   int CLASS_OR_INTERFACE_TYPE_SEGMENT = 5;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_OR_INTERFACE_TYPE_SEGMENT__ANNOTATIONS = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_OR_INTERFACE_TYPE_SEGMENT__NAME = 1;

   /**
    * The feature id for the '<em><b>Type Arguments</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_OR_INTERFACE_TYPE_SEGMENT__TYPE_ARGUMENTS = 2;

   /**
    * The number of structural features of the '<em>class Or Interface Type Segment</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_OR_INTERFACE_TYPE_SEGMENT_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.additionalBoundImpl
    * <em>additional Bound</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.additionalBoundImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getadditionalBound()
    * @generated
    */
   int ADDITIONAL_BOUND = 19;

   /**
    * The number of structural features of the '<em>additional Bound</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ADDITIONAL_BOUND_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceTypeImpl <em>interface Type</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceType()
    * @generated
    */
   int INTERFACE_TYPE = 9;

   /**
    * The number of structural features of the '<em>interface Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_TYPE_FEATURE_COUNT = ADDITIONAL_BOUND_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classTypeImpl <em>class Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassType()
    * @generated
    */
   int CLASS_TYPE = 6;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE__ANNOTATIONS = INTERFACE_TYPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE__NAME = INTERFACE_TYPE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Type Arguments</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE__TYPE_ARGUMENTS = INTERFACE_TYPE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Class Or Interface Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE__CLASS_OR_INTERFACE_TYPE = INTERFACE_TYPE_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>class Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_FEATURE_COUNT = INTERFACE_TYPE_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceType_lf_classOrInterfaceTypeImpl
    * <em>interface Type lf class Or Interface Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceType_lf_classOrInterfaceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceType_lf_classOrInterfaceType()
    * @generated
    */
   int INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE = 10;

   /**
    * The number of structural features of the '<em>interface Type lf class Or Interface Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classType_lf_classOrInterfaceTypeImpl
    * <em>class Type lf class Or Interface Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classType_lf_classOrInterfaceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassType_lf_classOrInterfaceType()
    * @generated
    */
   int CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE = 7;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS = INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE__NAME = INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Type Arguments</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS = INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>class Type lf class Or Interface Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT = INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceType_lfno_classOrInterfaceTypeImpl
    * <em>interface Type lfno class Or Interface Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceType_lfno_classOrInterfaceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceType_lfno_classOrInterfaceType()
    * @generated
    */
   int INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE = 11;

   /**
    * The number of structural features of the '<em>interface Type lfno class Or Interface Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classType_lfno_classOrInterfaceTypeImpl
    * <em>class Type lfno class Or Interface Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classType_lfno_classOrInterfaceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassType_lfno_classOrInterfaceType()
    * @generated
    */
   int CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE = 8;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS = INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__NAME = INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Type Arguments</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS = INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>class Type lfno class Or Interface Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT = INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeVariableImpl <em>type Variable</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeVariableImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeVariable()
    * @generated
    */
   int TYPE_VARIABLE = 12;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_VARIABLE__ANNOTATIONS = REFERENCE_TYPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_VARIABLE__NAME = REFERENCE_TYPE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>type Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_VARIABLE_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.arrayTypeImpl <em>array Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.arrayTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getarrayType()
    * @generated
    */
   int ARRAY_TYPE = 13;

   /**
    * The feature id for the '<em><b>Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ARRAY_TYPE__TYPE = REFERENCE_TYPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ARRAY_TYPE__DIMS = REFERENCE_TYPE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>array Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ARRAY_TYPE_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.dimsImpl <em>dims</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.dimsImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getdims()
    * @generated
    */
   int DIMS = 14;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DIMS__DIMS = 0;

   /**
    * The number of structural features of the '<em>dims</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DIMS_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.dimImpl <em>dim</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.dimImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getdim()
    * @generated
    */
   int DIM = 15;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DIM__ANNOTATIONS = 0;

   /**
    * The number of structural features of the '<em>dim</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DIM_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeParameterImpl <em>type Parameter</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeParameterImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeParameter()
    * @generated
    */
   int TYPE_PARAMETER = 16;

   /**
    * The feature id for the '<em><b>Type Parameter Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_PARAMETER__TYPE_PARAMETER_MODIFIERS = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_PARAMETER__NAME = 1;

   /**
    * The feature id for the '<em><b>Type Bound</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_PARAMETER__TYPE_BOUND = 2;

   /**
    * The number of structural features of the '<em>type Parameter</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_PARAMETER_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeParameterModifierImpl
    * <em>type Parameter Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeParameterModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeParameterModifier()
    * @generated
    */
   int TYPE_PARAMETER_MODIFIER = 17;

   /**
    * The number of structural features of the '<em>type Parameter Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_PARAMETER_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeBoundImpl <em>type Bound</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeBoundImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeBound()
    * @generated
    */
   int TYPE_BOUND = 18;

   /**
    * The feature id for the '<em><b>Type Variable</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_BOUND__TYPE_VARIABLE = 0;

   /**
    * The feature id for the '<em><b>Class Or Interface Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_BOUND__CLASS_OR_INTERFACE_TYPE = 1;

   /**
    * The feature id for the '<em><b>Additional Bound</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_BOUND__ADDITIONAL_BOUND = 2;

   /**
    * The number of structural features of the '<em>type Bound</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_BOUND_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeArgumentsImpl <em>type Arguments</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeArgumentsImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeArguments()
    * @generated
    */
   int TYPE_ARGUMENTS = 20;

   /**
    * The number of structural features of the '<em>type Arguments</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_ARGUMENTS_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeArgumentListImpl
    * <em>type Argument List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeArgumentListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeArgumentList()
    * @generated
    */
   int TYPE_ARGUMENT_LIST = 21;

   /**
    * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_ARGUMENT_LIST__TYPE_ARGUMENTS = TYPE_ARGUMENTS_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>type Argument List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_ARGUMENT_LIST_FEATURE_COUNT = TYPE_ARGUMENTS_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeArgumentImpl <em>type Argument</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeArgumentImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeArgument()
    * @generated
    */
   int TYPE_ARGUMENT = 22;

   /**
    * The number of structural features of the '<em>type Argument</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_ARGUMENT_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.wildcardImpl <em>wildcard</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.wildcardImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getwildcard()
    * @generated
    */
   int WILDCARD = 23;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int WILDCARD__ANNOTATIONS = TYPE_ARGUMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Wildcard Bounds</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int WILDCARD__WILDCARD_BOUNDS = TYPE_ARGUMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>wildcard</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int WILDCARD_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.wildcardBoundsImpl <em>wildcard Bounds</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.wildcardBoundsImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getwildcardBounds()
    * @generated
    */
   int WILDCARD_BOUNDS = 24;

   /**
    * The number of structural features of the '<em>wildcard Bounds</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int WILDCARD_BOUNDS_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.compilationUnitImpl
    * <em>compilation Unit</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.compilationUnitImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getcompilationUnit()
    * @generated
    */
   int COMPILATION_UNIT = 25;

   /**
    * The feature id for the '<em><b>Package</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int COMPILATION_UNIT__PACKAGE = 0;

   /**
    * The feature id for the '<em><b>Imports</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int COMPILATION_UNIT__IMPORTS = 1;

   /**
    * The feature id for the '<em><b>Types</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int COMPILATION_UNIT__TYPES = 2;

   /**
    * The number of structural features of the '<em>compilation Unit</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int COMPILATION_UNIT_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.packageDeclarationImpl
    * <em>package Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.packageDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getpackageDeclaration()
    * @generated
    */
   int PACKAGE_DECLARATION = 26;

   /**
    * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_DECLARATION__MODIFIERS = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_DECLARATION__NAME = 1;

   /**
    * The number of structural features of the '<em>package Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_DECLARATION_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.packageModifierImpl
    * <em>package Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.packageModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getpackageModifier()
    * @generated
    */
   int PACKAGE_MODIFIER = 27;

   /**
    * The number of structural features of the '<em>package Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.importDeclarationImpl
    * <em>import Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.importDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getimportDeclaration()
    * @generated
    */
   int IMPORT_DECLARATION = 28;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int IMPORT_DECLARATION__NAME = 0;

   /**
    * The number of structural features of the '<em>import Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int IMPORT_DECLARATION_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.singleTypeImportDeclarationImpl
    * <em>single Type Import Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.singleTypeImportDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsingleTypeImportDeclaration()
    * @generated
    */
   int SINGLE_TYPE_IMPORT_DECLARATION = 29;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SINGLE_TYPE_IMPORT_DECLARATION__NAME = IMPORT_DECLARATION__NAME;

   /**
    * The number of structural features of the '<em>single Type Import Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SINGLE_TYPE_IMPORT_DECLARATION_FEATURE_COUNT = IMPORT_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeImportOnDemandDeclarationImpl
    * <em>type Import On Demand Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeImportOnDemandDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeImportOnDemandDeclaration()
    * @generated
    */
   int TYPE_IMPORT_ON_DEMAND_DECLARATION = 30;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_IMPORT_ON_DEMAND_DECLARATION__NAME = IMPORT_DECLARATION__NAME;

   /**
    * The number of structural features of the '<em>type Import On Demand Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_IMPORT_ON_DEMAND_DECLARATION_FEATURE_COUNT = IMPORT_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.singleStaticImportDeclarationImpl
    * <em>single Static Import Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.singleStaticImportDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsingleStaticImportDeclaration()
    * @generated
    */
   int SINGLE_STATIC_IMPORT_DECLARATION = 31;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SINGLE_STATIC_IMPORT_DECLARATION__NAME = IMPORT_DECLARATION__NAME;

   /**
    * The number of structural features of the '<em>single Static Import Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SINGLE_STATIC_IMPORT_DECLARATION_FEATURE_COUNT = IMPORT_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.staticImportOnDemandDeclarationImpl
    * <em>static Import On Demand Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.staticImportOnDemandDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getstaticImportOnDemandDeclaration()
    * @generated
    */
   int STATIC_IMPORT_ON_DEMAND_DECLARATION = 32;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STATIC_IMPORT_ON_DEMAND_DECLARATION__NAME = IMPORT_DECLARATION__NAME;

   /**
    * The number of structural features of the '<em>static Import On Demand Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STATIC_IMPORT_ON_DEMAND_DECLARATION_FEATURE_COUNT = IMPORT_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeDeclarationImpl
    * <em>type Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeDeclaration()
    * @generated
    */
   int TYPE_DECLARATION = 33;

   /**
    * The number of structural features of the '<em>type Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_DECLARATION_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classDeclarationImpl
    * <em>class Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassDeclaration()
    * @generated
    */
   int CLASS_DECLARATION = 34;

   /**
    * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_DECLARATION__MODIFIERS = TYPE_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_DECLARATION__NAME = TYPE_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Superinterfaces</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_DECLARATION__SUPERINTERFACES = TYPE_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>class Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.normalClassDeclarationImpl
    * <em>normal Class Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.normalClassDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getnormalClassDeclaration()
    * @generated
    */
   int NORMAL_CLASS_DECLARATION = 35;

   /**
    * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_CLASS_DECLARATION__MODIFIERS = CLASS_DECLARATION__MODIFIERS;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_CLASS_DECLARATION__NAME = CLASS_DECLARATION__NAME;

   /**
    * The feature id for the '<em><b>Superinterfaces</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_CLASS_DECLARATION__SUPERINTERFACES = CLASS_DECLARATION__SUPERINTERFACES;

   /**
    * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS = CLASS_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Superclass</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_CLASS_DECLARATION__SUPERCLASS = CLASS_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Class Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_CLASS_DECLARATION__CLASS_BODY = CLASS_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>normal Class Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_CLASS_DECLARATION_FEATURE_COUNT = CLASS_DECLARATION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classModifierImpl <em>class Modifier</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassModifier()
    * @generated
    */
   int CLASS_MODIFIER = 36;

   /**
    * The number of structural features of the '<em>class Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.JavaClassModifierImpl
    * <em>Java Class Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.JavaClassModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaClassModifier()
    * @generated
    */
   int JAVA_CLASS_MODIFIER = 37;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_CLASS_MODIFIER__MODIFIER = CLASS_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Java Class Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_CLASS_MODIFIER_FEATURE_COUNT = CLASS_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeParametersImpl <em>type Parameters</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeParametersImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeParameters()
    * @generated
    */
   int TYPE_PARAMETERS = 38;

   /**
    * The number of structural features of the '<em>type Parameters</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_PARAMETERS_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.typeParameterListImpl
    * <em>type Parameter List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.typeParameterListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeParameterList()
    * @generated
    */
   int TYPE_PARAMETER_LIST = 39;

   /**
    * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_PARAMETER_LIST__TYPE_PARAMETERS = TYPE_PARAMETERS_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>type Parameter List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int TYPE_PARAMETER_LIST_FEATURE_COUNT = TYPE_PARAMETERS_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.superclassImpl <em>superclass</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.superclassImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsuperclass()
    * @generated
    */
   int SUPERCLASS = 40;

   /**
    * The number of structural features of the '<em>superclass</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SUPERCLASS_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.superinterfacesImpl <em>superinterfaces</em>}
    * ' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.superinterfacesImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsuperinterfaces()
    * @generated
    */
   int SUPERINTERFACES = 41;

   /**
    * The number of structural features of the '<em>superinterfaces</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SUPERINTERFACES_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceTypeListImpl
    * <em>interface Type List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceTypeListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceTypeList()
    * @generated
    */
   int INTERFACE_TYPE_LIST = 42;

   /**
    * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_TYPE_LIST__INTERFACE_TYPES = SUPERINTERFACES_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>interface Type List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_TYPE_LIST_FEATURE_COUNT = SUPERINTERFACES_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classBodyImpl <em>class Body</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classBodyImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassBody()
    * @generated
    */
   int CLASS_BODY = 43;

   /**
    * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_BODY__DECLARATIONS = 0;

   /**
    * The number of structural features of the '<em>class Body</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_BODY_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classBodyDeclarationImpl
    * <em>class Body Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classBodyDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassBodyDeclaration()
    * @generated
    */
   int CLASS_BODY_DECLARATION = 44;

   /**
    * The number of structural features of the '<em>class Body Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_BODY_DECLARATION_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.classMemberDeclarationImpl
    * <em>class Member Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.classMemberDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassMemberDeclaration()
    * @generated
    */
   int CLASS_MEMBER_DECLARATION = 45;

   /**
    * The number of structural features of the '<em>class Member Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_MEMBER_DECLARATION_FEATURE_COUNT = CLASS_BODY_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.fieldDeclarationImpl
    * <em>field Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.fieldDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getfieldDeclaration()
    * @generated
    */
   int FIELD_DECLARATION = 46;

   /**
    * The feature id for the '<em><b>Field Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FIELD_DECLARATION__FIELD_MODIFIERS = CLASS_MEMBER_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Unann Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FIELD_DECLARATION__UNANN_TYPE = CLASS_MEMBER_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Variable Declarator List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST = CLASS_MEMBER_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>field Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FIELD_DECLARATION_FEATURE_COUNT = CLASS_MEMBER_DECLARATION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.fieldModifierImpl <em>field Modifier</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.fieldModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getfieldModifier()
    * @generated
    */
   int FIELD_MODIFIER = 47;

   /**
    * The number of structural features of the '<em>field Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FIELD_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.JavaFieldModifierImpl
    * <em>Java Field Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.JavaFieldModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaFieldModifier()
    * @generated
    */
   int JAVA_FIELD_MODIFIER = 48;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_FIELD_MODIFIER__MODIFIER = FIELD_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Java Field Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_FIELD_MODIFIER_FEATURE_COUNT = FIELD_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.variableDeclaratorListImpl
    * <em>variable Declarator List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.variableDeclaratorListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableDeclaratorList()
    * @generated
    */
   int VARIABLE_DECLARATOR_LIST = 49;

   /**
    * The feature id for the '<em><b>Variable Declarators</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_DECLARATOR_LIST__VARIABLE_DECLARATORS = 0;

   /**
    * The number of structural features of the '<em>variable Declarator List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_DECLARATOR_LIST_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.variableDeclaratorImpl
    * <em>variable Declarator</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.variableDeclaratorImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableDeclarator()
    * @generated
    */
   int VARIABLE_DECLARATOR = 50;

   /**
    * The feature id for the '<em><b>Id</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_DECLARATOR__ID = 0;

   /**
    * The feature id for the '<em><b>Initializer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_DECLARATOR__INITIALIZER = 1;

   /**
    * The number of structural features of the '<em>variable Declarator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_DECLARATOR_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.variableDeclaratorIdImpl
    * <em>variable Declarator Id</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.variableDeclaratorIdImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableDeclaratorId()
    * @generated
    */
   int VARIABLE_DECLARATOR_ID = 51;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_DECLARATOR_ID__ID = 0;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_DECLARATOR_ID__DIMS = 1;

   /**
    * The number of structural features of the '<em>variable Declarator Id</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_DECLARATOR_ID_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.variableInitializerImpl
    * <em>variable Initializer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.variableInitializerImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableInitializer()
    * @generated
    */
   int VARIABLE_INITIALIZER = 52;

   /**
    * The number of structural features of the '<em>variable Initializer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_INITIALIZER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.resultImpl <em>result</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.resultImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getresult()
    * @generated
    */
   int RESULT = 67;

   /**
    * The number of structural features of the '<em>result</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int RESULT_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.unannTypeImpl <em>unann Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.unannTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannType()
    * @generated
    */
   int UNANN_TYPE = 53;

   /**
    * The number of structural features of the '<em>unann Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_TYPE_FEATURE_COUNT = RESULT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.unannPrimitiveTypeImpl
    * <em>unann Primitive Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.unannPrimitiveTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannPrimitiveType()
    * @generated
    */
   int UNANN_PRIMITIVE_TYPE = 54;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_PRIMITIVE_TYPE__DIMS = UNANN_TYPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_PRIMITIVE_TYPE__NAME = UNANN_TYPE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>unann Primitive Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_PRIMITIVE_TYPE_FEATURE_COUNT = UNANN_TYPE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.unannReferenceTypeImpl
    * <em>unann Reference Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.unannReferenceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannReferenceType()
    * @generated
    */
   int UNANN_REFERENCE_TYPE = 55;

   /**
    * The number of structural features of the '<em>unann Reference Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_REFERENCE_TYPE_FEATURE_COUNT = UNANN_TYPE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.unannClassOrInterfaceTypeImpl
    * <em>unann Class Or Interface Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.unannClassOrInterfaceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannClassOrInterfaceType()
    * @generated
    */
   int UNANN_CLASS_OR_INTERFACE_TYPE = 56;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_CLASS_OR_INTERFACE_TYPE__DIMS = UNANN_REFERENCE_TYPE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>unann Class Or Interface Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT = UNANN_REFERENCE_TYPE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.unannClassTypeImpl <em>unann Class Type</em>}
    * ' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.unannClassTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannClassType()
    * @generated
    */
   int UNANN_CLASS_TYPE = 57;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_CLASS_TYPE__DIMS = UNANN_CLASS_OR_INTERFACE_TYPE__DIMS;

   /**
    * The feature id for the '<em><b>Class Type Segment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_CLASS_TYPE__CLASS_TYPE_SEGMENT = UNANN_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>unann Class Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_CLASS_TYPE_FEATURE_COUNT = UNANN_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.ClassTypeSegmentImpl
    * <em>Class Type Segment</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.ClassTypeSegmentImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getClassTypeSegment()
    * @generated
    */
   int CLASS_TYPE_SEGMENT = 58;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_SEGMENT__NAME = 0;

   /**
    * The feature id for the '<em><b>Type Arguments</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS = 1;

   /**
    * The number of structural features of the '<em>Class Type Segment</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_SEGMENT_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.ClassTypeSegmentWithAnnotationsImpl
    * <em>Class Type Segment With Annotations</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.ClassTypeSegmentWithAnnotationsImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getClassTypeSegmentWithAnnotations()
    * @generated
    */
   int CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS = 59;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS__ANNOTATIONS = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS__NAME = 1;

   /**
    * The feature id for the '<em><b>Type Arguments</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS__TYPE_ARGUMENTS = 2;

   /**
    * The number of structural features of the '<em>Class Type Segment With Annotations</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.unannInterfaceTypeImpl
    * <em>unann Interface Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.unannInterfaceTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannInterfaceType()
    * @generated
    */
   int UNANN_INTERFACE_TYPE = 60;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_INTERFACE_TYPE__DIMS = UNANN_CLASS_OR_INTERFACE_TYPE__DIMS;

   /**
    * The number of structural features of the '<em>unann Interface Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_INTERFACE_TYPE_FEATURE_COUNT = UNANN_CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.unannTypeVariableImpl
    * <em>unann Type Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.unannTypeVariableImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannTypeVariable()
    * @generated
    */
   int UNANN_TYPE_VARIABLE = 61;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_TYPE_VARIABLE__DIMS = UNANN_REFERENCE_TYPE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_TYPE_VARIABLE__NAME = UNANN_REFERENCE_TYPE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>unann Type Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_TYPE_VARIABLE_FEATURE_COUNT = UNANN_REFERENCE_TYPE_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.unannArrayTypeImpl <em>unann Array Type</em>}
    * ' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.unannArrayTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannArrayType()
    * @generated
    */
   int UNANN_ARRAY_TYPE = 62;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_ARRAY_TYPE__DIMS = UNANN_REFERENCE_TYPE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>unann Array Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int UNANN_ARRAY_TYPE_FEATURE_COUNT = UNANN_REFERENCE_TYPE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.methodDeclarationImpl
    * <em>method Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.methodDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodDeclaration()
    * @generated
    */
   int METHOD_DECLARATION = 63;

   /**
    * The feature id for the '<em><b>Method Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_DECLARATION__METHOD_MODIFIERS = CLASS_MEMBER_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Method Header</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_DECLARATION__METHOD_HEADER = CLASS_MEMBER_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Method Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_DECLARATION__METHOD_BODY = CLASS_MEMBER_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>method Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_DECLARATION_FEATURE_COUNT = CLASS_MEMBER_DECLARATION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.methodModifierImpl <em>method Modifier</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.methodModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodModifier()
    * @generated
    */
   int METHOD_MODIFIER = 64;

   /**
    * The number of structural features of the '<em>method Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.JavaMethodModifierImpl
    * <em>Java Method Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.JavaMethodModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaMethodModifier()
    * @generated
    */
   int JAVA_METHOD_MODIFIER = 65;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_METHOD_MODIFIER__MODIFIER = METHOD_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Java Method Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_METHOD_MODIFIER_FEATURE_COUNT = METHOD_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.methodHeaderImpl <em>method Header</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.methodHeaderImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodHeader()
    * @generated
    */
   int METHOD_HEADER = 66;

   /**
    * The feature id for the '<em><b>Result</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_HEADER__RESULT = 0;

   /**
    * The feature id for the '<em><b>Method Declarator</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_HEADER__METHOD_DECLARATOR = 1;

   /**
    * The feature id for the '<em><b>Throws </b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_HEADER__THROWS_ = 2;

   /**
    * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_HEADER__TYPE_PARAMETERS = 3;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_HEADER__ANNOTATIONS = 4;

   /**
    * The number of structural features of the '<em>method Header</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_HEADER_FEATURE_COUNT = 5;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.voidTypeImpl <em>void Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.voidTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvoidType()
    * @generated
    */
   int VOID_TYPE = 68;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VOID_TYPE__NAME = RESULT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>void Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VOID_TYPE_FEATURE_COUNT = RESULT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.methodDeclaratorImpl
    * <em>method Declarator</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.methodDeclaratorImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodDeclarator()
    * @generated
    */
   int METHOD_DECLARATOR = 69;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_DECLARATOR__NAME = 0;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_DECLARATOR__PARAMETERS = 1;

   /**
    * The feature id for the '<em><b>Dims </b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_DECLARATOR__DIMS_ = 2;

   /**
    * The number of structural features of the '<em>method Declarator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_DECLARATOR_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.formalParameterListImpl
    * <em>formal Parameter List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.formalParameterListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getformalParameterList()
    * @generated
    */
   int FORMAL_PARAMETER_LIST = 70;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETER_LIST__PARAMETERS = 0;

   /**
    * The number of structural features of the '<em>formal Parameter List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETER_LIST_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.formalParametersImpl
    * <em>formal Parameters</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.formalParametersImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getformalParameters()
    * @generated
    */
   int FORMAL_PARAMETERS = 71;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETERS__PARAMETERS = 0;

   /**
    * The number of structural features of the '<em>formal Parameters</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETERS_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.lastFormalParameterImpl
    * <em>last Formal Parameter</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.lastFormalParameterImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getlastFormalParameter()
    * @generated
    */
   int LAST_FORMAL_PARAMETER = 75;

   /**
    * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LAST_FORMAL_PARAMETER__MODIFIERS = 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LAST_FORMAL_PARAMETER__TYPE = 1;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LAST_FORMAL_PARAMETER__ANNOTATIONS = 2;

   /**
    * The feature id for the '<em><b>Varargs</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LAST_FORMAL_PARAMETER__VARARGS = 3;

   /**
    * The feature id for the '<em><b>Name</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LAST_FORMAL_PARAMETER__NAME = 4;

   /**
    * The number of structural features of the '<em>last Formal Parameter</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int LAST_FORMAL_PARAMETER_FEATURE_COUNT = 5;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.formalParameterImpl
    * <em>formal Parameter</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.formalParameterImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getformalParameter()
    * @generated
    */
   int FORMAL_PARAMETER = 72;

   /**
    * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETER__MODIFIERS = LAST_FORMAL_PARAMETER__MODIFIERS;

   /**
    * The feature id for the '<em><b>Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETER__TYPE = LAST_FORMAL_PARAMETER__TYPE;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETER__ANNOTATIONS = LAST_FORMAL_PARAMETER__ANNOTATIONS;

   /**
    * The feature id for the '<em><b>Varargs</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETER__VARARGS = LAST_FORMAL_PARAMETER__VARARGS;

   /**
    * The feature id for the '<em><b>Name</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETER__NAME = LAST_FORMAL_PARAMETER__NAME;

   /**
    * The number of structural features of the '<em>formal Parameter</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FORMAL_PARAMETER_FEATURE_COUNT = LAST_FORMAL_PARAMETER_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.variableModifierImpl
    * <em>variable Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.variableModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableModifier()
    * @generated
    */
   int VARIABLE_MODIFIER = 73;

   /**
    * The number of structural features of the '<em>variable Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.JavaVariableModifierImpl
    * <em>Java Variable Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.JavaVariableModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaVariableModifier()
    * @generated
    */
   int JAVA_VARIABLE_MODIFIER = 74;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_VARIABLE_MODIFIER__MODIFIER = VARIABLE_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Java Variable Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_VARIABLE_MODIFIER_FEATURE_COUNT = VARIABLE_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.receiverParameterImpl
    * <em>receiver Parameter</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.receiverParameterImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getreceiverParameter()
    * @generated
    */
   int RECEIVER_PARAMETER = 76;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int RECEIVER_PARAMETER__ANNOTATIONS = 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int RECEIVER_PARAMETER__TYPE = 1;

   /**
    * The feature id for the '<em><b>Qualifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int RECEIVER_PARAMETER__QUALIFIER = 2;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int RECEIVER_PARAMETER__NAME = 3;

   /**
    * The number of structural features of the '<em>receiver Parameter</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int RECEIVER_PARAMETER_FEATURE_COUNT = 4;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.throws_Impl <em>throws </em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.throws_Impl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getthrows_()
    * @generated
    */
   int THROWS_ = 77;

   /**
    * The number of structural features of the '<em>throws </em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int THROWS__FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.exceptionTypeListImpl
    * <em>exception Type List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.exceptionTypeListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getexceptionTypeList()
    * @generated
    */
   int EXCEPTION_TYPE_LIST = 78;

   /**
    * The feature id for the '<em><b>Exception Types</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXCEPTION_TYPE_LIST__EXCEPTION_TYPES = THROWS__FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>exception Type List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXCEPTION_TYPE_LIST_FEATURE_COUNT = THROWS__FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.exceptionTypeImpl <em>exception Type</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.exceptionTypeImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getexceptionType()
    * @generated
    */
   int EXCEPTION_TYPE = 79;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXCEPTION_TYPE__ANNOTATIONS = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXCEPTION_TYPE__NAME = 1;

   /**
    * The number of structural features of the '<em>exception Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXCEPTION_TYPE_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.methodBodyImpl <em>method Body</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.methodBodyImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodBody()
    * @generated
    */
   int METHOD_BODY = 80;

   /**
    * The number of structural features of the '<em>method Body</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int METHOD_BODY_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.instanceInitializerImpl
    * <em>instance Initializer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.instanceInitializerImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinstanceInitializer()
    * @generated
    */
   int INSTANCE_INITIALIZER = 81;

   /**
    * The number of structural features of the '<em>instance Initializer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INSTANCE_INITIALIZER_FEATURE_COUNT = CLASS_BODY_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.staticInitializerImpl
    * <em>static Initializer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.staticInitializerImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getstaticInitializer()
    * @generated
    */
   int STATIC_INITIALIZER = 82;

   /**
    * The number of structural features of the '<em>static Initializer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int STATIC_INITIALIZER_FEATURE_COUNT = CLASS_BODY_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.constructorDeclarationImpl
    * <em>constructor Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.constructorDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstructorDeclaration()
    * @generated
    */
   int CONSTRUCTOR_DECLARATION = 83;

   /**
    * The feature id for the '<em><b>Constructor Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTRUCTOR_DECLARATION__CONSTRUCTOR_MODIFIERS = CLASS_BODY_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Constructor Declarator</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR = CLASS_BODY_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Throws </b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTRUCTOR_DECLARATION__THROWS_ = CLASS_BODY_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>constructor Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = CLASS_BODY_DECLARATION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.constructorModifierImpl
    * <em>constructor Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.constructorModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstructorModifier()
    * @generated
    */
   int CONSTRUCTOR_MODIFIER = 84;

   /**
    * The number of structural features of the '<em>constructor Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTRUCTOR_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.JavaConstructorModifierImpl
    * <em>Java Constructor Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.JavaConstructorModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaConstructorModifier()
    * @generated
    */
   int JAVA_CONSTRUCTOR_MODIFIER = 85;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_CONSTRUCTOR_MODIFIER__MODIFIER = CONSTRUCTOR_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Java Constructor Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_CONSTRUCTOR_MODIFIER_FEATURE_COUNT = CONSTRUCTOR_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.constructorDeclaratorImpl
    * <em>constructor Declarator</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.constructorDeclaratorImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstructorDeclarator()
    * @generated
    */
   int CONSTRUCTOR_DECLARATOR = 86;

   /**
    * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTRUCTOR_DECLARATOR__TYPE_PARAMETERS = 0;

   /**
    * The feature id for the '<em><b>Simple Type Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTRUCTOR_DECLARATOR__SIMPLE_TYPE_NAME = 1;

   /**
    * The feature id for the '<em><b>Formal Parameter List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST = 2;

   /**
    * The number of structural features of the '<em>constructor Declarator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTRUCTOR_DECLARATOR_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.enumDeclarationImpl
    * <em>enum Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.enumDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumDeclaration()
    * @generated
    */
   int ENUM_DECLARATION = 87;

   /**
    * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_DECLARATION__MODIFIERS = CLASS_DECLARATION__MODIFIERS;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_DECLARATION__NAME = CLASS_DECLARATION__NAME;

   /**
    * The feature id for the '<em><b>Superinterfaces</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_DECLARATION__SUPERINTERFACES = CLASS_DECLARATION__SUPERINTERFACES;

   /**
    * The feature id for the '<em><b>Enum Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_DECLARATION__ENUM_BODY = CLASS_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>enum Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_DECLARATION_FEATURE_COUNT = CLASS_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.enumBodyImpl <em>enum Body</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.enumBodyImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumBody()
    * @generated
    */
   int ENUM_BODY = 88;

   /**
    * The feature id for the '<em><b>Enum Constant List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_BODY__ENUM_CONSTANT_LIST = 0;

   /**
    * The feature id for the '<em><b>Enum Body Declarations</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_BODY__ENUM_BODY_DECLARATIONS = 1;

   /**
    * The number of structural features of the '<em>enum Body</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_BODY_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.enumConstantListImpl
    * <em>enum Constant List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.enumConstantListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumConstantList()
    * @generated
    */
   int ENUM_CONSTANT_LIST = 89;

   /**
    * The feature id for the '<em><b>Enum Constants</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_CONSTANT_LIST__ENUM_CONSTANTS = 0;

   /**
    * The number of structural features of the '<em>enum Constant List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_CONSTANT_LIST_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.enumConstantImpl <em>enum Constant</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.enumConstantImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumConstant()
    * @generated
    */
   int ENUM_CONSTANT = 90;

   /**
    * The feature id for the '<em><b>Enum Constant Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_CONSTANT__ENUM_CONSTANT_MODIFIERS = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_CONSTANT__NAME = 1;

   /**
    * The feature id for the '<em><b>Argument List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_CONSTANT__ARGUMENT_LIST = 2;

   /**
    * The feature id for the '<em><b>Class Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_CONSTANT__CLASS_BODY = 3;

   /**
    * The number of structural features of the '<em>enum Constant</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_CONSTANT_FEATURE_COUNT = 4;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.enumConstantModifierImpl
    * <em>enum Constant Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.enumConstantModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumConstantModifier()
    * @generated
    */
   int ENUM_CONSTANT_MODIFIER = 91;

   /**
    * The number of structural features of the '<em>enum Constant Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_CONSTANT_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.enumBodyDeclarationsImpl
    * <em>enum Body Declarations</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.enumBodyDeclarationsImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumBodyDeclarations()
    * @generated
    */
   int ENUM_BODY_DECLARATIONS = 92;

   /**
    * The feature id for the '<em><b>Class Body Declarations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_BODY_DECLARATIONS__CLASS_BODY_DECLARATIONS = 0;

   /**
    * The number of structural features of the '<em>enum Body Declarations</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENUM_BODY_DECLARATIONS_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceDeclarationImpl
    * <em>interface Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceDeclaration()
    * @generated
    */
   int INTERFACE_DECLARATION = 93;

   /**
    * The feature id for the '<em><b>Interface Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_DECLARATION__INTERFACE_MODIFIERS = TYPE_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_DECLARATION__NAME = TYPE_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>interface Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.normalInterfaceDeclarationImpl
    * <em>normal Interface Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.normalInterfaceDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getnormalInterfaceDeclaration()
    * @generated
    */
   int NORMAL_INTERFACE_DECLARATION = 94;

   /**
    * The feature id for the '<em><b>Interface Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_INTERFACE_DECLARATION__INTERFACE_MODIFIERS = INTERFACE_DECLARATION__INTERFACE_MODIFIERS;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_INTERFACE_DECLARATION__NAME = INTERFACE_DECLARATION__NAME;

   /**
    * The feature id for the '<em><b>Type Parameters</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS = INTERFACE_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Extends Interfaces</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES = INTERFACE_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Interface Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY = INTERFACE_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>normal Interface Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_INTERFACE_DECLARATION_FEATURE_COUNT = INTERFACE_DECLARATION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceModifierImpl
    * <em>interface Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceModifier()
    * @generated
    */
   int INTERFACE_MODIFIER = 95;

   /**
    * The number of structural features of the '<em>interface Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.JavaInterfaceModifierImpl
    * <em>Java Interface Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.JavaInterfaceModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaInterfaceModifier()
    * @generated
    */
   int JAVA_INTERFACE_MODIFIER = 96;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_INTERFACE_MODIFIER__MODIFIER = INTERFACE_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Java Interface Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_INTERFACE_MODIFIER_FEATURE_COUNT = INTERFACE_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.extendsInterfacesImpl
    * <em>extends Interfaces</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.extendsInterfacesImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getextendsInterfaces()
    * @generated
    */
   int EXTENDS_INTERFACES = 97;

   /**
    * The number of structural features of the '<em>extends Interfaces</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXTENDS_INTERFACES_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceBodyImpl <em>interface Body</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceBodyImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceBody()
    * @generated
    */
   int INTERFACE_BODY = 98;

   /**
    * The feature id for the '<em><b>Interface Member Declarations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS = 0;

   /**
    * The number of structural features of the '<em>interface Body</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_BODY_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceMemberDeclarationImpl
    * <em>interface Member Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceMemberDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceMemberDeclaration()
    * @generated
    */
   int INTERFACE_MEMBER_DECLARATION = 99;

   /**
    * The number of structural features of the '<em>interface Member Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.constantDeclarationImpl
    * <em>constant Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.constantDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstantDeclaration()
    * @generated
    */
   int CONSTANT_DECLARATION = 100;

   /**
    * The feature id for the '<em><b>Constant Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTANT_DECLARATION__CONSTANT_MODIFIERS = INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Unann Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTANT_DECLARATION__UNANN_TYPE = INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Variable Declarator List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST = INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>constant Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTANT_DECLARATION_FEATURE_COUNT = INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.constantModifierImpl
    * <em>constant Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.constantModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstantModifier()
    * @generated
    */
   int CONSTANT_MODIFIER = 101;

   /**
    * The number of structural features of the '<em>constant Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONSTANT_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.JavaConstantModifierImpl
    * <em>Java Constant Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.JavaConstantModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaConstantModifier()
    * @generated
    */
   int JAVA_CONSTANT_MODIFIER = 102;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_CONSTANT_MODIFIER__MODIFIER = CONSTANT_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Java Constant Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_CONSTANT_MODIFIER_FEATURE_COUNT = CONSTANT_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceMethodDeclarationImpl
    * <em>interface Method Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceMethodDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceMethodDeclaration()
    * @generated
    */
   int INTERFACE_METHOD_DECLARATION = 103;

   /**
    * The feature id for the '<em><b>Interface Method Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_METHOD_DECLARATION__INTERFACE_METHOD_MODIFIERS = INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Method Header</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_METHOD_DECLARATION__METHOD_HEADER = INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Method Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_METHOD_DECLARATION__METHOD_BODY = INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>interface Method Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_METHOD_DECLARATION_FEATURE_COUNT = INTERFACE_MEMBER_DECLARATION_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.interfaceMethodModifierImpl
    * <em>interface Method Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.interfaceMethodModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceMethodModifier()
    * @generated
    */
   int INTERFACE_METHOD_MODIFIER = 104;

   /**
    * The number of structural features of the '<em>interface Method Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int INTERFACE_METHOD_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.JavaInterfaceMethodModifiersImpl
    * <em>Java Interface Method Modifiers</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.JavaInterfaceMethodModifiersImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaInterfaceMethodModifiers()
    * @generated
    */
   int JAVA_INTERFACE_METHOD_MODIFIERS = 105;

   /**
    * The feature id for the '<em><b>Modifiers</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS = INTERFACE_METHOD_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Java Interface Method Modifiers</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_INTERFACE_METHOD_MODIFIERS_FEATURE_COUNT = INTERFACE_METHOD_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.annotationTypeDeclarationImpl
    * <em>annotation Type Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.annotationTypeDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeDeclaration()
    * @generated
    */
   int ANNOTATION_TYPE_DECLARATION = 106;

   /**
    * The feature id for the '<em><b>Interface Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_DECLARATION__INTERFACE_MODIFIERS = INTERFACE_DECLARATION__INTERFACE_MODIFIERS;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_DECLARATION__NAME = INTERFACE_DECLARATION__NAME;

   /**
    * The feature id for the '<em><b>Annotation Type Body</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY = INTERFACE_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>annotation Type Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_DECLARATION_FEATURE_COUNT = INTERFACE_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.annotationTypeBodyImpl
    * <em>annotation Type Body</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.annotationTypeBodyImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeBody()
    * @generated
    */
   int ANNOTATION_TYPE_BODY = 107;

   /**
    * The feature id for the '<em><b>Annotation Type Member Declarations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_BODY__ANNOTATION_TYPE_MEMBER_DECLARATIONS = 0;

   /**
    * The number of structural features of the '<em>annotation Type Body</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_BODY_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.annotationTypeMemberDeclarationImpl
    * <em>annotation Type Member Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.annotationTypeMemberDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeMemberDeclaration()
    * @generated
    */
   int ANNOTATION_TYPE_MEMBER_DECLARATION = 108;

   /**
    * The number of structural features of the '<em>annotation Type Member Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.annotationTypeElementDeclarationImpl
    * <em>annotation Type Element Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.annotationTypeElementDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeElementDeclaration()
    * @generated
    */
   int ANNOTATION_TYPE_ELEMENT_DECLARATION = 109;

   /**
    * The feature id for the '<em><b>Annotation Type Element Modifiers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_ELEMENT_DECLARATION__ANNOTATION_TYPE_ELEMENT_MODIFIERS = ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Unann Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE = ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_ELEMENT_DECLARATION__NAME = ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Dims</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS = ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Default Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE = ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>annotation Type Element Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_ELEMENT_DECLARATION_FEATURE_COUNT = ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT + 5;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.annotationTypeElementModifierImpl
    * <em>annotation Type Element Modifier</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.annotationTypeElementModifierImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeElementModifier()
    * @generated
    */
   int ANNOTATION_TYPE_ELEMENT_MODIFIER = 110;

   /**
    * The number of structural features of the '<em>annotation Type Element Modifier</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_TYPE_ELEMENT_MODIFIER_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.JavaAnnotationTypeElementModifiersImpl
    * <em>Java Annotation Type Element Modifiers</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.JavaAnnotationTypeElementModifiersImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaAnnotationTypeElementModifiers()
    * @generated
    */
   int JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS = 111;

   /**
    * The feature id for the '<em><b>Modifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS__MODIFIER = ANNOTATION_TYPE_ELEMENT_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Java Annotation Type Element Modifiers</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS_FEATURE_COUNT = ANNOTATION_TYPE_ELEMENT_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.defaultValueImpl <em>default Value</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.defaultValueImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getdefaultValue()
    * @generated
    */
   int DEFAULT_VALUE = 112;

   /**
    * The number of structural features of the '<em>default Value</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEFAULT_VALUE_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.annotationImpl <em>annotation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.annotationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotation()
    * @generated
    */
   int ANNOTATION = 113;

   /**
    * The feature id for the '<em><b>Type Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION__TYPE_NAME = TYPE_PARAMETER_MODIFIER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>annotation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_FEATURE_COUNT = TYPE_PARAMETER_MODIFIER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.normalAnnotationImpl
    * <em>normal Annotation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.normalAnnotationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getnormalAnnotation()
    * @generated
    */
   int NORMAL_ANNOTATION = 114;

   /**
    * The feature id for the '<em><b>Type Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_ANNOTATION__TYPE_NAME = ANNOTATION__TYPE_NAME;

   /**
    * The feature id for the '<em><b>Element Value Pair List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST = ANNOTATION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>normal Annotation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int NORMAL_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.elementValuePairListImpl
    * <em>element Value Pair List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.elementValuePairListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValuePairList()
    * @generated
    */
   int ELEMENT_VALUE_PAIR_LIST = 115;

   /**
    * The feature id for the '<em><b>Element Value Pairs</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_PAIR_LIST__ELEMENT_VALUE_PAIRS = 0;

   /**
    * The number of structural features of the '<em>element Value Pair List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_PAIR_LIST_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.elementValuePairImpl
    * <em>element Value Pair</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.elementValuePairImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValuePair()
    * @generated
    */
   int ELEMENT_VALUE_PAIR = 116;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_PAIR__NAME = 0;

   /**
    * The feature id for the '<em><b>Element Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_PAIR__ELEMENT_VALUE = 1;

   /**
    * The number of structural features of the '<em>element Value Pair</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_PAIR_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.elementValueImpl <em>element Value</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.elementValueImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValue()
    * @generated
    */
   int ELEMENT_VALUE = 117;

   /**
    * The number of structural features of the '<em>element Value</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_FEATURE_COUNT = DEFAULT_VALUE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.elementValueArrayInitializerImpl
    * <em>element Value Array Initializer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.elementValueArrayInitializerImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValueArrayInitializer()
    * @generated
    */
   int ELEMENT_VALUE_ARRAY_INITIALIZER = 118;

   /**
    * The feature id for the '<em><b>Element Value List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST = ELEMENT_VALUE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>element Value Array Initializer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_ARRAY_INITIALIZER_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.elementValueListImpl
    * <em>element Value List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.elementValueListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValueList()
    * @generated
    */
   int ELEMENT_VALUE_LIST = 119;

   /**
    * The feature id for the '<em><b>Element Values</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_LIST__ELEMENT_VALUES = 0;

   /**
    * The number of structural features of the '<em>element Value List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ELEMENT_VALUE_LIST_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.markerAnnotationImpl
    * <em>marker Annotation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.markerAnnotationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmarkerAnnotation()
    * @generated
    */
   int MARKER_ANNOTATION = 120;

   /**
    * The feature id for the '<em><b>Type Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MARKER_ANNOTATION__TYPE_NAME = ANNOTATION__TYPE_NAME;

   /**
    * The number of structural features of the '<em>marker Annotation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MARKER_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.singleElementAnnotationImpl
    * <em>single Element Annotation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.singleElementAnnotationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsingleElementAnnotation()
    * @generated
    */
   int SINGLE_ELEMENT_ANNOTATION = 121;

   /**
    * The feature id for the '<em><b>Type Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SINGLE_ELEMENT_ANNOTATION__TYPE_NAME = ANNOTATION__TYPE_NAME;

   /**
    * The feature id for the '<em><b>Element Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SINGLE_ELEMENT_ANNOTATION__ELEMENT_VALUE = ANNOTATION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>single Element Annotation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SINGLE_ELEMENT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.arrayInitializerImpl
    * <em>array Initializer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.arrayInitializerImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getarrayInitializer()
    * @generated
    */
   int ARRAY_INITIALIZER = 122;

   /**
    * The feature id for the '<em><b>Variable Initializer List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST = VARIABLE_INITIALIZER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>array Initializer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ARRAY_INITIALIZER_FEATURE_COUNT = VARIABLE_INITIALIZER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.variableInitializerListImpl
    * <em>variable Initializer List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.variableInitializerListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableInitializerList()
    * @generated
    */
   int VARIABLE_INITIALIZER_LIST = 123;

   /**
    * The feature id for the '<em><b>Variable Initializer</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_INITIALIZER_LIST__VARIABLE_INITIALIZER = 0;

   /**
    * The number of structural features of the '<em>variable Initializer List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VARIABLE_INITIALIZER_LIST_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.blockImpl <em>block</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.blockImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getblock()
    * @generated
    */
   int BLOCK = 124;

   /**
    * The feature id for the '<em><b>Dummy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BLOCK__DUMMY = METHOD_BODY_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>block</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BLOCK_FEATURE_COUNT = METHOD_BODY_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.blockStatementsImpl
    * <em>block Statements</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.blockStatementsImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getblockStatements()
    * @generated
    */
   int BLOCK_STATEMENTS = 125;

   /**
    * The feature id for the '<em><b>Dummy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BLOCK_STATEMENTS__DUMMY = 0;

   /**
    * The number of structural features of the '<em>block Statements</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BLOCK_STATEMENTS_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.argumentListImpl <em>argument List</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.argumentListImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getargumentList()
    * @generated
    */
   int ARGUMENT_LIST = 126;

   /**
    * The feature id for the '<em><b>Dummy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ARGUMENT_LIST__DUMMY = 0;

   /**
    * The number of structural features of the '<em>argument List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ARGUMENT_LIST_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.primaryImpl <em>primary</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.primaryImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getprimary()
    * @generated
    */
   int PRIMARY = 127;

   /**
    * The feature id for the '<em><b>Dummy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PRIMARY__DUMMY = 0;

   /**
    * The number of structural features of the '<em>primary</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PRIMARY_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.expressionImpl <em>expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.expressionImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getexpression()
    * @generated
    */
   int EXPRESSION = 128;

   /**
    * The feature id for the '<em><b>Dummy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXPRESSION__DUMMY = VARIABLE_INITIALIZER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXPRESSION_FEATURE_COUNT = VARIABLE_INITIALIZER_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.conditionalExpressionImpl
    * <em>conditional Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.conditionalExpressionImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconditionalExpression()
    * @generated
    */
   int CONDITIONAL_EXPRESSION = 129;

   /**
    * The feature id for the '<em><b>Dummy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION__DUMMY = ELEMENT_VALUE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>conditional Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CONDITIONAL_EXPRESSION_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.EmptyTypeDeclarationImpl
    * <em>Empty Type Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.EmptyTypeDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getEmptyTypeDeclaration()
    * @generated
    */
   int EMPTY_TYPE_DECLARATION = 130;

   /**
    * The number of structural features of the '<em>Empty Type Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EMPTY_TYPE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.impl.EmptyClassMemberDeclarationImpl
    * <em>Empty Class Member Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.impl.EmptyClassMemberDeclarationImpl
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getEmptyClassMemberDeclaration()
    * @generated
    */
   int EMPTY_CLASS_MEMBER_DECLARATION = 131;

   /**
    * The number of structural features of the '<em>Empty Class Member Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EMPTY_CLASS_MEMBER_DECLARATION_FEATURE_COUNT = CLASS_MEMBER_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.ClassModifiers <em>Class Modifiers</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.ClassModifiers
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getClassModifiers()
    * @generated
    */
   int CLASS_MODIFIERS = 132;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.FieldModifiers <em>Field Modifiers</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.FieldModifiers
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getFieldModifiers()
    * @generated
    */
   int FIELD_MODIFIERS = 133;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.methodModifiers <em>method Modifiers</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.methodModifiers
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodModifiers()
    * @generated
    */
   int METHOD_MODIFIERS = 134;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.VariableModifiers <em>Variable Modifiers</em>}'
    * enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.VariableModifiers
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getVariableModifiers()
    * @generated
    */
   int VARIABLE_MODIFIERS = 135;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.ConstructorModifiers
    * <em>Constructor Modifiers</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.ConstructorModifiers
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getConstructorModifiers()
    * @generated
    */
   int CONSTRUCTOR_MODIFIERS = 136;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.InterfaceModifiers <em>Interface Modifiers</em>}'
    * enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.InterfaceModifiers
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getInterfaceModifiers()
    * @generated
    */
   int INTERFACE_MODIFIERS = 137;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.ConstantModifiers <em>Constant Modifiers</em>}'
    * enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.ConstantModifiers
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getConstantModifiers()
    * @generated
    */
   int CONSTANT_MODIFIERS = 138;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.InterfaceMethodModifiers
    * <em>Interface Method Modifiers</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.InterfaceMethodModifiers
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getInterfaceMethodModifiers()
    * @generated
    */
   int INTERFACE_METHOD_MODIFIERS = 139;

   /**
    * The meta object id for the '{@link org.sourcepit.java.type.type.AnnotationTypeElementModifiers
    * <em>Annotation Type Element Modifiers</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.java.type.type.AnnotationTypeElementModifiers
    * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getAnnotationTypeElementModifiers()
    * @generated
    */
   int ANNOTATION_TYPE_ELEMENT_MODIFIERS = 140;


   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.Model <em>Model</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Model</em>'.
    * @see org.sourcepit.java.type.type.Model
    * @generated
    */
   EClass getModel();

   /**
    * Returns the meta object for the containment reference '{@link org.sourcepit.java.type.type.Model#getType
    * <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type</em>'.
    * @see org.sourcepit.java.type.type.Model#getType()
    * @see #getModel()
    * @generated
    */
   EReference getModel_Type();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.type <em>type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type</em>'.
    * @see org.sourcepit.java.type.type.type
    * @generated
    */
   EClass gettype();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.primitiveType <em>primitive Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>primitive Type</em>'.
    * @see org.sourcepit.java.type.type.primitiveType
    * @generated
    */
   EClass getprimitiveType();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.primitiveType#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.primitiveType#getAnnotations()
    * @see #getprimitiveType()
    * @generated
    */
   EReference getprimitiveType_Annotations();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.primitiveType#getTypeName
    * <em>Type Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Type Name</em>'.
    * @see org.sourcepit.java.type.type.primitiveType#getTypeName()
    * @see #getprimitiveType()
    * @generated
    */
   EAttribute getprimitiveType_TypeName();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.referenceType <em>reference Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>reference Type</em>'.
    * @see org.sourcepit.java.type.type.referenceType
    * @generated
    */
   EClass getreferenceType();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classOrInterfaceType
    * <em>class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Or Interface Type</em>'.
    * @see org.sourcepit.java.type.type.classOrInterfaceType
    * @generated
    */
   EClass getclassOrInterfaceType();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.classOrInterfaceType#getClassOrInterfaceTypeSegments
    * <em>Class Or Interface Type Segments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Class Or Interface Type Segments</em>'.
    * @see org.sourcepit.java.type.type.classOrInterfaceType#getClassOrInterfaceTypeSegments()
    * @see #getclassOrInterfaceType()
    * @generated
    */
   EReference getclassOrInterfaceType_ClassOrInterfaceTypeSegments();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment
    * <em>class Or Interface Type Segment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Or Interface Type Segment</em>'.
    * @see org.sourcepit.java.type.type.classOrInterfaceTypeSegment
    * @generated
    */
   EClass getclassOrInterfaceTypeSegment();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getAnnotations()
    * @see #getclassOrInterfaceTypeSegment()
    * @generated
    */
   EReference getclassOrInterfaceTypeSegment_Annotations();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getName()
    * @see #getclassOrInterfaceTypeSegment()
    * @generated
    */
   EAttribute getclassOrInterfaceTypeSegment_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getTypeArguments <em>Type Arguments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Arguments</em>'.
    * @see org.sourcepit.java.type.type.classOrInterfaceTypeSegment#getTypeArguments()
    * @see #getclassOrInterfaceTypeSegment()
    * @generated
    */
   EReference getclassOrInterfaceTypeSegment_TypeArguments();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classType <em>class Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Type</em>'.
    * @see org.sourcepit.java.type.type.classType
    * @generated
    */
   EClass getclassType();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.classType#getTypeArguments <em>Type Arguments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Arguments</em>'.
    * @see org.sourcepit.java.type.type.classType#getTypeArguments()
    * @see #getclassType()
    * @generated
    */
   EReference getclassType_TypeArguments();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.classType#getClassOrInterfaceType <em>Class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Class Or Interface Type</em>'.
    * @see org.sourcepit.java.type.type.classType#getClassOrInterfaceType()
    * @see #getclassType()
    * @generated
    */
   EReference getclassType_ClassOrInterfaceType();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classType_lf_classOrInterfaceType
    * <em>class Type lf class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Type lf class Or Interface Type</em>'.
    * @see org.sourcepit.java.type.type.classType_lf_classOrInterfaceType
    * @generated
    */
   EClass getclassType_lf_classOrInterfaceType();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.classType_lf_classOrInterfaceType#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.classType_lf_classOrInterfaceType#getAnnotations()
    * @see #getclassType_lf_classOrInterfaceType()
    * @generated
    */
   EReference getclassType_lf_classOrInterfaceType_Annotations();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.java.type.type.classType_lf_classOrInterfaceType#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.classType_lf_classOrInterfaceType#getName()
    * @see #getclassType_lf_classOrInterfaceType()
    * @generated
    */
   EAttribute getclassType_lf_classOrInterfaceType_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.classType_lf_classOrInterfaceType#getTypeArguments <em>Type Arguments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Arguments</em>'.
    * @see org.sourcepit.java.type.type.classType_lf_classOrInterfaceType#getTypeArguments()
    * @see #getclassType_lf_classOrInterfaceType()
    * @generated
    */
   EReference getclassType_lf_classOrInterfaceType_TypeArguments();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType
    * <em>class Type lfno class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Type lfno class Or Interface Type</em>'.
    * @see org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType
    * @generated
    */
   EClass getclassType_lfno_classOrInterfaceType();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType#getAnnotations()
    * @see #getclassType_lfno_classOrInterfaceType()
    * @generated
    */
   EReference getclassType_lfno_classOrInterfaceType_Annotations();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType#getName()
    * @see #getclassType_lfno_classOrInterfaceType()
    * @generated
    */
   EAttribute getclassType_lfno_classOrInterfaceType_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType#getTypeArguments <em>Type Arguments</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Arguments</em>'.
    * @see org.sourcepit.java.type.type.classType_lfno_classOrInterfaceType#getTypeArguments()
    * @see #getclassType_lfno_classOrInterfaceType()
    * @generated
    */
   EReference getclassType_lfno_classOrInterfaceType_TypeArguments();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceType <em>interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Type</em>'.
    * @see org.sourcepit.java.type.type.interfaceType
    * @generated
    */
   EClass getinterfaceType();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceType_lf_classOrInterfaceType
    * <em>interface Type lf class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Type lf class Or Interface Type</em>'.
    * @see org.sourcepit.java.type.type.interfaceType_lf_classOrInterfaceType
    * @generated
    */
   EClass getinterfaceType_lf_classOrInterfaceType();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceType_lfno_classOrInterfaceType
    * <em>interface Type lfno class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Type lfno class Or Interface Type</em>'.
    * @see org.sourcepit.java.type.type.interfaceType_lfno_classOrInterfaceType
    * @generated
    */
   EClass getinterfaceType_lfno_classOrInterfaceType();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeVariable <em>type Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Variable</em>'.
    * @see org.sourcepit.java.type.type.typeVariable
    * @generated
    */
   EClass gettypeVariable();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.arrayType <em>array Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>array Type</em>'.
    * @see org.sourcepit.java.type.type.arrayType
    * @generated
    */
   EClass getarrayType();

   /**
    * Returns the meta object for the containment reference '{@link org.sourcepit.java.type.type.arrayType#getType
    * <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type</em>'.
    * @see org.sourcepit.java.type.type.arrayType#getType()
    * @see #getarrayType()
    * @generated
    */
   EReference getarrayType_Type();

   /**
    * Returns the meta object for the containment reference '{@link org.sourcepit.java.type.type.arrayType#getDims
    * <em>Dims</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Dims</em>'.
    * @see org.sourcepit.java.type.type.arrayType#getDims()
    * @see #getarrayType()
    * @generated
    */
   EReference getarrayType_Dims();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.dims <em>dims</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>dims</em>'.
    * @see org.sourcepit.java.type.type.dims
    * @generated
    */
   EClass getdims();

   /**
    * Returns the meta object for the containment reference list '{@link org.sourcepit.java.type.type.dims#getDims
    * <em>Dims</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Dims</em>'.
    * @see org.sourcepit.java.type.type.dims#getDims()
    * @see #getdims()
    * @generated
    */
   EReference getdims_Dims();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.dim <em>dim</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>dim</em>'.
    * @see org.sourcepit.java.type.type.dim
    * @generated
    */
   EClass getdim();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.dim#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.dim#getAnnotations()
    * @see #getdim()
    * @generated
    */
   EReference getdim_Annotations();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeParameter <em>type Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Parameter</em>'.
    * @see org.sourcepit.java.type.type.typeParameter
    * @generated
    */
   EClass gettypeParameter();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.typeParameter#getTypeParameterModifiers <em>Type Parameter Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Type Parameter Modifiers</em>'.
    * @see org.sourcepit.java.type.type.typeParameter#getTypeParameterModifiers()
    * @see #gettypeParameter()
    * @generated
    */
   EReference gettypeParameter_TypeParameterModifiers();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.typeParameter#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.typeParameter#getName()
    * @see #gettypeParameter()
    * @generated
    */
   EAttribute gettypeParameter_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.typeParameter#getTypeBound <em>Type Bound</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Bound</em>'.
    * @see org.sourcepit.java.type.type.typeParameter#getTypeBound()
    * @see #gettypeParameter()
    * @generated
    */
   EReference gettypeParameter_TypeBound();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeParameterModifier
    * <em>type Parameter Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Parameter Modifier</em>'.
    * @see org.sourcepit.java.type.type.typeParameterModifier
    * @generated
    */
   EClass gettypeParameterModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeBound <em>type Bound</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Bound</em>'.
    * @see org.sourcepit.java.type.type.typeBound
    * @generated
    */
   EClass gettypeBound();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.typeBound#getTypeVariable <em>Type Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Variable</em>'.
    * @see org.sourcepit.java.type.type.typeBound#getTypeVariable()
    * @see #gettypeBound()
    * @generated
    */
   EReference gettypeBound_TypeVariable();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.typeBound#getClassOrInterfaceType <em>Class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Class Or Interface Type</em>'.
    * @see org.sourcepit.java.type.type.typeBound#getClassOrInterfaceType()
    * @see #gettypeBound()
    * @generated
    */
   EReference gettypeBound_ClassOrInterfaceType();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.typeBound#getAdditionalBound <em>Additional Bound</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Additional Bound</em>'.
    * @see org.sourcepit.java.type.type.typeBound#getAdditionalBound()
    * @see #gettypeBound()
    * @generated
    */
   EReference gettypeBound_AdditionalBound();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.additionalBound <em>additional Bound</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>additional Bound</em>'.
    * @see org.sourcepit.java.type.type.additionalBound
    * @generated
    */
   EClass getadditionalBound();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeArguments <em>type Arguments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Arguments</em>'.
    * @see org.sourcepit.java.type.type.typeArguments
    * @generated
    */
   EClass gettypeArguments();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeArgumentList
    * <em>type Argument List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Argument List</em>'.
    * @see org.sourcepit.java.type.type.typeArgumentList
    * @generated
    */
   EClass gettypeArgumentList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.typeArgumentList#getTypeArguments <em>Type Arguments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Type Arguments</em>'.
    * @see org.sourcepit.java.type.type.typeArgumentList#getTypeArguments()
    * @see #gettypeArgumentList()
    * @generated
    */
   EReference gettypeArgumentList_TypeArguments();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeArgument <em>type Argument</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Argument</em>'.
    * @see org.sourcepit.java.type.type.typeArgument
    * @generated
    */
   EClass gettypeArgument();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.wildcard <em>wildcard</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>wildcard</em>'.
    * @see org.sourcepit.java.type.type.wildcard
    * @generated
    */
   EClass getwildcard();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.wildcard#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.wildcard#getAnnotations()
    * @see #getwildcard()
    * @generated
    */
   EReference getwildcard_Annotations();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.wildcard#getWildcardBounds <em>Wildcard Bounds</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Wildcard Bounds</em>'.
    * @see org.sourcepit.java.type.type.wildcard#getWildcardBounds()
    * @see #getwildcard()
    * @generated
    */
   EReference getwildcard_WildcardBounds();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.wildcardBounds <em>wildcard Bounds</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>wildcard Bounds</em>'.
    * @see org.sourcepit.java.type.type.wildcardBounds
    * @generated
    */
   EClass getwildcardBounds();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.compilationUnit <em>compilation Unit</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>compilation Unit</em>'.
    * @see org.sourcepit.java.type.type.compilationUnit
    * @generated
    */
   EClass getcompilationUnit();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.compilationUnit#getPackage <em>Package</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Package</em>'.
    * @see org.sourcepit.java.type.type.compilationUnit#getPackage()
    * @see #getcompilationUnit()
    * @generated
    */
   EReference getcompilationUnit_Package();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.compilationUnit#getImports <em>Imports</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Imports</em>'.
    * @see org.sourcepit.java.type.type.compilationUnit#getImports()
    * @see #getcompilationUnit()
    * @generated
    */
   EReference getcompilationUnit_Imports();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.compilationUnit#getTypes <em>Types</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Types</em>'.
    * @see org.sourcepit.java.type.type.compilationUnit#getTypes()
    * @see #getcompilationUnit()
    * @generated
    */
   EReference getcompilationUnit_Types();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.packageDeclaration
    * <em>package Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>package Declaration</em>'.
    * @see org.sourcepit.java.type.type.packageDeclaration
    * @generated
    */
   EClass getpackageDeclaration();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.packageDeclaration#getModifiers <em>Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Modifiers</em>'.
    * @see org.sourcepit.java.type.type.packageDeclaration#getModifiers()
    * @see #getpackageDeclaration()
    * @generated
    */
   EReference getpackageDeclaration_Modifiers();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.packageDeclaration#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.packageDeclaration#getName()
    * @see #getpackageDeclaration()
    * @generated
    */
   EAttribute getpackageDeclaration_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.packageModifier <em>package Modifier</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>package Modifier</em>'.
    * @see org.sourcepit.java.type.type.packageModifier
    * @generated
    */
   EClass getpackageModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.importDeclaration
    * <em>import Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>import Declaration</em>'.
    * @see org.sourcepit.java.type.type.importDeclaration
    * @generated
    */
   EClass getimportDeclaration();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.importDeclaration#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.importDeclaration#getName()
    * @see #getimportDeclaration()
    * @generated
    */
   EAttribute getimportDeclaration_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.singleTypeImportDeclaration
    * <em>single Type Import Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>single Type Import Declaration</em>'.
    * @see org.sourcepit.java.type.type.singleTypeImportDeclaration
    * @generated
    */
   EClass getsingleTypeImportDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeImportOnDemandDeclaration
    * <em>type Import On Demand Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Import On Demand Declaration</em>'.
    * @see org.sourcepit.java.type.type.typeImportOnDemandDeclaration
    * @generated
    */
   EClass gettypeImportOnDemandDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.singleStaticImportDeclaration
    * <em>single Static Import Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>single Static Import Declaration</em>'.
    * @see org.sourcepit.java.type.type.singleStaticImportDeclaration
    * @generated
    */
   EClass getsingleStaticImportDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.staticImportOnDemandDeclaration
    * <em>static Import On Demand Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>static Import On Demand Declaration</em>'.
    * @see org.sourcepit.java.type.type.staticImportOnDemandDeclaration
    * @generated
    */
   EClass getstaticImportOnDemandDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeDeclaration <em>type Declaration</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Declaration</em>'.
    * @see org.sourcepit.java.type.type.typeDeclaration
    * @generated
    */
   EClass gettypeDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classDeclaration
    * <em>class Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Declaration</em>'.
    * @see org.sourcepit.java.type.type.classDeclaration
    * @generated
    */
   EClass getclassDeclaration();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.classDeclaration#getModifiers <em>Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Modifiers</em>'.
    * @see org.sourcepit.java.type.type.classDeclaration#getModifiers()
    * @see #getclassDeclaration()
    * @generated
    */
   EReference getclassDeclaration_Modifiers();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.classDeclaration#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.classDeclaration#getName()
    * @see #getclassDeclaration()
    * @generated
    */
   EAttribute getclassDeclaration_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.classDeclaration#getSuperinterfaces <em>Superinterfaces</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Superinterfaces</em>'.
    * @see org.sourcepit.java.type.type.classDeclaration#getSuperinterfaces()
    * @see #getclassDeclaration()
    * @generated
    */
   EReference getclassDeclaration_Superinterfaces();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.normalClassDeclaration
    * <em>normal Class Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>normal Class Declaration</em>'.
    * @see org.sourcepit.java.type.type.normalClassDeclaration
    * @generated
    */
   EClass getnormalClassDeclaration();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.normalClassDeclaration#getTypeParameters <em>Type Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Parameters</em>'.
    * @see org.sourcepit.java.type.type.normalClassDeclaration#getTypeParameters()
    * @see #getnormalClassDeclaration()
    * @generated
    */
   EReference getnormalClassDeclaration_TypeParameters();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.normalClassDeclaration#getSuperclass <em>Superclass</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Superclass</em>'.
    * @see org.sourcepit.java.type.type.normalClassDeclaration#getSuperclass()
    * @see #getnormalClassDeclaration()
    * @generated
    */
   EReference getnormalClassDeclaration_Superclass();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.normalClassDeclaration#getClassBody <em>Class Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Class Body</em>'.
    * @see org.sourcepit.java.type.type.normalClassDeclaration#getClassBody()
    * @see #getnormalClassDeclaration()
    * @generated
    */
   EReference getnormalClassDeclaration_ClassBody();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classModifier <em>class Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Modifier</em>'.
    * @see org.sourcepit.java.type.type.classModifier
    * @generated
    */
   EClass getclassModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.JavaClassModifier
    * <em>Java Class Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Java Class Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaClassModifier
    * @generated
    */
   EClass getJavaClassModifier();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.JavaClassModifier#getModifier
    * <em>Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaClassModifier#getModifier()
    * @see #getJavaClassModifier()
    * @generated
    */
   EAttribute getJavaClassModifier_Modifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeParameters <em>type Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Parameters</em>'.
    * @see org.sourcepit.java.type.type.typeParameters
    * @generated
    */
   EClass gettypeParameters();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.typeParameterList
    * <em>type Parameter List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>type Parameter List</em>'.
    * @see org.sourcepit.java.type.type.typeParameterList
    * @generated
    */
   EClass gettypeParameterList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.typeParameterList#getTypeParameters <em>Type Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
    * @see org.sourcepit.java.type.type.typeParameterList#getTypeParameters()
    * @see #gettypeParameterList()
    * @generated
    */
   EReference gettypeParameterList_TypeParameters();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.superclass <em>superclass</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>superclass</em>'.
    * @see org.sourcepit.java.type.type.superclass
    * @generated
    */
   EClass getsuperclass();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.superinterfaces <em>superinterfaces</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>superinterfaces</em>'.
    * @see org.sourcepit.java.type.type.superinterfaces
    * @generated
    */
   EClass getsuperinterfaces();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceTypeList
    * <em>interface Type List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Type List</em>'.
    * @see org.sourcepit.java.type.type.interfaceTypeList
    * @generated
    */
   EClass getinterfaceTypeList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.interfaceTypeList#getInterfaceTypes <em>Interface Types</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Interface Types</em>'.
    * @see org.sourcepit.java.type.type.interfaceTypeList#getInterfaceTypes()
    * @see #getinterfaceTypeList()
    * @generated
    */
   EReference getinterfaceTypeList_InterfaceTypes();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classBody <em>class Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Body</em>'.
    * @see org.sourcepit.java.type.type.classBody
    * @generated
    */
   EClass getclassBody();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.classBody#getDeclarations <em>Declarations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Declarations</em>'.
    * @see org.sourcepit.java.type.type.classBody#getDeclarations()
    * @see #getclassBody()
    * @generated
    */
   EReference getclassBody_Declarations();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classBodyDeclaration
    * <em>class Body Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Body Declaration</em>'.
    * @see org.sourcepit.java.type.type.classBodyDeclaration
    * @generated
    */
   EClass getclassBodyDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.classMemberDeclaration
    * <em>class Member Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>class Member Declaration</em>'.
    * @see org.sourcepit.java.type.type.classMemberDeclaration
    * @generated
    */
   EClass getclassMemberDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.fieldDeclaration
    * <em>field Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>field Declaration</em>'.
    * @see org.sourcepit.java.type.type.fieldDeclaration
    * @generated
    */
   EClass getfieldDeclaration();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.fieldDeclaration#getFieldModifiers <em>Field Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Field Modifiers</em>'.
    * @see org.sourcepit.java.type.type.fieldDeclaration#getFieldModifiers()
    * @see #getfieldDeclaration()
    * @generated
    */
   EReference getfieldDeclaration_FieldModifiers();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.fieldDeclaration#getUnannType <em>Unann Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Unann Type</em>'.
    * @see org.sourcepit.java.type.type.fieldDeclaration#getUnannType()
    * @see #getfieldDeclaration()
    * @generated
    */
   EReference getfieldDeclaration_UnannType();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.fieldDeclaration#getVariableDeclaratorList <em>Variable Declarator List</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Variable Declarator List</em>'.
    * @see org.sourcepit.java.type.type.fieldDeclaration#getVariableDeclaratorList()
    * @see #getfieldDeclaration()
    * @generated
    */
   EReference getfieldDeclaration_VariableDeclaratorList();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.fieldModifier <em>field Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>field Modifier</em>'.
    * @see org.sourcepit.java.type.type.fieldModifier
    * @generated
    */
   EClass getfieldModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.JavaFieldModifier
    * <em>Java Field Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Java Field Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaFieldModifier
    * @generated
    */
   EClass getJavaFieldModifier();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.JavaFieldModifier#getModifier
    * <em>Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaFieldModifier#getModifier()
    * @see #getJavaFieldModifier()
    * @generated
    */
   EAttribute getJavaFieldModifier_Modifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.variableDeclaratorList
    * <em>variable Declarator List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>variable Declarator List</em>'.
    * @see org.sourcepit.java.type.type.variableDeclaratorList
    * @generated
    */
   EClass getvariableDeclaratorList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.variableDeclaratorList#getVariableDeclarators <em>Variable Declarators</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Variable Declarators</em>'.
    * @see org.sourcepit.java.type.type.variableDeclaratorList#getVariableDeclarators()
    * @see #getvariableDeclaratorList()
    * @generated
    */
   EReference getvariableDeclaratorList_VariableDeclarators();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.variableDeclarator
    * <em>variable Declarator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>variable Declarator</em>'.
    * @see org.sourcepit.java.type.type.variableDeclarator
    * @generated
    */
   EClass getvariableDeclarator();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.variableDeclarator#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Id</em>'.
    * @see org.sourcepit.java.type.type.variableDeclarator#getId()
    * @see #getvariableDeclarator()
    * @generated
    */
   EReference getvariableDeclarator_Id();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.variableDeclarator#getInitializer <em>Initializer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Initializer</em>'.
    * @see org.sourcepit.java.type.type.variableDeclarator#getInitializer()
    * @see #getvariableDeclarator()
    * @generated
    */
   EReference getvariableDeclarator_Initializer();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.variableDeclaratorId
    * <em>variable Declarator Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>variable Declarator Id</em>'.
    * @see org.sourcepit.java.type.type.variableDeclaratorId
    * @generated
    */
   EClass getvariableDeclaratorId();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.variableDeclaratorId#getId
    * <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see org.sourcepit.java.type.type.variableDeclaratorId#getId()
    * @see #getvariableDeclaratorId()
    * @generated
    */
   EAttribute getvariableDeclaratorId_Id();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.variableDeclaratorId#getDims <em>Dims</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Dims</em>'.
    * @see org.sourcepit.java.type.type.variableDeclaratorId#getDims()
    * @see #getvariableDeclaratorId()
    * @generated
    */
   EReference getvariableDeclaratorId_Dims();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.variableInitializer
    * <em>variable Initializer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>variable Initializer</em>'.
    * @see org.sourcepit.java.type.type.variableInitializer
    * @generated
    */
   EClass getvariableInitializer();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.unannType <em>unann Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>unann Type</em>'.
    * @see org.sourcepit.java.type.type.unannType
    * @generated
    */
   EClass getunannType();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.unannPrimitiveType
    * <em>unann Primitive Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>unann Primitive Type</em>'.
    * @see org.sourcepit.java.type.type.unannPrimitiveType
    * @generated
    */
   EClass getunannPrimitiveType();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.unannPrimitiveType#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.unannPrimitiveType#getName()
    * @see #getunannPrimitiveType()
    * @generated
    */
   EAttribute getunannPrimitiveType_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.unannReferenceType
    * <em>unann Reference Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>unann Reference Type</em>'.
    * @see org.sourcepit.java.type.type.unannReferenceType
    * @generated
    */
   EClass getunannReferenceType();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.unannClassOrInterfaceType
    * <em>unann Class Or Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>unann Class Or Interface Type</em>'.
    * @see org.sourcepit.java.type.type.unannClassOrInterfaceType
    * @generated
    */
   EClass getunannClassOrInterfaceType();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.unannClassType <em>unann Class Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>unann Class Type</em>'.
    * @see org.sourcepit.java.type.type.unannClassType
    * @generated
    */
   EClass getunannClassType();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.unannClassType#getClassTypeSegment <em>Class Type Segment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Class Type Segment</em>'.
    * @see org.sourcepit.java.type.type.unannClassType#getClassTypeSegment()
    * @see #getunannClassType()
    * @generated
    */
   EReference getunannClassType_ClassTypeSegment();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.ClassTypeSegment
    * <em>Class Type Segment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Class Type Segment</em>'.
    * @see org.sourcepit.java.type.type.ClassTypeSegment
    * @generated
    */
   EClass getClassTypeSegment();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.ClassTypeSegment#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.ClassTypeSegment#getName()
    * @see #getClassTypeSegment()
    * @generated
    */
   EAttribute getClassTypeSegment_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.ClassTypeSegment#getTypeArguments <em>Type Arguments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Arguments</em>'.
    * @see org.sourcepit.java.type.type.ClassTypeSegment#getTypeArguments()
    * @see #getClassTypeSegment()
    * @generated
    */
   EReference getClassTypeSegment_TypeArguments();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations
    * <em>Class Type Segment With Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Class Type Segment With Annotations</em>'.
    * @see org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations
    * @generated
    */
   EClass getClassTypeSegmentWithAnnotations();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations#getAnnotations()
    * @see #getClassTypeSegmentWithAnnotations()
    * @generated
    */
   EReference getClassTypeSegmentWithAnnotations_Annotations();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations#getName()
    * @see #getClassTypeSegmentWithAnnotations()
    * @generated
    */
   EAttribute getClassTypeSegmentWithAnnotations_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations#getTypeArguments <em>Type Arguments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Arguments</em>'.
    * @see org.sourcepit.java.type.type.ClassTypeSegmentWithAnnotations#getTypeArguments()
    * @see #getClassTypeSegmentWithAnnotations()
    * @generated
    */
   EReference getClassTypeSegmentWithAnnotations_TypeArguments();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.unannInterfaceType
    * <em>unann Interface Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>unann Interface Type</em>'.
    * @see org.sourcepit.java.type.type.unannInterfaceType
    * @generated
    */
   EClass getunannInterfaceType();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.unannTypeVariable
    * <em>unann Type Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>unann Type Variable</em>'.
    * @see org.sourcepit.java.type.type.unannTypeVariable
    * @generated
    */
   EClass getunannTypeVariable();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.unannTypeVariable#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.unannTypeVariable#getName()
    * @see #getunannTypeVariable()
    * @generated
    */
   EAttribute getunannTypeVariable_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.unannArrayType <em>unann Array Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>unann Array Type</em>'.
    * @see org.sourcepit.java.type.type.unannArrayType
    * @generated
    */
   EClass getunannArrayType();

   /**
    * Returns the meta object for the containment reference '{@link org.sourcepit.java.type.type.unannArrayType#getDims
    * <em>Dims</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Dims</em>'.
    * @see org.sourcepit.java.type.type.unannArrayType#getDims()
    * @see #getunannArrayType()
    * @generated
    */
   EReference getunannArrayType_Dims();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.methodDeclaration
    * <em>method Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>method Declaration</em>'.
    * @see org.sourcepit.java.type.type.methodDeclaration
    * @generated
    */
   EClass getmethodDeclaration();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.methodDeclaration#getMethodModifiers <em>Method Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Method Modifiers</em>'.
    * @see org.sourcepit.java.type.type.methodDeclaration#getMethodModifiers()
    * @see #getmethodDeclaration()
    * @generated
    */
   EReference getmethodDeclaration_MethodModifiers();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.methodDeclaration#getMethodHeader <em>Method Header</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Method Header</em>'.
    * @see org.sourcepit.java.type.type.methodDeclaration#getMethodHeader()
    * @see #getmethodDeclaration()
    * @generated
    */
   EReference getmethodDeclaration_MethodHeader();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.methodDeclaration#getMethodBody <em>Method Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Method Body</em>'.
    * @see org.sourcepit.java.type.type.methodDeclaration#getMethodBody()
    * @see #getmethodDeclaration()
    * @generated
    */
   EReference getmethodDeclaration_MethodBody();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.methodModifier <em>method Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>method Modifier</em>'.
    * @see org.sourcepit.java.type.type.methodModifier
    * @generated
    */
   EClass getmethodModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.JavaMethodModifier
    * <em>Java Method Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Java Method Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaMethodModifier
    * @generated
    */
   EClass getJavaMethodModifier();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.JavaMethodModifier#getModifier
    * <em>Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaMethodModifier#getModifier()
    * @see #getJavaMethodModifier()
    * @generated
    */
   EAttribute getJavaMethodModifier_Modifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.methodHeader <em>method Header</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>method Header</em>'.
    * @see org.sourcepit.java.type.type.methodHeader
    * @generated
    */
   EClass getmethodHeader();

   /**
    * Returns the meta object for the containment reference '{@link org.sourcepit.java.type.type.methodHeader#getResult
    * <em>Result</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Result</em>'.
    * @see org.sourcepit.java.type.type.methodHeader#getResult()
    * @see #getmethodHeader()
    * @generated
    */
   EReference getmethodHeader_Result();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.methodHeader#getMethodDeclarator <em>Method Declarator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Method Declarator</em>'.
    * @see org.sourcepit.java.type.type.methodHeader#getMethodDeclarator()
    * @see #getmethodHeader()
    * @generated
    */
   EReference getmethodHeader_MethodDeclarator();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.methodHeader#getThrows_ <em>Throws </em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Throws </em>'.
    * @see org.sourcepit.java.type.type.methodHeader#getThrows_()
    * @see #getmethodHeader()
    * @generated
    */
   EReference getmethodHeader_Throws_();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.methodHeader#getTypeParameters <em>Type Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Parameters</em>'.
    * @see org.sourcepit.java.type.type.methodHeader#getTypeParameters()
    * @see #getmethodHeader()
    * @generated
    */
   EReference getmethodHeader_TypeParameters();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.methodHeader#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.methodHeader#getAnnotations()
    * @see #getmethodHeader()
    * @generated
    */
   EReference getmethodHeader_Annotations();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.result <em>result</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>result</em>'.
    * @see org.sourcepit.java.type.type.result
    * @generated
    */
   EClass getresult();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.voidType <em>void Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>void Type</em>'.
    * @see org.sourcepit.java.type.type.voidType
    * @generated
    */
   EClass getvoidType();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.voidType#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.voidType#getName()
    * @see #getvoidType()
    * @generated
    */
   EAttribute getvoidType_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.methodDeclarator
    * <em>method Declarator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>method Declarator</em>'.
    * @see org.sourcepit.java.type.type.methodDeclarator
    * @generated
    */
   EClass getmethodDeclarator();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.methodDeclarator#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.methodDeclarator#getName()
    * @see #getmethodDeclarator()
    * @generated
    */
   EAttribute getmethodDeclarator_Name();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.methodDeclarator#getParameters <em>Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Parameters</em>'.
    * @see org.sourcepit.java.type.type.methodDeclarator#getParameters()
    * @see #getmethodDeclarator()
    * @generated
    */
   EReference getmethodDeclarator_Parameters();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.methodDeclarator#getDims_ <em>Dims </em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Dims </em>'.
    * @see org.sourcepit.java.type.type.methodDeclarator#getDims_()
    * @see #getmethodDeclarator()
    * @generated
    */
   EReference getmethodDeclarator_Dims_();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.formalParameterList
    * <em>formal Parameter List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>formal Parameter List</em>'.
    * @see org.sourcepit.java.type.type.formalParameterList
    * @generated
    */
   EClass getformalParameterList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.formalParameterList#getParameters <em>Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Parameters</em>'.
    * @see org.sourcepit.java.type.type.formalParameterList#getParameters()
    * @see #getformalParameterList()
    * @generated
    */
   EReference getformalParameterList_Parameters();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.formalParameters
    * <em>formal Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>formal Parameters</em>'.
    * @see org.sourcepit.java.type.type.formalParameters
    * @generated
    */
   EClass getformalParameters();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.formalParameters#getParameters <em>Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Parameters</em>'.
    * @see org.sourcepit.java.type.type.formalParameters#getParameters()
    * @see #getformalParameters()
    * @generated
    */
   EReference getformalParameters_Parameters();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.formalParameter <em>formal Parameter</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>formal Parameter</em>'.
    * @see org.sourcepit.java.type.type.formalParameter
    * @generated
    */
   EClass getformalParameter();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.variableModifier
    * <em>variable Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>variable Modifier</em>'.
    * @see org.sourcepit.java.type.type.variableModifier
    * @generated
    */
   EClass getvariableModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.JavaVariableModifier
    * <em>Java Variable Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Java Variable Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaVariableModifier
    * @generated
    */
   EClass getJavaVariableModifier();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.JavaVariableModifier#getModifier
    * <em>Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaVariableModifier#getModifier()
    * @see #getJavaVariableModifier()
    * @generated
    */
   EAttribute getJavaVariableModifier_Modifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.lastFormalParameter
    * <em>last Formal Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>last Formal Parameter</em>'.
    * @see org.sourcepit.java.type.type.lastFormalParameter
    * @generated
    */
   EClass getlastFormalParameter();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.lastFormalParameter#getModifiers <em>Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Modifiers</em>'.
    * @see org.sourcepit.java.type.type.lastFormalParameter#getModifiers()
    * @see #getlastFormalParameter()
    * @generated
    */
   EReference getlastFormalParameter_Modifiers();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.lastFormalParameter#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type</em>'.
    * @see org.sourcepit.java.type.type.lastFormalParameter#getType()
    * @see #getlastFormalParameter()
    * @generated
    */
   EReference getlastFormalParameter_Type();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.lastFormalParameter#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.lastFormalParameter#getAnnotations()
    * @see #getlastFormalParameter()
    * @generated
    */
   EReference getlastFormalParameter_Annotations();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.lastFormalParameter#isVarargs
    * <em>Varargs</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Varargs</em>'.
    * @see org.sourcepit.java.type.type.lastFormalParameter#isVarargs()
    * @see #getlastFormalParameter()
    * @generated
    */
   EAttribute getlastFormalParameter_Varargs();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.lastFormalParameter#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.lastFormalParameter#getName()
    * @see #getlastFormalParameter()
    * @generated
    */
   EReference getlastFormalParameter_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.receiverParameter
    * <em>receiver Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>receiver Parameter</em>'.
    * @see org.sourcepit.java.type.type.receiverParameter
    * @generated
    */
   EClass getreceiverParameter();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.receiverParameter#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.receiverParameter#getAnnotations()
    * @see #getreceiverParameter()
    * @generated
    */
   EReference getreceiverParameter_Annotations();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.receiverParameter#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type</em>'.
    * @see org.sourcepit.java.type.type.receiverParameter#getType()
    * @see #getreceiverParameter()
    * @generated
    */
   EReference getreceiverParameter_Type();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.receiverParameter#getQualifier
    * <em>Qualifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Qualifier</em>'.
    * @see org.sourcepit.java.type.type.receiverParameter#getQualifier()
    * @see #getreceiverParameter()
    * @generated
    */
   EAttribute getreceiverParameter_Qualifier();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.receiverParameter#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.receiverParameter#getName()
    * @see #getreceiverParameter()
    * @generated
    */
   EAttribute getreceiverParameter_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.throws_ <em>throws </em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>throws </em>'.
    * @see org.sourcepit.java.type.type.throws_
    * @generated
    */
   EClass getthrows_();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.exceptionTypeList
    * <em>exception Type List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>exception Type List</em>'.
    * @see org.sourcepit.java.type.type.exceptionTypeList
    * @generated
    */
   EClass getexceptionTypeList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.exceptionTypeList#getExceptionTypes <em>Exception Types</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Exception Types</em>'.
    * @see org.sourcepit.java.type.type.exceptionTypeList#getExceptionTypes()
    * @see #getexceptionTypeList()
    * @generated
    */
   EReference getexceptionTypeList_ExceptionTypes();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.exceptionType <em>exception Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>exception Type</em>'.
    * @see org.sourcepit.java.type.type.exceptionType
    * @generated
    */
   EClass getexceptionType();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.exceptionType#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.java.type.type.exceptionType#getAnnotations()
    * @see #getexceptionType()
    * @generated
    */
   EReference getexceptionType_Annotations();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.exceptionType#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.exceptionType#getName()
    * @see #getexceptionType()
    * @generated
    */
   EAttribute getexceptionType_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.methodBody <em>method Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>method Body</em>'.
    * @see org.sourcepit.java.type.type.methodBody
    * @generated
    */
   EClass getmethodBody();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.instanceInitializer
    * <em>instance Initializer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>instance Initializer</em>'.
    * @see org.sourcepit.java.type.type.instanceInitializer
    * @generated
    */
   EClass getinstanceInitializer();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.staticInitializer
    * <em>static Initializer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>static Initializer</em>'.
    * @see org.sourcepit.java.type.type.staticInitializer
    * @generated
    */
   EClass getstaticInitializer();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.constructorDeclaration
    * <em>constructor Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>constructor Declaration</em>'.
    * @see org.sourcepit.java.type.type.constructorDeclaration
    * @generated
    */
   EClass getconstructorDeclaration();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.constructorDeclaration#getConstructorModifiers <em>Constructor Modifiers</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Constructor Modifiers</em>'.
    * @see org.sourcepit.java.type.type.constructorDeclaration#getConstructorModifiers()
    * @see #getconstructorDeclaration()
    * @generated
    */
   EReference getconstructorDeclaration_ConstructorModifiers();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.constructorDeclaration#getConstructorDeclarator
    * <em>Constructor Declarator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Constructor Declarator</em>'.
    * @see org.sourcepit.java.type.type.constructorDeclaration#getConstructorDeclarator()
    * @see #getconstructorDeclaration()
    * @generated
    */
   EReference getconstructorDeclaration_ConstructorDeclarator();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.constructorDeclaration#getThrows_ <em>Throws </em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Throws </em>'.
    * @see org.sourcepit.java.type.type.constructorDeclaration#getThrows_()
    * @see #getconstructorDeclaration()
    * @generated
    */
   EReference getconstructorDeclaration_Throws_();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.constructorModifier
    * <em>constructor Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>constructor Modifier</em>'.
    * @see org.sourcepit.java.type.type.constructorModifier
    * @generated
    */
   EClass getconstructorModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.JavaConstructorModifier
    * <em>Java Constructor Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Java Constructor Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaConstructorModifier
    * @generated
    */
   EClass getJavaConstructorModifier();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.java.type.type.JavaConstructorModifier#getModifier <em>Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaConstructorModifier#getModifier()
    * @see #getJavaConstructorModifier()
    * @generated
    */
   EAttribute getJavaConstructorModifier_Modifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.constructorDeclarator
    * <em>constructor Declarator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>constructor Declarator</em>'.
    * @see org.sourcepit.java.type.type.constructorDeclarator
    * @generated
    */
   EClass getconstructorDeclarator();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.constructorDeclarator#getTypeParameters <em>Type Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
    * @see org.sourcepit.java.type.type.constructorDeclarator#getTypeParameters()
    * @see #getconstructorDeclarator()
    * @generated
    */
   EReference getconstructorDeclarator_TypeParameters();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.java.type.type.constructorDeclarator#getSimpleTypeName <em>Simple Type Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Simple Type Name</em>'.
    * @see org.sourcepit.java.type.type.constructorDeclarator#getSimpleTypeName()
    * @see #getconstructorDeclarator()
    * @generated
    */
   EAttribute getconstructorDeclarator_SimpleTypeName();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.constructorDeclarator#getFormalParameterList <em>Formal Parameter List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Formal Parameter List</em>'.
    * @see org.sourcepit.java.type.type.constructorDeclarator#getFormalParameterList()
    * @see #getconstructorDeclarator()
    * @generated
    */
   EReference getconstructorDeclarator_FormalParameterList();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.enumDeclaration <em>enum Declaration</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>enum Declaration</em>'.
    * @see org.sourcepit.java.type.type.enumDeclaration
    * @generated
    */
   EClass getenumDeclaration();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.enumDeclaration#getEnumBody <em>Enum Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Enum Body</em>'.
    * @see org.sourcepit.java.type.type.enumDeclaration#getEnumBody()
    * @see #getenumDeclaration()
    * @generated
    */
   EReference getenumDeclaration_EnumBody();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.enumBody <em>enum Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>enum Body</em>'.
    * @see org.sourcepit.java.type.type.enumBody
    * @generated
    */
   EClass getenumBody();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.enumBody#getEnumConstantList <em>Enum Constant List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Enum Constant List</em>'.
    * @see org.sourcepit.java.type.type.enumBody#getEnumConstantList()
    * @see #getenumBody()
    * @generated
    */
   EReference getenumBody_EnumConstantList();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.enumBody#getEnumBodyDeclarations <em>Enum Body Declarations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Enum Body Declarations</em>'.
    * @see org.sourcepit.java.type.type.enumBody#getEnumBodyDeclarations()
    * @see #getenumBody()
    * @generated
    */
   EReference getenumBody_EnumBodyDeclarations();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.enumConstantList
    * <em>enum Constant List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>enum Constant List</em>'.
    * @see org.sourcepit.java.type.type.enumConstantList
    * @generated
    */
   EClass getenumConstantList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.enumConstantList#getEnumConstants <em>Enum Constants</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Enum Constants</em>'.
    * @see org.sourcepit.java.type.type.enumConstantList#getEnumConstants()
    * @see #getenumConstantList()
    * @generated
    */
   EReference getenumConstantList_EnumConstants();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.enumConstant <em>enum Constant</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>enum Constant</em>'.
    * @see org.sourcepit.java.type.type.enumConstant
    * @generated
    */
   EClass getenumConstant();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.enumConstant#getEnumConstantModifiers <em>Enum Constant Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Enum Constant Modifiers</em>'.
    * @see org.sourcepit.java.type.type.enumConstant#getEnumConstantModifiers()
    * @see #getenumConstant()
    * @generated
    */
   EReference getenumConstant_EnumConstantModifiers();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.enumConstant#getName <em>Name</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.enumConstant#getName()
    * @see #getenumConstant()
    * @generated
    */
   EAttribute getenumConstant_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.enumConstant#getArgumentList <em>Argument List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Argument List</em>'.
    * @see org.sourcepit.java.type.type.enumConstant#getArgumentList()
    * @see #getenumConstant()
    * @generated
    */
   EReference getenumConstant_ArgumentList();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.enumConstant#getClassBody <em>Class Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Class Body</em>'.
    * @see org.sourcepit.java.type.type.enumConstant#getClassBody()
    * @see #getenumConstant()
    * @generated
    */
   EReference getenumConstant_ClassBody();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.enumConstantModifier
    * <em>enum Constant Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>enum Constant Modifier</em>'.
    * @see org.sourcepit.java.type.type.enumConstantModifier
    * @generated
    */
   EClass getenumConstantModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.enumBodyDeclarations
    * <em>enum Body Declarations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>enum Body Declarations</em>'.
    * @see org.sourcepit.java.type.type.enumBodyDeclarations
    * @generated
    */
   EClass getenumBodyDeclarations();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.enumBodyDeclarations#getClassBodyDeclarations
    * <em>Class Body Declarations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Class Body Declarations</em>'.
    * @see org.sourcepit.java.type.type.enumBodyDeclarations#getClassBodyDeclarations()
    * @see #getenumBodyDeclarations()
    * @generated
    */
   EReference getenumBodyDeclarations_ClassBodyDeclarations();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceDeclaration
    * <em>interface Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Declaration</em>'.
    * @see org.sourcepit.java.type.type.interfaceDeclaration
    * @generated
    */
   EClass getinterfaceDeclaration();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.interfaceDeclaration#getInterfaceModifiers <em>Interface Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Interface Modifiers</em>'.
    * @see org.sourcepit.java.type.type.interfaceDeclaration#getInterfaceModifiers()
    * @see #getinterfaceDeclaration()
    * @generated
    */
   EReference getinterfaceDeclaration_InterfaceModifiers();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.interfaceDeclaration#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.interfaceDeclaration#getName()
    * @see #getinterfaceDeclaration()
    * @generated
    */
   EAttribute getinterfaceDeclaration_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.normalInterfaceDeclaration
    * <em>normal Interface Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>normal Interface Declaration</em>'.
    * @see org.sourcepit.java.type.type.normalInterfaceDeclaration
    * @generated
    */
   EClass getnormalInterfaceDeclaration();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.normalInterfaceDeclaration#getTypeParameters <em>Type Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Type Parameters</em>'.
    * @see org.sourcepit.java.type.type.normalInterfaceDeclaration#getTypeParameters()
    * @see #getnormalInterfaceDeclaration()
    * @generated
    */
   EReference getnormalInterfaceDeclaration_TypeParameters();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.normalInterfaceDeclaration#getExtendsInterfaces <em>Extends Interfaces</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Extends Interfaces</em>'.
    * @see org.sourcepit.java.type.type.normalInterfaceDeclaration#getExtendsInterfaces()
    * @see #getnormalInterfaceDeclaration()
    * @generated
    */
   EReference getnormalInterfaceDeclaration_ExtendsInterfaces();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.normalInterfaceDeclaration#getInterfaceBody <em>Interface Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Interface Body</em>'.
    * @see org.sourcepit.java.type.type.normalInterfaceDeclaration#getInterfaceBody()
    * @see #getnormalInterfaceDeclaration()
    * @generated
    */
   EReference getnormalInterfaceDeclaration_InterfaceBody();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceModifier
    * <em>interface Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Modifier</em>'.
    * @see org.sourcepit.java.type.type.interfaceModifier
    * @generated
    */
   EClass getinterfaceModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.JavaInterfaceModifier
    * <em>Java Interface Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Java Interface Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaInterfaceModifier
    * @generated
    */
   EClass getJavaInterfaceModifier();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.JavaInterfaceModifier#getModifier
    * <em>Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaInterfaceModifier#getModifier()
    * @see #getJavaInterfaceModifier()
    * @generated
    */
   EAttribute getJavaInterfaceModifier_Modifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.extendsInterfaces
    * <em>extends Interfaces</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>extends Interfaces</em>'.
    * @see org.sourcepit.java.type.type.extendsInterfaces
    * @generated
    */
   EClass getextendsInterfaces();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceBody <em>interface Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Body</em>'.
    * @see org.sourcepit.java.type.type.interfaceBody
    * @generated
    */
   EClass getinterfaceBody();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.interfaceBody#getInterfaceMemberDeclarations
    * <em>Interface Member Declarations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Interface Member Declarations</em>'.
    * @see org.sourcepit.java.type.type.interfaceBody#getInterfaceMemberDeclarations()
    * @see #getinterfaceBody()
    * @generated
    */
   EReference getinterfaceBody_InterfaceMemberDeclarations();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceMemberDeclaration
    * <em>interface Member Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Member Declaration</em>'.
    * @see org.sourcepit.java.type.type.interfaceMemberDeclaration
    * @generated
    */
   EClass getinterfaceMemberDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.constantDeclaration
    * <em>constant Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>constant Declaration</em>'.
    * @see org.sourcepit.java.type.type.constantDeclaration
    * @generated
    */
   EClass getconstantDeclaration();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.constantDeclaration#getConstantModifiers <em>Constant Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Constant Modifiers</em>'.
    * @see org.sourcepit.java.type.type.constantDeclaration#getConstantModifiers()
    * @see #getconstantDeclaration()
    * @generated
    */
   EReference getconstantDeclaration_ConstantModifiers();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.constantDeclaration#getUnannType <em>Unann Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Unann Type</em>'.
    * @see org.sourcepit.java.type.type.constantDeclaration#getUnannType()
    * @see #getconstantDeclaration()
    * @generated
    */
   EReference getconstantDeclaration_UnannType();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.constantDeclaration#getVariableDeclaratorList
    * <em>Variable Declarator List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Variable Declarator List</em>'.
    * @see org.sourcepit.java.type.type.constantDeclaration#getVariableDeclaratorList()
    * @see #getconstantDeclaration()
    * @generated
    */
   EReference getconstantDeclaration_VariableDeclaratorList();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.constantModifier
    * <em>constant Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>constant Modifier</em>'.
    * @see org.sourcepit.java.type.type.constantModifier
    * @generated
    */
   EClass getconstantModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.JavaConstantModifier
    * <em>Java Constant Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Java Constant Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaConstantModifier
    * @generated
    */
   EClass getJavaConstantModifier();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.JavaConstantModifier#getModifier
    * <em>Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaConstantModifier#getModifier()
    * @see #getJavaConstantModifier()
    * @generated
    */
   EAttribute getJavaConstantModifier_Modifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceMethodDeclaration
    * <em>interface Method Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Method Declaration</em>'.
    * @see org.sourcepit.java.type.type.interfaceMethodDeclaration
    * @generated
    */
   EClass getinterfaceMethodDeclaration();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.interfaceMethodDeclaration#getInterfaceMethodModifiers
    * <em>Interface Method Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Interface Method Modifiers</em>'.
    * @see org.sourcepit.java.type.type.interfaceMethodDeclaration#getInterfaceMethodModifiers()
    * @see #getinterfaceMethodDeclaration()
    * @generated
    */
   EReference getinterfaceMethodDeclaration_InterfaceMethodModifiers();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.interfaceMethodDeclaration#getMethodHeader <em>Method Header</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Method Header</em>'.
    * @see org.sourcepit.java.type.type.interfaceMethodDeclaration#getMethodHeader()
    * @see #getinterfaceMethodDeclaration()
    * @generated
    */
   EReference getinterfaceMethodDeclaration_MethodHeader();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.interfaceMethodDeclaration#getMethodBody <em>Method Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Method Body</em>'.
    * @see org.sourcepit.java.type.type.interfaceMethodDeclaration#getMethodBody()
    * @see #getinterfaceMethodDeclaration()
    * @generated
    */
   EReference getinterfaceMethodDeclaration_MethodBody();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.interfaceMethodModifier
    * <em>interface Method Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>interface Method Modifier</em>'.
    * @see org.sourcepit.java.type.type.interfaceMethodModifier
    * @generated
    */
   EClass getinterfaceMethodModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.JavaInterfaceMethodModifiers
    * <em>Java Interface Method Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Java Interface Method Modifiers</em>'.
    * @see org.sourcepit.java.type.type.JavaInterfaceMethodModifiers
    * @generated
    */
   EClass getJavaInterfaceMethodModifiers();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.java.type.type.JavaInterfaceMethodModifiers#getModifiers <em>Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifiers</em>'.
    * @see org.sourcepit.java.type.type.JavaInterfaceMethodModifiers#getModifiers()
    * @see #getJavaInterfaceMethodModifiers()
    * @generated
    */
   EAttribute getJavaInterfaceMethodModifiers_Modifiers();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.annotationTypeDeclaration
    * <em>annotation Type Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>annotation Type Declaration</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeDeclaration
    * @generated
    */
   EClass getannotationTypeDeclaration();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.annotationTypeDeclaration#getAnnotationTypeBody <em>Annotation Type Body</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Annotation Type Body</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeDeclaration#getAnnotationTypeBody()
    * @see #getannotationTypeDeclaration()
    * @generated
    */
   EReference getannotationTypeDeclaration_AnnotationTypeBody();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.annotationTypeBody
    * <em>annotation Type Body</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>annotation Type Body</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeBody
    * @generated
    */
   EClass getannotationTypeBody();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.annotationTypeBody#getAnnotationTypeMemberDeclarations
    * <em>Annotation Type Member Declarations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotation Type Member Declarations</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeBody#getAnnotationTypeMemberDeclarations()
    * @see #getannotationTypeBody()
    * @generated
    */
   EReference getannotationTypeBody_AnnotationTypeMemberDeclarations();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.annotationTypeMemberDeclaration
    * <em>annotation Type Member Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>annotation Type Member Declaration</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeMemberDeclaration
    * @generated
    */
   EClass getannotationTypeMemberDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.annotationTypeElementDeclaration
    * <em>annotation Type Element Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>annotation Type Element Declaration</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeElementDeclaration
    * @generated
    */
   EClass getannotationTypeElementDeclaration();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getAnnotationTypeElementModifiers
    * <em>Annotation Type Element Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotation Type Element Modifiers</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeElementDeclaration#getAnnotationTypeElementModifiers()
    * @see #getannotationTypeElementDeclaration()
    * @generated
    */
   EReference getannotationTypeElementDeclaration_AnnotationTypeElementModifiers();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getUnannType <em>Unann Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Unann Type</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeElementDeclaration#getUnannType()
    * @see #getannotationTypeElementDeclaration()
    * @generated
    */
   EReference getannotationTypeElementDeclaration_UnannType();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeElementDeclaration#getName()
    * @see #getannotationTypeElementDeclaration()
    * @generated
    */
   EAttribute getannotationTypeElementDeclaration_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getDims <em>Dims</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Dims</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeElementDeclaration#getDims()
    * @see #getannotationTypeElementDeclaration()
    * @generated
    */
   EReference getannotationTypeElementDeclaration_Dims();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.annotationTypeElementDeclaration#getDefaultValue <em>Default Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Default Value</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeElementDeclaration#getDefaultValue()
    * @see #getannotationTypeElementDeclaration()
    * @generated
    */
   EReference getannotationTypeElementDeclaration_DefaultValue();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.annotationTypeElementModifier
    * <em>annotation Type Element Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>annotation Type Element Modifier</em>'.
    * @see org.sourcepit.java.type.type.annotationTypeElementModifier
    * @generated
    */
   EClass getannotationTypeElementModifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.JavaAnnotationTypeElementModifiers
    * <em>Java Annotation Type Element Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Java Annotation Type Element Modifiers</em>'.
    * @see org.sourcepit.java.type.type.JavaAnnotationTypeElementModifiers
    * @generated
    */
   EClass getJavaAnnotationTypeElementModifiers();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.java.type.type.JavaAnnotationTypeElementModifiers#getModifier <em>Modifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Modifier</em>'.
    * @see org.sourcepit.java.type.type.JavaAnnotationTypeElementModifiers#getModifier()
    * @see #getJavaAnnotationTypeElementModifiers()
    * @generated
    */
   EAttribute getJavaAnnotationTypeElementModifiers_Modifier();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.defaultValue <em>default Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>default Value</em>'.
    * @see org.sourcepit.java.type.type.defaultValue
    * @generated
    */
   EClass getdefaultValue();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.annotation <em>annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>annotation</em>'.
    * @see org.sourcepit.java.type.type.annotation
    * @generated
    */
   EClass getannotation();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.annotation#getTypeName
    * <em>Type Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Type Name</em>'.
    * @see org.sourcepit.java.type.type.annotation#getTypeName()
    * @see #getannotation()
    * @generated
    */
   EAttribute getannotation_TypeName();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.normalAnnotation
    * <em>normal Annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>normal Annotation</em>'.
    * @see org.sourcepit.java.type.type.normalAnnotation
    * @generated
    */
   EClass getnormalAnnotation();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.normalAnnotation#getElementValuePairList <em>Element Value Pair List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Element Value Pair List</em>'.
    * @see org.sourcepit.java.type.type.normalAnnotation#getElementValuePairList()
    * @see #getnormalAnnotation()
    * @generated
    */
   EReference getnormalAnnotation_ElementValuePairList();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.elementValuePairList
    * <em>element Value Pair List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>element Value Pair List</em>'.
    * @see org.sourcepit.java.type.type.elementValuePairList
    * @generated
    */
   EClass getelementValuePairList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.elementValuePairList#getElementValuePairs <em>Element Value Pairs</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Element Value Pairs</em>'.
    * @see org.sourcepit.java.type.type.elementValuePairList#getElementValuePairs()
    * @see #getelementValuePairList()
    * @generated
    */
   EReference getelementValuePairList_ElementValuePairs();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.elementValuePair
    * <em>element Value Pair</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>element Value Pair</em>'.
    * @see org.sourcepit.java.type.type.elementValuePair
    * @generated
    */
   EClass getelementValuePair();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.elementValuePair#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.java.type.type.elementValuePair#getName()
    * @see #getelementValuePair()
    * @generated
    */
   EAttribute getelementValuePair_Name();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.elementValuePair#getElementValue <em>Element Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Element Value</em>'.
    * @see org.sourcepit.java.type.type.elementValuePair#getElementValue()
    * @see #getelementValuePair()
    * @generated
    */
   EReference getelementValuePair_ElementValue();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.elementValue <em>element Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>element Value</em>'.
    * @see org.sourcepit.java.type.type.elementValue
    * @generated
    */
   EClass getelementValue();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.elementValueArrayInitializer
    * <em>element Value Array Initializer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>element Value Array Initializer</em>'.
    * @see org.sourcepit.java.type.type.elementValueArrayInitializer
    * @generated
    */
   EClass getelementValueArrayInitializer();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.elementValueArrayInitializer#getElementValueList <em>Element Value List</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Element Value List</em>'.
    * @see org.sourcepit.java.type.type.elementValueArrayInitializer#getElementValueList()
    * @see #getelementValueArrayInitializer()
    * @generated
    */
   EReference getelementValueArrayInitializer_ElementValueList();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.elementValueList
    * <em>element Value List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>element Value List</em>'.
    * @see org.sourcepit.java.type.type.elementValueList
    * @generated
    */
   EClass getelementValueList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.elementValueList#getElementValues <em>Element Values</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Element Values</em>'.
    * @see org.sourcepit.java.type.type.elementValueList#getElementValues()
    * @see #getelementValueList()
    * @generated
    */
   EReference getelementValueList_ElementValues();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.markerAnnotation
    * <em>marker Annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>marker Annotation</em>'.
    * @see org.sourcepit.java.type.type.markerAnnotation
    * @generated
    */
   EClass getmarkerAnnotation();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.singleElementAnnotation
    * <em>single Element Annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>single Element Annotation</em>'.
    * @see org.sourcepit.java.type.type.singleElementAnnotation
    * @generated
    */
   EClass getsingleElementAnnotation();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.singleElementAnnotation#getElementValue <em>Element Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Element Value</em>'.
    * @see org.sourcepit.java.type.type.singleElementAnnotation#getElementValue()
    * @see #getsingleElementAnnotation()
    * @generated
    */
   EReference getsingleElementAnnotation_ElementValue();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.arrayInitializer
    * <em>array Initializer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>array Initializer</em>'.
    * @see org.sourcepit.java.type.type.arrayInitializer
    * @generated
    */
   EClass getarrayInitializer();

   /**
    * Returns the meta object for the containment reference '
    * {@link org.sourcepit.java.type.type.arrayInitializer#getVariableInitializerList
    * <em>Variable Initializer List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Variable Initializer List</em>'.
    * @see org.sourcepit.java.type.type.arrayInitializer#getVariableInitializerList()
    * @see #getarrayInitializer()
    * @generated
    */
   EReference getarrayInitializer_VariableInitializerList();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.variableInitializerList
    * <em>variable Initializer List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>variable Initializer List</em>'.
    * @see org.sourcepit.java.type.type.variableInitializerList
    * @generated
    */
   EClass getvariableInitializerList();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.java.type.type.variableInitializerList#getVariableInitializer <em>Variable Initializer</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Variable Initializer</em>'.
    * @see org.sourcepit.java.type.type.variableInitializerList#getVariableInitializer()
    * @see #getvariableInitializerList()
    * @generated
    */
   EReference getvariableInitializerList_VariableInitializer();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.block <em>block</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>block</em>'.
    * @see org.sourcepit.java.type.type.block
    * @generated
    */
   EClass getblock();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.block#getDummy <em>Dummy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Dummy</em>'.
    * @see org.sourcepit.java.type.type.block#getDummy()
    * @see #getblock()
    * @generated
    */
   EAttribute getblock_Dummy();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.blockStatements <em>block Statements</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>block Statements</em>'.
    * @see org.sourcepit.java.type.type.blockStatements
    * @generated
    */
   EClass getblockStatements();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.blockStatements#getDummy
    * <em>Dummy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Dummy</em>'.
    * @see org.sourcepit.java.type.type.blockStatements#getDummy()
    * @see #getblockStatements()
    * @generated
    */
   EAttribute getblockStatements_Dummy();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.argumentList <em>argument List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>argument List</em>'.
    * @see org.sourcepit.java.type.type.argumentList
    * @generated
    */
   EClass getargumentList();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.argumentList#getDummy
    * <em>Dummy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Dummy</em>'.
    * @see org.sourcepit.java.type.type.argumentList#getDummy()
    * @see #getargumentList()
    * @generated
    */
   EAttribute getargumentList_Dummy();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.primary <em>primary</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>primary</em>'.
    * @see org.sourcepit.java.type.type.primary
    * @generated
    */
   EClass getprimary();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.primary#getDummy <em>Dummy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Dummy</em>'.
    * @see org.sourcepit.java.type.type.primary#getDummy()
    * @see #getprimary()
    * @generated
    */
   EAttribute getprimary_Dummy();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.expression <em>expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>expression</em>'.
    * @see org.sourcepit.java.type.type.expression
    * @generated
    */
   EClass getexpression();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.expression#getDummy <em>Dummy</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Dummy</em>'.
    * @see org.sourcepit.java.type.type.expression#getDummy()
    * @see #getexpression()
    * @generated
    */
   EAttribute getexpression_Dummy();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.conditionalExpression
    * <em>conditional Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>conditional Expression</em>'.
    * @see org.sourcepit.java.type.type.conditionalExpression
    * @generated
    */
   EClass getconditionalExpression();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.java.type.type.conditionalExpression#getDummy
    * <em>Dummy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Dummy</em>'.
    * @see org.sourcepit.java.type.type.conditionalExpression#getDummy()
    * @see #getconditionalExpression()
    * @generated
    */
   EAttribute getconditionalExpression_Dummy();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.EmptyTypeDeclaration
    * <em>Empty Type Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Empty Type Declaration</em>'.
    * @see org.sourcepit.java.type.type.EmptyTypeDeclaration
    * @generated
    */
   EClass getEmptyTypeDeclaration();

   /**
    * Returns the meta object for class '{@link org.sourcepit.java.type.type.EmptyClassMemberDeclaration
    * <em>Empty Class Member Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Empty Class Member Declaration</em>'.
    * @see org.sourcepit.java.type.type.EmptyClassMemberDeclaration
    * @generated
    */
   EClass getEmptyClassMemberDeclaration();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.java.type.type.ClassModifiers <em>Class Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Class Modifiers</em>'.
    * @see org.sourcepit.java.type.type.ClassModifiers
    * @generated
    */
   EEnum getClassModifiers();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.java.type.type.FieldModifiers <em>Field Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Field Modifiers</em>'.
    * @see org.sourcepit.java.type.type.FieldModifiers
    * @generated
    */
   EEnum getFieldModifiers();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.java.type.type.methodModifiers <em>method Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>method Modifiers</em>'.
    * @see org.sourcepit.java.type.type.methodModifiers
    * @generated
    */
   EEnum getmethodModifiers();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.java.type.type.VariableModifiers
    * <em>Variable Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Variable Modifiers</em>'.
    * @see org.sourcepit.java.type.type.VariableModifiers
    * @generated
    */
   EEnum getVariableModifiers();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.java.type.type.ConstructorModifiers
    * <em>Constructor Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Constructor Modifiers</em>'.
    * @see org.sourcepit.java.type.type.ConstructorModifiers
    * @generated
    */
   EEnum getConstructorModifiers();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.java.type.type.InterfaceModifiers
    * <em>Interface Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Interface Modifiers</em>'.
    * @see org.sourcepit.java.type.type.InterfaceModifiers
    * @generated
    */
   EEnum getInterfaceModifiers();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.java.type.type.ConstantModifiers
    * <em>Constant Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Constant Modifiers</em>'.
    * @see org.sourcepit.java.type.type.ConstantModifiers
    * @generated
    */
   EEnum getConstantModifiers();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.java.type.type.InterfaceMethodModifiers
    * <em>Interface Method Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Interface Method Modifiers</em>'.
    * @see org.sourcepit.java.type.type.InterfaceMethodModifiers
    * @generated
    */
   EEnum getInterfaceMethodModifiers();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.java.type.type.AnnotationTypeElementModifiers
    * <em>Annotation Type Element Modifiers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Annotation Type Element Modifiers</em>'.
    * @see org.sourcepit.java.type.type.AnnotationTypeElementModifiers
    * @generated
    */
   EEnum getAnnotationTypeElementModifiers();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   TypeFactory getTypeFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.ModelImpl <em>Model</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.ModelImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getModel()
       * @generated
       */
      EClass MODEL = eINSTANCE.getModel();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference MODEL__TYPE = eINSTANCE.getModel_Type();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeImpl <em>type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettype()
       * @generated
       */
      EClass TYPE = eINSTANCE.gettype();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.primitiveTypeImpl
       * <em>primitive Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.primitiveTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getprimitiveType()
       * @generated
       */
      EClass PRIMITIVE_TYPE = eINSTANCE.getprimitiveType();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference PRIMITIVE_TYPE__ANNOTATIONS = eINSTANCE.getprimitiveType_Annotations();

      /**
       * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute PRIMITIVE_TYPE__TYPE_NAME = eINSTANCE.getprimitiveType_TypeName();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.referenceTypeImpl
       * <em>reference Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.referenceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getreferenceType()
       * @generated
       */
      EClass REFERENCE_TYPE = eINSTANCE.getreferenceType();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.classOrInterfaceTypeImpl
       * <em>class Or Interface Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classOrInterfaceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassOrInterfaceType()
       * @generated
       */
      EClass CLASS_OR_INTERFACE_TYPE = eINSTANCE.getclassOrInterfaceType();

      /**
       * The meta object literal for the '<em><b>Class Or Interface Type Segments</b></em>' containment reference list
       * feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_OR_INTERFACE_TYPE__CLASS_OR_INTERFACE_TYPE_SEGMENTS = eINSTANCE.getclassOrInterfaceType_ClassOrInterfaceTypeSegments();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.classOrInterfaceTypeSegmentImpl
       * <em>class Or Interface Type Segment</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classOrInterfaceTypeSegmentImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassOrInterfaceTypeSegment()
       * @generated
       */
      EClass CLASS_OR_INTERFACE_TYPE_SEGMENT = eINSTANCE.getclassOrInterfaceTypeSegment();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_OR_INTERFACE_TYPE_SEGMENT__ANNOTATIONS = eINSTANCE.getclassOrInterfaceTypeSegment_Annotations();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CLASS_OR_INTERFACE_TYPE_SEGMENT__NAME = eINSTANCE.getclassOrInterfaceTypeSegment_Name();

      /**
       * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_OR_INTERFACE_TYPE_SEGMENT__TYPE_ARGUMENTS = eINSTANCE.getclassOrInterfaceTypeSegment_TypeArguments();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.classTypeImpl <em>class Type</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassType()
       * @generated
       */
      EClass CLASS_TYPE = eINSTANCE.getclassType();

      /**
       * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_TYPE__TYPE_ARGUMENTS = eINSTANCE.getclassType_TypeArguments();

      /**
       * The meta object literal for the '<em><b>Class Or Interface Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_TYPE__CLASS_OR_INTERFACE_TYPE = eINSTANCE.getclassType_ClassOrInterfaceType();

      /**
       * The meta object literal for the '
       * {@link org.sourcepit.java.type.type.impl.classType_lf_classOrInterfaceTypeImpl
       * <em>class Type lf class Or Interface Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classType_lf_classOrInterfaceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassType_lf_classOrInterfaceType()
       * @generated
       */
      EClass CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE = eINSTANCE.getclassType_lf_classOrInterfaceType();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS = eINSTANCE.getclassType_lf_classOrInterfaceType_Annotations();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE__NAME = eINSTANCE.getclassType_lf_classOrInterfaceType_Name();

      /**
       * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS = eINSTANCE.getclassType_lf_classOrInterfaceType_TypeArguments();

      /**
       * The meta object literal for the '
       * {@link org.sourcepit.java.type.type.impl.classType_lfno_classOrInterfaceTypeImpl
       * <em>class Type lfno class Or Interface Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classType_lfno_classOrInterfaceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassType_lfno_classOrInterfaceType()
       * @generated
       */
      EClass CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE = eINSTANCE.getclassType_lfno_classOrInterfaceType();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__ANNOTATIONS = eINSTANCE.getclassType_lfno_classOrInterfaceType_Annotations();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__NAME = eINSTANCE.getclassType_lfno_classOrInterfaceType_Name();

      /**
       * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS = eINSTANCE.getclassType_lfno_classOrInterfaceType_TypeArguments();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.interfaceTypeImpl
       * <em>interface Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceType()
       * @generated
       */
      EClass INTERFACE_TYPE = eINSTANCE.getinterfaceType();

      /**
       * The meta object literal for the '
       * {@link org.sourcepit.java.type.type.impl.interfaceType_lf_classOrInterfaceTypeImpl
       * <em>interface Type lf class Or Interface Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceType_lf_classOrInterfaceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceType_lf_classOrInterfaceType()
       * @generated
       */
      EClass INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE = eINSTANCE.getinterfaceType_lf_classOrInterfaceType();

      /**
       * The meta object literal for the '
       * {@link org.sourcepit.java.type.type.impl.interfaceType_lfno_classOrInterfaceTypeImpl
       * <em>interface Type lfno class Or Interface Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceType_lfno_classOrInterfaceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceType_lfno_classOrInterfaceType()
       * @generated
       */
      EClass INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE = eINSTANCE.getinterfaceType_lfno_classOrInterfaceType();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeVariableImpl
       * <em>type Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeVariableImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeVariable()
       * @generated
       */
      EClass TYPE_VARIABLE = eINSTANCE.gettypeVariable();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.arrayTypeImpl <em>array Type</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.arrayTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getarrayType()
       * @generated
       */
      EClass ARRAY_TYPE = eINSTANCE.getarrayType();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ARRAY_TYPE__TYPE = eINSTANCE.getarrayType_Type();

      /**
       * The meta object literal for the '<em><b>Dims</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ARRAY_TYPE__DIMS = eINSTANCE.getarrayType_Dims();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.dimsImpl <em>dims</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.dimsImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getdims()
       * @generated
       */
      EClass DIMS = eINSTANCE.getdims();

      /**
       * The meta object literal for the '<em><b>Dims</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference DIMS__DIMS = eINSTANCE.getdims_Dims();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.dimImpl <em>dim</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.dimImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getdim()
       * @generated
       */
      EClass DIM = eINSTANCE.getdim();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference DIM__ANNOTATIONS = eINSTANCE.getdim_Annotations();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeParameterImpl
       * <em>type Parameter</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeParameterImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeParameter()
       * @generated
       */
      EClass TYPE_PARAMETER = eINSTANCE.gettypeParameter();

      /**
       * The meta object literal for the '<em><b>Type Parameter Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TYPE_PARAMETER__TYPE_PARAMETER_MODIFIERS = eINSTANCE.gettypeParameter_TypeParameterModifiers();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute TYPE_PARAMETER__NAME = eINSTANCE.gettypeParameter_Name();

      /**
       * The meta object literal for the '<em><b>Type Bound</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TYPE_PARAMETER__TYPE_BOUND = eINSTANCE.gettypeParameter_TypeBound();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeParameterModifierImpl
       * <em>type Parameter Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeParameterModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeParameterModifier()
       * @generated
       */
      EClass TYPE_PARAMETER_MODIFIER = eINSTANCE.gettypeParameterModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeBoundImpl <em>type Bound</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeBoundImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeBound()
       * @generated
       */
      EClass TYPE_BOUND = eINSTANCE.gettypeBound();

      /**
       * The meta object literal for the '<em><b>Type Variable</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TYPE_BOUND__TYPE_VARIABLE = eINSTANCE.gettypeBound_TypeVariable();

      /**
       * The meta object literal for the '<em><b>Class Or Interface Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TYPE_BOUND__CLASS_OR_INTERFACE_TYPE = eINSTANCE.gettypeBound_ClassOrInterfaceType();

      /**
       * The meta object literal for the '<em><b>Additional Bound</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TYPE_BOUND__ADDITIONAL_BOUND = eINSTANCE.gettypeBound_AdditionalBound();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.additionalBoundImpl
       * <em>additional Bound</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.additionalBoundImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getadditionalBound()
       * @generated
       */
      EClass ADDITIONAL_BOUND = eINSTANCE.getadditionalBound();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeArgumentsImpl
       * <em>type Arguments</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeArgumentsImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeArguments()
       * @generated
       */
      EClass TYPE_ARGUMENTS = eINSTANCE.gettypeArguments();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeArgumentListImpl
       * <em>type Argument List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeArgumentListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeArgumentList()
       * @generated
       */
      EClass TYPE_ARGUMENT_LIST = eINSTANCE.gettypeArgumentList();

      /**
       * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TYPE_ARGUMENT_LIST__TYPE_ARGUMENTS = eINSTANCE.gettypeArgumentList_TypeArguments();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeArgumentImpl
       * <em>type Argument</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeArgumentImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeArgument()
       * @generated
       */
      EClass TYPE_ARGUMENT = eINSTANCE.gettypeArgument();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.wildcardImpl <em>wildcard</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.wildcardImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getwildcard()
       * @generated
       */
      EClass WILDCARD = eINSTANCE.getwildcard();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference WILDCARD__ANNOTATIONS = eINSTANCE.getwildcard_Annotations();

      /**
       * The meta object literal for the '<em><b>Wildcard Bounds</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference WILDCARD__WILDCARD_BOUNDS = eINSTANCE.getwildcard_WildcardBounds();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.wildcardBoundsImpl
       * <em>wildcard Bounds</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.wildcardBoundsImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getwildcardBounds()
       * @generated
       */
      EClass WILDCARD_BOUNDS = eINSTANCE.getwildcardBounds();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.compilationUnitImpl
       * <em>compilation Unit</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.compilationUnitImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getcompilationUnit()
       * @generated
       */
      EClass COMPILATION_UNIT = eINSTANCE.getcompilationUnit();

      /**
       * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference COMPILATION_UNIT__PACKAGE = eINSTANCE.getcompilationUnit_Package();

      /**
       * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference COMPILATION_UNIT__IMPORTS = eINSTANCE.getcompilationUnit_Imports();

      /**
       * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference COMPILATION_UNIT__TYPES = eINSTANCE.getcompilationUnit_Types();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.packageDeclarationImpl
       * <em>package Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.packageDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getpackageDeclaration()
       * @generated
       */
      EClass PACKAGE_DECLARATION = eINSTANCE.getpackageDeclaration();

      /**
       * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference PACKAGE_DECLARATION__MODIFIERS = eINSTANCE.getpackageDeclaration_Modifiers();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getpackageDeclaration_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.packageModifierImpl
       * <em>package Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.packageModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getpackageModifier()
       * @generated
       */
      EClass PACKAGE_MODIFIER = eINSTANCE.getpackageModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.importDeclarationImpl
       * <em>import Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.importDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getimportDeclaration()
       * @generated
       */
      EClass IMPORT_DECLARATION = eINSTANCE.getimportDeclaration();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute IMPORT_DECLARATION__NAME = eINSTANCE.getimportDeclaration_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.singleTypeImportDeclarationImpl
       * <em>single Type Import Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.singleTypeImportDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsingleTypeImportDeclaration()
       * @generated
       */
      EClass SINGLE_TYPE_IMPORT_DECLARATION = eINSTANCE.getsingleTypeImportDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeImportOnDemandDeclarationImpl
       * <em>type Import On Demand Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeImportOnDemandDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeImportOnDemandDeclaration()
       * @generated
       */
      EClass TYPE_IMPORT_ON_DEMAND_DECLARATION = eINSTANCE.gettypeImportOnDemandDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.singleStaticImportDeclarationImpl
       * <em>single Static Import Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.singleStaticImportDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsingleStaticImportDeclaration()
       * @generated
       */
      EClass SINGLE_STATIC_IMPORT_DECLARATION = eINSTANCE.getsingleStaticImportDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.staticImportOnDemandDeclarationImpl
       * <em>static Import On Demand Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.staticImportOnDemandDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getstaticImportOnDemandDeclaration()
       * @generated
       */
      EClass STATIC_IMPORT_ON_DEMAND_DECLARATION = eINSTANCE.getstaticImportOnDemandDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeDeclarationImpl
       * <em>type Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeDeclaration()
       * @generated
       */
      EClass TYPE_DECLARATION = eINSTANCE.gettypeDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.classDeclarationImpl
       * <em>class Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassDeclaration()
       * @generated
       */
      EClass CLASS_DECLARATION = eINSTANCE.getclassDeclaration();

      /**
       * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_DECLARATION__MODIFIERS = eINSTANCE.getclassDeclaration_Modifiers();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CLASS_DECLARATION__NAME = eINSTANCE.getclassDeclaration_Name();

      /**
       * The meta object literal for the '<em><b>Superinterfaces</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_DECLARATION__SUPERINTERFACES = eINSTANCE.getclassDeclaration_Superinterfaces();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.normalClassDeclarationImpl
       * <em>normal Class Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.normalClassDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getnormalClassDeclaration()
       * @generated
       */
      EClass NORMAL_CLASS_DECLARATION = eINSTANCE.getnormalClassDeclaration();

      /**
       * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference NORMAL_CLASS_DECLARATION__TYPE_PARAMETERS = eINSTANCE.getnormalClassDeclaration_TypeParameters();

      /**
       * The meta object literal for the '<em><b>Superclass</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference NORMAL_CLASS_DECLARATION__SUPERCLASS = eINSTANCE.getnormalClassDeclaration_Superclass();

      /**
       * The meta object literal for the '<em><b>Class Body</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference NORMAL_CLASS_DECLARATION__CLASS_BODY = eINSTANCE.getnormalClassDeclaration_ClassBody();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.classModifierImpl
       * <em>class Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassModifier()
       * @generated
       */
      EClass CLASS_MODIFIER = eINSTANCE.getclassModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.JavaClassModifierImpl
       * <em>Java Class Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.JavaClassModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaClassModifier()
       * @generated
       */
      EClass JAVA_CLASS_MODIFIER = eINSTANCE.getJavaClassModifier();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute JAVA_CLASS_MODIFIER__MODIFIER = eINSTANCE.getJavaClassModifier_Modifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeParametersImpl
       * <em>type Parameters</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeParametersImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeParameters()
       * @generated
       */
      EClass TYPE_PARAMETERS = eINSTANCE.gettypeParameters();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.typeParameterListImpl
       * <em>type Parameter List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.typeParameterListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#gettypeParameterList()
       * @generated
       */
      EClass TYPE_PARAMETER_LIST = eINSTANCE.gettypeParameterList();

      /**
       * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference TYPE_PARAMETER_LIST__TYPE_PARAMETERS = eINSTANCE.gettypeParameterList_TypeParameters();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.superclassImpl <em>superclass</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.superclassImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsuperclass()
       * @generated
       */
      EClass SUPERCLASS = eINSTANCE.getsuperclass();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.superinterfacesImpl
       * <em>superinterfaces</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.superinterfacesImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsuperinterfaces()
       * @generated
       */
      EClass SUPERINTERFACES = eINSTANCE.getsuperinterfaces();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.interfaceTypeListImpl
       * <em>interface Type List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceTypeListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceTypeList()
       * @generated
       */
      EClass INTERFACE_TYPE_LIST = eINSTANCE.getinterfaceTypeList();

      /**
       * The meta object literal for the '<em><b>Interface Types</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference INTERFACE_TYPE_LIST__INTERFACE_TYPES = eINSTANCE.getinterfaceTypeList_InterfaceTypes();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.classBodyImpl <em>class Body</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classBodyImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassBody()
       * @generated
       */
      EClass CLASS_BODY = eINSTANCE.getclassBody();

      /**
       * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_BODY__DECLARATIONS = eINSTANCE.getclassBody_Declarations();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.classBodyDeclarationImpl
       * <em>class Body Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classBodyDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassBodyDeclaration()
       * @generated
       */
      EClass CLASS_BODY_DECLARATION = eINSTANCE.getclassBodyDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.classMemberDeclarationImpl
       * <em>class Member Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.classMemberDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getclassMemberDeclaration()
       * @generated
       */
      EClass CLASS_MEMBER_DECLARATION = eINSTANCE.getclassMemberDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.fieldDeclarationImpl
       * <em>field Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.fieldDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getfieldDeclaration()
       * @generated
       */
      EClass FIELD_DECLARATION = eINSTANCE.getfieldDeclaration();

      /**
       * The meta object literal for the '<em><b>Field Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference FIELD_DECLARATION__FIELD_MODIFIERS = eINSTANCE.getfieldDeclaration_FieldModifiers();

      /**
       * The meta object literal for the '<em><b>Unann Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference FIELD_DECLARATION__UNANN_TYPE = eINSTANCE.getfieldDeclaration_UnannType();

      /**
       * The meta object literal for the '<em><b>Variable Declarator List</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference FIELD_DECLARATION__VARIABLE_DECLARATOR_LIST = eINSTANCE.getfieldDeclaration_VariableDeclaratorList();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.fieldModifierImpl
       * <em>field Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.fieldModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getfieldModifier()
       * @generated
       */
      EClass FIELD_MODIFIER = eINSTANCE.getfieldModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.JavaFieldModifierImpl
       * <em>Java Field Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.JavaFieldModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaFieldModifier()
       * @generated
       */
      EClass JAVA_FIELD_MODIFIER = eINSTANCE.getJavaFieldModifier();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute JAVA_FIELD_MODIFIER__MODIFIER = eINSTANCE.getJavaFieldModifier_Modifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.variableDeclaratorListImpl
       * <em>variable Declarator List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.variableDeclaratorListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableDeclaratorList()
       * @generated
       */
      EClass VARIABLE_DECLARATOR_LIST = eINSTANCE.getvariableDeclaratorList();

      /**
       * The meta object literal for the '<em><b>Variable Declarators</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference VARIABLE_DECLARATOR_LIST__VARIABLE_DECLARATORS = eINSTANCE.getvariableDeclaratorList_VariableDeclarators();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.variableDeclaratorImpl
       * <em>variable Declarator</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.variableDeclaratorImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableDeclarator()
       * @generated
       */
      EClass VARIABLE_DECLARATOR = eINSTANCE.getvariableDeclarator();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference VARIABLE_DECLARATOR__ID = eINSTANCE.getvariableDeclarator_Id();

      /**
       * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference VARIABLE_DECLARATOR__INITIALIZER = eINSTANCE.getvariableDeclarator_Initializer();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.variableDeclaratorIdImpl
       * <em>variable Declarator Id</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.variableDeclaratorIdImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableDeclaratorId()
       * @generated
       */
      EClass VARIABLE_DECLARATOR_ID = eINSTANCE.getvariableDeclaratorId();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute VARIABLE_DECLARATOR_ID__ID = eINSTANCE.getvariableDeclaratorId_Id();

      /**
       * The meta object literal for the '<em><b>Dims</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference VARIABLE_DECLARATOR_ID__DIMS = eINSTANCE.getvariableDeclaratorId_Dims();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.variableInitializerImpl
       * <em>variable Initializer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.variableInitializerImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableInitializer()
       * @generated
       */
      EClass VARIABLE_INITIALIZER = eINSTANCE.getvariableInitializer();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.unannTypeImpl <em>unann Type</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.unannTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannType()
       * @generated
       */
      EClass UNANN_TYPE = eINSTANCE.getunannType();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.unannPrimitiveTypeImpl
       * <em>unann Primitive Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.unannPrimitiveTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannPrimitiveType()
       * @generated
       */
      EClass UNANN_PRIMITIVE_TYPE = eINSTANCE.getunannPrimitiveType();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute UNANN_PRIMITIVE_TYPE__NAME = eINSTANCE.getunannPrimitiveType_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.unannReferenceTypeImpl
       * <em>unann Reference Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.unannReferenceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannReferenceType()
       * @generated
       */
      EClass UNANN_REFERENCE_TYPE = eINSTANCE.getunannReferenceType();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.unannClassOrInterfaceTypeImpl
       * <em>unann Class Or Interface Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.unannClassOrInterfaceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannClassOrInterfaceType()
       * @generated
       */
      EClass UNANN_CLASS_OR_INTERFACE_TYPE = eINSTANCE.getunannClassOrInterfaceType();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.unannClassTypeImpl
       * <em>unann Class Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.unannClassTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannClassType()
       * @generated
       */
      EClass UNANN_CLASS_TYPE = eINSTANCE.getunannClassType();

      /**
       * The meta object literal for the '<em><b>Class Type Segment</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference UNANN_CLASS_TYPE__CLASS_TYPE_SEGMENT = eINSTANCE.getunannClassType_ClassTypeSegment();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.ClassTypeSegmentImpl
       * <em>Class Type Segment</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.ClassTypeSegmentImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getClassTypeSegment()
       * @generated
       */
      EClass CLASS_TYPE_SEGMENT = eINSTANCE.getClassTypeSegment();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CLASS_TYPE_SEGMENT__NAME = eINSTANCE.getClassTypeSegment_Name();

      /**
       * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_TYPE_SEGMENT__TYPE_ARGUMENTS = eINSTANCE.getClassTypeSegment_TypeArguments();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.ClassTypeSegmentWithAnnotationsImpl
       * <em>Class Type Segment With Annotations</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.ClassTypeSegmentWithAnnotationsImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getClassTypeSegmentWithAnnotations()
       * @generated
       */
      EClass CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS = eINSTANCE.getClassTypeSegmentWithAnnotations();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS__ANNOTATIONS = eINSTANCE.getClassTypeSegmentWithAnnotations_Annotations();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS__NAME = eINSTANCE.getClassTypeSegmentWithAnnotations_Name();

      /**
       * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CLASS_TYPE_SEGMENT_WITH_ANNOTATIONS__TYPE_ARGUMENTS = eINSTANCE.getClassTypeSegmentWithAnnotations_TypeArguments();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.unannInterfaceTypeImpl
       * <em>unann Interface Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.unannInterfaceTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannInterfaceType()
       * @generated
       */
      EClass UNANN_INTERFACE_TYPE = eINSTANCE.getunannInterfaceType();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.unannTypeVariableImpl
       * <em>unann Type Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.unannTypeVariableImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannTypeVariable()
       * @generated
       */
      EClass UNANN_TYPE_VARIABLE = eINSTANCE.getunannTypeVariable();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute UNANN_TYPE_VARIABLE__NAME = eINSTANCE.getunannTypeVariable_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.unannArrayTypeImpl
       * <em>unann Array Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.unannArrayTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getunannArrayType()
       * @generated
       */
      EClass UNANN_ARRAY_TYPE = eINSTANCE.getunannArrayType();

      /**
       * The meta object literal for the '<em><b>Dims</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference UNANN_ARRAY_TYPE__DIMS = eINSTANCE.getunannArrayType_Dims();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.methodDeclarationImpl
       * <em>method Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.methodDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodDeclaration()
       * @generated
       */
      EClass METHOD_DECLARATION = eINSTANCE.getmethodDeclaration();

      /**
       * The meta object literal for the '<em><b>Method Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_DECLARATION__METHOD_MODIFIERS = eINSTANCE.getmethodDeclaration_MethodModifiers();

      /**
       * The meta object literal for the '<em><b>Method Header</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_DECLARATION__METHOD_HEADER = eINSTANCE.getmethodDeclaration_MethodHeader();

      /**
       * The meta object literal for the '<em><b>Method Body</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_DECLARATION__METHOD_BODY = eINSTANCE.getmethodDeclaration_MethodBody();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.methodModifierImpl
       * <em>method Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.methodModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodModifier()
       * @generated
       */
      EClass METHOD_MODIFIER = eINSTANCE.getmethodModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.JavaMethodModifierImpl
       * <em>Java Method Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.JavaMethodModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaMethodModifier()
       * @generated
       */
      EClass JAVA_METHOD_MODIFIER = eINSTANCE.getJavaMethodModifier();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute JAVA_METHOD_MODIFIER__MODIFIER = eINSTANCE.getJavaMethodModifier_Modifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.methodHeaderImpl
       * <em>method Header</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.methodHeaderImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodHeader()
       * @generated
       */
      EClass METHOD_HEADER = eINSTANCE.getmethodHeader();

      /**
       * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_HEADER__RESULT = eINSTANCE.getmethodHeader_Result();

      /**
       * The meta object literal for the '<em><b>Method Declarator</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_HEADER__METHOD_DECLARATOR = eINSTANCE.getmethodHeader_MethodDeclarator();

      /**
       * The meta object literal for the '<em><b>Throws </b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_HEADER__THROWS_ = eINSTANCE.getmethodHeader_Throws_();

      /**
       * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_HEADER__TYPE_PARAMETERS = eINSTANCE.getmethodHeader_TypeParameters();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_HEADER__ANNOTATIONS = eINSTANCE.getmethodHeader_Annotations();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.resultImpl <em>result</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.resultImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getresult()
       * @generated
       */
      EClass RESULT = eINSTANCE.getresult();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.voidTypeImpl <em>void Type</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.voidTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvoidType()
       * @generated
       */
      EClass VOID_TYPE = eINSTANCE.getvoidType();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute VOID_TYPE__NAME = eINSTANCE.getvoidType_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.methodDeclaratorImpl
       * <em>method Declarator</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.methodDeclaratorImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodDeclarator()
       * @generated
       */
      EClass METHOD_DECLARATOR = eINSTANCE.getmethodDeclarator();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute METHOD_DECLARATOR__NAME = eINSTANCE.getmethodDeclarator_Name();

      /**
       * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_DECLARATOR__PARAMETERS = eINSTANCE.getmethodDeclarator_Parameters();

      /**
       * The meta object literal for the '<em><b>Dims </b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference METHOD_DECLARATOR__DIMS_ = eINSTANCE.getmethodDeclarator_Dims_();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.formalParameterListImpl
       * <em>formal Parameter List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.formalParameterListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getformalParameterList()
       * @generated
       */
      EClass FORMAL_PARAMETER_LIST = eINSTANCE.getformalParameterList();

      /**
       * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference FORMAL_PARAMETER_LIST__PARAMETERS = eINSTANCE.getformalParameterList_Parameters();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.formalParametersImpl
       * <em>formal Parameters</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.formalParametersImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getformalParameters()
       * @generated
       */
      EClass FORMAL_PARAMETERS = eINSTANCE.getformalParameters();

      /**
       * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference FORMAL_PARAMETERS__PARAMETERS = eINSTANCE.getformalParameters_Parameters();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.formalParameterImpl
       * <em>formal Parameter</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.formalParameterImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getformalParameter()
       * @generated
       */
      EClass FORMAL_PARAMETER = eINSTANCE.getformalParameter();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.variableModifierImpl
       * <em>variable Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.variableModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableModifier()
       * @generated
       */
      EClass VARIABLE_MODIFIER = eINSTANCE.getvariableModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.JavaVariableModifierImpl
       * <em>Java Variable Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.JavaVariableModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaVariableModifier()
       * @generated
       */
      EClass JAVA_VARIABLE_MODIFIER = eINSTANCE.getJavaVariableModifier();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute JAVA_VARIABLE_MODIFIER__MODIFIER = eINSTANCE.getJavaVariableModifier_Modifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.lastFormalParameterImpl
       * <em>last Formal Parameter</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.lastFormalParameterImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getlastFormalParameter()
       * @generated
       */
      EClass LAST_FORMAL_PARAMETER = eINSTANCE.getlastFormalParameter();

      /**
       * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LAST_FORMAL_PARAMETER__MODIFIERS = eINSTANCE.getlastFormalParameter_Modifiers();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LAST_FORMAL_PARAMETER__TYPE = eINSTANCE.getlastFormalParameter_Type();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LAST_FORMAL_PARAMETER__ANNOTATIONS = eINSTANCE.getlastFormalParameter_Annotations();

      /**
       * The meta object literal for the '<em><b>Varargs</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute LAST_FORMAL_PARAMETER__VARARGS = eINSTANCE.getlastFormalParameter_Varargs();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference LAST_FORMAL_PARAMETER__NAME = eINSTANCE.getlastFormalParameter_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.receiverParameterImpl
       * <em>receiver Parameter</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.receiverParameterImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getreceiverParameter()
       * @generated
       */
      EClass RECEIVER_PARAMETER = eINSTANCE.getreceiverParameter();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference RECEIVER_PARAMETER__ANNOTATIONS = eINSTANCE.getreceiverParameter_Annotations();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference RECEIVER_PARAMETER__TYPE = eINSTANCE.getreceiverParameter_Type();

      /**
       * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute RECEIVER_PARAMETER__QUALIFIER = eINSTANCE.getreceiverParameter_Qualifier();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute RECEIVER_PARAMETER__NAME = eINSTANCE.getreceiverParameter_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.throws_Impl <em>throws </em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.throws_Impl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getthrows_()
       * @generated
       */
      EClass THROWS_ = eINSTANCE.getthrows_();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.exceptionTypeListImpl
       * <em>exception Type List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.exceptionTypeListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getexceptionTypeList()
       * @generated
       */
      EClass EXCEPTION_TYPE_LIST = eINSTANCE.getexceptionTypeList();

      /**
       * The meta object literal for the '<em><b>Exception Types</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference EXCEPTION_TYPE_LIST__EXCEPTION_TYPES = eINSTANCE.getexceptionTypeList_ExceptionTypes();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.exceptionTypeImpl
       * <em>exception Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.exceptionTypeImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getexceptionType()
       * @generated
       */
      EClass EXCEPTION_TYPE = eINSTANCE.getexceptionType();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference EXCEPTION_TYPE__ANNOTATIONS = eINSTANCE.getexceptionType_Annotations();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute EXCEPTION_TYPE__NAME = eINSTANCE.getexceptionType_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.methodBodyImpl <em>method Body</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.methodBodyImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodBody()
       * @generated
       */
      EClass METHOD_BODY = eINSTANCE.getmethodBody();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.instanceInitializerImpl
       * <em>instance Initializer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.instanceInitializerImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinstanceInitializer()
       * @generated
       */
      EClass INSTANCE_INITIALIZER = eINSTANCE.getinstanceInitializer();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.staticInitializerImpl
       * <em>static Initializer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.staticInitializerImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getstaticInitializer()
       * @generated
       */
      EClass STATIC_INITIALIZER = eINSTANCE.getstaticInitializer();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.constructorDeclarationImpl
       * <em>constructor Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.constructorDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstructorDeclaration()
       * @generated
       */
      EClass CONSTRUCTOR_DECLARATION = eINSTANCE.getconstructorDeclaration();

      /**
       * The meta object literal for the '<em><b>Constructor Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CONSTRUCTOR_DECLARATION__CONSTRUCTOR_MODIFIERS = eINSTANCE.getconstructorDeclaration_ConstructorModifiers();

      /**
       * The meta object literal for the '<em><b>Constructor Declarator</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CONSTRUCTOR_DECLARATION__CONSTRUCTOR_DECLARATOR = eINSTANCE.getconstructorDeclaration_ConstructorDeclarator();

      /**
       * The meta object literal for the '<em><b>Throws </b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CONSTRUCTOR_DECLARATION__THROWS_ = eINSTANCE.getconstructorDeclaration_Throws_();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.constructorModifierImpl
       * <em>constructor Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.constructorModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstructorModifier()
       * @generated
       */
      EClass CONSTRUCTOR_MODIFIER = eINSTANCE.getconstructorModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.JavaConstructorModifierImpl
       * <em>Java Constructor Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.JavaConstructorModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaConstructorModifier()
       * @generated
       */
      EClass JAVA_CONSTRUCTOR_MODIFIER = eINSTANCE.getJavaConstructorModifier();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute JAVA_CONSTRUCTOR_MODIFIER__MODIFIER = eINSTANCE.getJavaConstructorModifier_Modifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.constructorDeclaratorImpl
       * <em>constructor Declarator</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.constructorDeclaratorImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstructorDeclarator()
       * @generated
       */
      EClass CONSTRUCTOR_DECLARATOR = eINSTANCE.getconstructorDeclarator();

      /**
       * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CONSTRUCTOR_DECLARATOR__TYPE_PARAMETERS = eINSTANCE.getconstructorDeclarator_TypeParameters();

      /**
       * The meta object literal for the '<em><b>Simple Type Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CONSTRUCTOR_DECLARATOR__SIMPLE_TYPE_NAME = eINSTANCE.getconstructorDeclarator_SimpleTypeName();

      /**
       * The meta object literal for the '<em><b>Formal Parameter List</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CONSTRUCTOR_DECLARATOR__FORMAL_PARAMETER_LIST = eINSTANCE.getconstructorDeclarator_FormalParameterList();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.enumDeclarationImpl
       * <em>enum Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.enumDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumDeclaration()
       * @generated
       */
      EClass ENUM_DECLARATION = eINSTANCE.getenumDeclaration();

      /**
       * The meta object literal for the '<em><b>Enum Body</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENUM_DECLARATION__ENUM_BODY = eINSTANCE.getenumDeclaration_EnumBody();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.enumBodyImpl <em>enum Body</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.enumBodyImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumBody()
       * @generated
       */
      EClass ENUM_BODY = eINSTANCE.getenumBody();

      /**
       * The meta object literal for the '<em><b>Enum Constant List</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENUM_BODY__ENUM_CONSTANT_LIST = eINSTANCE.getenumBody_EnumConstantList();

      /**
       * The meta object literal for the '<em><b>Enum Body Declarations</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENUM_BODY__ENUM_BODY_DECLARATIONS = eINSTANCE.getenumBody_EnumBodyDeclarations();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.enumConstantListImpl
       * <em>enum Constant List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.enumConstantListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumConstantList()
       * @generated
       */
      EClass ENUM_CONSTANT_LIST = eINSTANCE.getenumConstantList();

      /**
       * The meta object literal for the '<em><b>Enum Constants</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENUM_CONSTANT_LIST__ENUM_CONSTANTS = eINSTANCE.getenumConstantList_EnumConstants();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.enumConstantImpl
       * <em>enum Constant</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.enumConstantImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumConstant()
       * @generated
       */
      EClass ENUM_CONSTANT = eINSTANCE.getenumConstant();

      /**
       * The meta object literal for the '<em><b>Enum Constant Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENUM_CONSTANT__ENUM_CONSTANT_MODIFIERS = eINSTANCE.getenumConstant_EnumConstantModifiers();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ENUM_CONSTANT__NAME = eINSTANCE.getenumConstant_Name();

      /**
       * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENUM_CONSTANT__ARGUMENT_LIST = eINSTANCE.getenumConstant_ArgumentList();

      /**
       * The meta object literal for the '<em><b>Class Body</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENUM_CONSTANT__CLASS_BODY = eINSTANCE.getenumConstant_ClassBody();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.enumConstantModifierImpl
       * <em>enum Constant Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.enumConstantModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumConstantModifier()
       * @generated
       */
      EClass ENUM_CONSTANT_MODIFIER = eINSTANCE.getenumConstantModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.enumBodyDeclarationsImpl
       * <em>enum Body Declarations</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.enumBodyDeclarationsImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getenumBodyDeclarations()
       * @generated
       */
      EClass ENUM_BODY_DECLARATIONS = eINSTANCE.getenumBodyDeclarations();

      /**
       * The meta object literal for the '<em><b>Class Body Declarations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENUM_BODY_DECLARATIONS__CLASS_BODY_DECLARATIONS = eINSTANCE.getenumBodyDeclarations_ClassBodyDeclarations();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.interfaceDeclarationImpl
       * <em>interface Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceDeclaration()
       * @generated
       */
      EClass INTERFACE_DECLARATION = eINSTANCE.getinterfaceDeclaration();

      /**
       * The meta object literal for the '<em><b>Interface Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference INTERFACE_DECLARATION__INTERFACE_MODIFIERS = eINSTANCE.getinterfaceDeclaration_InterfaceModifiers();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute INTERFACE_DECLARATION__NAME = eINSTANCE.getinterfaceDeclaration_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.normalInterfaceDeclarationImpl
       * <em>normal Interface Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.normalInterfaceDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getnormalInterfaceDeclaration()
       * @generated
       */
      EClass NORMAL_INTERFACE_DECLARATION = eINSTANCE.getnormalInterfaceDeclaration();

      /**
       * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference NORMAL_INTERFACE_DECLARATION__TYPE_PARAMETERS = eINSTANCE.getnormalInterfaceDeclaration_TypeParameters();

      /**
       * The meta object literal for the '<em><b>Extends Interfaces</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference NORMAL_INTERFACE_DECLARATION__EXTENDS_INTERFACES = eINSTANCE.getnormalInterfaceDeclaration_ExtendsInterfaces();

      /**
       * The meta object literal for the '<em><b>Interface Body</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference NORMAL_INTERFACE_DECLARATION__INTERFACE_BODY = eINSTANCE.getnormalInterfaceDeclaration_InterfaceBody();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.interfaceModifierImpl
       * <em>interface Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceModifier()
       * @generated
       */
      EClass INTERFACE_MODIFIER = eINSTANCE.getinterfaceModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.JavaInterfaceModifierImpl
       * <em>Java Interface Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.JavaInterfaceModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaInterfaceModifier()
       * @generated
       */
      EClass JAVA_INTERFACE_MODIFIER = eINSTANCE.getJavaInterfaceModifier();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute JAVA_INTERFACE_MODIFIER__MODIFIER = eINSTANCE.getJavaInterfaceModifier_Modifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.extendsInterfacesImpl
       * <em>extends Interfaces</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.extendsInterfacesImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getextendsInterfaces()
       * @generated
       */
      EClass EXTENDS_INTERFACES = eINSTANCE.getextendsInterfaces();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.interfaceBodyImpl
       * <em>interface Body</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceBodyImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceBody()
       * @generated
       */
      EClass INTERFACE_BODY = eINSTANCE.getinterfaceBody();

      /**
       * The meta object literal for the '<em><b>Interface Member Declarations</b></em>' containment reference list
       * feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference INTERFACE_BODY__INTERFACE_MEMBER_DECLARATIONS = eINSTANCE.getinterfaceBody_InterfaceMemberDeclarations();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.interfaceMemberDeclarationImpl
       * <em>interface Member Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceMemberDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceMemberDeclaration()
       * @generated
       */
      EClass INTERFACE_MEMBER_DECLARATION = eINSTANCE.getinterfaceMemberDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.constantDeclarationImpl
       * <em>constant Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.constantDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstantDeclaration()
       * @generated
       */
      EClass CONSTANT_DECLARATION = eINSTANCE.getconstantDeclaration();

      /**
       * The meta object literal for the '<em><b>Constant Modifiers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CONSTANT_DECLARATION__CONSTANT_MODIFIERS = eINSTANCE.getconstantDeclaration_ConstantModifiers();

      /**
       * The meta object literal for the '<em><b>Unann Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CONSTANT_DECLARATION__UNANN_TYPE = eINSTANCE.getconstantDeclaration_UnannType();

      /**
       * The meta object literal for the '<em><b>Variable Declarator List</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference CONSTANT_DECLARATION__VARIABLE_DECLARATOR_LIST = eINSTANCE.getconstantDeclaration_VariableDeclaratorList();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.constantModifierImpl
       * <em>constant Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.constantModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconstantModifier()
       * @generated
       */
      EClass CONSTANT_MODIFIER = eINSTANCE.getconstantModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.JavaConstantModifierImpl
       * <em>Java Constant Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.JavaConstantModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaConstantModifier()
       * @generated
       */
      EClass JAVA_CONSTANT_MODIFIER = eINSTANCE.getJavaConstantModifier();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute JAVA_CONSTANT_MODIFIER__MODIFIER = eINSTANCE.getJavaConstantModifier_Modifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.interfaceMethodDeclarationImpl
       * <em>interface Method Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceMethodDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceMethodDeclaration()
       * @generated
       */
      EClass INTERFACE_METHOD_DECLARATION = eINSTANCE.getinterfaceMethodDeclaration();

      /**
       * The meta object literal for the '<em><b>Interface Method Modifiers</b></em>' containment reference list
       * feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference INTERFACE_METHOD_DECLARATION__INTERFACE_METHOD_MODIFIERS = eINSTANCE.getinterfaceMethodDeclaration_InterfaceMethodModifiers();

      /**
       * The meta object literal for the '<em><b>Method Header</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference INTERFACE_METHOD_DECLARATION__METHOD_HEADER = eINSTANCE.getinterfaceMethodDeclaration_MethodHeader();

      /**
       * The meta object literal for the '<em><b>Method Body</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference INTERFACE_METHOD_DECLARATION__METHOD_BODY = eINSTANCE.getinterfaceMethodDeclaration_MethodBody();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.interfaceMethodModifierImpl
       * <em>interface Method Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.interfaceMethodModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getinterfaceMethodModifier()
       * @generated
       */
      EClass INTERFACE_METHOD_MODIFIER = eINSTANCE.getinterfaceMethodModifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.JavaInterfaceMethodModifiersImpl
       * <em>Java Interface Method Modifiers</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.JavaInterfaceMethodModifiersImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaInterfaceMethodModifiers()
       * @generated
       */
      EClass JAVA_INTERFACE_METHOD_MODIFIERS = eINSTANCE.getJavaInterfaceMethodModifiers();

      /**
       * The meta object literal for the '<em><b>Modifiers</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute JAVA_INTERFACE_METHOD_MODIFIERS__MODIFIERS = eINSTANCE.getJavaInterfaceMethodModifiers_Modifiers();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.annotationTypeDeclarationImpl
       * <em>annotation Type Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.annotationTypeDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeDeclaration()
       * @generated
       */
      EClass ANNOTATION_TYPE_DECLARATION = eINSTANCE.getannotationTypeDeclaration();

      /**
       * The meta object literal for the '<em><b>Annotation Type Body</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION_TYPE_DECLARATION__ANNOTATION_TYPE_BODY = eINSTANCE.getannotationTypeDeclaration_AnnotationTypeBody();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.annotationTypeBodyImpl
       * <em>annotation Type Body</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.annotationTypeBodyImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeBody()
       * @generated
       */
      EClass ANNOTATION_TYPE_BODY = eINSTANCE.getannotationTypeBody();

      /**
       * The meta object literal for the '<em><b>Annotation Type Member Declarations</b></em>' containment reference
       * list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION_TYPE_BODY__ANNOTATION_TYPE_MEMBER_DECLARATIONS = eINSTANCE.getannotationTypeBody_AnnotationTypeMemberDeclarations();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.annotationTypeMemberDeclarationImpl
       * <em>annotation Type Member Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.annotationTypeMemberDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeMemberDeclaration()
       * @generated
       */
      EClass ANNOTATION_TYPE_MEMBER_DECLARATION = eINSTANCE.getannotationTypeMemberDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.annotationTypeElementDeclarationImpl
       * <em>annotation Type Element Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.annotationTypeElementDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeElementDeclaration()
       * @generated
       */
      EClass ANNOTATION_TYPE_ELEMENT_DECLARATION = eINSTANCE.getannotationTypeElementDeclaration();

      /**
       * The meta object literal for the '<em><b>Annotation Type Element Modifiers</b></em>' containment reference list
       * feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION_TYPE_ELEMENT_DECLARATION__ANNOTATION_TYPE_ELEMENT_MODIFIERS = eINSTANCE.getannotationTypeElementDeclaration_AnnotationTypeElementModifiers();

      /**
       * The meta object literal for the '<em><b>Unann Type</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION_TYPE_ELEMENT_DECLARATION__UNANN_TYPE = eINSTANCE.getannotationTypeElementDeclaration_UnannType();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ANNOTATION_TYPE_ELEMENT_DECLARATION__NAME = eINSTANCE.getannotationTypeElementDeclaration_Name();

      /**
       * The meta object literal for the '<em><b>Dims</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION_TYPE_ELEMENT_DECLARATION__DIMS = eINSTANCE.getannotationTypeElementDeclaration_Dims();

      /**
       * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION_TYPE_ELEMENT_DECLARATION__DEFAULT_VALUE = eINSTANCE.getannotationTypeElementDeclaration_DefaultValue();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.annotationTypeElementModifierImpl
       * <em>annotation Type Element Modifier</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.annotationTypeElementModifierImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotationTypeElementModifier()
       * @generated
       */
      EClass ANNOTATION_TYPE_ELEMENT_MODIFIER = eINSTANCE.getannotationTypeElementModifier();

      /**
       * The meta object literal for the '
       * {@link org.sourcepit.java.type.type.impl.JavaAnnotationTypeElementModifiersImpl
       * <em>Java Annotation Type Element Modifiers</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.JavaAnnotationTypeElementModifiersImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getJavaAnnotationTypeElementModifiers()
       * @generated
       */
      EClass JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS = eINSTANCE.getJavaAnnotationTypeElementModifiers();

      /**
       * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute JAVA_ANNOTATION_TYPE_ELEMENT_MODIFIERS__MODIFIER = eINSTANCE.getJavaAnnotationTypeElementModifiers_Modifier();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.defaultValueImpl
       * <em>default Value</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.defaultValueImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getdefaultValue()
       * @generated
       */
      EClass DEFAULT_VALUE = eINSTANCE.getdefaultValue();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.annotationImpl <em>annotation</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.annotationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getannotation()
       * @generated
       */
      EClass ANNOTATION = eINSTANCE.getannotation();

      /**
       * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ANNOTATION__TYPE_NAME = eINSTANCE.getannotation_TypeName();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.normalAnnotationImpl
       * <em>normal Annotation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.normalAnnotationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getnormalAnnotation()
       * @generated
       */
      EClass NORMAL_ANNOTATION = eINSTANCE.getnormalAnnotation();

      /**
       * The meta object literal for the '<em><b>Element Value Pair List</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference NORMAL_ANNOTATION__ELEMENT_VALUE_PAIR_LIST = eINSTANCE.getnormalAnnotation_ElementValuePairList();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.elementValuePairListImpl
       * <em>element Value Pair List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.elementValuePairListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValuePairList()
       * @generated
       */
      EClass ELEMENT_VALUE_PAIR_LIST = eINSTANCE.getelementValuePairList();

      /**
       * The meta object literal for the '<em><b>Element Value Pairs</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ELEMENT_VALUE_PAIR_LIST__ELEMENT_VALUE_PAIRS = eINSTANCE.getelementValuePairList_ElementValuePairs();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.elementValuePairImpl
       * <em>element Value Pair</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.elementValuePairImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValuePair()
       * @generated
       */
      EClass ELEMENT_VALUE_PAIR = eINSTANCE.getelementValuePair();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ELEMENT_VALUE_PAIR__NAME = eINSTANCE.getelementValuePair_Name();

      /**
       * The meta object literal for the '<em><b>Element Value</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ELEMENT_VALUE_PAIR__ELEMENT_VALUE = eINSTANCE.getelementValuePair_ElementValue();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.elementValueImpl
       * <em>element Value</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.elementValueImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValue()
       * @generated
       */
      EClass ELEMENT_VALUE = eINSTANCE.getelementValue();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.elementValueArrayInitializerImpl
       * <em>element Value Array Initializer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.elementValueArrayInitializerImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValueArrayInitializer()
       * @generated
       */
      EClass ELEMENT_VALUE_ARRAY_INITIALIZER = eINSTANCE.getelementValueArrayInitializer();

      /**
       * The meta object literal for the '<em><b>Element Value List</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ELEMENT_VALUE_ARRAY_INITIALIZER__ELEMENT_VALUE_LIST = eINSTANCE.getelementValueArrayInitializer_ElementValueList();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.elementValueListImpl
       * <em>element Value List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.elementValueListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getelementValueList()
       * @generated
       */
      EClass ELEMENT_VALUE_LIST = eINSTANCE.getelementValueList();

      /**
       * The meta object literal for the '<em><b>Element Values</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ELEMENT_VALUE_LIST__ELEMENT_VALUES = eINSTANCE.getelementValueList_ElementValues();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.markerAnnotationImpl
       * <em>marker Annotation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.markerAnnotationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmarkerAnnotation()
       * @generated
       */
      EClass MARKER_ANNOTATION = eINSTANCE.getmarkerAnnotation();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.singleElementAnnotationImpl
       * <em>single Element Annotation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.singleElementAnnotationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getsingleElementAnnotation()
       * @generated
       */
      EClass SINGLE_ELEMENT_ANNOTATION = eINSTANCE.getsingleElementAnnotation();

      /**
       * The meta object literal for the '<em><b>Element Value</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference SINGLE_ELEMENT_ANNOTATION__ELEMENT_VALUE = eINSTANCE.getsingleElementAnnotation_ElementValue();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.arrayInitializerImpl
       * <em>array Initializer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.arrayInitializerImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getarrayInitializer()
       * @generated
       */
      EClass ARRAY_INITIALIZER = eINSTANCE.getarrayInitializer();

      /**
       * The meta object literal for the '<em><b>Variable Initializer List</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ARRAY_INITIALIZER__VARIABLE_INITIALIZER_LIST = eINSTANCE.getarrayInitializer_VariableInitializerList();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.variableInitializerListImpl
       * <em>variable Initializer List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.variableInitializerListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getvariableInitializerList()
       * @generated
       */
      EClass VARIABLE_INITIALIZER_LIST = eINSTANCE.getvariableInitializerList();

      /**
       * The meta object literal for the '<em><b>Variable Initializer</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference VARIABLE_INITIALIZER_LIST__VARIABLE_INITIALIZER = eINSTANCE.getvariableInitializerList_VariableInitializer();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.blockImpl <em>block</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.blockImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getblock()
       * @generated
       */
      EClass BLOCK = eINSTANCE.getblock();

      /**
       * The meta object literal for the '<em><b>Dummy</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute BLOCK__DUMMY = eINSTANCE.getblock_Dummy();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.blockStatementsImpl
       * <em>block Statements</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.blockStatementsImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getblockStatements()
       * @generated
       */
      EClass BLOCK_STATEMENTS = eINSTANCE.getblockStatements();

      /**
       * The meta object literal for the '<em><b>Dummy</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute BLOCK_STATEMENTS__DUMMY = eINSTANCE.getblockStatements_Dummy();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.argumentListImpl
       * <em>argument List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.argumentListImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getargumentList()
       * @generated
       */
      EClass ARGUMENT_LIST = eINSTANCE.getargumentList();

      /**
       * The meta object literal for the '<em><b>Dummy</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ARGUMENT_LIST__DUMMY = eINSTANCE.getargumentList_Dummy();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.primaryImpl <em>primary</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.primaryImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getprimary()
       * @generated
       */
      EClass PRIMARY = eINSTANCE.getprimary();

      /**
       * The meta object literal for the '<em><b>Dummy</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute PRIMARY__DUMMY = eINSTANCE.getprimary_Dummy();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.expressionImpl <em>expression</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.expressionImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getexpression()
       * @generated
       */
      EClass EXPRESSION = eINSTANCE.getexpression();

      /**
       * The meta object literal for the '<em><b>Dummy</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute EXPRESSION__DUMMY = eINSTANCE.getexpression_Dummy();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.conditionalExpressionImpl
       * <em>conditional Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.conditionalExpressionImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getconditionalExpression()
       * @generated
       */
      EClass CONDITIONAL_EXPRESSION = eINSTANCE.getconditionalExpression();

      /**
       * The meta object literal for the '<em><b>Dummy</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CONDITIONAL_EXPRESSION__DUMMY = eINSTANCE.getconditionalExpression_Dummy();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.EmptyTypeDeclarationImpl
       * <em>Empty Type Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.EmptyTypeDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getEmptyTypeDeclaration()
       * @generated
       */
      EClass EMPTY_TYPE_DECLARATION = eINSTANCE.getEmptyTypeDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.impl.EmptyClassMemberDeclarationImpl
       * <em>Empty Class Member Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.impl.EmptyClassMemberDeclarationImpl
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getEmptyClassMemberDeclaration()
       * @generated
       */
      EClass EMPTY_CLASS_MEMBER_DECLARATION = eINSTANCE.getEmptyClassMemberDeclaration();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.ClassModifiers <em>Class Modifiers</em>}'
       * enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.ClassModifiers
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getClassModifiers()
       * @generated
       */
      EEnum CLASS_MODIFIERS = eINSTANCE.getClassModifiers();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.FieldModifiers <em>Field Modifiers</em>}'
       * enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.FieldModifiers
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getFieldModifiers()
       * @generated
       */
      EEnum FIELD_MODIFIERS = eINSTANCE.getFieldModifiers();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.methodModifiers <em>method Modifiers</em>}
       * ' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.methodModifiers
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getmethodModifiers()
       * @generated
       */
      EEnum METHOD_MODIFIERS = eINSTANCE.getmethodModifiers();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.VariableModifiers
       * <em>Variable Modifiers</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.VariableModifiers
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getVariableModifiers()
       * @generated
       */
      EEnum VARIABLE_MODIFIERS = eINSTANCE.getVariableModifiers();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.ConstructorModifiers
       * <em>Constructor Modifiers</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.ConstructorModifiers
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getConstructorModifiers()
       * @generated
       */
      EEnum CONSTRUCTOR_MODIFIERS = eINSTANCE.getConstructorModifiers();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.InterfaceModifiers
       * <em>Interface Modifiers</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.InterfaceModifiers
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getInterfaceModifiers()
       * @generated
       */
      EEnum INTERFACE_MODIFIERS = eINSTANCE.getInterfaceModifiers();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.ConstantModifiers
       * <em>Constant Modifiers</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.ConstantModifiers
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getConstantModifiers()
       * @generated
       */
      EEnum CONSTANT_MODIFIERS = eINSTANCE.getConstantModifiers();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.InterfaceMethodModifiers
       * <em>Interface Method Modifiers</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.InterfaceMethodModifiers
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getInterfaceMethodModifiers()
       * @generated
       */
      EEnum INTERFACE_METHOD_MODIFIERS = eINSTANCE.getInterfaceMethodModifiers();

      /**
       * The meta object literal for the '{@link org.sourcepit.java.type.type.AnnotationTypeElementModifiers
       * <em>Annotation Type Element Modifiers</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.java.type.type.AnnotationTypeElementModifiers
       * @see org.sourcepit.java.type.type.impl.TypePackageImpl#getAnnotationTypeElementModifiers()
       * @generated
       */
      EEnum ANNOTATION_TYPE_ELEMENT_MODIFIERS = eINSTANCE.getAnnotationTypeElementModifiers();

   }

} // TypePackage
