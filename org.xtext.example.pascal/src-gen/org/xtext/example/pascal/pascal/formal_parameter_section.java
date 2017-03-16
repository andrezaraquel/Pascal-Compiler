/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>formal parameter section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.formal_parameter_section#getValue_parameter_section <em>Value parameter section</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.formal_parameter_section#getVariable_parameter_section <em>Variable parameter section</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.formal_parameter_section#getProcedure_parameter_section <em>Procedure parameter section</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.formal_parameter_section#getFunction_parameter_section <em>Function parameter section</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section()
 * @model
 * @generated
 */
public interface formal_parameter_section extends EObject
{
  /**
   * Returns the value of the '<em><b>Value parameter section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value parameter section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value parameter section</em>' containment reference.
   * @see #setValue_parameter_section(value_parameter_section)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section_Value_parameter_section()
   * @model containment="true"
   * @generated
   */
  value_parameter_section getValue_parameter_section();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.formal_parameter_section#getValue_parameter_section <em>Value parameter section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value parameter section</em>' containment reference.
   * @see #getValue_parameter_section()
   * @generated
   */
  void setValue_parameter_section(value_parameter_section value);

  /**
   * Returns the value of the '<em><b>Variable parameter section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable parameter section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable parameter section</em>' containment reference.
   * @see #setVariable_parameter_section(variable_parameter_section)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section_Variable_parameter_section()
   * @model containment="true"
   * @generated
   */
  variable_parameter_section getVariable_parameter_section();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.formal_parameter_section#getVariable_parameter_section <em>Variable parameter section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable parameter section</em>' containment reference.
   * @see #getVariable_parameter_section()
   * @generated
   */
  void setVariable_parameter_section(variable_parameter_section value);

  /**
   * Returns the value of the '<em><b>Procedure parameter section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure parameter section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure parameter section</em>' containment reference.
   * @see #setProcedure_parameter_section(procedure_parameter_section)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section_Procedure_parameter_section()
   * @model containment="true"
   * @generated
   */
  procedure_parameter_section getProcedure_parameter_section();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.formal_parameter_section#getProcedure_parameter_section <em>Procedure parameter section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure parameter section</em>' containment reference.
   * @see #getProcedure_parameter_section()
   * @generated
   */
  void setProcedure_parameter_section(procedure_parameter_section value);

  /**
   * Returns the value of the '<em><b>Function parameter section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function parameter section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function parameter section</em>' containment reference.
   * @see #setFunction_parameter_section(function_parameter_section)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getformal_parameter_section_Function_parameter_section()
   * @model containment="true"
   * @generated
   */
  function_parameter_section getFunction_parameter_section();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.formal_parameter_section#getFunction_parameter_section <em>Function parameter section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function parameter section</em>' containment reference.
   * @see #getFunction_parameter_section()
   * @generated
   */
  void setFunction_parameter_section(function_parameter_section value);

} // formal_parameter_section
