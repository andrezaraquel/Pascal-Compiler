/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.procedure_identification#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_identification()
 * @model
 * @generated
 */
public interface procedure_identification extends EObject
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
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprocedure_identification_Identifier()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.procedure_identification#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(identifier value);

} // procedure_identification
