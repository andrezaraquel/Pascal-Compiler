/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enumerated type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.enumerated_type#getIdentifier_list <em>Identifier list</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getenumerated_type()
 * @model
 * @generated
 */
public interface enumerated_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier list</em>' containment reference.
   * @see #setIdentifier_list(identifier_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getenumerated_type_Identifier_list()
   * @model containment="true"
   * @generated
   */
  identifier_list getIdentifier_list();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.enumerated_type#getIdentifier_list <em>Identifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier list</em>' containment reference.
   * @see #getIdentifier_list()
   * @generated
   */
  void setIdentifier_list(identifier_list value);

} // enumerated_type
