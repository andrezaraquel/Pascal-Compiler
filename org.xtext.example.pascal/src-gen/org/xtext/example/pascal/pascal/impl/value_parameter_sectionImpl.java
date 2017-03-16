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
import org.xtext.example.pascal.pascal.identifier_list;
import org.xtext.example.pascal.pascal.parameter_type;
import org.xtext.example.pascal.pascal.value_parameter_section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>value parameter section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.value_parameter_sectionImpl#getIdentifier_list <em>Identifier list</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.value_parameter_sectionImpl#getParameter_type <em>Parameter type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class value_parameter_sectionImpl extends MinimalEObjectImpl.Container implements value_parameter_section
{
  /**
   * The cached value of the '{@link #getIdentifier_list() <em>Identifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier_list()
   * @generated
   * @ordered
   */
  protected identifier_list identifier_list;

  /**
   * The cached value of the '{@link #getParameter_type() <em>Parameter type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_type()
   * @generated
   * @ordered
   */
  protected parameter_type parameter_type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected value_parameter_sectionImpl()
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
    return PascalPackage.Literals.VALUE_PARAMETER_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier_list getIdentifier_list()
  {
    return identifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier_list(identifier_list newIdentifier_list, NotificationChain msgs)
  {
    identifier_list oldIdentifier_list = identifier_list;
    identifier_list = newIdentifier_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST, oldIdentifier_list, newIdentifier_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier_list(identifier_list newIdentifier_list)
  {
    if (newIdentifier_list != identifier_list)
    {
      NotificationChain msgs = null;
      if (identifier_list != null)
        msgs = ((InternalEObject)identifier_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST, null, msgs);
      if (newIdentifier_list != null)
        msgs = ((InternalEObject)newIdentifier_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifier_list(newIdentifier_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST, newIdentifier_list, newIdentifier_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_type getParameter_type()
  {
    return parameter_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter_type(parameter_type newParameter_type, NotificationChain msgs)
  {
    parameter_type oldParameter_type = parameter_type;
    parameter_type = newParameter_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE, oldParameter_type, newParameter_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter_type(parameter_type newParameter_type)
  {
    if (newParameter_type != parameter_type)
    {
      NotificationChain msgs = null;
      if (parameter_type != null)
        msgs = ((InternalEObject)parameter_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE, null, msgs);
      if (newParameter_type != null)
        msgs = ((InternalEObject)newParameter_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE, null, msgs);
      msgs = basicSetParameter_type(newParameter_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE, newParameter_type, newParameter_type));
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        return basicSetIdentifier_list(null, msgs);
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        return basicSetParameter_type(null, msgs);
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        return getIdentifier_list();
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        return getParameter_type();
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        setIdentifier_list((identifier_list)newValue);
        return;
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        setParameter_type((parameter_type)newValue);
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        setIdentifier_list((identifier_list)null);
        return;
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        setParameter_type((parameter_type)null);
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        return identifier_list != null;
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        return parameter_type != null;
    }
    return super.eIsSet(featureID);
  }

} //value_parameter_sectionImpl
