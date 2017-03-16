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
import org.xtext.example.pascal.pascal.array_type;
import org.xtext.example.pascal.pascal.element_type;
import org.xtext.example.pascal.pascal.index_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>array type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.array_typeImpl#getIndex_type <em>Index type</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.array_typeImpl#getElement_type <em>Element type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class array_typeImpl extends MinimalEObjectImpl.Container implements array_type
{
  /**
   * The cached value of the '{@link #getIndex_type() <em>Index type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex_type()
   * @generated
   * @ordered
   */
  protected EList<index_type> index_type;

  /**
   * The cached value of the '{@link #getElement_type() <em>Element type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement_type()
   * @generated
   * @ordered
   */
  protected element_type element_type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected array_typeImpl()
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
    return PascalPackage.Literals.ARRAY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<index_type> getIndex_type()
  {
    if (index_type == null)
    {
      index_type = new EObjectContainmentEList<index_type>(index_type.class, this, PascalPackage.ARRAY_TYPE__INDEX_TYPE);
    }
    return index_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_type getElement_type()
  {
    return element_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement_type(element_type newElement_type, NotificationChain msgs)
  {
    element_type oldElement_type = element_type;
    element_type = newElement_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.ARRAY_TYPE__ELEMENT_TYPE, oldElement_type, newElement_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement_type(element_type newElement_type)
  {
    if (newElement_type != element_type)
    {
      NotificationChain msgs = null;
      if (element_type != null)
        msgs = ((InternalEObject)element_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ARRAY_TYPE__ELEMENT_TYPE, null, msgs);
      if (newElement_type != null)
        msgs = ((InternalEObject)newElement_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ARRAY_TYPE__ELEMENT_TYPE, null, msgs);
      msgs = basicSetElement_type(newElement_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ARRAY_TYPE__ELEMENT_TYPE, newElement_type, newElement_type));
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
      case PascalPackage.ARRAY_TYPE__INDEX_TYPE:
        return ((InternalEList<?>)getIndex_type()).basicRemove(otherEnd, msgs);
      case PascalPackage.ARRAY_TYPE__ELEMENT_TYPE:
        return basicSetElement_type(null, msgs);
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
      case PascalPackage.ARRAY_TYPE__INDEX_TYPE:
        return getIndex_type();
      case PascalPackage.ARRAY_TYPE__ELEMENT_TYPE:
        return getElement_type();
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
      case PascalPackage.ARRAY_TYPE__INDEX_TYPE:
        getIndex_type().clear();
        getIndex_type().addAll((Collection<? extends index_type>)newValue);
        return;
      case PascalPackage.ARRAY_TYPE__ELEMENT_TYPE:
        setElement_type((element_type)newValue);
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
      case PascalPackage.ARRAY_TYPE__INDEX_TYPE:
        getIndex_type().clear();
        return;
      case PascalPackage.ARRAY_TYPE__ELEMENT_TYPE:
        setElement_type((element_type)null);
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
      case PascalPackage.ARRAY_TYPE__INDEX_TYPE:
        return index_type != null && !index_type.isEmpty();
      case PascalPackage.ARRAY_TYPE__ELEMENT_TYPE:
        return element_type != null;
    }
    return super.eIsSet(featureID);
  }

} //array_typeImpl
