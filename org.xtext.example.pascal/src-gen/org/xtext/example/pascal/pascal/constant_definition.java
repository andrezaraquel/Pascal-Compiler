/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constant definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.constant_definition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.constant_definition#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getconstant_definition()
 * @model
 * @generated
 */
public interface constant_definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(identifier)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getconstant_definition_Identifier()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.constant_definition#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(identifier value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(constant)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getconstant_definition_Constant()
   * @model containment="true"
   * @generated
   */
  constant getConstant();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.constant_definition#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(constant value);

} // constant_definition