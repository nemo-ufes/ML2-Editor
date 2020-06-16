/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.VariableDeclaration#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.VariableDeclaration#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.VariableDeclaration#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Name</em>' attribute.
   * @see #setVariableName(String)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getVariableDeclaration_VariableName()
   * @model
   * @generated
   */
  String getVariableName();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.VariableDeclaration#getVariableName <em>Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Name</em>' attribute.
   * @see #getVariableName()
   * @generated
   */
  void setVariableName(String value);

  /**
   * Returns the value of the '<em><b>Variable Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Type</em>' containment reference.
   * @see #setVariableType(TypeLiteralExpression)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getVariableDeclaration_VariableType()
   * @model containment="true"
   * @generated
   */
  TypeLiteralExpression getVariableType();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.VariableDeclaration#getVariableType <em>Variable Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Type</em>' containment reference.
   * @see #getVariableType()
   * @generated
   */
  void setVariableType(TypeLiteralExpression value);

  /**
   * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Value</em>' containment reference.
   * @see #setInitialValue(LiteralExpression)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getVariableDeclaration_InitialValue()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getInitialValue();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.VariableDeclaration#getInitialValue <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Value</em>' containment reference.
   * @see #getInitialValue()
   * @generated
   */
  void setInitialValue(LiteralExpression value);

} // VariableDeclaration
