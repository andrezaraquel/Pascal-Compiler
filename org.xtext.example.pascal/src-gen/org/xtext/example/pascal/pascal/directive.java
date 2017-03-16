/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.directive#getCompiler_defined_directives <em>Compiler defined directives</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getdirective()
 * @model
 * @generated
 */
public interface directive extends EObject
{
  /**
   * Returns the value of the '<em><b>Compiler defined directives</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compiler defined directives</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compiler defined directives</em>' containment reference.
   * @see #setCompiler_defined_directives(compiler_defined_directives)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getdirective_Compiler_defined_directives()
   * @model containment="true"
   * @generated
   */
  compiler_defined_directives getCompiler_defined_directives();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.directive#getCompiler_defined_directives <em>Compiler defined directives</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compiler defined directives</em>' containment reference.
   * @see #getCompiler_defined_directives()
   * @generated
   */
  void setCompiler_defined_directives(compiler_defined_directives value);

} // directive
