/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.variable#getEntire_variable <em>Entire variable</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.variable#getExpression_list <em>Expression list</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.variable#getField_identifier <em>Field identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable()
 * @model
 * @generated
 */
public interface variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Entire variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entire variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entire variable</em>' containment reference.
   * @see #setEntire_variable(entire_variable)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_Entire_variable()
   * @model containment="true"
   * @generated
   */
  entire_variable getEntire_variable();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.variable#getEntire_variable <em>Entire variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entire variable</em>' containment reference.
   * @see #getEntire_variable()
   * @generated
   */
  void setEntire_variable(entire_variable value);

  /**
   * Returns the value of the '<em><b>Expression list</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.expression_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression list</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression list</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_Expression_list()
   * @model containment="true"
   * @generated
   */
  EList<expression_list> getExpression_list();

  /**
   * Returns the value of the '<em><b>Field identifier</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.identifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field identifier</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field identifier</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_Field_identifier()
   * @model containment="true"
   * @generated
   */
  EList<identifier> getField_identifier();

} // variable
