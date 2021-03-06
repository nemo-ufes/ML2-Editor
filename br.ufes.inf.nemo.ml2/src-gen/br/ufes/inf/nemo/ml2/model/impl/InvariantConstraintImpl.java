/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.InvariantConstraint;
import br.ufes.inf.nemo.ml2.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.InvariantConstraintImpl#getInvariantAlias <em>Invariant Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvariantConstraintImpl extends ConstraintImpl implements InvariantConstraint
{
  /**
   * The default value of the '{@link #getInvariantAlias() <em>Invariant Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariantAlias()
   * @generated
   * @ordered
   */
  protected static final String INVARIANT_ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInvariantAlias() <em>Invariant Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariantAlias()
   * @generated
   * @ordered
   */
  protected String invariantAlias = INVARIANT_ALIAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvariantConstraintImpl()
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
    return ModelPackage.Literals.INVARIANT_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInvariantAlias()
  {
    return invariantAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInvariantAlias(String newInvariantAlias)
  {
    String oldInvariantAlias = invariantAlias;
    invariantAlias = newInvariantAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INVARIANT_CONSTRAINT__INVARIANT_ALIAS, oldInvariantAlias, invariantAlias));
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
      case ModelPackage.INVARIANT_CONSTRAINT__INVARIANT_ALIAS:
        return getInvariantAlias();
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
      case ModelPackage.INVARIANT_CONSTRAINT__INVARIANT_ALIAS:
        setInvariantAlias((String)newValue);
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
      case ModelPackage.INVARIANT_CONSTRAINT__INVARIANT_ALIAS:
        setInvariantAlias(INVARIANT_ALIAS_EDEFAULT);
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
      case ModelPackage.INVARIANT_CONSTRAINT__INVARIANT_ALIAS:
        return INVARIANT_ALIAS_EDEFAULT == null ? invariantAlias != null : !INVARIANT_ALIAS_EDEFAULT.equals(invariantAlias);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (invariantAlias: ");
    result.append(invariantAlias);
    result.append(')');
    return result.toString();
  }

} //InvariantConstraintImpl
