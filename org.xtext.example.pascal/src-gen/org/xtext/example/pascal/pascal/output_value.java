/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>output value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.output_value#getOutput_value <em>Output value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getoutput_value()
 * @model
 * @generated
 */
public interface output_value extends output_list
{
  /**
   * Returns the value of the '<em><b>Output value</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.output_value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output value</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getoutput_value_Output_value()
   * @model containment="true"
   * @generated
   */
  EList<output_value> getOutput_value();

} // output_value
