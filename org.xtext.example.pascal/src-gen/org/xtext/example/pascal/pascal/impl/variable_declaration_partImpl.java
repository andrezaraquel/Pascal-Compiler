/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.variable_declaration;
import org.xtext.example.pascal.pascal.variable_declaration_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable declaration part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.variable_declaration_partImpl#getVariable_declaration <em>Variable declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variable_declaration_partImpl extends MinimalEObjectImpl.Container implements variable_declaration_part
{
  /**
   * The cached value of the '{@link #getVariable_declaration() <em>Variable declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_declaration()
   * @generated
   * @ordered
   */
  protected EList<variable_declaration> variable_declaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variable_declaration_partImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.VARIABLE_DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variable_declaration> getVariable_declaration()
  {
    if (variable_declaration == null)
    {
      variable_declaration = new EObjectContainmentEList<variable_declaration>(variable_declaration.class, this, PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION);
    }
    return variable_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        return ((InternalEList<?>)getVariable_declaration()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        return getVariable_declaration();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        getVariable_declaration().clear();
        getVariable_declaration().addAll((Collection<? extends variable_declaration>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        getVariable_declaration().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATION:
        return variable_declaration != null && !variable_declaration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //variable_declaration_partImpl
