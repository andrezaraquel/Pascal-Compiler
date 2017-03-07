/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>packed conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema#getBound_specification <em>Bound specification</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema#getType_identifier <em>Type identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getpacked_conformant_array_schema()
 * @model
 * @generated
 */
public interface packed_conformant_array_schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Bound specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound specification</em>' containment reference.
   * @see #setBound_specification(bound_specification)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getpacked_conformant_array_schema_Bound_specification()
   * @model containment="true"
   * @generated
   */
  bound_specification getBound_specification();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema#getBound_specification <em>Bound specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound specification</em>' containment reference.
   * @see #getBound_specification()
   * @generated
   */
  void setBound_specification(bound_specification value);

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
   * @see org.xtext.example.pascal.pascal.PascalPackage#getpacked_conformant_array_schema_Type_identifier()
   * @model containment="true"
   * @generated
   */
  type_identifier getType_identifier();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema#getType_identifier <em>Type identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type identifier</em>' containment reference.
   * @see #getType_identifier()
   * @generated
   */
  void setType_identifier(type_identifier value);

} // packed_conformant_array_schema
