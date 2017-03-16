/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.variant#getCase_label_list <em>Case label list</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.variant#getField_list <em>Field list</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getvariant()
 * @model
 * @generated
 */
public interface variant extends EObject
{
  /**
   * Returns the value of the '<em><b>Case label list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case label list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case label list</em>' containment reference.
   * @see #setCase_label_list(case_label_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariant_Case_label_list()
   * @model containment="true"
   * @generated
   */
  case_label_list getCase_label_list();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.variant#getCase_label_list <em>Case label list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case label list</em>' containment reference.
   * @see #getCase_label_list()
   * @generated
   */
  void setCase_label_list(case_label_list value);

  /**
   * Returns the value of the '<em><b>Field list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field list</em>' containment reference.
   * @see #setField_list(field_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariant_Field_list()
   * @model containment="true"
   * @generated
   */
  field_list getField_list();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.variant#getField_list <em>Field list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field list</em>' containment reference.
   * @see #getField_list()
   * @generated
   */
  void setField_list(field_list value);

} // variant
