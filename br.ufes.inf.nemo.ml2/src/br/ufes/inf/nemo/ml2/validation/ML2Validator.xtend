/*
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.validation

import com.google.inject.Inject
import org.eclipse.xtext.validation.CheckType
import org.eclipse.xtext.validation.Check
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.model.Class
import br.ufes.inf.nemo.ml2.model.EntityDeclaration
import br.ufes.inf.nemo.ml2.model.FeatureAssignment
import br.ufes.inf.nemo.ml2.model.GeneralizationSet
import br.ufes.inf.nemo.ml2.model.Feature
import br.ufes.inf.nemo.ml2.model.HighOrderClass
import br.ufes.inf.nemo.ml2.model.DataType
import br.ufes.inf.nemo.ml2.model.HigherOrderClass
import br.ufes.inf.nemo.ml2.model.RegularityFeature
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment
import br.ufes.inf.nemo.ml2.model.AttributeAssignment

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ML2Validator extends AbstractML2Validator {
	
	@Inject extension ML2Util
	
	@Inject extension LinguisticRules
	@Inject extension MLTRules
	@Inject extension UFORules
	
	public static val INSTANTIATION_OF_DISJOINT_TYPES = "br.ufes.inf.nemo.ontol.InstantiationOfDisjointTypes"
	public static val MISSING_COMPLETE_INSTANTIATION = "br.ufes.inf.nemo.ontol.MissingCompleteInstantiation"
	public static val POWERTYPE_COMPLETE_SPECIALIZATION = "br.ufes.inf.nemo.ontol.PowertypeCompleteSpecialization"
	public static val COMPLETE_CHARACTERIZATION_AND_COMPLETENESS = "br.ufes.inf.nemo.ontol.CompleteCharacterizationAndCompleteness"
	public static val DISJOINT_CHARACTERIZATION_AND_DISJOINTNESS = "br.ufes.inf.nemo.ontol.DisjointCharacterizationAndDisjointness"
	public static val MANDATORY_SPECIALIZATION_OF_ENDURANT = "br.ufes.inf.nemo.ontol.MandaorySpecializationOfEndurant"
	public static val NONSORTAL_SPECIALIZING_SORTAL = "br.ufes.inf.nemo.ontol.NonSortalSpecializingSortal"
	public static val RIGID_SPECIALIZING_ANTIRIGID = "br.ufes.inf.nemo.ontol.RigidSpecializingAntiRigid"
	public static val SEMIRIGID_SPECIALIZING_ANTIRIGID = "br.ufes.inf.nemo.ontol.SemiRigidSpecializingAntiRigid"
	public static val MULTIPLE_IDENTITIES = "br.ufes.inf.nemo.ontol.MultipleIdentities"
	public static val MISSING_IDENTITY = "br.ufes.inf.nemo.ontol.MissingIdentity"
	public static val NECESSARY_INSTANTIATION = "br.ufes.inf.nemo.ontol.NecessaryInstantiation"
	public static val MISSING_SPECIALIZATION_TO_BASETYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationToBasetype"
	
	// TODO Update checks table
	public static val UFO_A_MISSING_MUST_INSTANTIATION = "br.ufes.inf.nemo.ontol.ufo.a.MissingMustInstantiation"
	public static val UFO_A_ILLEGAL_SORTAL_SPECIALIZATION = "br.ufes.inf.nemo.ontol.ufo.a.IllegalSortalSpecialization"
	public static val UFO_A_ILLEGAL_RIGID_SPECIALIZATION = "br.ufes.inf.nemo.ontol.ufo.a.IllegalRigidSpecialization"
	public static val NON_CONFORMANT_ASSIGNMENT = "br.ufes.inf.nemo.ontol.NonConformantAssigment"
	
	@Check(CheckType.FAST)
	def void callIsNameValid(EntityDeclaration e){
		e.isNameValid?.runIssue
	}
	@Check(CheckType.FAST)
	def void callDuplicatedEntityName(EntityDeclaration e){
		e.duplicatedEntityName?.runIssue
	}
	@Check(CheckType.FAST)
	def void calIsValidInstantiation(EntityDeclaration e){
		e.isValidInstantiation?.runIssue
	}
	
	@Check(CheckType.FAST)
	def void callIsValidSpecialization(Class c){
		c.isValidSpecialization?.runIssue
	}
	@Check(CheckType.NORMAL)
	def void callHasCyclicSpecialization(Class c){
		val ch = c.classHierarchy
		c.hasCyclicSpecialization(ch)?.runIssue
	}
	@Check(CheckType.FAST)
	def void callHasValidCategorizedClass(HigherOrderClass c){
		c.hasValidCategorizedClass?.runIssue
	}
	@Check(CheckType.FAST)
	def void callHasValidPowertypeRelation(HigherOrderClass c){
		c.hasValidPowertypeRelation?.runIssue
	}
	@Check(CheckType.FAST)
	def void callHasValidSubordinators(HigherOrderClass c){
		c.hasValidSubordinators?.runIssue
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnDataTypes(DataType d){
		d.containsReferences?.runIssue
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnHOClass(HighOrderClass ho){
		ho.minOrder?.runIssue
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnGeneralizationSet(GeneralizationSet gs){
		gs.hasValidMembers?.runIssue
	}
	
	@Check(CheckType.FAST)
	def void callCheckFeatureName(Feature f){
		f.checkFeatureName?.runIssue
	}
	@Check(CheckType.FAST)
	def void callCheckSubsettedMultiplicity(Feature f){
		f.checkSubsettedMultiplicity?.runIssue
	}
	@Check(CheckType.FAST)
	def void callCheckRegularityAndContainer(RegularityFeature f){
		f.checkRegularityAndContainer?.runIssue
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnFeatureAssignment(FeatureAssignment fa){
		fa.checkMultiplicityAndAssignment?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void callCheckFeatureAssignmentType(FeatureAssignment fa){
		fa.checkFeatureAssignmentType?.runIssue
	}
	
	// TODO: enable for attribute assignments as well 	
	@Check(CheckType.NORMAL)
	def void callCheckRegularityFeatureConformance(AttributeAssignment fa){
		fa.checkRegularityFeatureConformance?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void callCheckRegularityFeatureConformance(ReferenceAssignment fa){
		fa.checkRegularityFeatureConformance?.runIssue
	}
	
	@Check(CheckType.EXPENSIVE)
	def void callMissingInstantiationByCompleteness(EntityDeclaration e){
		val iof = e.allInstantiatedClasses
		e.missingInstantiationByCompleteness(iof)?.runIssue
	}
	
	@Check(CheckType.EXPENSIVE)
	def void callIsInstanceOfDisjointClasses(EntityDeclaration e){
		val iof = e.allInstantiatedClasses
		e.isInstanceOfDisjointClasses(iof)?.runIssue
	}
	
	@Check(CheckType.EXPENSIVE)
	def void callIsMissingSpecializationThroughPowertype(Class c) {
		val ch = c.classHierarchy
		val iof = c.allInstantiatedClasses
		c.isMissingSpecializationThroughPowertype(ch,iof)?.runIssue
	}
	
	// TODO: enable constraint
	@Check(CheckType.NORMAL)
	def void callObeysSubordination(Class c) {
		val ch = c.classHierarchy
		val iof = c.allInstantiatedClasses
		c.obeysSubordination(ch, iof)?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void callHasSimpleSubordinationCycle(HigherOrderClass c) {
		c.hasSimpleSubordinationCycle?.runIssue
	}
	
	@Check(CheckType.EXPENSIVE)
	def void callIsSpecializingDisjointClasses(Class c) {
		val ch = c.classHierarchy
		c.isSpecializingDisjointClasses(ch)?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void callCheckInstantiatedRegularities(Class c) {
		c.checkInstantiatedRegularities?.runIssue
	}
	
//	@Check(CheckType.EXPENSIVE)
//	def void expensiveChecksOnFOClass(FOClass c) {
//		// TODO Insert a check for UFO models
//		
//		val ch = (c as Class).classHierarchy
//		val iof = (c as Class).allInstantiatedClasses
//		val endurant = c.UFOEndurant
//		
//		val mustInstantiate = c.UFOMustInstantiateClasses
//		val mixinclass = c.getLibClass(ML2Lib.UFO_MIXIN_CLASS)
//		val rigidclass = c.getLibClass(ML2Lib.UFO_RIGID_CLASS)
//		val semirigidclass = c.getLibClass(ML2Lib.UFO_SEMI_RIGID_CLASS)
//
//		c.mustInstantiateUFOMetaproperties(ch,iof,endurant,mustInstantiate)?.runIssue
//		c.checkSpecializationAndSortality(ch,iof,mixinclass)?.runIssue
//		c.checkSpecializationAndRigidity(ch,iof,rigidclass,semirigidclass)?.runIssue
//	}
	
	def private dispatch runIssue(ValidationError issue){
		val it = issue
		if(source !== null && feature !== null && index!=-1 && code !== null)
			error(message,source,feature,index,code,issueData)
		else if(source !== null && feature !== null && code !== null)
			error(message,source,feature,code,issueData)
		else if(feature !== null && index!=-1 && code !== null)
			error(message,feature,index,code,issueData)
		else if(source !== null && feature !== null && index!=-1)
			error(message,source,feature,index)
		else if(source !== null && feature !== null)
			error(message,source,feature)
		else if(feature !== null && code !== null)
			error(message,feature,code,issueData)
		else if(feature !== null && index!=-1)
			error(message,feature,index)
		else if(source !== null && feature !== null)
			error(message,feature)
	}
	
	def private dispatch runIssue(ValidationWarning issue){
		val it = issue
		if(source !== null && feature !== null && index!=-1 && code !== null)
			warning(message,source,feature,index,code,issueData)
		else if(source !== null && feature !== null && code !== null)
			warning(message,source,feature,code,issueData)
		else if(source !== null && feature !== null && index!=-1)
			warning(message,source,feature,index)
		else if(source !== null && feature !== null)
			warning(message,source,feature)
		else if(feature !== null && index!=-1 && code !== null)
			warning(message,feature,index,code,issueData)
		else if(feature !== null && code !== null)
			warning(message,feature,code,issueData)
		else if(feature !== null && index!=-1)
			warning(message,feature,index)
		else if(source !== null && feature !== null)
			warning(message,feature)
	}
	
}
