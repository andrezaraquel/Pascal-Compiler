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
import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.goto_statement;
import org.xtext.example.pascal.pascal.procedure_statement;
import org.xtext.example.pascal.pascal.simple_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_statementImpl#getAssignment_statement <em>Assignment statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_statementImpl#getProcedure_statement <em>Procedure statement</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_statementImpl#getGoto_statement <em>Goto statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class simple_statementImpl extends MinimalEObjectImpl.Container implements simple_statement
{
  /**
   * The cached value of the '{@link #getAssignment_statement() <em>Assignment statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment_statement()
   * @generated
   * @ordered
   */
  protected assignment_statement assignment_statement;

  /**
   * The cached value of the '{@link #getProcedure_statement() <em>Procedure statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedure_statement()
   * @generated
   * @ordered
   */
  protected procedure_statement procedure_statement;

  /**
   * The cached value of the '{@link #getGoto_statement() <em>Goto statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoto_statement()
   * @generated
   * @ordered
   */
  protected goto_statement goto_statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_statementImpl()
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
    return PascalPackage.Literals.SIMPLE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_statement getAssignment_statement()
  {
    return assignment_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment_statement(assignment_statement newAssignment_statement, NotificationChain msgs)
  {
    assignment_statement oldAssignment_statement = assignment_statement;
    assignment_statement = newAssignment_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT, oldAssignment_statement, newAssignment_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment_statement(assignment_statement newAssignment_statement)
  {
    if (newAssignment_statement != assignment_statement)
    {
      NotificationChain msgs = null;
      if (assignment_statement != null)
        msgs = ((InternalEObject)assignment_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT, null, msgs);
      if (newAssignment_statement != null)
        msgs = ((InternalEObject)newAssignment_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT, null, msgs);
      msgs = basicSetAssignment_statement(newAssignment_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT, newAssignment_statement, newAssignment_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_statement getProcedure_statement()
  {
    return procedure_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedure_statement(procedure_statement newProcedure_statement, NotificationChain msgs)
  {
    procedure_statement oldProcedure_statement = procedure_statement;
    procedure_statement = newProcedure_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT, oldProcedure_statement, newProcedure_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedure_statement(procedure_statement newProcedure_statement)
  {
    if (newProcedure_statement != procedure_statement)
    {
      NotificationChain msgs = null;
      if (procedure_statement != null)
        msgs = ((InternalEObject)procedure_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT, null, msgs);
      if (newProcedure_statement != null)
        msgs = ((InternalEObject)newProcedure_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT, null, msgs);
      msgs = basicSetProcedure_statement(newProcedure_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT, newProcedure_statement, newProcedure_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public goto_statement getGoto_statement()
  {
    return goto_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoto_statement(goto_statement newGoto_statement, NotificationChain msgs)
  {
    goto_statement oldGoto_statement = goto_statement;
    goto_statement = newGoto_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT, oldGoto_statement, newGoto_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoto_statement(goto_statement newGoto_statement)
  {
    if (newGoto_statement != goto_statement)
    {
      NotificationChain msgs = null;
      if (goto_statement != null)
        msgs = ((InternalEObject)goto_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT, null, msgs);
      if (newGoto_statement != null)
        msgs = ((InternalEObject)newGoto_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT, null, msgs);
      msgs = basicSetGoto_statement(newGoto_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT, newGoto_statement, newGoto_statement));
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        return basicSetAssignment_statement(null, msgs);
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        return basicSetProcedure_statement(null, msgs);
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        return basicSetGoto_statement(null, msgs);
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        return getAssignment_statement();
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        return getProcedure_statement();
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        return getGoto_statement();
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        setAssignment_statement((assignment_statement)newValue);
        return;
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        setProcedure_statement((procedure_statement)newValue);
        return;
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        setGoto_statement((goto_statement)newValue);
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        setAssignment_statement((assignment_statement)null);
        return;
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        setProcedure_statement((procedure_statement)null);
        return;
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        setGoto_statement((goto_statement)null);
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        return assignment_statement != null;
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        return procedure_statement != null;
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        return goto_statement != null;
    }
    return super.eIsSet(featureID);
  }

} //simple_statementImpl
