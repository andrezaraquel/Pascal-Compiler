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
import org.xtext.example.pascal.pascal.program_heading;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>program heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.program_headingImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.program_headingImpl#getIdentifier_list <em>Identifier list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class program_headingImpl extends MinimalEObjectImpl.Container implements program_heading
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected program_headingImpl()
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
    return PascalPackage.Literals.PROGRAM_HEADING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM_HEADING__IDENTIFIER, oldIdentifier, identifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST, oldIdentifier_list, newIdentifier_list);
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
        msgs = ((InternalEObject)identifier_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST, null, msgs);
      if (newIdentifier_list != null)
        msgs = ((InternalEObject)newIdentifier_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifier_list(newIdentifier_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST, newIdentifier_list, newIdentifier_list));
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        return basicSetIdentifier_list(null, msgs);
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER:
        return getIdentifier();
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        return getIdentifier_list();
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        setIdentifier_list((identifier_list)newValue);
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        setIdentifier_list((identifier_list)null);
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
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case PascalPackage.PROGRAM_HEADING__IDENTIFIER_LIST:
        return identifier_list != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //program_headingImpl
