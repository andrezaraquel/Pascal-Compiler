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
import org.xtext.example.pascal.pascal.constant;
import org.xtext.example.pascal.pascal.identifier;
import org.xtext.example.pascal.pascal.number;
import org.xtext.example.pascal.pascal.strings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#getConstant_identifier <em>Constant identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#getStrings <em>Strings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class constantImpl extends MinimalEObjectImpl.Container implements constant
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
   * The cached value of the '{@link #getConstant_identifier() <em>Constant identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant_identifier()
   * @generated
   * @ordered
   */
  protected identifier constant_identifier;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected number number;

  /**
   * The cached value of the '{@link #getStrings() <em>Strings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrings()
   * @generated
   * @ordered
   */
  protected strings strings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constantImpl()
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
    return PascalPackage.Literals.CONSTANT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__SIGN, oldSign, sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getConstant_identifier()
  {
    return constant_identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant_identifier(identifier newConstant_identifier, NotificationChain msgs)
  {
    identifier oldConstant_identifier = constant_identifier;
    constant_identifier = newConstant_identifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__CONSTANT_IDENTIFIER, oldConstant_identifier, newConstant_identifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant_identifier(identifier newConstant_identifier)
  {
    if (newConstant_identifier != constant_identifier)
    {
      NotificationChain msgs = null;
      if (constant_identifier != null)
        msgs = ((InternalEObject)constant_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__CONSTANT_IDENTIFIER, null, msgs);
      if (newConstant_identifier != null)
        msgs = ((InternalEObject)newConstant_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__CONSTANT_IDENTIFIER, null, msgs);
      msgs = basicSetConstant_identifier(newConstant_identifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__CONSTANT_IDENTIFIER, newConstant_identifier, newConstant_identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(number newNumber, NotificationChain msgs)
  {
    number oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(number newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public strings getStrings()
  {
    return strings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStrings(strings newStrings, NotificationChain msgs)
  {
    strings oldStrings = strings;
    strings = newStrings;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__STRINGS, oldStrings, newStrings);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrings(strings newStrings)
  {
    if (newStrings != strings)
    {
      NotificationChain msgs = null;
      if (strings != null)
        msgs = ((InternalEObject)strings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__STRINGS, null, msgs);
      if (newStrings != null)
        msgs = ((InternalEObject)newStrings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__STRINGS, null, msgs);
      msgs = basicSetStrings(newStrings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__STRINGS, newStrings, newStrings));
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
      case PascalPackage.CONSTANT__CONSTANT_IDENTIFIER:
        return basicSetConstant_identifier(null, msgs);
      case PascalPackage.CONSTANT__NUMBER:
        return basicSetNumber(null, msgs);
      case PascalPackage.CONSTANT__STRINGS:
        return basicSetStrings(null, msgs);
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
      case PascalPackage.CONSTANT__SIGN:
        return getSign();
      case PascalPackage.CONSTANT__CONSTANT_IDENTIFIER:
        return getConstant_identifier();
      case PascalPackage.CONSTANT__NUMBER:
        return getNumber();
      case PascalPackage.CONSTANT__STRINGS:
        return getStrings();
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
      case PascalPackage.CONSTANT__SIGN:
        setSign((String)newValue);
        return;
      case PascalPackage.CONSTANT__CONSTANT_IDENTIFIER:
        setConstant_identifier((identifier)newValue);
        return;
      case PascalPackage.CONSTANT__NUMBER:
        setNumber((number)newValue);
        return;
      case PascalPackage.CONSTANT__STRINGS:
        setStrings((strings)newValue);
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
      case PascalPackage.CONSTANT__SIGN:
        setSign(SIGN_EDEFAULT);
        return;
      case PascalPackage.CONSTANT__CONSTANT_IDENTIFIER:
        setConstant_identifier((identifier)null);
        return;
      case PascalPackage.CONSTANT__NUMBER:
        setNumber((number)null);
        return;
      case PascalPackage.CONSTANT__STRINGS:
        setStrings((strings)null);
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
      case PascalPackage.CONSTANT__SIGN:
        return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
      case PascalPackage.CONSTANT__CONSTANT_IDENTIFIER:
        return constant_identifier != null;
      case PascalPackage.CONSTANT__NUMBER:
        return number != null;
      case PascalPackage.CONSTANT__STRINGS:
        return strings != null;
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

} //constantImpl
