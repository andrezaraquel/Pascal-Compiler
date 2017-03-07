/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.digit_sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>digit sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.digit_sequenceImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.digit_sequenceImpl#getUnsigned_digit_sequence <em>Unsigned digit sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class digit_sequenceImpl extends MinimalEObjectImpl.Container implements digit_sequence
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
   * The default value of the '{@link #getUnsigned_digit_sequence() <em>Unsigned digit sequence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsigned_digit_sequence()
   * @generated
   * @ordered
   */
  protected static final String UNSIGNED_DIGIT_SEQUENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnsigned_digit_sequence() <em>Unsigned digit sequence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsigned_digit_sequence()
   * @generated
   * @ordered
   */
  protected String unsigned_digit_sequence = UNSIGNED_DIGIT_SEQUENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected digit_sequenceImpl()
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
    return PascalPackage.Literals.DIGIT_SEQUENCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DIGIT_SEQUENCE__SIGN, oldSign, sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnsigned_digit_sequence()
  {
    return unsigned_digit_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsigned_digit_sequence(String newUnsigned_digit_sequence)
  {
    String oldUnsigned_digit_sequence = unsigned_digit_sequence;
    unsigned_digit_sequence = newUnsigned_digit_sequence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DIGIT_SEQUENCE__UNSIGNED_DIGIT_SEQUENCE, oldUnsigned_digit_sequence, unsigned_digit_sequence));
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
      case PascalPackage.DIGIT_SEQUENCE__SIGN:
        return getSign();
      case PascalPackage.DIGIT_SEQUENCE__UNSIGNED_DIGIT_SEQUENCE:
        return getUnsigned_digit_sequence();
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
      case PascalPackage.DIGIT_SEQUENCE__SIGN:
        setSign((String)newValue);
        return;
      case PascalPackage.DIGIT_SEQUENCE__UNSIGNED_DIGIT_SEQUENCE:
        setUnsigned_digit_sequence((String)newValue);
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
      case PascalPackage.DIGIT_SEQUENCE__SIGN:
        setSign(SIGN_EDEFAULT);
        return;
      case PascalPackage.DIGIT_SEQUENCE__UNSIGNED_DIGIT_SEQUENCE:
        setUnsigned_digit_sequence(UNSIGNED_DIGIT_SEQUENCE_EDEFAULT);
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
      case PascalPackage.DIGIT_SEQUENCE__SIGN:
        return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
      case PascalPackage.DIGIT_SEQUENCE__UNSIGNED_DIGIT_SEQUENCE:
        return UNSIGNED_DIGIT_SEQUENCE_EDEFAULT == null ? unsigned_digit_sequence != null : !UNSIGNED_DIGIT_SEQUENCE_EDEFAULT.equals(unsigned_digit_sequence);
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
    result.append(", unsigned_digit_sequence: ");
    result.append(unsigned_digit_sequence);
    result.append(')');
    return result.toString();
  }

} //digit_sequenceImpl