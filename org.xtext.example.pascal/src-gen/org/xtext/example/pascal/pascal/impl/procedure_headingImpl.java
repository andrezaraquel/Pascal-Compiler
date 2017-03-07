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
import org.xtext.example.pascal.pascal.formal_parameter_list;
import org.xtext.example.pascal.pascal.identifier;
import org.xtext.example.pascal.pascal.procedure_heading;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>procedure heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.procedure_headingImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.procedure_headingImpl#getFormal_parameter_list <em>Formal parameter list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class procedure_headingImpl extends MinimalEObjectImpl.Container implements procedure_heading
{
  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected identifier identifier;

  /**
   * The cached value of the '{@link #getFormal_parameter_list() <em>Formal parameter list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormal_parameter_list()
   * @generated
   * @ordered
   */
  protected formal_parameter_list formal_parameter_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected procedure_headingImpl()
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
    return PascalPackage.Literals.PROCEDURE_HEADING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier(identifier newIdentifier, NotificationChain msgs)
  {
    identifier oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_HEADING__IDENTIFIER, oldIdentifier, newIdentifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(identifier newIdentifier)
  {
    if (newIdentifier != identifier)
    {
      NotificationChain msgs = null;
      if (identifier != null)
        msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_HEADING__IDENTIFIER, null, msgs);
      if (newIdentifier != null)
        msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_HEADING__IDENTIFIER, null, msgs);
      msgs = basicSetIdentifier(newIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_HEADING__IDENTIFIER, newIdentifier, newIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formal_parameter_list getFormal_parameter_list()
  {
    return formal_parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormal_parameter_list(formal_parameter_list newFormal_parameter_list, NotificationChain msgs)
  {
    formal_parameter_list oldFormal_parameter_list = formal_parameter_list;
    formal_parameter_list = newFormal_parameter_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST, oldFormal_parameter_list, newFormal_parameter_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormal_parameter_list(formal_parameter_list newFormal_parameter_list)
  {
    if (newFormal_parameter_list != formal_parameter_list)
    {
      NotificationChain msgs = null;
      if (formal_parameter_list != null)
        msgs = ((InternalEObject)formal_parameter_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST, null, msgs);
      if (newFormal_parameter_list != null)
        msgs = ((InternalEObject)newFormal_parameter_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST, null, msgs);
      msgs = basicSetFormal_parameter_list(newFormal_parameter_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST, newFormal_parameter_list, newFormal_parameter_list));
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
      case PascalPackage.PROCEDURE_HEADING__IDENTIFIER:
        return basicSetIdentifier(null, msgs);
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
        return basicSetFormal_parameter_list(null, msgs);
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
      case PascalPackage.PROCEDURE_HEADING__IDENTIFIER:
        return getIdentifier();
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
        return getFormal_parameter_list();
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
      case PascalPackage.PROCEDURE_HEADING__IDENTIFIER:
        setIdentifier((identifier)newValue);
        return;
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
        setFormal_parameter_list((formal_parameter_list)newValue);
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
      case PascalPackage.PROCEDURE_HEADING__IDENTIFIER:
        setIdentifier((identifier)null);
        return;
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
        setFormal_parameter_list((formal_parameter_list)null);
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
      case PascalPackage.PROCEDURE_HEADING__IDENTIFIER:
        return identifier != null;
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
        return formal_parameter_list != null;
    }
    return super.eIsSet(featureID);
  }

} //procedure_headingImpl
