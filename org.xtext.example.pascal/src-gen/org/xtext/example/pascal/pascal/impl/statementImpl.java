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
import org.xtext.example.pascal.pascal.label;
import org.xtext.example.pascal.pascal.simple_statement;
import org.xtext.example.pascal.pascal.statement;
import org.xtext.example.pascal.pascal.structured_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.statementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.statementImpl#getSimple_statement <em>Simple statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.statementImpl#getStructured_statement <em>Structured statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class statementImpl extends MinimalEObjectImpl.Container implements statement
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected label label;

  /**
   * The cached value of the '{@link #getSimple_statement() <em>Simple statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimple_statement()
   * @generated
   * @ordered
   */
  protected simple_statement simple_statement;

  /**
   * The cached value of the '{@link #getStructured_statement() <em>Structured statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructured_statement()
   * @generated
   * @ordered
   */
  protected structured_statement structured_statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statementImpl()
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
    return PascalPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(label newLabel, NotificationChain msgs)
  {
    label oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(label newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_statement getSimple_statement()
  {
    return simple_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimple_statement(simple_statement newSimple_statement, NotificationChain msgs)
  {
    simple_statement oldSimple_statement = simple_statement;
    simple_statement = newSimple_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__SIMPLE_STATEMENT, oldSimple_statement, newSimple_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimple_statement(simple_statement newSimple_statement)
  {
    if (newSimple_statement != simple_statement)
    {
      NotificationChain msgs = null;
      if (simple_statement != null)
        msgs = ((InternalEObject)simple_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__SIMPLE_STATEMENT, null, msgs);
      if (newSimple_statement != null)
        msgs = ((InternalEObject)newSimple_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__SIMPLE_STATEMENT, null, msgs);
      msgs = basicSetSimple_statement(newSimple_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__SIMPLE_STATEMENT, newSimple_statement, newSimple_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structured_statement getStructured_statement()
  {
    return structured_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructured_statement(structured_statement newStructured_statement, NotificationChain msgs)
  {
    structured_statement oldStructured_statement = structured_statement;
    structured_statement = newStructured_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__STRUCTURED_STATEMENT, oldStructured_statement, newStructured_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructured_statement(structured_statement newStructured_statement)
  {
    if (newStructured_statement != structured_statement)
    {
      NotificationChain msgs = null;
      if (structured_statement != null)
        msgs = ((InternalEObject)structured_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__STRUCTURED_STATEMENT, null, msgs);
      if (newStructured_statement != null)
        msgs = ((InternalEObject)newStructured_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STATEMENT__STRUCTURED_STATEMENT, null, msgs);
      msgs = basicSetStructured_statement(newStructured_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENT__STRUCTURED_STATEMENT, newStructured_statement, newStructured_statement));
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
      case PascalPackage.STATEMENT__LABEL:
        return basicSetLabel(null, msgs);
      case PascalPackage.STATEMENT__SIMPLE_STATEMENT:
        return basicSetSimple_statement(null, msgs);
      case PascalPackage.STATEMENT__STRUCTURED_STATEMENT:
        return basicSetStructured_statement(null, msgs);
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
      case PascalPackage.STATEMENT__LABEL:
        return getLabel();
      case PascalPackage.STATEMENT__SIMPLE_STATEMENT:
        return getSimple_statement();
      case PascalPackage.STATEMENT__STRUCTURED_STATEMENT:
        return getStructured_statement();
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
      case PascalPackage.STATEMENT__LABEL:
        setLabel((label)newValue);
        return;
      case PascalPackage.STATEMENT__SIMPLE_STATEMENT:
        setSimple_statement((simple_statement)newValue);
        return;
      case PascalPackage.STATEMENT__STRUCTURED_STATEMENT:
        setStructured_statement((structured_statement)newValue);
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
      case PascalPackage.STATEMENT__LABEL:
        setLabel((label)null);
        return;
      case PascalPackage.STATEMENT__SIMPLE_STATEMENT:
        setSimple_statement((simple_statement)null);
        return;
      case PascalPackage.STATEMENT__STRUCTURED_STATEMENT:
        setStructured_statement((structured_statement)null);
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
      case PascalPackage.STATEMENT__LABEL:
        return label != null;
      case PascalPackage.STATEMENT__SIMPLE_STATEMENT:
        return simple_statement != null;
      case PascalPackage.STATEMENT__STRUCTURED_STATEMENT:
        return structured_statement != null;
    }
    return super.eIsSet(featureID);
  }

} //statementImpl
