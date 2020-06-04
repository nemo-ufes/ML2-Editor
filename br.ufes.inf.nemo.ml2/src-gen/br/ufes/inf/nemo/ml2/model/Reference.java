/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.Reference#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.Reference#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.Reference#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.Reference#get_type <em>type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.Reference#getSubsetOf <em>Subset Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.Reference#getOppositeTo <em>Opposite To</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Feature
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReference_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.Reference#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReference_LowerBound()
   * @model
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.Reference#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(int)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReference_UpperBound()
   * @model
   * @generated
   */
  int getUpperBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.Reference#getUpperBound <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(int value);

  /**
   * Returns the value of the '<em><b>type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>type</em>' reference.
   * @see #set_type(br.ufes.inf.nemo.ml2.model.Class)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReference__type()
   * @model
   * @generated
   */
  br.ufes.inf.nemo.ml2.model.Class get_type();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.Reference#get_type <em>type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>type</em>' reference.
   * @see #get_type()
   * @generated
   */
  void set_type(br.ufes.inf.nemo.ml2.model.Class value);

  /**
   * Returns the value of the '<em><b>Subset Of</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.Reference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subset Of</em>' reference list.
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReference_SubsetOf()
   * @model
   * @generated
   */
  EList<Reference> getSubsetOf();

  /**
   * Returns the value of the '<em><b>Opposite To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite To</em>' reference.
   * @see #setOppositeTo(Reference)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReference_OppositeTo()
   * @model
   * @generated
   */
  Reference getOppositeTo();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.Reference#getOppositeTo <em>Opposite To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite To</em>' reference.
   * @see #getOppositeTo()
   * @generated
   */
  void setOppositeTo(Reference value);

} // Reference
