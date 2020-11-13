/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.UserDefinedTypeLiteral#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getUserDefinedTypeLiteral()
 * @model
 * @generated
 */
public interface UserDefinedTypeLiteral extends TypeLiteralExpression
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' reference.
   * @see #setTypeName(br.ufes.inf.nemo.ml2.model.Class)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getUserDefinedTypeLiteral_TypeName()
   * @model
   * @generated
   */
  br.ufes.inf.nemo.ml2.model.Class getTypeName();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.UserDefinedTypeLiteral#getTypeName <em>Type Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(br.ufes.inf.nemo.ml2.model.Class value);

} // UserDefinedTypeLiteral