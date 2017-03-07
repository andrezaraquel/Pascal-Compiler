/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.constant_definition_part;
import org.xtext.example.pascal.pascal.declaration_part;
import org.xtext.example.pascal.pascal.directive;
import org.xtext.example.pascal.pascal.function_body;
import org.xtext.example.pascal.pascal.function_heading;
import org.xtext.example.pascal.pascal.function_identification;
import org.xtext.example.pascal.pascal.label_declaration_part;
import org.xtext.example.pascal.pascal.procedure_body;
import org.xtext.example.pascal.pascal.procedure_heading;
import org.xtext.example.pascal.pascal.procedure_identification;
import org.xtext.example.pascal.pascal.type_definition_part;
import org.xtext.example.pascal.pascal.variable_declaration_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declaration part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getLabel_declaration_part <em>Label declaration part</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getConstant_definition_part <em>Constant definition part</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getType_definition_part <em>Type definition part</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getVariable_declaration_part <em>Variable declaration part</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getProcedure_heading <em>Procedure heading</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getProcedure_body <em>Procedure body</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getDirective <em>Directive</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getProcedure_identification <em>Procedure identification</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getFunction_heading <em>Function heading</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getFunction_body <em>Function body</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.declaration_partImpl#getFunction_identification <em>Function identification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class declaration_partImpl extends MinimalEObjectImpl.Container implements declaration_part
{
  /**
   * The cached value of the '{@link #getLabel_declaration_part() <em>Label declaration part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel_declaration_part()
   * @generated
   * @ordered
   */
  protected label_declaration_part label_declaration_part;

  /**
   * The cached value of the '{@link #getConstant_definition_part() <em>Constant definition part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant_definition_part()
   * @generated
   * @ordered
   */
  protected constant_definition_part constant_definition_part;

  /**
   * The cached value of the '{@link #getType_definition_part() <em>Type definition part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_definition_part()
   * @generated
   * @ordered
   */
  protected type_definition_part type_definition_part;

  /**
   * The cached value of the '{@link #getVariable_declaration_part() <em>Variable declaration part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_declaration_part()
   * @generated
   * @ordered
   */
  protected variable_declaration_part variable_declaration_part;

  /**
   * The cached value of the '{@link #getProcedure_heading() <em>Procedure heading</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedure_heading()
   * @generated
   * @ordered
   */
  protected EList<procedure_heading> procedure_heading;

  /**
   * The cached value of the '{@link #getProcedure_body() <em>Procedure body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedure_body()
   * @generated
   * @ordered
   */
  protected EList<procedure_body> procedure_body;

  /**
   * The cached value of the '{@link #getDirective() <em>Directive</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirective()
   * @generated
   * @ordered
   */
  protected EList<directive> directive;

  /**
   * The cached value of the '{@link #getProcedure_identification() <em>Procedure identification</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedure_identification()
   * @generated
   * @ordered
   */
  protected EList<procedure_identification> procedure_identification;

  /**
   * The cached value of the '{@link #getFunction_heading() <em>Function heading</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_heading()
   * @generated
   * @ordered
   */
  protected EList<function_heading> function_heading;

  /**
   * The cached value of the '{@link #getFunction_body() <em>Function body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_body()
   * @generated
   * @ordered
   */
  protected EList<function_body> function_body;

  /**
   * The cached value of the '{@link #getFunction_identification() <em>Function identification</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_identification()
   * @generated
   * @ordered
   */
  protected EList<function_identification> function_identification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declaration_partImpl()
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
    return PascalPackage.Literals.DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label_declaration_part getLabel_declaration_part()
  {
    return label_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel_declaration_part(label_declaration_part newLabel_declaration_part, NotificationChain msgs)
  {
    label_declaration_part oldLabel_declaration_part = label_declaration_part;
    label_declaration_part = newLabel_declaration_part;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART, oldLabel_declaration_part, newLabel_declaration_part);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel_declaration_part(label_declaration_part newLabel_declaration_part)
  {
    if (newLabel_declaration_part != label_declaration_part)
    {
      NotificationChain msgs = null;
      if (label_declaration_part != null)
        msgs = ((InternalEObject)label_declaration_part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART, null, msgs);
      if (newLabel_declaration_part != null)
        msgs = ((InternalEObject)newLabel_declaration_part).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART, null, msgs);
      msgs = basicSetLabel_declaration_part(newLabel_declaration_part, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART, newLabel_declaration_part, newLabel_declaration_part));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition_part getConstant_definition_part()
  {
    return constant_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant_definition_part(constant_definition_part newConstant_definition_part, NotificationChain msgs)
  {
    constant_definition_part oldConstant_definition_part = constant_definition_part;
    constant_definition_part = newConstant_definition_part;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART, oldConstant_definition_part, newConstant_definition_part);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant_definition_part(constant_definition_part newConstant_definition_part)
  {
    if (newConstant_definition_part != constant_definition_part)
    {
      NotificationChain msgs = null;
      if (constant_definition_part != null)
        msgs = ((InternalEObject)constant_definition_part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART, null, msgs);
      if (newConstant_definition_part != null)
        msgs = ((InternalEObject)newConstant_definition_part).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART, null, msgs);
      msgs = basicSetConstant_definition_part(newConstant_definition_part, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART, newConstant_definition_part, newConstant_definition_part));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition_part getType_definition_part()
  {
    return type_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_definition_part(type_definition_part newType_definition_part, NotificationChain msgs)
  {
    type_definition_part oldType_definition_part = type_definition_part;
    type_definition_part = newType_definition_part;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART, oldType_definition_part, newType_definition_part);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_definition_part(type_definition_part newType_definition_part)
  {
    if (newType_definition_part != type_definition_part)
    {
      NotificationChain msgs = null;
      if (type_definition_part != null)
        msgs = ((InternalEObject)type_definition_part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART, null, msgs);
      if (newType_definition_part != null)
        msgs = ((InternalEObject)newType_definition_part).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART, null, msgs);
      msgs = basicSetType_definition_part(newType_definition_part, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART, newType_definition_part, newType_definition_part));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration_part getVariable_declaration_part()
  {
    return variable_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable_declaration_part(variable_declaration_part newVariable_declaration_part, NotificationChain msgs)
  {
    variable_declaration_part oldVariable_declaration_part = variable_declaration_part;
    variable_declaration_part = newVariable_declaration_part;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART, oldVariable_declaration_part, newVariable_declaration_part);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable_declaration_part(variable_declaration_part newVariable_declaration_part)
  {
    if (newVariable_declaration_part != variable_declaration_part)
    {
      NotificationChain msgs = null;
      if (variable_declaration_part != null)
        msgs = ((InternalEObject)variable_declaration_part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART, null, msgs);
      if (newVariable_declaration_part != null)
        msgs = ((InternalEObject)newVariable_declaration_part).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART, null, msgs);
      msgs = basicSetVariable_declaration_part(newVariable_declaration_part, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART, newVariable_declaration_part, newVariable_declaration_part));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<procedure_heading> getProcedure_heading()
  {
    if (procedure_heading == null)
    {
      procedure_heading = new EObjectContainmentEList<procedure_heading>(procedure_heading.class, this, PascalPackage.DECLARATION_PART__PROCEDURE_HEADING);
    }
    return procedure_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<procedure_body> getProcedure_body()
  {
    if (procedure_body == null)
    {
      procedure_body = new EObjectContainmentEList<procedure_body>(procedure_body.class, this, PascalPackage.DECLARATION_PART__PROCEDURE_BODY);
    }
    return procedure_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<directive> getDirective()
  {
    if (directive == null)
    {
      directive = new EObjectContainmentEList<directive>(directive.class, this, PascalPackage.DECLARATION_PART__DIRECTIVE);
    }
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<procedure_identification> getProcedure_identification()
  {
    if (procedure_identification == null)
    {
      procedure_identification = new EObjectContainmentEList<procedure_identification>(procedure_identification.class, this, PascalPackage.DECLARATION_PART__PROCEDURE_IDENTIFICATION);
    }
    return procedure_identification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<function_heading> getFunction_heading()
  {
    if (function_heading == null)
    {
      function_heading = new EObjectContainmentEList<function_heading>(function_heading.class, this, PascalPackage.DECLARATION_PART__FUNCTION_HEADING);
    }
    return function_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<function_body> getFunction_body()
  {
    if (function_body == null)
    {
      function_body = new EObjectContainmentEList<function_body>(function_body.class, this, PascalPackage.DECLARATION_PART__FUNCTION_BODY);
    }
    return function_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<function_identification> getFunction_identification()
  {
    if (function_identification == null)
    {
      function_identification = new EObjectContainmentEList<function_identification>(function_identification.class, this, PascalPackage.DECLARATION_PART__FUNCTION_IDENTIFICATION);
    }
    return function_identification;
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
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        return basicSetLabel_declaration_part(null, msgs);
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        return basicSetConstant_definition_part(null, msgs);
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        return basicSetType_definition_part(null, msgs);
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        return basicSetVariable_declaration_part(null, msgs);
      case PascalPackage.DECLARATION_PART__PROCEDURE_HEADING:
        return ((InternalEList<?>)getProcedure_heading()).basicRemove(otherEnd, msgs);
      case PascalPackage.DECLARATION_PART__PROCEDURE_BODY:
        return ((InternalEList<?>)getProcedure_body()).basicRemove(otherEnd, msgs);
      case PascalPackage.DECLARATION_PART__DIRECTIVE:
        return ((InternalEList<?>)getDirective()).basicRemove(otherEnd, msgs);
      case PascalPackage.DECLARATION_PART__PROCEDURE_IDENTIFICATION:
        return ((InternalEList<?>)getProcedure_identification()).basicRemove(otherEnd, msgs);
      case PascalPackage.DECLARATION_PART__FUNCTION_HEADING:
        return ((InternalEList<?>)getFunction_heading()).basicRemove(otherEnd, msgs);
      case PascalPackage.DECLARATION_PART__FUNCTION_BODY:
        return ((InternalEList<?>)getFunction_body()).basicRemove(otherEnd, msgs);
      case PascalPackage.DECLARATION_PART__FUNCTION_IDENTIFICATION:
        return ((InternalEList<?>)getFunction_identification()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        return getLabel_declaration_part();
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        return getConstant_definition_part();
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        return getType_definition_part();
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        return getVariable_declaration_part();
      case PascalPackage.DECLARATION_PART__PROCEDURE_HEADING:
        return getProcedure_heading();
      case PascalPackage.DECLARATION_PART__PROCEDURE_BODY:
        return getProcedure_body();
      case PascalPackage.DECLARATION_PART__DIRECTIVE:
        return getDirective();
      case PascalPackage.DECLARATION_PART__PROCEDURE_IDENTIFICATION:
        return getProcedure_identification();
      case PascalPackage.DECLARATION_PART__FUNCTION_HEADING:
        return getFunction_heading();
      case PascalPackage.DECLARATION_PART__FUNCTION_BODY:
        return getFunction_body();
      case PascalPackage.DECLARATION_PART__FUNCTION_IDENTIFICATION:
        return getFunction_identification();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        setLabel_declaration_part((label_declaration_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        setConstant_definition_part((constant_definition_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        setType_definition_part((type_definition_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        setVariable_declaration_part((variable_declaration_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE_HEADING:
        getProcedure_heading().clear();
        getProcedure_heading().addAll((Collection<? extends procedure_heading>)newValue);
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE_BODY:
        getProcedure_body().clear();
        getProcedure_body().addAll((Collection<? extends procedure_body>)newValue);
        return;
      case PascalPackage.DECLARATION_PART__DIRECTIVE:
        getDirective().clear();
        getDirective().addAll((Collection<? extends directive>)newValue);
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE_IDENTIFICATION:
        getProcedure_identification().clear();
        getProcedure_identification().addAll((Collection<? extends procedure_identification>)newValue);
        return;
      case PascalPackage.DECLARATION_PART__FUNCTION_HEADING:
        getFunction_heading().clear();
        getFunction_heading().addAll((Collection<? extends function_heading>)newValue);
        return;
      case PascalPackage.DECLARATION_PART__FUNCTION_BODY:
        getFunction_body().clear();
        getFunction_body().addAll((Collection<? extends function_body>)newValue);
        return;
      case PascalPackage.DECLARATION_PART__FUNCTION_IDENTIFICATION:
        getFunction_identification().clear();
        getFunction_identification().addAll((Collection<? extends function_identification>)newValue);
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
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        setLabel_declaration_part((label_declaration_part)null);
        return;
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        setConstant_definition_part((constant_definition_part)null);
        return;
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        setType_definition_part((type_definition_part)null);
        return;
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        setVariable_declaration_part((variable_declaration_part)null);
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE_HEADING:
        getProcedure_heading().clear();
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE_BODY:
        getProcedure_body().clear();
        return;
      case PascalPackage.DECLARATION_PART__DIRECTIVE:
        getDirective().clear();
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE_IDENTIFICATION:
        getProcedure_identification().clear();
        return;
      case PascalPackage.DECLARATION_PART__FUNCTION_HEADING:
        getFunction_heading().clear();
        return;
      case PascalPackage.DECLARATION_PART__FUNCTION_BODY:
        getFunction_body().clear();
        return;
      case PascalPackage.DECLARATION_PART__FUNCTION_IDENTIFICATION:
        getFunction_identification().clear();
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
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        return label_declaration_part != null;
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        return constant_definition_part != null;
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        return type_definition_part != null;
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        return variable_declaration_part != null;
      case PascalPackage.DECLARATION_PART__PROCEDURE_HEADING:
        return procedure_heading != null && !procedure_heading.isEmpty();
      case PascalPackage.DECLARATION_PART__PROCEDURE_BODY:
        return procedure_body != null && !procedure_body.isEmpty();
      case PascalPackage.DECLARATION_PART__DIRECTIVE:
        return directive != null && !directive.isEmpty();
      case PascalPackage.DECLARATION_PART__PROCEDURE_IDENTIFICATION:
        return procedure_identification != null && !procedure_identification.isEmpty();
      case PascalPackage.DECLARATION_PART__FUNCTION_HEADING:
        return function_heading != null && !function_heading.isEmpty();
      case PascalPackage.DECLARATION_PART__FUNCTION_BODY:
        return function_body != null && !function_body.isEmpty();
      case PascalPackage.DECLARATION_PART__FUNCTION_IDENTIFICATION:
        return function_identification != null && !function_identification.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //declaration_partImpl