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
import org.xtext.example.pascal.pascal.pointer_type;
import org.xtext.example.pascal.pascal.simple_type;
import org.xtext.example.pascal.pascal.structured_type;
import org.xtext.example.pascal.pascal.type;
import org.xtext.example.pascal.pascal.type_identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.typeImpl#getSimple_type <em>Simple type</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.typeImpl#getStructured_type <em>Structured type</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.typeImpl#getPointer_type <em>Pointer type</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.typeImpl#getType_identifier <em>Type identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class typeImpl extends MinimalEObjectImpl.Container implements type
{
  /**
   * The cached value of the '{@link #getSimple_type() <em>Simple type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimple_type()
   * @generated
   * @ordered
   */
  protected simple_type simple_type;

  /**
   * The cached value of the '{@link #getStructured_type() <em>Structured type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructured_type()
   * @generated
   * @ordered
   */
  protected structured_type structured_type;

  /**
   * The cached value of the '{@link #getPointer_type() <em>Pointer type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer_type()
   * @generated
   * @ordered
   */
  protected pointer_type pointer_type;

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
  protected typeImpl()
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
    return PascalPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_type getSimple_type()
  {
    return simple_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimple_type(simple_type newSimple_type, NotificationChain msgs)
  {
    simple_type oldSimple_type = simple_type;
    simple_type = newSimple_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__SIMPLE_TYPE, oldSimple_type, newSimple_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimple_type(simple_type newSimple_type)
  {
    if (newSimple_type != simple_type)
    {
      NotificationChain msgs = null;
      if (simple_type != null)
        msgs = ((InternalEObject)simple_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__SIMPLE_TYPE, null, msgs);
      if (newSimple_type != null)
        msgs = ((InternalEObject)newSimple_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__SIMPLE_TYPE, null, msgs);
      msgs = basicSetSimple_type(newSimple_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__SIMPLE_TYPE, newSimple_type, newSimple_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structured_type getStructured_type()
  {
    return structured_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructured_type(structured_type newStructured_type, NotificationChain msgs)
  {
    structured_type oldStructured_type = structured_type;
    structured_type = newStructured_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__STRUCTURED_TYPE, oldStructured_type, newStructured_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructured_type(structured_type newStructured_type)
  {
    if (newStructured_type != structured_type)
    {
      NotificationChain msgs = null;
      if (structured_type != null)
        msgs = ((InternalEObject)structured_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__STRUCTURED_TYPE, null, msgs);
      if (newStructured_type != null)
        msgs = ((InternalEObject)newStructured_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__STRUCTURED_TYPE, null, msgs);
      msgs = basicSetStructured_type(newStructured_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__STRUCTURED_TYPE, newStructured_type, newStructured_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer_type getPointer_type()
  {
    return pointer_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointer_type(pointer_type newPointer_type, NotificationChain msgs)
  {
    pointer_type oldPointer_type = pointer_type;
    pointer_type = newPointer_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__POINTER_TYPE, oldPointer_type, newPointer_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointer_type(pointer_type newPointer_type)
  {
    if (newPointer_type != pointer_type)
    {
      NotificationChain msgs = null;
      if (pointer_type != null)
        msgs = ((InternalEObject)pointer_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__POINTER_TYPE, null, msgs);
      if (newPointer_type != null)
        msgs = ((InternalEObject)newPointer_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__POINTER_TYPE, null, msgs);
      msgs = basicSetPointer_type(newPointer_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__POINTER_TYPE, newPointer_type, newPointer_type));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__TYPE_IDENTIFIER, oldType_identifier, newType_identifier);
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
        msgs = ((InternalEObject)type_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__TYPE_IDENTIFIER, null, msgs);
      if (newType_identifier != null)
        msgs = ((InternalEObject)newType_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetType_identifier(newType_identifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__TYPE_IDENTIFIER, newType_identifier, newType_identifier));
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        return basicSetSimple_type(null, msgs);
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        return basicSetStructured_type(null, msgs);
      case PascalPackage.TYPE__POINTER_TYPE:
        return basicSetPointer_type(null, msgs);
      case PascalPackage.TYPE__TYPE_IDENTIFIER:
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        return getSimple_type();
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        return getStructured_type();
      case PascalPackage.TYPE__POINTER_TYPE:
        return getPointer_type();
      case PascalPackage.TYPE__TYPE_IDENTIFIER:
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        setSimple_type((simple_type)newValue);
        return;
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        setStructured_type((structured_type)newValue);
        return;
      case PascalPackage.TYPE__POINTER_TYPE:
        setPointer_type((pointer_type)newValue);
        return;
      case PascalPackage.TYPE__TYPE_IDENTIFIER:
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        setSimple_type((simple_type)null);
        return;
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        setStructured_type((structured_type)null);
        return;
      case PascalPackage.TYPE__POINTER_TYPE:
        setPointer_type((pointer_type)null);
        return;
      case PascalPackage.TYPE__TYPE_IDENTIFIER:
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        return simple_type != null;
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        return structured_type != null;
      case PascalPackage.TYPE__POINTER_TYPE:
        return pointer_type != null;
      case PascalPackage.TYPE__TYPE_IDENTIFIER:
        return type_identifier != null;
    }
    return super.eIsSet(featureID);
  }

} //typeImpl
