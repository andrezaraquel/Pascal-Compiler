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
import org.xtext.example.pascal.pascal.type;
import org.xtext.example.pascal.pascal.variable_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.variable_declarationImpl#getIdentifier_list <em>Identifier list</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.variable_declarationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variable_declarationImpl extends MinimalEObjectImpl.Container implements variable_declaration
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variable_declarationImpl()
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
    return PascalPackage.Literals.VARIABLE_DECLARATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE_DECLARATION__IDENTIFIER_LIST, oldIdentifier_list, newIdentifier_list);
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
        msgs = ((InternalEObject)identifier_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE_DECLARATION__IDENTIFIER_LIST, null, msgs);
      if (newIdentifier_list != null)
        msgs = ((InternalEObject)newIdentifier_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE_DECLARATION__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifier_list(newIdentifier_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE_DECLARATION__IDENTIFIER_LIST, newIdentifier_list, newIdentifier_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(type newType, NotificationChain msgs)
  {
    type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE_DECLARATION__TYPE, newType, newType));
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
      case PascalPackage.VARIABLE_DECLARATION__IDENTIFIER_LIST:
        return basicSetIdentifier_list(null, msgs);
      case PascalPackage.VARIABLE_DECLARATION__TYPE:
        return basicSetType(null, msgs);
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
      case PascalPackage.VARIABLE_DECLARATION__IDENTIFIER_LIST:
        return getIdentifier_list();
      case PascalPackage.VARIABLE_DECLARATION__TYPE:
        return getType();
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
      case PascalPackage.VARIABLE_DECLARATION__IDENTIFIER_LIST:
        setIdentifier_list((identifier_list)newValue);
        return;
      case PascalPackage.VARIABLE_DECLARATION__TYPE:
        setType((type)newValue);
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
      case PascalPackage.VARIABLE_DECLARATION__IDENTIFIER_LIST:
        setIdentifier_list((identifier_list)null);
        return;
      case PascalPackage.VARIABLE_DECLARATION__TYPE:
        setType((type)null);
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
      case PascalPackage.VARIABLE_DECLARATION__IDENTIFIER_LIST:
        return identifier_list != null;
      case PascalPackage.VARIABLE_DECLARATION__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //variable_declarationImpl