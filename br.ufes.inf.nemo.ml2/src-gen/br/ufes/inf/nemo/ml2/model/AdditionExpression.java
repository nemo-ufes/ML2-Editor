/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.AdditionExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.AdditionExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getAdditionExpression()
 * @model
 * @generated
 */
public interface AdditionExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(MultiplicationExpression)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getAdditionExpression_Left()
   * @model containment="true"
   * @generated
   */
  MultiplicationExpression getLeft();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.AdditionExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(MultiplicationExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.AdditionOperation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getAdditionExpression_Right()
   * @model containment="true"
   * @generated
   */
  EList<AdditionOperation> getRight();

} // AdditionExpression
