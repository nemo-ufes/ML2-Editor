package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.lib.ML2Lib;
import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import br.ufes.inf.nemo.ml2.validation.LinguisticRules;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ML2InjectorProvider.class)
@SuppressWarnings("all")
public class ML2LinguistcRulesTest {
  @Inject
  @Extension
  private ParseHelper<ML2Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private ML2Lib _mL2Lib;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void testIsNameValid() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t { class Abc; }");
      final ML2Model correctModel = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(correctModel);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t { class abc; }");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder_1);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModel, _mL2Class, LinguisticRules.INVALID_ENTITY_DECLARATION_NAME);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsValidSpecialization() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t{ class A specializes A; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t{ order 2 class A; class B specializes A; }");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" ");
      _builder_2.append("module t{ order 2 class A; orderless class B specializes A; }");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(" ");
      _builder_3.append("module t{ order 2 class A; order 3 class B specializes A; }");
      final ML2Model incorrectModelD = this._parseHelper.parse(_builder_3);
      EClass _mL2Class_3 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelD, _mL2Class_3, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("module t {");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("orderless class WA; order 2 class HA; class FA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("orderless class WB specializes WA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("order 2 class HB specializes WA, HA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("class FB specializes WA, FA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t");
      _builder_4.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_4);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasCyclicSpecialization() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t{ class A specializes A; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.CYCLIC_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A specializes B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.CYCLIC_SPECIALIZATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidBasetype() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { order 2 class A categorizes B; orderless class B; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.INVALID_CATEGORIZED_CLASS);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { order 2 class A categorizes B; order 2 class B ; }");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.INVALID_CATEGORIZED_CLASS);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { order 3 class A categorizes B; order 3 class B; }");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, LinguisticRules.INVALID_CATEGORIZED_CLASS);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class A categorizes B; class B;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 3 class C categorizes D; order 2 class D;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidPowertypeRelation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { order 2 class A isPowertypeOf B; orderless class B; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { order 2 class A isPowertypeOf B; order 2 class B; }");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { order 3 class A isPowertypeOf B; order 3 class B; }");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class A isPowertypeOf B; class B;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 3 class C isPowertypeOf D; order 2 class D;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidSubordinators() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { order 2 class A subordinatedTo A; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { order 2 class A subordinatedTo B; class B; }");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { order 2 class A subordinatedTo B; order 3 class B; }");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t { order 2 class A subordinatedTo B; order 2 class B; }");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicatedNames() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{ class A; class A; }");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertError(incorrectModel, _entityDeclaration, LinguisticRules.DUPLICATED_ENTITY_NAME);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{ class A; class B; }");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidMembers() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("genset gs general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _generalizationSet = MetaPackage.eINSTANCE.getGeneralizationSet();
      this._validationTestHelper.assertError(incorrectModelA, _generalizationSet, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class X categorizes B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("genset gs general A categorizer X specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _generalizationSet_1 = MetaPackage.eINSTANCE.getGeneralizationSet();
      this._validationTestHelper.assertError(incorrectModelB, _generalizationSet_1, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class B specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class C specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("order 2 class X categorizes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("genset gs general A categorizer X specifics B,C;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _generalizationSet_2 = MetaPackage.eINSTANCE.getGeneralizationSet();
      this._validationTestHelper.assertError(incorrectModelC, _generalizationSet_2, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class B:X specializes A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class C:X specializes A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class X categorizes A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("genset gs general A categorizer X specifics B,C;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testObeysSubordination() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class XA; ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class XB subordinatedTo XA;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class YA:XA; class YB:XB;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModel, _mL2Class, 
        LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class XA; order 2 class XB subordinatedTo XA;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class YA:XA; class YB:XB specializes YA;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasSimpleSubordinationCycle() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{ orderless class A subordinatedTo A; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A subordinatedTo B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B subordinatedTo A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t{");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("orderless class A subordinatedTo B;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("orderless class B specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t{");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("orderless class A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("orderless class B specializes A subordinatedTo A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsSpecializingDisjointClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("disjoint genset x general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class D specializes B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertWarning(incorrectModel, _mL2Class, 
        LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("disjoint genset x general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class D specializes C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class E specializes B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertNoWarnings(correctModel, _mL2Class_1, 
        LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsInstanceOfDisjointClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("disjoint genset a general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X:B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertWarning(incorrectModel, _entityDeclaration, 
        LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("genset a general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X:B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      EClass _entityDeclaration_1 = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertNoWarnings(correctModel, _entityDeclaration_1, 
        LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingInstantiationByCompleteness() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("complete genset a general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X:A;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertWarning(incorrectModel, _entityDeclaration, 
        LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("complete genset a general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X:A,B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      EClass _entityDeclaration_1 = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertNoWarnings(correctModel, _entityDeclaration_1, 
        LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSubsettedMultiplicity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToA : [2..3] A");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nickname : [2..3] A");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class B specializes A {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToB : [1..3] B subsets refToA");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nickname2 : [1..3] B subsets nickname");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _reference = MetaPackage.eINSTANCE.getReference();
      this._validationTestHelper.assertError(incorrectModelA, _reference, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attribute = MetaPackage.eINSTANCE.getAttribute();
      this._validationTestHelper.assertError(incorrectModelA, _attribute, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToA : [2..3] A");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nickname : [2..3] A");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B specializes A {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToB : [2..4] B subsets refToA");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nickname2 : [2..5] B subsets nickname");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _reference_1 = MetaPackage.eINSTANCE.getReference();
      this._validationTestHelper.assertError(incorrectModelB, _reference_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attribute_1 = MetaPackage.eINSTANCE.getAttribute();
      this._validationTestHelper.assertError(incorrectModelB, _attribute_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToA : [2..3] A");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nickname : [2..3] A");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class B specializes A {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToB : [2..2] B subsets refToA");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nickname2 : [3..3] B subsets nickname");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_2);
      this._validationTestHelper.assertNoError(correctModel, LinguisticRules.INVALID_MULTIPLICITY);
      this._validationTestHelper.assertNoError(correctModel, LinguisticRules.INVALID_MULTIPLICITY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultiplicityAndAssignment() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToA : [2..3] A");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nicknames : [2..3] A\t// This is going to fire other issues not related to multiplicity");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X : A { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToA = X");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nicknames = \"John\"");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _referenceAssignment = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertWarning(incorrectModelA, _referenceAssignment, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attributeAssignment = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorrectModelA, _attributeAssignment, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A { ");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToA : [2..3] A");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nicknames : [2..3] A\t// This is going to fire other issues not related to multiplicity");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X : A { ");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToA = {X,X,X,X}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nicknames = {\"John\",\"Bob\",\"Gary\",\"Nick\"}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _referenceAssignment_1 = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertWarning(incorrectModelB, _referenceAssignment_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attributeAssignment_1 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorrectModelB, _attributeAssignment_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A { ");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToA : [2..3] A");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nicknames : [2..3] A\t// This is going to fire other issues not related to multiplicity");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("individual X : A { ");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToA = {X,X}");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nicknames = {\"John\",\"Bob\",\"Gary\"}");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_2);
      EClass _referenceAssignment_2 = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertNoWarnings(correctModel, _referenceAssignment_2, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attributeAssignment_2 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertNoWarnings(correctModel, _attributeAssignment_2, 
        LinguisticRules.INVALID_MULTIPLICITY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckFeatureAssignmentType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("datatype Color {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("red:Number blue:Number green:Number");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual Black : Color { red=0 green=0 blue=0 };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class ColoredObject { color : [1..2] Color };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual SomeCube : ColoredObject { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("color = {Black,[ red=255 green=255 blue=255 ]}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual OtherCube : ColoredObject { color = Black };");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model correctModelB = this._parseHelper.parse(_builder);
      EClass _attributeAssignment = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertNoErrors(correctModelB, _attributeAssignment, 
        LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
      this._validationTestHelper.assertNoErrors(correctModelB);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckRegularityAndContainer() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class HA { regularity h_name : String determinesValue name };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A { name : String };");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _feature = MetaPackage.eINSTANCE.getFeature();
      this._validationTestHelper.assertError(incorrectModelA, _feature, 
        LinguisticRules.FIRST_ORDER_REGULARITY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class HA { regularity ref h_a : A determinesValue name };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A { ref a : A };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _feature_1 = MetaPackage.eINSTANCE.getFeature();
      this._validationTestHelper.assertError(incorrectModelB, _feature_1, 
        LinguisticRules.FIRST_ORDER_REGULARITY);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("order 2 class HA categorizes A { regularity ref h_a : A determinesMaxValue a };");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A { ref a : A };");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _feature_2 = MetaPackage.eINSTANCE.getFeature();
      this._validationTestHelper.assertError(incorrectModelC, _feature_2, 
        LinguisticRules.RESTRICTED_REGULARITY_TYPE);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class HA categorizes A { regularity h_name : String determinesType name };");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class A { name : String };");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model incorrectModelD = this._parseHelper.parse(_builder_3);
      EClass _feature_3 = MetaPackage.eINSTANCE.getFeature();
      this._validationTestHelper.assertError(incorrectModelD, _feature_3, 
        LinguisticRules.RESTRICTED_REGULARITY_TYPE);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckInstantiatedRegularities() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A; individual Aminus :A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class B categorizes C { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("regularity ref actualToA : A determinesValue toA };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class C { ref toA : A };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class BC :B specializes C {};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorretModel = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertWarning(incorretModel, _mL2Class, 
        LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A; individual Aminus :A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class B categorizes C { ");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("regularity ref actualToA : A determinesValue toA");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class C { ref toA : A };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class BC :B specializes C {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref actualToA = Aminus };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model corretModel = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertNoWarnings(corretModel, _mL2Class_1, 
        LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckRegularityFeatureConformance() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class HA categorizes A {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("regularity ref ha_ref : [0..*] A determinesValue a_ref };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A { ref a_ref : [0..*] A };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class B :HA specializes A { ref ha_ref = {A1,A3} };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual A1 :A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual A2 :A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual A3 :A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual B1 :B { ref a_ref = {A2} };");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorretModelA = this._parseHelper.parse(_builder);
      EClass _referenceAssignment = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertWarning(incorretModelA, _referenceAssignment, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class HA categorizes A {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("regularity ref ha_ref : [0..*] A determinesValue a_ref };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A { ref a_ref : [0..*] A };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B :HA specializes A { ref ha_ref = {A1,A3} };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual A1 :A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual A3 :A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual B1 :B { ref a_ref = {A1,A3} };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model corretModelA = this._parseHelper.parse(_builder_1);
      EClass _referenceAssignment_1 = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertNoWarnings(corretModelA, _referenceAssignment_1, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("order 2 class HA categorizes A {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("regularity ref ha_ref : [0..*] A determinesAllowedValues a_ref };");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A { ref a_ref : [0..*] A };");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class B :HA specializes A { ref ha_ref = {A1,A3} };");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("individual A1 :A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("individual A2 :A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("individual A3 :A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("individual B1 :B { ref a_ref = {A2} };");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model incorretModelB = this._parseHelper.parse(_builder_2);
      EClass _referenceAssignment_2 = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertWarning(incorretModelB, _referenceAssignment_2, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class HA categorizes A {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t\t");
      _builder_3.append("regularity ref ha_ref : [0..*] A determinesAllowedValues a_ref };");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class A { ref a_ref : [0..*] A };");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class B :HA specializes A { ref ha_ref = {A1,A3} };");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("individual A1 :A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("individual A3 :A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("individual B1 :B { ref a_ref = {} };");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("individual B2 :B { ref a_ref = {A3} };");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model corretModelB = this._parseHelper.parse(_builder_3);
      EClass _referenceAssignment_3 = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertNoWarnings(corretModelB, _referenceAssignment_3, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("module t {");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("order 2 class HA categorizes A {");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t\t");
      _builder_4.append("regularity limit : Number determinesMaxValue number };");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("class A { number : [0..*] Number };");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("class B :HA specializes A { limit = 50 };");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("individual B1 :B { number = 51 };");
      _builder_4.newLine();
      _builder_4.append("\t\t\t");
      _builder_4.append("}");
      final ML2Model incorretModelC1 = this._parseHelper.parse(_builder_4);
      EClass _attributeAssignment = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorretModelC1, _attributeAssignment, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("module t {");
      _builder_5.newLine();
      _builder_5.append("\t\t\t\t");
      _builder_5.append("order 2 class HA categorizes A {");
      _builder_5.newLine();
      _builder_5.append("\t\t\t\t\t");
      _builder_5.append("regularity limit : Number determinesMinValue number };");
      _builder_5.newLine();
      _builder_5.append("\t\t\t\t");
      _builder_5.append("class A { number : [0..*] Number };");
      _builder_5.newLine();
      _builder_5.append("\t\t\t\t");
      _builder_5.append("class B :HA specializes A { limit = 50 };");
      _builder_5.newLine();
      _builder_5.append("\t\t\t\t");
      _builder_5.append("individual B1 :B { number = 49 };");
      _builder_5.newLine();
      _builder_5.append("\t\t\t");
      _builder_5.append("}");
      final ML2Model incorretModelC2 = this._parseHelper.parse(_builder_5);
      EClass _attributeAssignment_1 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorretModelC2, _attributeAssignment_1, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("module t {");
      _builder_6.newLine();
      _builder_6.append("\t\t\t\t");
      _builder_6.append("order 2 class HA categorizes A {");
      _builder_6.newLine();
      _builder_6.append("\t\t\t\t\t");
      _builder_6.append("regularity max_limit : Number determinesMaxValue number");
      _builder_6.newLine();
      _builder_6.append("\t\t\t\t\t");
      _builder_6.append("regularity min_limit : Number determinesMinValue number");
      _builder_6.newLine();
      _builder_6.append("\t\t\t\t ");
      _builder_6.append("};");
      _builder_6.newLine();
      _builder_6.append("\t\t\t\t");
      _builder_6.append("class A { number : [0..*] Number };");
      _builder_6.newLine();
      _builder_6.append("\t\t\t\t");
      _builder_6.append("class B :HA specializes A { max_limit = 50\tmin_limit = 50 };");
      _builder_6.newLine();
      _builder_6.append("\t\t\t\t");
      _builder_6.append("individual B1 :B { number = 50 };");
      _builder_6.newLine();
      _builder_6.append("\t\t\t");
      _builder_6.append("}");
      final ML2Model corretModelC = this._parseHelper.parse(_builder_6);
      EClass _attributeAssignment_2 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertNoWarnings(corretModelC, _attributeAssignment_2, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append("module t {");
      _builder_7.newLine();
      _builder_7.append("\t\t\t\t");
      _builder_7.append("order 2 class HA categorizes A {");
      _builder_7.newLine();
      _builder_7.append("\t\t\t\t\t");
      _builder_7.append("regularity predefine : Boolean determinesValue b };");
      _builder_7.newLine();
      _builder_7.append("\t\t\t\t");
      _builder_7.append("class A { b : Boolean };");
      _builder_7.newLine();
      _builder_7.append("\t\t\t\t");
      _builder_7.append("class B :HA specializes A { predefine = true };");
      _builder_7.newLine();
      _builder_7.append("\t\t\t\t");
      _builder_7.append("individual B1 :B { b = false };");
      _builder_7.newLine();
      _builder_7.append("\t\t\t");
      _builder_7.append("}");
      final ML2Model incorretModelD1 = this._parseHelper.parse(_builder_7);
      EClass _attributeAssignment_3 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorretModelD1, _attributeAssignment_3, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.append("module t {");
      _builder_8.newLine();
      _builder_8.append("\t\t\t\t");
      _builder_8.append("datatype Color { value : Number };");
      _builder_8.newLine();
      _builder_8.append("\t\t\t\t");
      _builder_8.append("individual Black :Color { value = 0 };");
      _builder_8.newLine();
      _builder_8.append("\t\t\t\t");
      _builder_8.append("order 2 class HA categorizes A {");
      _builder_8.newLine();
      _builder_8.append("\t\t\t\t\t");
      _builder_8.append("regularity predefine : Color determinesValue color };");
      _builder_8.newLine();
      _builder_8.append("\t\t\t\t");
      _builder_8.append("class A { color : Color };");
      _builder_8.newLine();
      _builder_8.append("\t\t\t\t");
      _builder_8.append("class B :HA specializes A { predefine = Black };");
      _builder_8.newLine();
      _builder_8.append("\t\t\t\t");
      _builder_8.append("individual B1 :B { color = [value=0] };");
      _builder_8.newLine();
      _builder_8.append("\t\t\t");
      _builder_8.append("}");
      final ML2Model incorretModelD2 = this._parseHelper.parse(_builder_8);
      EClass _attributeAssignment_4 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorretModelD2, _attributeAssignment_4, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_9 = new StringConcatenation();
      _builder_9.append("module t {");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("datatype Color { value : Number };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("individual Black :Color { value = 0 };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("order 2 class HA categorizes A {");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t\t");
      _builder_9.append("regularity predefine : Color determinesValue color };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("class A { color : Color };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("class B :HA specializes A { predefine = Black };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("individual B1 :B { color = Black };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("order 2 class DHA categorizes DA {");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t\t");
      _builder_9.append("regularity predefine : Boolean determinesValue b };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("class DA { b : Boolean };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("class DB :DHA specializes DA { predefine = false };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t\t");
      _builder_9.append("individual DB1 :DB { b = false };");
      _builder_9.newLine();
      _builder_9.append("\t\t\t");
      _builder_9.append("}");
      final ML2Model incorretModelD = this._parseHelper.parse(_builder_9);
      EClass _attributeAssignment_5 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertNoWarnings(incorretModelD, _attributeAssignment_5, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_10 = new StringConcatenation();
      _builder_10.append("module t {");
      _builder_10.newLine();
      _builder_10.append("\t\t\t\t");
      _builder_10.append("order 2 class HA categorizes A {");
      _builder_10.newLine();
      _builder_10.append("\t\t\t\t\t");
      _builder_10.append("regularity predefine : [0..*] String determinesAllowedValues names };");
      _builder_10.newLine();
      _builder_10.append("\t\t\t\t");
      _builder_10.append("class A { names : [0..*] String };");
      _builder_10.newLine();
      _builder_10.append("\t\t\t\t");
      _builder_10.append("class B :HA specializes A { predefine = {\"abc\",\"bac\"} };");
      _builder_10.newLine();
      _builder_10.append("\t\t\t\t");
      _builder_10.append("individual B1 :B { names = \"aaa\" };");
      _builder_10.newLine();
      _builder_10.append("\t\t\t");
      _builder_10.append("}");
      final ML2Model incorretModelE1 = this._parseHelper.parse(_builder_10);
      EClass _attributeAssignment_6 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorretModelE1, _attributeAssignment_6, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_11 = new StringConcatenation();
      _builder_11.append("module t {");
      _builder_11.newLine();
      _builder_11.append("\t\t\t\t");
      _builder_11.append("datatype Color { value : Number };");
      _builder_11.newLine();
      _builder_11.append("\t\t\t\t");
      _builder_11.append("individual Black :Color { value = 0 };");
      _builder_11.newLine();
      _builder_11.append("\t\t\t\t");
      _builder_11.append("individual White :Color { value = 100 };");
      _builder_11.newLine();
      _builder_11.append("\t\t\t\t");
      _builder_11.append("order 2 class HA categorizes A {");
      _builder_11.newLine();
      _builder_11.append("\t\t\t\t\t");
      _builder_11.append("regularity predefine : Color determinesAllowedValues color };");
      _builder_11.newLine();
      _builder_11.append("\t\t\t\t");
      _builder_11.append("class A { color : Color };");
      _builder_11.newLine();
      _builder_11.append("\t\t\t\t");
      _builder_11.append("class B :HA specializes A { predefine = {Black,White} };");
      _builder_11.newLine();
      _builder_11.append("\t\t\t\t");
      _builder_11.append("individual B1 :B { color = [value=0] };");
      _builder_11.newLine();
      _builder_11.append("\t\t\t");
      _builder_11.append("}");
      final ML2Model incorretModelE2 = this._parseHelper.parse(_builder_11);
      EClass _attributeAssignment_7 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorretModelE2, _attributeAssignment_7, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
      StringConcatenation _builder_12 = new StringConcatenation();
      _builder_12.append("module t {");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("datatype Color { value : Number };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("individual Black :Color { value = 0 };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("individual White :Color { value = 100 };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("order 2 class HA categorizes A {");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t\t");
      _builder_12.append("regularity predefine : [0..*] Color determinesAllowedValues color };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("class A { color : Color };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("class B :HA specializes A { predefine = {Black,White} };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("individual B1 :B { color = White };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("order 2 class EHA categorizes EA {");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t\t");
      _builder_12.append("regularity predefine : [0..*] String determinesAllowedValues names };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("class EA { names : [0..*] String };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("class EB :EHA specializes EA { predefine = {\"abc\",\"bac\"} };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t\t");
      _builder_12.append("individual EB1 :EB { names = {\"abc\",\"bac\"} };");
      _builder_12.newLine();
      _builder_12.append("\t\t\t");
      _builder_12.append("}");
      final ML2Model corretModelE = this._parseHelper.parse(_builder_12);
      EClass _attributeAssignment_8 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertNoWarnings(corretModelE, _attributeAssignment_8, 
        LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
