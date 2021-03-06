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
import org.xtext.example.pascal.pascal.bound_specification;
import org.xtext.example.pascal.pascal.conformant_array_schema;
import org.xtext.example.pascal.pascal.type_identifier;
import org.xtext.example.pascal.pascal.unpacked_conformant_array_schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unpacked conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl#getBound_specification <em>Bound specification</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl#getType_identifier <em>Type identifier</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl#getConformant_array_schema <em>Conformant array schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class unpacked_conformant_array_schemaImpl extends MinimalEObjectImpl.Container implements unpacked_conformant_array_schema
{
  /**
   * The cached value of the '{@link #getBound_specification() <em>Bound specification</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound_specification()
   * @generated
   * @ordered
   */
  protected EList<bound_specification> bound_specification;

  /**
   * The cached value of the '{@link #getType_identifier() <em>Type identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_identifier()
   * @generated
   * @ordered
   */
  protected type_identifier type_identifier;

  /**
   * The cached value of the '{@link #getConformant_array_schema() <em>Conformant array schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConformant_array_schema()
   * @generated
   * @ordered
   */
  protected conformant_array_schema conformant_array_schema;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unpacked_conformant_array_schemaImpl()
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
    return PascalPackage.Literals.UNPACKED_CONFORMANT_ARRAY_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<bound_specification> getBound_specification()
  {
    if (bound_specification == null)
    {
      bound_specification = new EObjectContainmentEList<bound_specification>(bound_specification.class, this, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION);
    }
    return bound_specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_identifier getType_identifier()
  {
    return type_identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_identifier(type_identifier newType_identifier, NotificationChain msgs)
  {
    type_identifier oldType_identifier = type_identifier;
    type_identifier = newType_identifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER, oldType_identifier, newType_identifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_identifier(type_identifier newType_identifier)
  {
    if (newType_identifier != type_identifier)
    {
      NotificationChain msgs = null;
      if (type_identifier != null)
        msgs = ((InternalEObject)type_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER, null, msgs);
      if (newType_identifier != null)
        msgs = ((InternalEObject)newType_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetType_identifier(newType_identifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER, newType_identifier, newType_identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conformant_array_schema getConformant_array_schema()
  {
    return conformant_array_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConformant_array_schema(conformant_array_schema newConformant_array_schema, NotificationChain msgs)
  {
    conformant_array_schema oldConformant_array_schema = conformant_array_schema;
    conformant_array_schema = newConformant_array_schema;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA, oldConformant_array_schema, newConformant_array_schema);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConformant_array_schema(conformant_array_schema newConformant_array_schema)
  {
    if (newConformant_array_schema != conformant_array_schema)
    {
      NotificationChain msgs = null;
      if (conformant_array_schema != null)
        msgs = ((InternalEObject)conformant_array_schema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA, null, msgs);
      if (newConformant_array_schema != null)
        msgs = ((InternalEObject)newConformant_array_schema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA, null, msgs);
      msgs = basicSetConformant_array_schema(newConformant_array_schema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA, newConformant_array_schema, newConformant_array_schema));
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        return ((InternalEList<?>)getBound_specification()).basicRemove(otherEnd, msgs);
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
        return basicSetType_identifier(null, msgs);
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
        return basicSetConformant_array_schema(null, msgs);
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        return getBound_specification();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
        return getType_identifier();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
        return getConformant_array_schema();
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        getBound_specification().clear();
        getBound_specification().addAll((Collection<? extends bound_specification>)newValue);
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
        setType_identifier((type_identifier)newValue);
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
        setConformant_array_schema((conformant_array_schema)newValue);
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        getBound_specification().clear();
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
        setType_identifier((type_identifier)null);
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
        setConformant_array_schema((conformant_array_schema)null);
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        return bound_specification != null && !bound_specification.isEmpty();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE_IDENTIFIER:
        return type_identifier != null;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
        return conformant_array_schema != null;
    }
    return super.eIsSet(featureID);
  }

} //unpacked_conformant_array_schemaImpl
