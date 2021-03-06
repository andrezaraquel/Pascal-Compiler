/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.procedure_block#getDeclaration_part <em>Declaration part</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.procedure_block#getStatement_part <em>Statement part</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_block()
 * @model
 * @generated
 */
public interface procedure_block extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration part</em>' containment reference.
   * @see #setDeclaration_part(declaration_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_block_Declaration_part()
   * @model containment="true"
   * @generated
   */
  declaration_part getDeclaration_part();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.procedure_block#getDeclaration_part <em>Declaration part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration part</em>' containment reference.
   * @see #getDeclaration_part()
   * @generated
   */
  void setDeclaration_part(declaration_part value);

  /**
   * Returns the value of the '<em><b>Statement part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement part</em>' containment reference.
   * @see #setStatement_part(statement_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_block_Statement_part()
   * @model containment="true"
   * @generated
   */
  statement_part getStatement_part();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.procedure_block#getStatement_part <em>Statement part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement part</em>' containment reference.
   * @see #getStatement_part()
   * @generated
   */
  void setStatement_part(statement_part value);

} // procedure_block
