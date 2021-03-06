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
import org.xtext.example.pascal.pascal.field_list;
import org.xtext.example.pascal.pascal.fixed_part;
import org.xtext.example.pascal.pascal.variant_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>field list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.field_listImpl#getFixed_part <em>Fixed part</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.field_listImpl#getVariant_part <em>Variant part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class field_listImpl extends MinimalEObjectImpl.Container implements field_list
{
  /**
   * The cached value of the '{@link #getFixed_part() <em>Fixed part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixed_part()
   * @generated
   * @ordered
   */
  protected fixed_part fixed_part;

  /**
   * The cached value of the '{@link #getVariant_part() <em>Variant part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant_part()
   * @generated
   * @ordered
   */
  protected variant_part variant_part;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected field_listImpl()
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
    return PascalPackage.Literals.FIELD_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fixed_part getFixed_part()
  {
    return fixed_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFixed_part(fixed_part newFixed_part, NotificationChain msgs)
  {
    fixed_part oldFixed_part = fixed_part;
    fixed_part = newFixed_part;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__FIXED_PART, oldFixed_part, newFixed_part);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixed_part(fixed_part newFixed_part)
  {
    if (newFixed_part != fixed_part)
    {
      NotificationChain msgs = null;
      if (fixed_part != null)
        msgs = ((InternalEObject)fixed_part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__FIXED_PART, null, msgs);
      if (newFixed_part != null)
        msgs = ((InternalEObject)newFixed_part).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__FIXED_PART, null, msgs);
      msgs = basicSetFixed_part(newFixed_part, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__FIXED_PART, newFixed_part, newFixed_part));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variant_part getVariant_part()
  {
    return variant_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariant_part(variant_part newVariant_part, NotificationChain msgs)
  {
    variant_part oldVariant_part = variant_part;
    variant_part = newVariant_part;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__VARIANT_PART, oldVariant_part, newVariant_part);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariant_part(variant_part newVariant_part)
  {
    if (newVariant_part != variant_part)
    {
      NotificationChain msgs = null;
      if (variant_part != null)
        msgs = ((InternalEObject)variant_part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__VARIANT_PART, null, msgs);
      if (newVariant_part != null)
        msgs = ((InternalEObject)newVariant_part).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__VARIANT_PART, null, msgs);
      msgs = basicSetVariant_part(newVariant_part, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__VARIANT_PART, newVariant_part, newVariant_part));
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        return basicSetFixed_part(null, msgs);
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        return basicSetVariant_part(null, msgs);
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        return getFixed_part();
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        return getVariant_part();
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        setFixed_part((fixed_part)newValue);
        return;
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        setVariant_part((variant_part)newValue);
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        setFixed_part((fixed_part)null);
        return;
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        setVariant_part((variant_part)null);
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        return fixed_part != null;
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        return variant_part != null;
    }
    return super.eIsSet(featureID);
  }

} //field_listImpl
