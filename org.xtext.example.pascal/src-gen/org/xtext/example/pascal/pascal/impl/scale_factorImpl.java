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
import org.xtext.example.pascal.pascal.digit_sequence;
import org.xtext.example.pascal.pascal.scale_factor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>scale factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.scale_factorImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.scale_factorImpl#getDigit_sequence <em>Digit sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class scale_factorImpl extends MinimalEObjectImpl.Container implements scale_factor
{
  /**
   * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected static final String SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected String sign = SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getDigit_sequence() <em>Digit sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDigit_sequence()
   * @generated
   * @ordered
   */
  protected digit_sequence digit_sequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected scale_factorImpl()
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
    return PascalPackage.Literals.SCALE_FACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSign()
  {
    return sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSign(String newSign)
  {
    String oldSign = sign;
    sign = newSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SCALE_FACTOR__SIGN, oldSign, sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public digit_sequence getDigit_sequence()
  {
    return digit_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDigit_sequence(digit_sequence newDigit_sequence, NotificationChain msgs)
  {
    digit_sequence oldDigit_sequence = digit_sequence;
    digit_sequence = newDigit_sequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SCALE_FACTOR__DIGIT_SEQUENCE, oldDigit_sequence, newDigit_sequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDigit_sequence(digit_sequence newDigit_sequence)
  {
    if (newDigit_sequence != digit_sequence)
    {
      NotificationChain msgs = null;
      if (digit_sequence != null)
        msgs = ((InternalEObject)digit_sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SCALE_FACTOR__DIGIT_SEQUENCE, null, msgs);
      if (newDigit_sequence != null)
        msgs = ((InternalEObject)newDigit_sequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SCALE_FACTOR__DIGIT_SEQUENCE, null, msgs);
      msgs = basicSetDigit_sequence(newDigit_sequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SCALE_FACTOR__DIGIT_SEQUENCE, newDigit_sequence, newDigit_sequence));
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
      case PascalPackage.SCALE_FACTOR__DIGIT_SEQUENCE:
        return basicSetDigit_sequence(null, msgs);
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
      case PascalPackage.SCALE_FACTOR__SIGN:
        return getSign();
      case PascalPackage.SCALE_FACTOR__DIGIT_SEQUENCE:
        return getDigit_sequence();
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
      case PascalPackage.SCALE_FACTOR__SIGN:
        setSign((String)newValue);
        return;
      case PascalPackage.SCALE_FACTOR__DIGIT_SEQUENCE:
        setDigit_sequence((digit_sequence)newValue);
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
      case PascalPackage.SCALE_FACTOR__SIGN:
        setSign(SIGN_EDEFAULT);
        return;
      case PascalPackage.SCALE_FACTOR__DIGIT_SEQUENCE:
        setDigit_sequence((digit_sequence)null);
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
      case PascalPackage.SCALE_FACTOR__SIGN:
        return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
      case PascalPackage.SCALE_FACTOR__DIGIT_SEQUENCE:
        return digit_sequence != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sign: ");
    result.append(sign);
    result.append(')');
    return result.toString();
  }

} //scale_factorImpl
