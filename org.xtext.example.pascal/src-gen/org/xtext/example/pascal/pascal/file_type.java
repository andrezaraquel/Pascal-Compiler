/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>file type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.file_type#getFile_component_type <em>File component type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getfile_type()
 * @model
 * @generated
 */
public interface file_type extends EObject
{
  /**
   * Returns the value of the '<em><b>File component type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File component type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File component type</em>' containment reference.
   * @see #setFile_component_type(file_component_type)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfile_type_File_component_type()
   * @model containment="true"
   * @generated
   */
  file_component_type getFile_component_type();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.file_type#getFile_component_type <em>File component type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File component type</em>' containment reference.
   * @see #getFile_component_type()
   * @generated
   */
  void setFile_component_type(file_component_type value);

} // file_type
