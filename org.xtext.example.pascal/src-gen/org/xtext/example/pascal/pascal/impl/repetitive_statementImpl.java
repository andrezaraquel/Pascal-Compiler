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
import org.xtext.example.pascal.pascal.for_statement;
import org.xtext.example.pascal.pascal.repeat_statement;
import org.xtext.example.pascal.pascal.repetitive_statement;
import org.xtext.example.pascal.pascal.while_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>repetitive statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.repetitive_statementImpl#getWhile_statement <em>While statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.repetitive_statementImpl#getRepeat_statement <em>Repeat statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.repetitive_statementImpl#getFor_statement <em>For statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class repetitive_statementImpl extends MinimalEObjectImpl.Container implements repetitive_statement
{
  /**
   * The cached value of the '{@link #getWhile_statement() <em>While statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhile_statement()
   * @generated
   * @ordered
   */
  protected while_statement while_statement;

  /**
   * The cached value of the '{@link #getRepeat_statement() <em>Repeat statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeat_statement()
   * @generated
   * @ordered
   */
  protected repeat_statement repeat_statement;

  /**
   * The cached value of the '{@link #getFor_statement() <em>For statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor_statement()
   * @generated
   * @ordered
   */
  protected for_statement for_statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected repetitive_statementImpl()
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
    return PascalPackage.Literals.REPETITIVE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public while_statement getWhile_statement()
  {
    return while_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhile_statement(while_statement newWhile_statement, NotificationChain msgs)
  {
    while_statement oldWhile_statement = while_statement;
    while_statement = newWhile_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__WHILE_STATEMENT, oldWhile_statement, newWhile_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhile_statement(while_statement newWhile_statement)
  {
    if (newWhile_statement != while_statement)
    {
      NotificationChain msgs = null;
      if (while_statement != null)
        msgs = ((InternalEObject)while_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__WHILE_STATEMENT, null, msgs);
      if (newWhile_statement != null)
        msgs = ((InternalEObject)newWhile_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__WHILE_STATEMENT, null, msgs);
      msgs = basicSetWhile_statement(newWhile_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__WHILE_STATEMENT, newWhile_statement, newWhile_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public repeat_statement getRepeat_statement()
  {
    return repeat_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepeat_statement(repeat_statement newRepeat_statement, NotificationChain msgs)
  {
    repeat_statement oldRepeat_statement = repeat_statement;
    repeat_statement = newRepeat_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__REPEAT_STATEMENT, oldRepeat_statement, newRepeat_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeat_statement(repeat_statement newRepeat_statement)
  {
    if (newRepeat_statement != repeat_statement)
    {
      NotificationChain msgs = null;
      if (repeat_statement != null)
        msgs = ((InternalEObject)repeat_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__REPEAT_STATEMENT, null, msgs);
      if (newRepeat_statement != null)
        msgs = ((InternalEObject)newRepeat_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__REPEAT_STATEMENT, null, msgs);
      msgs = basicSetRepeat_statement(newRepeat_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__REPEAT_STATEMENT, newRepeat_statement, newRepeat_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_statement getFor_statement()
  {
    return for_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFor_statement(for_statement newFor_statement, NotificationChain msgs)
  {
    for_statement oldFor_statement = for_statement;
    for_statement = newFor_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__FOR_STATEMENT, oldFor_statement, newFor_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor_statement(for_statement newFor_statement)
  {
    if (newFor_statement != for_statement)
    {
      NotificationChain msgs = null;
      if (for_statement != null)
        msgs = ((InternalEObject)for_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__FOR_STATEMENT, null, msgs);
      if (newFor_statement != null)
        msgs = ((InternalEObject)newFor_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__FOR_STATEMENT, null, msgs);
      msgs = basicSetFor_statement(newFor_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__FOR_STATEMENT, newFor_statement, newFor_statement));
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STATEMENT:
        return basicSetWhile_statement(null, msgs);
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STATEMENT:
        return basicSetRepeat_statement(null, msgs);
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STATEMENT:
        return basicSetFor_statement(null, msgs);
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STATEMENT:
        return getWhile_statement();
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STATEMENT:
        return getRepeat_statement();
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STATEMENT:
        return getFor_statement();
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STATEMENT:
        setWhile_statement((while_statement)newValue);
        return;
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STATEMENT:
        setRepeat_statement((repeat_statement)newValue);
        return;
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STATEMENT:
        setFor_statement((for_statement)newValue);
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STATEMENT:
        setWhile_statement((while_statement)null);
        return;
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STATEMENT:
        setRepeat_statement((repeat_statement)null);
        return;
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STATEMENT:
        setFor_statement((for_statement)null);
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
      case PascalPackage.REPETITIVE_STATEMENT__WHILE_STATEMENT:
        return while_statement != null;
      case PascalPackage.REPETITIVE_STATEMENT__REPEAT_STATEMENT:
        return repeat_statement != null;
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STATEMENT:
        return for_statement != null;
    }
    return super.eIsSet(featureID);
  }

} //repetitive_statementImpl
