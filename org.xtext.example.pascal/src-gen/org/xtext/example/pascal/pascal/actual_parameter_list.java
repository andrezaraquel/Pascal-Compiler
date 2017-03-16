/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>actual parameter list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.actual_parameter_list#getActual_parameter <em>Actual parameter</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getactual_parameter_list()
 * @model
 * @generated
 */
public interface actual_parameter_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Actual parameter</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.actual_parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual parameter</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getactual_parameter_list_Actual_parameter()
   * @model containment="true"
   * @generated
   */
  EList<actual_parameter> getActual_parameter();

} // actual_parameter_list
