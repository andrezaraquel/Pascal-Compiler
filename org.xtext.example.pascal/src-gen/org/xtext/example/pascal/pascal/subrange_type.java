/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>subrange type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.subrange_type#getLower_bound <em>Lower bound</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.subrange_type#getUpper_bound <em>Upper bound</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getsubrange_type()
 * @model
 * @generated
 */
public interface subrange_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower bound</em>' containment reference.
   * @see #setLower_bound(lower_bound)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsubrange_type_Lower_bound()
   * @model containment="true"
   * @generated
   */
  lower_bound getLower_bound();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.subrange_type#getLower_bound <em>Lower bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower bound</em>' containment reference.
   * @see #getLower_bound()
   * @generated
   */
  void setLower_bound(lower_bound value);

  /**
   * Returns the value of the '<em><b>Upper bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper bound</em>' containment reference.
   * @see #setUpper_bound(upper_bound)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getsubrange_type_Upper_bound()
   * @model containment="true"
   * @generated
   */
  upper_bound getUpper_bound();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.subrange_type#getUpper_bound <em>Upper bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper bound</em>' containment reference.
   * @see #getUpper_bound()
   * @generated
   */
  void setUpper_bound(upper_bound value);

} // subrange_type
