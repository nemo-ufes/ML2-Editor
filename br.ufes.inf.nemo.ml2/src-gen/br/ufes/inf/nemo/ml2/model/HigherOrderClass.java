/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Higher Order Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.HigherOrderClass#getSubordinators <em>Subordinators</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.HigherOrderClass#getCategorizationType <em>Categorization Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.HigherOrderClass#getCategorizedClass <em>Categorized Class</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.HigherOrderClass#getPowertypeOf <em>Powertype Of</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getHigherOrderClass()
 * @model
 * @generated
 */
public interface HigherOrderClass extends br.ufes.inf.nemo.ml2.model.Class
{
  /**
   * Returns the value of the '<em><b>Subordinators</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.HigherOrderClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subordinators</em>' reference list.
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getHigherOrderClass_Subordinators()
   * @model
   * @generated
   */
  EList<HigherOrderClass> getSubordinators();

  /**
   * Returns the value of the '<em><b>Categorization Type</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufes.inf.nemo.ml2.model.CategorizationType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Categorization Type</em>' attribute.
   * @see br.ufes.inf.nemo.ml2.model.CategorizationType
   * @see #setCategorizationType(CategorizationType)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getHigherOrderClass_CategorizationType()
   * @model
   * @generated
   */
  CategorizationType getCategorizationType();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.HigherOrderClass#getCategorizationType <em>Categorization Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Categorization Type</em>' attribute.
   * @see br.ufes.inf.nemo.ml2.model.CategorizationType
   * @see #getCategorizationType()
   * @generated
   */
  void setCategorizationType(CategorizationType value);

  /**
   * Returns the value of the '<em><b>Categorized Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Categorized Class</em>' reference.
   * @see #setCategorizedClass(br.ufes.inf.nemo.ml2.model.Class)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getHigherOrderClass_CategorizedClass()
   * @model
   * @generated
   */
  br.ufes.inf.nemo.ml2.model.Class getCategorizedClass();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.HigherOrderClass#getCategorizedClass <em>Categorized Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Categorized Class</em>' reference.
   * @see #getCategorizedClass()
   * @generated
   */
  void setCategorizedClass(br.ufes.inf.nemo.ml2.model.Class value);

  /**
   * Returns the value of the '<em><b>Powertype Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Powertype Of</em>' reference.
   * @see #setPowertypeOf(br.ufes.inf.nemo.ml2.model.Class)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getHigherOrderClass_PowertypeOf()
   * @model
   * @generated
   */
  br.ufes.inf.nemo.ml2.model.Class getPowertypeOf();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.HigherOrderClass#getPowertypeOf <em>Powertype Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Powertype Of</em>' reference.
   * @see #getPowertypeOf()
   * @generated
   */
  void setPowertypeOf(br.ufes.inf.nemo.ml2.model.Class value);

} // HigherOrderClass
