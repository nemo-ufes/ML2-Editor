/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.RegularityAttribute;
import br.ufes.inf.nemo.ml2.model.RegularityFeature;
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regularity Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.RegularityAttributeImpl#getRegularityType <em>Regularity Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.RegularityAttributeImpl#getRegulates <em>Regulates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegularityAttributeImpl extends AttributeImpl implements RegularityAttribute
{
  /**
   * The default value of the '{@link #getRegularityType() <em>Regularity Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegularityType()
   * @generated
   * @ordered
   */
  protected static final RegularityFeatureType REGULARITY_TYPE_EDEFAULT = RegularityFeatureType.DETERMINES_MAX_VALUE;

  /**
   * The cached value of the '{@link #getRegularityType() <em>Regularity Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegularityType()
   * @generated
   * @ordered
   */
  protected RegularityFeatureType regularityType = REGULARITY_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRegulates() <em>Regulates</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegulates()
   * @generated
   * @ordered
   */
  protected Attribute regulates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegularityAttributeImpl()
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
    return ModelPackage.Literals.REGULARITY_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RegularityFeatureType getRegularityType()
  {
    return regularityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRegularityType(RegularityFeatureType newRegularityType)
  {
    RegularityFeatureType oldRegularityType = regularityType;
    regularityType = newRegularityType == null ? REGULARITY_TYPE_EDEFAULT : newRegularityType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULARITY_ATTRIBUTE__REGULARITY_TYPE, oldRegularityType, regularityType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getRegulates()
  {
    if (regulates != null && regulates.eIsProxy())
    {
      InternalEObject oldRegulates = (InternalEObject)regulates;
      regulates = (Attribute)eResolveProxy(oldRegulates);
      if (regulates != oldRegulates)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.REGULARITY_ATTRIBUTE__REGULATES, oldRegulates, regulates));
      }
    }
    return regulates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetRegulates()
  {
    return regulates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRegulates(Attribute newRegulates)
  {
    Attribute oldRegulates = regulates;
    regulates = newRegulates;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULARITY_ATTRIBUTE__REGULATES, oldRegulates, regulates));
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
      case ModelPackage.REGULARITY_ATTRIBUTE__REGULARITY_TYPE:
        return getRegularityType();
      case ModelPackage.REGULARITY_ATTRIBUTE__REGULATES:
        if (resolve) return getRegulates();
        return basicGetRegulates();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.REGULARITY_ATTRIBUTE__REGULARITY_TYPE:
        setRegularityType((RegularityFeatureType)newValue);
        return;
      case ModelPackage.REGULARITY_ATTRIBUTE__REGULATES:
        setRegulates((Attribute)newValue);
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
      case ModelPackage.REGULARITY_ATTRIBUTE__REGULARITY_TYPE:
        setRegularityType(REGULARITY_TYPE_EDEFAULT);
        return;
      case ModelPackage.REGULARITY_ATTRIBUTE__REGULATES:
        setRegulates((Attribute)null);
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
      case ModelPackage.REGULARITY_ATTRIBUTE__REGULARITY_TYPE:
        return regularityType != REGULARITY_TYPE_EDEFAULT;
      case ModelPackage.REGULARITY_ATTRIBUTE__REGULATES:
        return regulates != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == RegularityFeature.class)
    {
      switch (derivedFeatureID)
      {
        case ModelPackage.REGULARITY_ATTRIBUTE__REGULARITY_TYPE: return ModelPackage.REGULARITY_FEATURE__REGULARITY_TYPE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == RegularityFeature.class)
    {
      switch (baseFeatureID)
      {
        case ModelPackage.REGULARITY_FEATURE__REGULARITY_TYPE: return ModelPackage.REGULARITY_ATTRIBUTE__REGULARITY_TYPE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (regularityType: ");
    result.append(regularityType);
    result.append(')');
    return result.toString();
  }

} //RegularityAttributeImpl
