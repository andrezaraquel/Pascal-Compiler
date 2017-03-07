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
import org.xtext.example.pascal.pascal.enumerated_type;
import org.xtext.example.pascal.pascal.simple_type;
import org.xtext.example.pascal.pascal.subrange_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_typeImpl#getSubrange_type <em>Subrange type</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_typeImpl#getEnumerated_type <em>Enumerated type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class simple_typeImpl extends MinimalEObjectImpl.Container implements simple_type
{
  /**
   * The cached value of the '{@link #getSubrange_type() <em>Subrange type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubrange_type()
   * @generated
   * @ordered
   */
  protected subrange_type subrange_type;

  /**
   * The cached value of the '{@link #getEnumerated_type() <em>Enumerated type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerated_type()
   * @generated
   * @ordered
   */
  protected enumerated_type enumerated_type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_typeImpl()
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
    return PascalPackage.Literals.SIMPLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subrange_type getSubrange_type()
  {
    return subrange_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubrange_type(subrange_type newSubrange_type, NotificationChain msgs)
  {
    subrange_type oldSubrange_type = subrange_type;
    subrange_type = newSubrange_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, oldSubrange_type, newSubrange_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubrange_type(subrange_type newSubrange_type)
  {
    if (newSubrange_type != subrange_type)
    {
      NotificationChain msgs = null;
      if (subrange_type != null)
        msgs = ((InternalEObject)subrange_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, null, msgs);
      if (newSubrange_type != null)
        msgs = ((InternalEObject)newSubrange_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, null, msgs);
      msgs = basicSetSubrange_type(newSubrange_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, newSubrange_type, newSubrange_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enumerated_type getEnumerated_type()
  {
    return enumerated_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumerated_type(enumerated_type newEnumerated_type, NotificationChain msgs)
  {
    enumerated_type oldEnumerated_type = enumerated_type;
    enumerated_type = newEnumerated_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE, oldEnumerated_type, newEnumerated_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumerated_type(enumerated_type newEnumerated_type)
  {
    if (newEnumerated_type != enumerated_type)
    {
      NotificationChain msgs = null;
      if (enumerated_type != null)
        msgs = ((InternalEObject)enumerated_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE, null, msgs);
      if (newEnumerated_type != null)
        msgs = ((InternalEObject)newEnumerated_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE, null, msgs);
      msgs = basicSetEnumerated_type(newEnumerated_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE, newEnumerated_type, newEnumerated_type));
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        return basicSetSubrange_type(null, msgs);
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        return basicSetEnumerated_type(null, msgs);
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        return getSubrange_type();
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        return getEnumerated_type();
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        setSubrange_type((subrange_type)newValue);
        return;
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        setEnumerated_type((enumerated_type)newValue);
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        setSubrange_type((subrange_type)null);
        return;
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        setEnumerated_type((enumerated_type)null);
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        return subrange_type != null;
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        return enumerated_type != null;
    }
    return super.eIsSet(featureID);
  }

} //simple_typeImpl
