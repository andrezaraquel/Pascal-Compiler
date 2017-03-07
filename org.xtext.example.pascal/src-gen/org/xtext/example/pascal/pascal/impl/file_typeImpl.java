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
import org.xtext.example.pascal.pascal.file_component_type;
import org.xtext.example.pascal.pascal.file_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>file type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.file_typeImpl#getFile_component_type <em>File component type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class file_typeImpl extends MinimalEObjectImpl.Container implements file_type
{
  /**
   * The cached value of the '{@link #getFile_component_type() <em>File component type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile_component_type()
   * @generated
   * @ordered
   */
  protected file_component_type file_component_type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected file_typeImpl()
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
    return PascalPackage.Literals.FILE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public file_component_type getFile_component_type()
  {
    return file_component_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFile_component_type(file_component_type newFile_component_type, NotificationChain msgs)
  {
    file_component_type oldFile_component_type = file_component_type;
    file_component_type = newFile_component_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FILE_TYPE__FILE_COMPONENT_TYPE, oldFile_component_type, newFile_component_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFile_component_type(file_component_type newFile_component_type)
  {
    if (newFile_component_type != file_component_type)
    {
      NotificationChain msgs = null;
      if (file_component_type != null)
        msgs = ((InternalEObject)file_component_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FILE_TYPE__FILE_COMPONENT_TYPE, null, msgs);
      if (newFile_component_type != null)
        msgs = ((InternalEObject)newFile_component_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FILE_TYPE__FILE_COMPONENT_TYPE, null, msgs);
      msgs = basicSetFile_component_type(newFile_component_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FILE_TYPE__FILE_COMPONENT_TYPE, newFile_component_type, newFile_component_type));
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
      case PascalPackage.FILE_TYPE__FILE_COMPONENT_TYPE:
        return basicSetFile_component_type(null, msgs);
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
      case PascalPackage.FILE_TYPE__FILE_COMPONENT_TYPE:
        return getFile_component_type();
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
      case PascalPackage.FILE_TYPE__FILE_COMPONENT_TYPE:
        setFile_component_type((file_component_type)newValue);
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
      case PascalPackage.FILE_TYPE__FILE_COMPONENT_TYPE:
        setFile_component_type((file_component_type)null);
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
      case PascalPackage.FILE_TYPE__FILE_COMPONENT_TYPE:
        return file_component_type != null;
    }
    return super.eIsSet(featureID);
  }

} //file_typeImpl
