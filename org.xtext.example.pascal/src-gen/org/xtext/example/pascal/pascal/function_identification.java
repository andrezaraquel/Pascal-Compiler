/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.function_identification#getFunction_identifier <em>Function identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getfunction_identification()
 * @model
 * @generated
 */
public interface function_identification extends EObject
{
  /**
   * Returns the value of the '<em><b>Function identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function identifier</em>' containment reference.
   * @see #setFunction_identifier(identifier)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfunction_identification_Function_identifier()
   * @model containment="true"
   * @generated
   */
  identifier getFunction_identifier();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.function_identification#getFunction_identifier <em>Function identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function identifier</em>' containment reference.
   * @see #getFunction_identifier()
   * @generated
   */
  void setFunction_identifier(identifier value);

} // function_identification
