/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.procedure_heading#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.procedure_heading#getFormal_parameter_list <em>Formal parameter list</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_heading()
 * @model
 * @generated
 */
public interface procedure_heading extends EObject
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
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_heading_Identifier()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.procedure_heading#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(identifier value);

  /**
   * Returns the value of the '<em><b>Formal parameter list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal parameter list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal parameter list</em>' containment reference.
   * @see #setFormal_parameter_list(formal_parameter_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_heading_Formal_parameter_list()
   * @model containment="true"
   * @generated
   */
  formal_parameter_list getFormal_parameter_list();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.procedure_heading#getFormal_parameter_list <em>Formal parameter list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal parameter list</em>' containment reference.
   * @see #getFormal_parameter_list()
   * @generated
   */
  void setFormal_parameter_list(formal_parameter_list value);

} // procedure_heading
