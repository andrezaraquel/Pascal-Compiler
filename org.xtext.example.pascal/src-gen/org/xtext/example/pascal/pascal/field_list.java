/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.field_list#getFixed_part <em>Fixed part</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.field_list#getVariant_part <em>Variant part</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getfield_list()
 * @model
 * @generated
 */
public interface field_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Fixed part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixed part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed part</em>' containment reference.
   * @see #setFixed_part(fixed_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfield_list_Fixed_part()
   * @model containment="true"
   * @generated
   */
  fixed_part getFixed_part();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.field_list#getFixed_part <em>Fixed part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed part</em>' containment reference.
   * @see #getFixed_part()
   * @generated
   */
  void setFixed_part(fixed_part value);

  /**
   * Returns the value of the '<em><b>Variant part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant part</em>' containment reference.
   * @see #setVariant_part(variant_part)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfield_list_Variant_part()
   * @model containment="true"
   * @generated
   */
  variant_part getVariant_part();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.field_list#getVariant_part <em>Variant part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant part</em>' containment reference.
   * @see #getVariant_part()
   * @generated
   */
  void setVariant_part(variant_part value);

} // field_list