/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binary Set Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getBinarySetOperator()
 * @model
 * @generated
 */
public enum BinarySetOperator implements Enumerator
{
  /**
   * The '<em><b>INCLUDES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INCLUDES_VALUE
   * @generated
   * @ordered
   */
  INCLUDES(0, "INCLUDES", "includes"),

  /**
   * The '<em><b>INCLUDES ALL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INCLUDES_ALL_VALUE
   * @generated
   * @ordered
   */
  INCLUDES_ALL(1, "INCLUDES_ALL", "includesAll"),

  /**
   * The '<em><b>EXCLUDES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXCLUDES_VALUE
   * @generated
   * @ordered
   */
  EXCLUDES(2, "EXCLUDES", "excludes"),

  /**
   * The '<em><b>EXCLUDES ALL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXCLUDES_ALL_VALUE
   * @generated
   * @ordered
   */
  EXCLUDES_ALL(3, "EXCLUDES_ALL", "excludesAll"),

  /**
   * The '<em><b>INCLUDING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INCLUDING_VALUE
   * @generated
   * @ordered
   */
  INCLUDING(4, "INCLUDING", "including"),

  /**
   * The '<em><b>EXCLUDING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXCLUDING_VALUE
   * @generated
   * @ordered
   */
  EXCLUDING(5, "EXCLUDING", "excluding"),

  /**
   * The '<em><b>UNION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNION_VALUE
   * @generated
   * @ordered
   */
  UNION(6, "UNION", "union"),

  /**
   * The '<em><b>INTERSECTION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERSECTION_VALUE
   * @generated
   * @ordered
   */
  INTERSECTION(7, "INTERSECTION", "intersection"),

  /**
   * The '<em><b>SYMMETRIC DIFFERENCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYMMETRIC_DIFFERENCE_VALUE
   * @generated
   * @ordered
   */
  SYMMETRIC_DIFFERENCE(8, "SYMMETRIC_DIFFERENCE", "symmetricDifference");

  /**
   * The '<em><b>INCLUDES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INCLUDES
   * @model literal="includes"
   * @generated
   * @ordered
   */
  public static final int INCLUDES_VALUE = 0;

  /**
   * The '<em><b>INCLUDES ALL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INCLUDES_ALL
   * @model literal="includesAll"
   * @generated
   * @ordered
   */
  public static final int INCLUDES_ALL_VALUE = 1;

  /**
   * The '<em><b>EXCLUDES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXCLUDES
   * @model literal="excludes"
   * @generated
   * @ordered
   */
  public static final int EXCLUDES_VALUE = 2;

  /**
   * The '<em><b>EXCLUDES ALL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXCLUDES_ALL
   * @model literal="excludesAll"
   * @generated
   * @ordered
   */
  public static final int EXCLUDES_ALL_VALUE = 3;

  /**
   * The '<em><b>INCLUDING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INCLUDING
   * @model literal="including"
   * @generated
   * @ordered
   */
  public static final int INCLUDING_VALUE = 4;

  /**
   * The '<em><b>EXCLUDING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXCLUDING
   * @model literal="excluding"
   * @generated
   * @ordered
   */
  public static final int EXCLUDING_VALUE = 5;

  /**
   * The '<em><b>UNION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNION
   * @model literal="union"
   * @generated
   * @ordered
   */
  public static final int UNION_VALUE = 6;

  /**
   * The '<em><b>INTERSECTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERSECTION
   * @model literal="intersection"
   * @generated
   * @ordered
   */
  public static final int INTERSECTION_VALUE = 7;

  /**
   * The '<em><b>SYMMETRIC DIFFERENCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYMMETRIC_DIFFERENCE
   * @model literal="symmetricDifference"
   * @generated
   * @ordered
   */
  public static final int SYMMETRIC_DIFFERENCE_VALUE = 8;

  /**
   * An array of all the '<em><b>Binary Set Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BinarySetOperator[] VALUES_ARRAY =
    new BinarySetOperator[]
    {
      INCLUDES,
      INCLUDES_ALL,
      EXCLUDES,
      EXCLUDES_ALL,
      INCLUDING,
      EXCLUDING,
      UNION,
      INTERSECTION,
      SYMMETRIC_DIFFERENCE,
    };

  /**
   * A public read-only list of all the '<em><b>Binary Set Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BinarySetOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Binary Set Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BinarySetOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BinarySetOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Binary Set Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BinarySetOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BinarySetOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Binary Set Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BinarySetOperator get(int value)
  {
    switch (value)
    {
      case INCLUDES_VALUE: return INCLUDES;
      case INCLUDES_ALL_VALUE: return INCLUDES_ALL;
      case EXCLUDES_VALUE: return EXCLUDES;
      case EXCLUDES_ALL_VALUE: return EXCLUDES_ALL;
      case INCLUDING_VALUE: return INCLUDING;
      case EXCLUDING_VALUE: return EXCLUDING;
      case UNION_VALUE: return UNION;
      case INTERSECTION_VALUE: return INTERSECTION;
      case SYMMETRIC_DIFFERENCE_VALUE: return SYMMETRIC_DIFFERENCE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private BinarySetOperator(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //BinarySetOperator
