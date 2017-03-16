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
import org.xtext.example.pascal.pascal.declaration_part;
import org.xtext.example.pascal.pascal.function_block;
import org.xtext.example.pascal.pascal.statement_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.function_blockImpl#getDeclaration_part <em>Declaration part</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.function_blockImpl#getStatement_part <em>Statement part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class function_blockImpl extends MinimalEObjectImpl.Container implements function_block
{
  /**
   * The cached value of the '{@link #getDeclaration_part() <em>Declaration part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration_part()
   * @generated
   * @ordered
   */
  protected declaration_part declaration_part;

  /**
   * The cached value of the '{@link #getStatement_part() <em>Statement part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement_part()
   * @generated
   * @ordered
   */
  protected statement_part statement_part;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected function_blockImpl()
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
    return PascalPackage.Literals.FUNCTION_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_part getDeclaration_part()
  {
    return declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration_part(declaration_part newDeclaration_part, NotificationChain msgs)
  {
    declaration_part oldDeclaration_part = declaration_part;
    declaration_part = newDeclaration_part;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_BLOCK__DECLARATION_PART, oldDeclaration_part, newDeclaration_part);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration_part(declaration_part newDeclaration_part)
  {
    if (newDeclaration_part != declaration_part)
    {
      NotificationChain msgs = null;
      if (declaration_part != null)
        msgs = ((InternalEObject)declaration_part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_BLOCK__DECLARATION_PART, null, msgs);
      if (newDeclaration_part != null)
        msgs = ((InternalEObject)newDeclaration_part).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_BLOCK__DECLARATION_PART, null, msgs);
      msgs = basicSetDeclaration_part(newDeclaration_part, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_BLOCK__DECLARATION_PART, newDeclaration_part, newDeclaration_part));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_part getStatement_part()
  {
    return statement_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement_part(statement_part newStatement_part, NotificationChain msgs)
  {
    statement_part oldStatement_part = statement_part;
    statement_part = newStatement_part;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_BLOCK__STATEMENT_PART, oldStatement_part, newStatement_part);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement_part(statement_part newStatement_part)
  {
    if (newStatement_part != statement_part)
    {
      NotificationChain msgs = null;
      if (statement_part != null)
        msgs = ((InternalEObject)statement_part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_BLOCK__STATEMENT_PART, null, msgs);
      if (newStatement_part != null)
        msgs = ((InternalEObject)newStatement_part).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_BLOCK__STATEMENT_PART, null, msgs);
      msgs = basicSetStatement_part(newStatement_part, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_BLOCK__STATEMENT_PART, newStatement_part, newStatement_part));
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
      case PascalPackage.FUNCTION_BLOCK__DECLARATION_PART:
        return basicSetDeclaration_part(null, msgs);
      case PascalPackage.FUNCTION_BLOCK__STATEMENT_PART:
        return basicSetStatement_part(null, msgs);
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
      case PascalPackage.FUNCTION_BLOCK__DECLARATION_PART:
        return getDeclaration_part();
      case PascalPackage.FUNCTION_BLOCK__STATEMENT_PART:
        return getStatement_part();
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
      case PascalPackage.FUNCTION_BLOCK__DECLARATION_PART:
        setDeclaration_part((declaration_part)newValue);
        return;
      case PascalPackage.FUNCTION_BLOCK__STATEMENT_PART:
        setStatement_part((statement_part)newValue);
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
      case PascalPackage.FUNCTION_BLOCK__DECLARATION_PART:
        setDeclaration_part((declaration_part)null);
        return;
      case PascalPackage.FUNCTION_BLOCK__STATEMENT_PART:
        setStatement_part((statement_part)null);
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
      case PascalPackage.FUNCTION_BLOCK__DECLARATION_PART:
        return declaration_part != null;
      case PascalPackage.FUNCTION_BLOCK__STATEMENT_PART:
        return statement_part != null;
    }
    return super.eIsSet(featureID);
  }

} //function_blockImpl
