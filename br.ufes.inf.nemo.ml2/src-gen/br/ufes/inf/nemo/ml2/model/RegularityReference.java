/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regularity Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.RegularityReference#getRegulates <em>Regulates</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getRegularityReference()
 * @model
 * @generated
 */
public interface RegularityReference extends Reference, RegularityFeature
{
  /**
   * Returns the value of the '<em><b>Regulates</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regulates</em>' reference.
   * @see #setRegulates(Reference)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getRegularityReference_Regulates()
   * @model
   * @generated
   */
  Reference getRegulates();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.RegularityReference#getRegulates <em>Regulates</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regulates</em>' reference.
   * @see #getRegulates()
   * @generated
   */
  void setRegulates(Reference value);

} // RegularityReference
