/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.OclExpression;
import br.ufes.inf.nemo.ml2.model.UnaryIteration;
import br.ufes.inf.nemo.ml2.model.UnaryIterator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Iteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.UnaryIterationImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.UnaryIterationImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.UnaryIterationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryIterationImpl extends BuiltInOperationImpl implements UnaryIteration
{
  /**
   * The default value of the '{@link #getIterator() <em>Iterator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterator()
   * @generated
   * @ordered
   */
  protected static final UnaryIterator ITERATOR_EDEFAULT = UnaryIterator.COUNT;

  /**
   * The cached value of the '{@link #getIterator() <em>Iterator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterator()
   * @generated
   * @ordered
   */
  protected UnaryIterator iterator = ITERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<String> variables;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected OclExpression body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryIterationImpl()
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
    return ModelPackage.Literals.UNARY_ITERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryIterator getIterator()
  {
    return iterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIterator(UnaryIterator newIterator)
  {
    UnaryIterator oldIterator = iterator;
    iterator = newIterator == null ? ITERATOR_EDEFAULT : newIterator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UNARY_ITERATION__ITERATOR, oldIterator, iterator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getVariables()
  {
    if (variables == null)
    {
      variables = new EDataTypeEList<String>(String.class, this, ModelPackage.UNARY_ITERATION__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OclExpression getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(OclExpression newBody, NotificationChain msgs)
  {
    OclExpression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.UNARY_ITERATION__BODY, oldBody, newBody);
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
  public void setBody(OclExpression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.UNARY_ITERATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.UNARY_ITERATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UNARY_ITERATION__BODY, newBody, newBody));
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
      case ModelPackage.UNARY_ITERATION__BODY:
        return basicSetBody(null, msgs);
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
      case ModelPackage.UNARY_ITERATION__ITERATOR:
        return getIterator();
      case ModelPackage.UNARY_ITERATION__VARIABLES:
        return getVariables();
      case ModelPackage.UNARY_ITERATION__BODY:
        return getBody();
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
      case ModelPackage.UNARY_ITERATION__ITERATOR:
        setIterator((UnaryIterator)newValue);
        return;
      case ModelPackage.UNARY_ITERATION__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends String>)newValue);
        return;
      case ModelPackage.UNARY_ITERATION__BODY:
        setBody((OclExpression)newValue);
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
      case ModelPackage.UNARY_ITERATION__ITERATOR:
        setIterator(ITERATOR_EDEFAULT);
        return;
      case ModelPackage.UNARY_ITERATION__VARIABLES:
        getVariables().clear();
        return;
      case ModelPackage.UNARY_ITERATION__BODY:
        setBody((OclExpression)null);
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
      case ModelPackage.UNARY_ITERATION__ITERATOR:
        return iterator != ITERATOR_EDEFAULT;
      case ModelPackage.UNARY_ITERATION__VARIABLES:
        return variables != null && !variables.isEmpty();
      case ModelPackage.UNARY_ITERATION__BODY:
        return body != null;
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
    result.append(" (iterator: ");
    result.append(iterator);
    result.append(", variables: ");
    result.append(variables);
    result.append(')');
    return result.toString();
  }

} //UnaryIterationImpl
