/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.term#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.term#getMultiplication_operator <em>Multiplication operator</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getterm()
 * @model
 * @generated
 */
public interface term extends EObject
{
  /**
   * Returns the value of the '<em><b>Factor</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.factor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getterm_Factor()
   * @model containment="true"
   * @generated
   */
  EList<factor> getFactor();

  /**
   * Returns the value of the '<em><b>Multiplication operator</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplication operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplication operator</em>' attribute list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getterm_Multiplication_operator()
   * @model unique="false"
   * @generated
   */
  EList<String> getMultiplication_operator();

} // term
