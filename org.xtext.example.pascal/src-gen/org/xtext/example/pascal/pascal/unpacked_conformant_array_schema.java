/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unpacked conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getBound_specification <em>Bound specification</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getType_identifier <em>Type identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getConformant_array_schema <em>Conformant array schema</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getunpacked_conformant_array_schema()
 * @model
 * @generated
 */
public interface unpacked_conformant_array_schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Bound specification</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.bound_specification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound specification</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound specification</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getunpacked_conformant_array_schema_Bound_specification()
   * @model containment="true"
   * @generated
   */
  EList<bound_specification> getBound_specification();

  /**
   * Returns the value of the '<em><b>Type identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type identifier</em>' containment reference.
   * @see #setType_identifier(type_identifier)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getunpacked_conformant_array_schema_Type_identifier()
   * @model containment="true"
   * @generated
   */
  type_identifier getType_identifier();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getType_identifier <em>Type identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type identifier</em>' containment reference.
   * @see #getType_identifier()
   * @generated
   */
  void setType_identifier(type_identifier value);

  /**
   * Returns the value of the '<em><b>Conformant array schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conformant array schema</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conformant array schema</em>' containment reference.
   * @see #setConformant_array_schema(conformant_array_schema)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getunpacked_conformant_array_schema_Conformant_array_schema()
   * @model containment="true"
   * @generated
   */
  conformant_array_schema getConformant_array_schema();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.unpacked_conformant_array_schema#getConformant_array_schema <em>Conformant array schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conformant array schema</em>' containment reference.
   * @see #getConformant_array_schema()
   * @generated
   */
  void setConformant_array_schema(conformant_array_schema value);

} // unpacked_conformant_array_schema
