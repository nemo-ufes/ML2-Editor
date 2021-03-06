/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.BooleanLiteralExpression#isBooleanSymbol <em>Boolean Symbol</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getBooleanLiteralExpression()
 * @model
 * @generated
 */
public interface BooleanLiteralExpression extends PrimitiveLiteralExpression
{
  /**
   * Returns the value of the '<em><b>Boolean Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Symbol</em>' attribute.
   * @see #setBooleanSymbol(boolean)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getBooleanLiteralExpression_BooleanSymbol()
   * @model
   * @generated
   */
  boolean isBooleanSymbol();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.BooleanLiteralExpression#isBooleanSymbol <em>Boolean Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Symbol</em>' attribute.
   * @see #isBooleanSymbol()
   * @generated
   */
  void setBooleanSymbol(boolean value);

} // BooleanLiteralExpression
