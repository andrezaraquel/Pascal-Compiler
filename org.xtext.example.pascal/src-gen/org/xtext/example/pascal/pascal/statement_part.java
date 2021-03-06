/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.statement_part#getStatement_sequence <em>Statement sequence</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getstatement_part()
 * @model
 * @generated
 */
public interface statement_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement sequence</em>' containment reference.
   * @see #setStatement_sequence(statement_sequence)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstatement_part_Statement_sequence()
   * @model containment="true"
   * @generated
   */
  statement_sequence getStatement_sequence();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.statement_part#getStatement_sequence <em>Statement sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement sequence</em>' containment reference.
   * @see #getStatement_sequence()
   * @generated
   */
  void setStatement_sequence(statement_sequence value);

} // statement_part
