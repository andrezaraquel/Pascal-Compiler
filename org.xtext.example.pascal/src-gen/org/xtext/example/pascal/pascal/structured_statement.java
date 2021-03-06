/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>structured statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getCompound_statement <em>Compound statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getRepetitive_statement <em>Repetitive statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getConditional_statement <em>Conditional statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getWith_statement <em>With statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement()
 * @model
 * @generated
 */
public interface structured_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Compound statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compound statement</em>' containment reference.
   * @see #setCompound_statement(compound_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_Compound_statement()
   * @model containment="true"
   * @generated
   */
  compound_statement getCompound_statement();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getCompound_statement <em>Compound statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compound statement</em>' containment reference.
   * @see #getCompound_statement()
   * @generated
   */
  void setCompound_statement(compound_statement value);

  /**
   * Returns the value of the '<em><b>Repetitive statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repetitive statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repetitive statement</em>' containment reference.
   * @see #setRepetitive_statement(repetitive_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_Repetitive_statement()
   * @model containment="true"
   * @generated
   */
  repetitive_statement getRepetitive_statement();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getRepetitive_statement <em>Repetitive statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repetitive statement</em>' containment reference.
   * @see #getRepetitive_statement()
   * @generated
   */
  void setRepetitive_statement(repetitive_statement value);

  /**
   * Returns the value of the '<em><b>Conditional statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional statement</em>' containment reference.
   * @see #setConditional_statement(conditional_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_Conditional_statement()
   * @model containment="true"
   * @generated
   */
  conditional_statement getConditional_statement();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getConditional_statement <em>Conditional statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional statement</em>' containment reference.
   * @see #getConditional_statement()
   * @generated
   */
  void setConditional_statement(conditional_statement value);

  /**
   * Returns the value of the '<em><b>With statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>With statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>With statement</em>' containment reference.
   * @see #setWith_statement(with_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_With_statement()
   * @model containment="true"
   * @generated
   */
  with_statement getWith_statement();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getWith_statement <em>With statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With statement</em>' containment reference.
   * @see #getWith_statement()
   * @generated
   */
  void setWith_statement(with_statement value);

} // structured_statement
