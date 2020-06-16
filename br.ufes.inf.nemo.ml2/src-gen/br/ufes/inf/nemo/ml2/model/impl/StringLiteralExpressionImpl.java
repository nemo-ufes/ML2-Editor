/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.StringLiteralExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.StringLiteralExpressionImpl#getStringSymbol <em>String Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringLiteralExpressionImpl extends PrimitiveLiteralExpressionImpl implements StringLiteralExpression
{
  /**
   * The default value of the '{@link #getStringSymbol() <em>String Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringSymbol()
   * @generated
   * @ordered
   */
  protected static final String STRING_SYMBOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringSymbol() <em>String Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringSymbol()
   * @generated
   * @ordered
   */
  protected String stringSymbol = STRING_SYMBOL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringLiteralExpressionImpl()
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
    return ModelPackage.Literals.STRING_LITERAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStringSymbol()
  {
    return stringSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStringSymbol(String newStringSymbol)
  {
    String oldStringSymbol = stringSymbol;
    stringSymbol = newStringSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STRING_LITERAL_EXPRESSION__STRING_SYMBOL, oldStringSymbol, stringSymbol));
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
      case ModelPackage.STRING_LITERAL_EXPRESSION__STRING_SYMBOL:
        return getStringSymbol();
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
      case ModelPackage.STRING_LITERAL_EXPRESSION__STRING_SYMBOL:
        setStringSymbol((String)newValue);
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
      case ModelPackage.STRING_LITERAL_EXPRESSION__STRING_SYMBOL:
        setStringSymbol(STRING_SYMBOL_EDEFAULT);
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
      case ModelPackage.STRING_LITERAL_EXPRESSION__STRING_SYMBOL:
        return STRING_SYMBOL_EDEFAULT == null ? stringSymbol != null : !STRING_SYMBOL_EDEFAULT.equals(stringSymbol);
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
    result.append(" (stringSymbol: ");
    result.append(stringSymbol);
    result.append(')');
    return result.toString();
  }

} //StringLiteralExpressionImpl
