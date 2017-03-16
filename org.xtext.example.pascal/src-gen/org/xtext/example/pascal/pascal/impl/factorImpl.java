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
import org.xtext.example.pascal.pascal.expression;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.function_designator;
import org.xtext.example.pascal.pascal.identifier;
import org.xtext.example.pascal.pascal.number;
import org.xtext.example.pascal.pascal.set;
import org.xtext.example.pascal.pascal.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getStrings <em>Strings</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getFunction_designator <em>Function designator</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class factorImpl extends MinimalEObjectImpl.Container implements factor
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected variable variable;

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
   * The default value of the '{@link #getStrings() <em>Strings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrings()
   * @generated
   * @ordered
   */
  protected static final String STRINGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStrings() <em>Strings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrings()
   * @generated
   * @ordered
   */
  protected String strings = STRINGS_EDEFAULT;

  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected set set;

  /**
   * The default value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean()
   * @generated
   * @ordered
   */
  protected String boolean_ = BOOLEAN_EDEFAULT;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected identifier identifier;

  /**
   * The cached value of the '{@link #getFunction_designator() <em>Function designator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_designator()
   * @generated
   * @ordered
   */
  protected function_designator function_designator;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected factor factor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected factorImpl()
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
    return PascalPackage.Literals.FACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(variable newVariable, NotificationChain msgs)
  {
    variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__VARIABLE, newVariable, newVariable));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NUMBER, oldNumber, newNumber);
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
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStrings()
  {
    return strings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrings(String newStrings)
  {
    String oldStrings = strings;
    strings = newStrings;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__STRINGS, oldStrings, strings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public set getSet()
  {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(set newSet, NotificationChain msgs)
  {
    set oldSet = set;
    set = newSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__SET, oldSet, newSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(set newSet)
  {
    if (newSet != set)
    {
      NotificationChain msgs = null;
      if (set != null)
        msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__SET, null, msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__SET, null, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__SET, newSet, newSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBoolean()
  {
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolean(String newBoolean)
  {
    String oldBoolean = boolean_;
    boolean_ = newBoolean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__BOOLEAN, oldBoolean, boolean_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier(identifier newIdentifier, NotificationChain msgs)
  {
    identifier oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__IDENTIFIER, oldIdentifier, newIdentifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(identifier newIdentifier)
  {
    if (newIdentifier != identifier)
    {
      NotificationChain msgs = null;
      if (identifier != null)
        msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__IDENTIFIER, null, msgs);
      if (newIdentifier != null)
        msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__IDENTIFIER, null, msgs);
      msgs = basicSetIdentifier(newIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__IDENTIFIER, newIdentifier, newIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_designator getFunction_designator()
  {
    return function_designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction_designator(function_designator newFunction_designator, NotificationChain msgs)
  {
    function_designator oldFunction_designator = function_designator;
    function_designator = newFunction_designator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FUNCTION_DESIGNATOR, oldFunction_designator, newFunction_designator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction_designator(function_designator newFunction_designator)
  {
    if (newFunction_designator != function_designator)
    {
      NotificationChain msgs = null;
      if (function_designator != null)
        msgs = ((InternalEObject)function_designator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FUNCTION_DESIGNATOR, null, msgs);
      if (newFunction_designator != null)
        msgs = ((InternalEObject)newFunction_designator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FUNCTION_DESIGNATOR, null, msgs);
      msgs = basicSetFunction_designator(newFunction_designator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FUNCTION_DESIGNATOR, newFunction_designator, newFunction_designator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factor getFactor()
  {
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFactor(factor newFactor, NotificationChain msgs)
  {
    factor oldFactor = factor;
    factor = newFactor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FACTOR, oldFactor, newFactor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor(factor newFactor)
  {
    if (newFactor != factor)
    {
      NotificationChain msgs = null;
      if (factor != null)
        msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FACTOR, null, msgs);
      if (newFactor != null)
        msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FACTOR, null, msgs);
      msgs = basicSetFactor(newFactor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FACTOR, newFactor, newFactor));
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
      case PascalPackage.FACTOR__VARIABLE:
        return basicSetVariable(null, msgs);
      case PascalPackage.FACTOR__NUMBER:
        return basicSetNumber(null, msgs);
      case PascalPackage.FACTOR__SET:
        return basicSetSet(null, msgs);
      case PascalPackage.FACTOR__IDENTIFIER:
        return basicSetIdentifier(null, msgs);
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        return basicSetFunction_designator(null, msgs);
      case PascalPackage.FACTOR__EXPRESSION:
        return basicSetExpression(null, msgs);
      case PascalPackage.FACTOR__FACTOR:
        return basicSetFactor(null, msgs);
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
      case PascalPackage.FACTOR__VARIABLE:
        return getVariable();
      case PascalPackage.FACTOR__NUMBER:
        return getNumber();
      case PascalPackage.FACTOR__STRINGS:
        return getStrings();
      case PascalPackage.FACTOR__SET:
        return getSet();
      case PascalPackage.FACTOR__BOOLEAN:
        return getBoolean();
      case PascalPackage.FACTOR__IDENTIFIER:
        return getIdentifier();
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        return getFunction_designator();
      case PascalPackage.FACTOR__EXPRESSION:
        return getExpression();
      case PascalPackage.FACTOR__FACTOR:
        return getFactor();
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
      case PascalPackage.FACTOR__VARIABLE:
        setVariable((variable)newValue);
        return;
      case PascalPackage.FACTOR__NUMBER:
        setNumber((number)newValue);
        return;
      case PascalPackage.FACTOR__STRINGS:
        setStrings((String)newValue);
        return;
      case PascalPackage.FACTOR__SET:
        setSet((set)newValue);
        return;
      case PascalPackage.FACTOR__BOOLEAN:
        setBoolean((String)newValue);
        return;
      case PascalPackage.FACTOR__IDENTIFIER:
        setIdentifier((identifier)newValue);
        return;
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        setFunction_designator((function_designator)newValue);
        return;
      case PascalPackage.FACTOR__EXPRESSION:
        setExpression((expression)newValue);
        return;
      case PascalPackage.FACTOR__FACTOR:
        setFactor((factor)newValue);
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
      case PascalPackage.FACTOR__VARIABLE:
        setVariable((variable)null);
        return;
      case PascalPackage.FACTOR__NUMBER:
        setNumber((number)null);
        return;
      case PascalPackage.FACTOR__STRINGS:
        setStrings(STRINGS_EDEFAULT);
        return;
      case PascalPackage.FACTOR__SET:
        setSet((set)null);
        return;
      case PascalPackage.FACTOR__BOOLEAN:
        setBoolean(BOOLEAN_EDEFAULT);
        return;
      case PascalPackage.FACTOR__IDENTIFIER:
        setIdentifier((identifier)null);
        return;
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        setFunction_designator((function_designator)null);
        return;
      case PascalPackage.FACTOR__EXPRESSION:
        setExpression((expression)null);
        return;
      case PascalPackage.FACTOR__FACTOR:
        setFactor((factor)null);
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
      case PascalPackage.FACTOR__VARIABLE:
        return variable != null;
      case PascalPackage.FACTOR__NUMBER:
        return number != null;
      case PascalPackage.FACTOR__STRINGS:
        return STRINGS_EDEFAULT == null ? strings != null : !STRINGS_EDEFAULT.equals(strings);
      case PascalPackage.FACTOR__SET:
        return set != null;
      case PascalPackage.FACTOR__BOOLEAN:
        return BOOLEAN_EDEFAULT == null ? boolean_ != null : !BOOLEAN_EDEFAULT.equals(boolean_);
      case PascalPackage.FACTOR__IDENTIFIER:
        return identifier != null;
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        return function_designator != null;
      case PascalPackage.FACTOR__EXPRESSION:
        return expression != null;
      case PascalPackage.FACTOR__FACTOR:
        return factor != null;
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
    result.append(" (strings: ");
    result.append(strings);
    result.append(", boolean: ");
    result.append(boolean_);
    result.append(')');
    return result.toString();
  }

} //factorImpl
