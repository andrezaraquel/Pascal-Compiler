/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.actual_parameter_list;
import org.xtext.example.pascal.pascal.function_designator;
import org.xtext.example.pascal.pascal.identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function designator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.function_designatorImpl#getFunction_identifier <em>Function identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.function_designatorImpl#getActual_parameter_list <em>Actual parameter list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class function_designatorImpl extends MinimalEObjectImpl.Container implements function_designator
{
  /**
   * The cached value of the '{@link #getFunction_identifier() <em>Function identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_identifier()
   * @generated
   * @ordered
   */
  protected identifier function_identifier;

  /**
   * The cached value of the '{@link #getActual_parameter_list() <em>Actual parameter list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual_parameter_list()
   * @generated
   * @ordered
   */
  protected actual_parameter_list actual_parameter_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected function_designatorImpl()
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
    return PascalPackage.Literals.FUNCTION_DESIGNATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getFunction_identifier()
  {
    return function_identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction_identifier(identifier newFunction_identifier, NotificationChain msgs)
  {
    identifier oldFunction_identifier = function_identifier;
    function_identifier = newFunction_identifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DESIGNATOR__FUNCTION_IDENTIFIER, oldFunction_identifier, newFunction_identifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction_identifier(identifier newFunction_identifier)
  {
    if (newFunction_identifier != function_identifier)
    {
      NotificationChain msgs = null;
      if (function_identifier != null)
        msgs = ((InternalEObject)function_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DESIGNATOR__FUNCTION_IDENTIFIER, null, msgs);
      if (newFunction_identifier != null)
        msgs = ((InternalEObject)newFunction_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DESIGNATOR__FUNCTION_IDENTIFIER, null, msgs);
      msgs = basicSetFunction_identifier(newFunction_identifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DESIGNATOR__FUNCTION_IDENTIFIER, newFunction_identifier, newFunction_identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actual_parameter_list getActual_parameter_list()
  {
    return actual_parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual_parameter_list(actual_parameter_list newActual_parameter_list, NotificationChain msgs)
  {
    actual_parameter_list oldActual_parameter_list = actual_parameter_list;
    actual_parameter_list = newActual_parameter_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DESIGNATOR__ACTUAL_PARAMETER_LIST, oldActual_parameter_list, newActual_parameter_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActual_parameter_list(actual_parameter_list newActual_parameter_list)
  {
    if (newActual_parameter_list != actual_parameter_list)
    {
      NotificationChain msgs = null;
      if (actual_parameter_list != null)
        msgs = ((InternalEObject)actual_parameter_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DESIGNATOR__ACTUAL_PARAMETER_LIST, null, msgs);
      if (newActual_parameter_list != null)
        msgs = ((InternalEObject)newActual_parameter_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_DESIGNATOR__ACTUAL_PARAMETER_LIST, null, msgs);
      msgs = basicSetActual_parameter_list(newActual_parameter_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_DESIGNATOR__ACTUAL_PARAMETER_LIST, newActual_parameter_list, newActual_parameter_list));
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
      case PascalPackage.FUNCTION_DESIGNATOR__FUNCTION_IDENTIFIER:
        return basicSetFunction_identifier(null, msgs);
      case PascalPackage.FUNCTION_DESIGNATOR__ACTUAL_PARAMETER_LIST:
        return basicSetActual_parameter_list(null, msgs);
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
      case PascalPackage.FUNCTION_DESIGNATOR__FUNCTION_IDENTIFIER:
        return getFunction_identifier();
      case PascalPackage.FUNCTION_DESIGNATOR__ACTUAL_PARAMETER_LIST:
        return getActual_parameter_list();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.FUNCTION_DESIGNATOR__FUNCTION_IDENTIFIER:
        setFunction_identifier((identifier)newValue);
        return;
      case PascalPackage.FUNCTION_DESIGNATOR__ACTUAL_PARAMETER_LIST:
        setActual_parameter_list((actual_parameter_list)newValue);
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
      case PascalPackage.FUNCTION_DESIGNATOR__FUNCTION_IDENTIFIER:
        setFunction_identifier((identifier)null);
        return;
      case PascalPackage.FUNCTION_DESIGNATOR__ACTUAL_PARAMETER_LIST:
        setActual_parameter_list((actual_parameter_list)null);
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
      case PascalPackage.FUNCTION_DESIGNATOR__FUNCTION_IDENTIFIER:
        return function_identifier != null;
      case PascalPackage.FUNCTION_DESIGNATOR__ACTUAL_PARAMETER_LIST:
        return actual_parameter_list != null;
    }
    return super.eIsSet(featureID);
  }

} //function_designatorImpl
