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
import org.xtext.example.pascal.pascal.block;
import org.xtext.example.pascal.pascal.program;
import org.xtext.example.pascal.pascal.program_heading;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.programImpl#getProgram_heading <em>Program heading</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.programImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class programImpl extends MinimalEObjectImpl.Container implements program
{
  /**
   * The cached value of the '{@link #getProgram_heading() <em>Program heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgram_heading()
   * @generated
   * @ordered
   */
  protected program_heading program_heading;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected block block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected programImpl()
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
    return PascalPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public program_heading getProgram_heading()
  {
    return program_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProgram_heading(program_heading newProgram_heading, NotificationChain msgs)
  {
    program_heading oldProgram_heading = program_heading;
    program_heading = newProgram_heading;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM__PROGRAM_HEADING, oldProgram_heading, newProgram_heading);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProgram_heading(program_heading newProgram_heading)
  {
    if (newProgram_heading != program_heading)
    {
      NotificationChain msgs = null;
      if (program_heading != null)
        msgs = ((InternalEObject)program_heading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM__PROGRAM_HEADING, null, msgs);
      if (newProgram_heading != null)
        msgs = ((InternalEObject)newProgram_heading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM__PROGRAM_HEADING, null, msgs);
      msgs = basicSetProgram_heading(newProgram_heading, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM__PROGRAM_HEADING, newProgram_heading, newProgram_heading));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(block newBlock, NotificationChain msgs)
  {
    block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROGRAM__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROGRAM__BLOCK, newBlock, newBlock));
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
      case PascalPackage.PROGRAM__PROGRAM_HEADING:
        return basicSetProgram_heading(null, msgs);
      case PascalPackage.PROGRAM__BLOCK:
        return basicSetBlock(null, msgs);
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
      case PascalPackage.PROGRAM__PROGRAM_HEADING:
        return getProgram_heading();
      case PascalPackage.PROGRAM__BLOCK:
        return getBlock();
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
      case PascalPackage.PROGRAM__PROGRAM_HEADING:
        setProgram_heading((program_heading)newValue);
        return;
      case PascalPackage.PROGRAM__BLOCK:
        setBlock((block)newValue);
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
      case PascalPackage.PROGRAM__PROGRAM_HEADING:
        setProgram_heading((program_heading)null);
        return;
      case PascalPackage.PROGRAM__BLOCK:
        setBlock((block)null);
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
      case PascalPackage.PROGRAM__PROGRAM_HEADING:
        return program_heading != null;
      case PascalPackage.PROGRAM__BLOCK:
        return block != null;
    }
    return super.eIsSet(featureID);
  }

} //programImpl
