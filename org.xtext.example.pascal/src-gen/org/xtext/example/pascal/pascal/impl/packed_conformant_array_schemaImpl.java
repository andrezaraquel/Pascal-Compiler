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
import org.xtext.example.pascal.pascal.packed_conformant_array_schema;
import org.xtext.example.pascal.pascal.type_identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>packed conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.packed_conformant_array_schemaImpl#getBound_specification <em>Bound specification</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.packed_conformant_array_schemaImpl#getType_identifier <em>Type identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class packed_conformant_array_schemaImpl extends MinimalEObjectImpl.Container implements packed_conformant_array_schema
{
  /**
   * The cached value of the '{@link #getBound_specification() <em>Bound specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound_specification()
   * @generated
   * @ordered
   */
  protected bound_specification bound_specification;

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
  protected packed_conformant_array_schemaImpl()
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
    return PascalPackage.Literals.PACKED_CONFORMANT_ARRAY_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bound_specification getBound_specification()
  {
    return bound_specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBound_specification(bound_specification newBound_specification, NotificationChain msgs)
  {
    bound_specification oldBound_specification = bound_specification;
    bound_specification = newBound_specification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION, oldBound_specification, newBound_specification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBound_specification(bound_specification newBound_specification)
  {
    if (newBound_specification != bound_specification)
    {
      NotificationChain msgs = null;
      if (bound_specification != null)
        msgs = ((InternalEObject)bound_specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION, null, msgs);
      if (newBound_specification != null)
        msgs = ((InternalEObject)newBound_specification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION, null, msgs);
      msgs = basicSetBound_specification(newBound_specification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION, newBound_specification, newBound_specification));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER, oldType_identifier, newType_identifier);
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
        msgs = ((InternalEObject)type_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER, null, msgs);
      if (newType_identifier != null)
        msgs = ((InternalEObject)newType_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetType_identifier(newType_identifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER, newType_identifier, newType_identifier));
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        return basicSetBound_specification(null, msgs);
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        return getBound_specification();
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        setBound_specification((bound_specification)newValue);
        return;
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        setBound_specification((bound_specification)null);
        return;
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        return bound_specification != null;
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
        return type_identifier != null;
    }
    return super.eIsSet(featureID);
  }

} //packed_conformant_array_schemaImpl
