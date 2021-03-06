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
import org.xtext.example.pascal.pascal.compound_statement;
import org.xtext.example.pascal.pascal.conditional_statement;
import org.xtext.example.pascal.pascal.repetitive_statement;
import org.xtext.example.pascal.pascal.structured_statement;
import org.xtext.example.pascal.pascal.with_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>structured statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl#getCompound_statement <em>Compound statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl#getRepetitive_statement <em>Repetitive statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl#getConditional_statement <em>Conditional statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.structured_statementImpl#getWith_statement <em>With statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class structured_statementImpl extends MinimalEObjectImpl.Container implements structured_statement
{
  /**
   * The cached value of the '{@link #getCompound_statement() <em>Compound statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompound_statement()
   * @generated
   * @ordered
   */
  protected compound_statement compound_statement;

  /**
   * The cached value of the '{@link #getRepetitive_statement() <em>Repetitive statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepetitive_statement()
   * @generated
   * @ordered
   */
  protected repetitive_statement repetitive_statement;

  /**
   * The cached value of the '{@link #getConditional_statement() <em>Conditional statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditional_statement()
   * @generated
   * @ordered
   */
  protected conditional_statement conditional_statement;

  /**
   * The cached value of the '{@link #getWith_statement() <em>With statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWith_statement()
   * @generated
   * @ordered
   */
  protected with_statement with_statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected structured_statementImpl()
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
    return PascalPackage.Literals.STRUCTURED_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compound_statement getCompound_statement()
  {
    return compound_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompound_statement(compound_statement newCompound_statement, NotificationChain msgs)
  {
    compound_statement oldCompound_statement = compound_statement;
    compound_statement = newCompound_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__COMPOUND_STATEMENT, oldCompound_statement, newCompound_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompound_statement(compound_statement newCompound_statement)
  {
    if (newCompound_statement != compound_statement)
    {
      NotificationChain msgs = null;
      if (compound_statement != null)
        msgs = ((InternalEObject)compound_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__COMPOUND_STATEMENT, null, msgs);
      if (newCompound_statement != null)
        msgs = ((InternalEObject)newCompound_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__COMPOUND_STATEMENT, null, msgs);
      msgs = basicSetCompound_statement(newCompound_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__COMPOUND_STATEMENT, newCompound_statement, newCompound_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public repetitive_statement getRepetitive_statement()
  {
    return repetitive_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepetitive_statement(repetitive_statement newRepetitive_statement, NotificationChain msgs)
  {
    repetitive_statement oldRepetitive_statement = repetitive_statement;
    repetitive_statement = newRepetitive_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__REPETITIVE_STATEMENT, oldRepetitive_statement, newRepetitive_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepetitive_statement(repetitive_statement newRepetitive_statement)
  {
    if (newRepetitive_statement != repetitive_statement)
    {
      NotificationChain msgs = null;
      if (repetitive_statement != null)
        msgs = ((InternalEObject)repetitive_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__REPETITIVE_STATEMENT, null, msgs);
      if (newRepetitive_statement != null)
        msgs = ((InternalEObject)newRepetitive_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__REPETITIVE_STATEMENT, null, msgs);
      msgs = basicSetRepetitive_statement(newRepetitive_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__REPETITIVE_STATEMENT, newRepetitive_statement, newRepetitive_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditional_statement getConditional_statement()
  {
    return conditional_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditional_statement(conditional_statement newConditional_statement, NotificationChain msgs)
  {
    conditional_statement oldConditional_statement = conditional_statement;
    conditional_statement = newConditional_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL_STATEMENT, oldConditional_statement, newConditional_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditional_statement(conditional_statement newConditional_statement)
  {
    if (newConditional_statement != conditional_statement)
    {
      NotificationChain msgs = null;
      if (conditional_statement != null)
        msgs = ((InternalEObject)conditional_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL_STATEMENT, null, msgs);
      if (newConditional_statement != null)
        msgs = ((InternalEObject)newConditional_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL_STATEMENT, null, msgs);
      msgs = basicSetConditional_statement(newConditional_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL_STATEMENT, newConditional_statement, newConditional_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public with_statement getWith_statement()
  {
    return with_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWith_statement(with_statement newWith_statement, NotificationChain msgs)
  {
    with_statement oldWith_statement = with_statement;
    with_statement = newWith_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__WITH_STATEMENT, oldWith_statement, newWith_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWith_statement(with_statement newWith_statement)
  {
    if (newWith_statement != with_statement)
    {
      NotificationChain msgs = null;
      if (with_statement != null)
        msgs = ((InternalEObject)with_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__WITH_STATEMENT, null, msgs);
      if (newWith_statement != null)
        msgs = ((InternalEObject)newWith_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_STATEMENT__WITH_STATEMENT, null, msgs);
      msgs = basicSetWith_statement(newWith_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_STATEMENT__WITH_STATEMENT, newWith_statement, newWith_statement));
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND_STATEMENT:
        return basicSetCompound_statement(null, msgs);
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE_STATEMENT:
        return basicSetRepetitive_statement(null, msgs);
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL_STATEMENT:
        return basicSetConditional_statement(null, msgs);
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STATEMENT:
        return basicSetWith_statement(null, msgs);
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND_STATEMENT:
        return getCompound_statement();
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE_STATEMENT:
        return getRepetitive_statement();
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL_STATEMENT:
        return getConditional_statement();
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STATEMENT:
        return getWith_statement();
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND_STATEMENT:
        setCompound_statement((compound_statement)newValue);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE_STATEMENT:
        setRepetitive_statement((repetitive_statement)newValue);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL_STATEMENT:
        setConditional_statement((conditional_statement)newValue);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STATEMENT:
        setWith_statement((with_statement)newValue);
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND_STATEMENT:
        setCompound_statement((compound_statement)null);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE_STATEMENT:
        setRepetitive_statement((repetitive_statement)null);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL_STATEMENT:
        setConditional_statement((conditional_statement)null);
        return;
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STATEMENT:
        setWith_statement((with_statement)null);
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
      case PascalPackage.STRUCTURED_STATEMENT__COMPOUND_STATEMENT:
        return compound_statement != null;
      case PascalPackage.STRUCTURED_STATEMENT__REPETITIVE_STATEMENT:
        return repetitive_statement != null;
      case PascalPackage.STRUCTURED_STATEMENT__CONDITIONAL_STATEMENT:
        return conditional_statement != null;
      case PascalPackage.STRUCTURED_STATEMENT__WITH_STATEMENT:
        return with_statement != null;
    }
    return super.eIsSet(featureID);
  }

} //structured_statementImpl
