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
import org.xtext.example.pascal.pascal.ordinal_type_identifier;
import org.xtext.example.pascal.pascal.type_identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ordinal type identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.ordinal_type_identifierImpl#getType_identifier <em>Type identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ordinal_type_identifierImpl extends MinimalEObjectImpl.Container implements ordinal_type_identifier
{
  /**
   * The cached value of the '{@link #getType_identifier() <em>Type identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_identifier()
   * @generated
   * @ordered
   */
  protected type_identifier type_identifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ordinal_type_identifierImpl()
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
    return PascalPackage.Literals.ORDINAL_TYPE_IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_identifier getType_identifier()
  {
    return type_identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_identifier(type_identifier newType_identifier, NotificationChain msgs)
  {
    type_identifier oldType_identifier = type_identifier;
    type_identifier = newType_identifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.ORDINAL_TYPE_IDENTIFIER__TYPE_IDENTIFIER, oldType_identifier, newType_identifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_identifier(type_identifier newType_identifier)
  {
    if (newType_identifier != type_identifier)
    {
      NotificationChain msgs = null;
      if (type_identifier != null)
        msgs = ((InternalEObject)type_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ORDINAL_TYPE_IDENTIFIER__TYPE_IDENTIFIER, null, msgs);
      if (newType_identifier != null)
        msgs = ((InternalEObject)newType_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ORDINAL_TYPE_IDENTIFIER__TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetType_identifier(newType_identifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ORDINAL_TYPE_IDENTIFIER__TYPE_IDENTIFIER, newType_identifier, newType_identifier));
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
      case PascalPackage.ORDINAL_TYPE_IDENTIFIER__TYPE_IDENTIFIER:
        return basicSetType_identifier(null, msgs);
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
      case PascalPackage.ORDINAL_TYPE_IDENTIFIER__TYPE_IDENTIFIER:
        return getType_identifier();
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
      case PascalPackage.ORDINAL_TYPE_IDENTIFIER__TYPE_IDENTIFIER:
        setType_identifier((type_identifier)newValue);
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
      case PascalPackage.ORDINAL_TYPE_IDENTIFIER__TYPE_IDENTIFIER:
        setType_identifier((type_identifier)null);
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
      case PascalPackage.ORDINAL_TYPE_IDENTIFIER__TYPE_IDENTIFIER:
        return type_identifier != null;
    }
    return super.eIsSet(featureID);
  }

} //ordinal_type_identifierImpl
