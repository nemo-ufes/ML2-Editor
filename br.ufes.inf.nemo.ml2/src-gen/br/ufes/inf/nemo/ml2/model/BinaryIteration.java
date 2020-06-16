/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Iteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.BinaryIteration#getVariables <em>Variables</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.BinaryIteration#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getBinaryIteration()
 * @model
 * @generated
 */
public interface BinaryIteration extends BuiltInOperation
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' attribute list.
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getBinaryIteration_Variables()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariables();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(OclExpression)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getBinaryIteration_Body()
   * @model containment="true"
   * @generated
   */
  OclExpression getBody();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.BinaryIteration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(OclExpression value);

} // BinaryIteration
