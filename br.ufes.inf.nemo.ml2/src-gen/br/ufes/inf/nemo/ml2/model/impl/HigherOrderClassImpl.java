/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.CategorizationType;
import br.ufes.inf.nemo.ml2.model.HigherOrderClass;
import br.ufes.inf.nemo.ml2.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Higher Order Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.HigherOrderClassImpl#getSubordinators <em>Subordinators</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.HigherOrderClassImpl#getCategorizationType <em>Categorization Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.HigherOrderClassImpl#getCategorizedClass <em>Categorized Class</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.HigherOrderClassImpl#getPowertypeOf <em>Powertype Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HigherOrderClassImpl extends ClassImpl implements HigherOrderClass
{
  /**
   * The cached value of the '{@link #getSubordinators() <em>Subordinators</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubordinators()
   * @generated
   * @ordered
   */
  protected EList<HigherOrderClass> subordinators;

  /**
   * The default value of the '{@link #getCategorizationType() <em>Categorization Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategorizationType()
   * @generated
   * @ordered
   */
  protected static final CategorizationType CATEGORIZATION_TYPE_EDEFAULT = CategorizationType.CATEGORIZER;

  /**
   * The cached value of the '{@link #getCategorizationType() <em>Categorization Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategorizationType()
   * @generated
   * @ordered
   */
  protected CategorizationType categorizationType = CATEGORIZATION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCategorizedClass() <em>Categorized Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategorizedClass()
   * @generated
   * @ordered
   */
  protected br.ufes.inf.nemo.ml2.model.Class categorizedClass;

  /**
   * The cached value of the '{@link #getPowertypeOf() <em>Powertype Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPowertypeOf()
   * @generated
   * @ordered
   */
  protected br.ufes.inf.nemo.ml2.model.Class powertypeOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HigherOrderClassImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelPackage.Literals.HIGHER_ORDER_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<HigherOrderClass> getSubordinators()
  {
    if (subordinators == null)
    {
      subordinators = new EObjectResolvingEList<HigherOrderClass>(HigherOrderClass.class, this, ModelPackage.HIGHER_ORDER_CLASS__SUBORDINATORS);
    }
    return subordinators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CategorizationType getCategorizationType()
  {
    return categorizationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCategorizationType(CategorizationType newCategorizationType)
  {
    CategorizationType oldCategorizationType = categorizationType;
    categorizationType = newCategorizationType == null ? CATEGORIZATION_TYPE_EDEFAULT : newCategorizationType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZATION_TYPE, oldCategorizationType, categorizationType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public br.ufes.inf.nemo.ml2.model.Class getCategorizedClass()
  {
    if (categorizedClass != null && categorizedClass.eIsProxy())
    {
      InternalEObject oldCategorizedClass = (InternalEObject)categorizedClass;
      categorizedClass = (br.ufes.inf.nemo.ml2.model.Class)eResolveProxy(oldCategorizedClass);
      if (categorizedClass != oldCategorizedClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZED_CLASS, oldCategorizedClass, categorizedClass));
      }
    }
    return categorizedClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public br.ufes.inf.nemo.ml2.model.Class basicGetCategorizedClass()
  {
    return categorizedClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCategorizedClass(br.ufes.inf.nemo.ml2.model.Class newCategorizedClass)
  {
    br.ufes.inf.nemo.ml2.model.Class oldCategorizedClass = categorizedClass;
    categorizedClass = newCategorizedClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZED_CLASS, oldCategorizedClass, categorizedClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public br.ufes.inf.nemo.ml2.model.Class getPowertypeOf()
  {
    if (powertypeOf != null && powertypeOf.eIsProxy())
    {
      InternalEObject oldPowertypeOf = (InternalEObject)powertypeOf;
      powertypeOf = (br.ufes.inf.nemo.ml2.model.Class)eResolveProxy(oldPowertypeOf);
      if (powertypeOf != oldPowertypeOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.HIGHER_ORDER_CLASS__POWERTYPE_OF, oldPowertypeOf, powertypeOf));
      }
    }
    return powertypeOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public br.ufes.inf.nemo.ml2.model.Class basicGetPowertypeOf()
  {
    return powertypeOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPowertypeOf(br.ufes.inf.nemo.ml2.model.Class newPowertypeOf)
  {
    br.ufes.inf.nemo.ml2.model.Class oldPowertypeOf = powertypeOf;
    powertypeOf = newPowertypeOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HIGHER_ORDER_CLASS__POWERTYPE_OF, oldPowertypeOf, powertypeOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelPackage.HIGHER_ORDER_CLASS__SUBORDINATORS:
        return getSubordinators();
      case ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZATION_TYPE:
        return getCategorizationType();
      case ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZED_CLASS:
        if (resolve) return getCategorizedClass();
        return basicGetCategorizedClass();
      case ModelPackage.HIGHER_ORDER_CLASS__POWERTYPE_OF:
        if (resolve) return getPowertypeOf();
        return basicGetPowertypeOf();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.HIGHER_ORDER_CLASS__SUBORDINATORS:
        getSubordinators().clear();
        getSubordinators().addAll((Collection<? extends HigherOrderClass>)newValue);
        return;
      case ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZATION_TYPE:
        setCategorizationType((CategorizationType)newValue);
        return;
      case ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZED_CLASS:
        setCategorizedClass((br.ufes.inf.nemo.ml2.model.Class)newValue);
        return;
      case ModelPackage.HIGHER_ORDER_CLASS__POWERTYPE_OF:
        setPowertypeOf((br.ufes.inf.nemo.ml2.model.Class)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.HIGHER_ORDER_CLASS__SUBORDINATORS:
        getSubordinators().clear();
        return;
      case ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZATION_TYPE:
        setCategorizationType(CATEGORIZATION_TYPE_EDEFAULT);
        return;
      case ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZED_CLASS:
        setCategorizedClass((br.ufes.inf.nemo.ml2.model.Class)null);
        return;
      case ModelPackage.HIGHER_ORDER_CLASS__POWERTYPE_OF:
        setPowertypeOf((br.ufes.inf.nemo.ml2.model.Class)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.HIGHER_ORDER_CLASS__SUBORDINATORS:
        return subordinators != null && !subordinators.isEmpty();
      case ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZATION_TYPE:
        return categorizationType != CATEGORIZATION_TYPE_EDEFAULT;
      case ModelPackage.HIGHER_ORDER_CLASS__CATEGORIZED_CLASS:
        return categorizedClass != null;
      case ModelPackage.HIGHER_ORDER_CLASS__POWERTYPE_OF:
        return powertypeOf != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (categorizationType: ");
    result.append(categorizationType);
    result.append(')');
    return result.toString();
  }

} //HigherOrderClassImpl
