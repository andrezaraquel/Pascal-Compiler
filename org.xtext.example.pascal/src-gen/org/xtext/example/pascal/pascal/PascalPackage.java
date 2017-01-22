/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.pascal.pascal.PascalFactory
 * @model kind="package"
 * @generated
 */
public interface PascalPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pascal";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/pascal/Pascal";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pascal";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PascalPackage eINSTANCE = org.xtext.example.pascal.pascal.impl.PascalPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.BeginImpl <em>Begin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.BeginImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getBegin()
   * @generated
   */
  int BEGIN = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEGIN__NAME = 0;

  /**
   * The number of structural features of the '<em>Begin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEGIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.FunctionImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = BEGIN__NAME;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = BEGIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.pascal.pascal.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.pascal.pascal.impl.ProcedureImpl
   * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = BEGIN__NAME;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = BEGIN_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.Begin <em>Begin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Begin</em>'.
   * @see org.xtext.example.pascal.pascal.Begin
   * @generated
   */
  EClass getBegin();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.pascal.pascal.Begin#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.pascal.pascal.Begin#getName()
   * @see #getBegin()
   * @generated
   */
  EAttribute getBegin_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.example.pascal.pascal.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for class '{@link org.xtext.example.pascal.pascal.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see org.xtext.example.pascal.pascal.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PascalFactory getPascalFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.BeginImpl <em>Begin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.BeginImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getBegin()
     * @generated
     */
    EClass BEGIN = eINSTANCE.getBegin();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEGIN__NAME = eINSTANCE.getBegin_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.FunctionImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '{@link org.xtext.example.pascal.pascal.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.pascal.pascal.impl.ProcedureImpl
     * @see org.xtext.example.pascal.pascal.impl.PascalPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

  }

} //PascalPackage
