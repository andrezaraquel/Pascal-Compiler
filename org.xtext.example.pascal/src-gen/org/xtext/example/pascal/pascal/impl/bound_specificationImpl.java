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
import org.xtext.example.pascal.pascal.bound_specification;
import org.xtext.example.pascal.pascal.identifier;
import org.xtext.example.pascal.pascal.ordinal_type_identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>bound specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.bound_specificationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.bound_specificationImpl#getIdentifier2 <em>Identifier2</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.bound_specificationImpl#getOrdinal_type_identifier <em>Ordinal type identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class bound_specificationImpl extends MinimalEObjectImpl.Container implements bound_specification
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
   * The cached value of the '{@link #getIdentifier2() <em>Identifier2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier2()
   * @generated
   * @ordered
   */
  protected identifier identifier2;

  /**
   * The cached value of the '{@link #getOrdinal_type_identifier() <em>Ordinal type identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdinal_type_identifier()
   * @generated
   * @ordered
   */
  protected ordinal_type_identifier ordinal_type_identifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected bound_specificationImpl()
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
    return PascalPackage.Literals.BOUND_SPECIFICATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BOUND_SPECIFICATION__IDENTIFIER, oldIdentifier, newIdentifier);
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
        msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BOUND_SPECIFICATION__IDENTIFIER, null, msgs);
      if (newIdentifier != null)
        msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BOUND_SPECIFICATION__IDENTIFIER, null, msgs);
      msgs = basicSetIdentifier(newIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BOUND_SPECIFICATION__IDENTIFIER, newIdentifier, newIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getIdentifier2()
  {
    return identifier2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier2(identifier newIdentifier2, NotificationChain msgs)
  {
    identifier oldIdentifier2 = identifier2;
    identifier2 = newIdentifier2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BOUND_SPECIFICATION__IDENTIFIER2, oldIdentifier2, newIdentifier2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier2(identifier newIdentifier2)
  {
    if (newIdentifier2 != identifier2)
    {
      NotificationChain msgs = null;
      if (identifier2 != null)
        msgs = ((InternalEObject)identifier2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BOUND_SPECIFICATION__IDENTIFIER2, null, msgs);
      if (newIdentifier2 != null)
        msgs = ((InternalEObject)newIdentifier2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BOUND_SPECIFICATION__IDENTIFIER2, null, msgs);
      msgs = basicSetIdentifier2(newIdentifier2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BOUND_SPECIFICATION__IDENTIFIER2, newIdentifier2, newIdentifier2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ordinal_type_identifier getOrdinal_type_identifier()
  {
    return ordinal_type_identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrdinal_type_identifier(ordinal_type_identifier newOrdinal_type_identifier, NotificationChain msgs)
  {
    ordinal_type_identifier oldOrdinal_type_identifier = ordinal_type_identifier;
    ordinal_type_identifier = newOrdinal_type_identifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BOUND_SPECIFICATION__ORDINAL_TYPE_IDENTIFIER, oldOrdinal_type_identifier, newOrdinal_type_identifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrdinal_type_identifier(ordinal_type_identifier newOrdinal_type_identifier)
  {
    if (newOrdinal_type_identifier != ordinal_type_identifier)
    {
      NotificationChain msgs = null;
      if (ordinal_type_identifier != null)
        msgs = ((InternalEObject)ordinal_type_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BOUND_SPECIFICATION__ORDINAL_TYPE_IDENTIFIER, null, msgs);
      if (newOrdinal_type_identifier != null)
        msgs = ((InternalEObject)newOrdinal_type_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BOUND_SPECIFICATION__ORDINAL_TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetOrdinal_type_identifier(newOrdinal_type_identifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BOUND_SPECIFICATION__ORDINAL_TYPE_IDENTIFIER, newOrdinal_type_identifier, newOrdinal_type_identifier));
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
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER:
        return basicSetIdentifier(null, msgs);
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER2:
        return basicSetIdentifier2(null, msgs);
      case PascalPackage.BOUND_SPECIFICATION__ORDINAL_TYPE_IDENTIFIER:
        return basicSetOrdinal_type_identifier(null, msgs);
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
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER:
        return getIdentifier();
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER2:
        return getIdentifier2();
      case PascalPackage.BOUND_SPECIFICATION__ORDINAL_TYPE_IDENTIFIER:
        return getOrdinal_type_identifier();
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
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER:
        setIdentifier((identifier)newValue);
        return;
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER2:
        setIdentifier2((identifier)newValue);
        return;
      case PascalPackage.BOUND_SPECIFICATION__ORDINAL_TYPE_IDENTIFIER:
        setOrdinal_type_identifier((ordinal_type_identifier)newValue);
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
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER:
        setIdentifier((identifier)null);
        return;
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER2:
        setIdentifier2((identifier)null);
        return;
      case PascalPackage.BOUND_SPECIFICATION__ORDINAL_TYPE_IDENTIFIER:
        setOrdinal_type_identifier((ordinal_type_identifier)null);
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
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER:
        return identifier != null;
      case PascalPackage.BOUND_SPECIFICATION__IDENTIFIER2:
        return identifier2 != null;
      case PascalPackage.BOUND_SPECIFICATION__ORDINAL_TYPE_IDENTIFIER:
        return ordinal_type_identifier != null;
    }
    return super.eIsSet(featureID);
  }

} //bound_specificationImpl