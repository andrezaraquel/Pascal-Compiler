/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.label#getInteger_number <em>Integer number</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getlabel()
 * @model
 * @generated
 */
public interface label extends EObject
{
  /**
   * Returns the value of the '<em><b>Integer number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer number</em>' containment reference.
   * @see #setInteger_number(integer_number)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getlabel_Integer_number()
   * @model containment="true"
   * @generated
   */
  integer_number getInteger_number();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.label#getInteger_number <em>Integer number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer number</em>' containment reference.
   * @see #getInteger_number()
   * @generated
   */
  void setInteger_number(integer_number value);

} // label
