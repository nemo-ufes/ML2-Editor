/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dot Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.DotOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getDotOperation()
 * @model
 * @generated
 */
public interface DotOperation extends CallOperation
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(VariableExpression)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getDotOperation_Right()
   * @model containment="true"
   * @generated
   */
  VariableExpression getRight();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.DotOperation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(VariableExpression value);

} // DotOperation
