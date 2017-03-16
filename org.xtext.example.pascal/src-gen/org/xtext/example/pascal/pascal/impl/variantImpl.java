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
import org.xtext.example.pascal.pascal.case_label_list;
import org.xtext.example.pascal.pascal.field_list;
import org.xtext.example.pascal.pascal.variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.variantImpl#getCase_label_list <em>Case label list</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.variantImpl#getField_list <em>Field list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variantImpl extends MinimalEObjectImpl.Container implements variant
{
  /**
   * The cached value of the '{@link #getCase_label_list() <em>Case label list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase_label_list()
   * @generated
   * @ordered
   */
  protected case_label_list case_label_list;

  /**
   * The cached value of the '{@link #getField_list() <em>Field list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField_list()
   * @generated
   * @ordered
   */
  protected field_list field_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variantImpl()
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
    return PascalPackage.Literals.VARIANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_label_list getCase_label_list()
  {
    return case_label_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCase_label_list(case_label_list newCase_label_list, NotificationChain msgs)
  {
    case_label_list oldCase_label_list = case_label_list;
    case_label_list = newCase_label_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__CASE_LABEL_LIST, oldCase_label_list, newCase_label_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCase_label_list(case_label_list newCase_label_list)
  {
    if (newCase_label_list != case_label_list)
    {
      NotificationChain msgs = null;
      if (case_label_list != null)
        msgs = ((InternalEObject)case_label_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__CASE_LABEL_LIST, null, msgs);
      if (newCase_label_list != null)
        msgs = ((InternalEObject)newCase_label_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__CASE_LABEL_LIST, null, msgs);
      msgs = basicSetCase_label_list(newCase_label_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__CASE_LABEL_LIST, newCase_label_list, newCase_label_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_list getField_list()
  {
    return field_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetField_list(field_list newField_list, NotificationChain msgs)
  {
    field_list oldField_list = field_list;
    field_list = newField_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__FIELD_LIST, oldField_list, newField_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField_list(field_list newField_list)
  {
    if (newField_list != field_list)
    {
      NotificationChain msgs = null;
      if (field_list != null)
        msgs = ((InternalEObject)field_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__FIELD_LIST, null, msgs);
      if (newField_list != null)
        msgs = ((InternalEObject)newField_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__FIELD_LIST, null, msgs);
      msgs = basicSetField_list(newField_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__FIELD_LIST, newField_list, newField_list));
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        return basicSetCase_label_list(null, msgs);
      case PascalPackage.VARIANT__FIELD_LIST:
        return basicSetField_list(null, msgs);
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        return getCase_label_list();
      case PascalPackage.VARIANT__FIELD_LIST:
        return getField_list();
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        setCase_label_list((case_label_list)newValue);
        return;
      case PascalPackage.VARIANT__FIELD_LIST:
        setField_list((field_list)newValue);
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        setCase_label_list((case_label_list)null);
        return;
      case PascalPackage.VARIANT__FIELD_LIST:
        setField_list((field_list)null);
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        return case_label_list != null;
      case PascalPackage.VARIANT__FIELD_LIST:
        return field_list != null;
    }
    return super.eIsSet(featureID);
  }

} //variantImpl
