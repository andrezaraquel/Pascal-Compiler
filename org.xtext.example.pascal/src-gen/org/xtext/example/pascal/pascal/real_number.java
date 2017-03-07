/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>real number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.real_number#getDigit_sequence <em>Digit sequence</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.real_number#getDigit_sequence2 <em>Digit sequence2</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.real_number#getScale_factor <em>Scale factor</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getreal_number()
 * @model
 * @generated
 */
public interface real_number extends EObject
{
  /**
   * Returns the value of the '<em><b>Digit sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Digit sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Digit sequence</em>' containment reference.
   * @see #setDigit_sequence(digit_sequence)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getreal_number_Digit_sequence()
   * @model containment="true"
   * @generated
   */
  digit_sequence getDigit_sequence();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.real_number#getDigit_sequence <em>Digit sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Digit sequence</em>' containment reference.
   * @see #getDigit_sequence()
   * @generated
   */
  void setDigit_sequence(digit_sequence value);

  /**
   * Returns the value of the '<em><b>Digit sequence2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Digit sequence2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Digit sequence2</em>' containment reference.
   * @see #setDigit_sequence2(digit_sequence)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getreal_number_Digit_sequence2()
   * @model containment="true"
   * @generated
   */
  digit_sequence getDigit_sequence2();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.real_number#getDigit_sequence2 <em>Digit sequence2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Digit sequence2</em>' containment reference.
   * @see #getDigit_sequence2()
   * @generated
   */
  void setDigit_sequence2(digit_sequence value);

  /**
   * Returns the value of the '<em><b>Scale factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scale factor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scale factor</em>' containment reference.
   * @see #setScale_factor(scale_factor)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getreal_number_Scale_factor()
   * @model containment="true"
   * @generated
   */
  scale_factor getScale_factor();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.real_number#getScale_factor <em>Scale factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale factor</em>' containment reference.
   * @see #getScale_factor()
   * @generated
   */
  void setScale_factor(scale_factor value);

} // real_number