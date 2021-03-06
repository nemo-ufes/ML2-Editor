/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.LetExpression;
import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.OclExpression;
import br.ufes.inf.nemo.ml2.model.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Let Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.LetExpressionImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.LetExpressionImpl#getInExpression <em>In Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LetExpressionImpl extends OclExpressionImpl implements LetExpression
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> variables;

  /**
   * The cached value of the '{@link #getInExpression() <em>In Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInExpression()
   * @generated
   * @ordered
   */
  protected OclExpression inExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LetExpressionImpl()
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
    return ModelPackage.Literals.LET_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VariableDeclaration> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, ModelPackage.LET_EXPRESSION__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OclExpression getInExpression()
  {
    return inExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInExpression(OclExpression newInExpression, NotificationChain msgs)
  {
    OclExpression oldInExpression = inExpression;
    inExpression = newInExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.LET_EXPRESSION__IN_EXPRESSION, oldInExpression, newInExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInExpression(OclExpression newInExpression)
  {
    if (newInExpression != inExpression)
    {
      NotificationChain msgs = null;
      if (inExpression != null)
        msgs = ((InternalEObject)inExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LET_EXPRESSION__IN_EXPRESSION, null, msgs);
      if (newInExpression != null)
        msgs = ((InternalEObject)newInExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LET_EXPRESSION__IN_EXPRESSION, null, msgs);
      msgs = basicSetInExpression(newInExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LET_EXPRESSION__IN_EXPRESSION, newInExpression, newInExpression));
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
      case ModelPackage.LET_EXPRESSION__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case ModelPackage.LET_EXPRESSION__IN_EXPRESSION:
        return basicSetInExpression(null, msgs);
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
      case ModelPackage.LET_EXPRESSION__VARIABLES:
        return getVariables();
      case ModelPackage.LET_EXPRESSION__IN_EXPRESSION:
        return getInExpression();
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
      case ModelPackage.LET_EXPRESSION__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case ModelPackage.LET_EXPRESSION__IN_EXPRESSION:
        setInExpression((OclExpression)newValue);
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
      case ModelPackage.LET_EXPRESSION__VARIABLES:
        getVariables().clear();
        return;
      case ModelPackage.LET_EXPRESSION__IN_EXPRESSION:
        setInExpression((OclExpression)null);
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
      case ModelPackage.LET_EXPRESSION__VARIABLES:
        return variables != null && !variables.isEmpty();
      case ModelPackage.LET_EXPRESSION__IN_EXPRESSION:
        return inExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //LetExpressionImpl
