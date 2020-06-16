/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.CollectionTypeName#getTypename <em>Typename</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.CollectionTypeName#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getCollectionTypeName()
 * @model
 * @generated
 */
public interface CollectionTypeName extends TypeLiteralExpression
{
  /**
   * Returns the value of the '<em><b>Typename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' attribute.
   * @see #setTypename(String)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getCollectionTypeName_Typename()
   * @model
   * @generated
   */
  String getTypename();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.CollectionTypeName#getTypename <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' attribute.
   * @see #getTypename()
   * @generated
   */
  void setTypename(String value);

  /**
   * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' containment reference.
   * @see #setElementType(TypeLiteralExpression)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getCollectionTypeName_ElementType()
   * @model containment="true"
   * @generated
   */
  TypeLiteralExpression getElementType();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.CollectionTypeName#getElementType <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' containment reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(TypeLiteralExpression value);

} // CollectionTypeName
