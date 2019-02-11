/*
 * generated by Xtext 2.16.0
 */
package br.ufes.inf.nemo.ml2.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.common.util.BasicEList
import br.ufes.inf.nemo.ml2.model.ML2Class
import br.ufes.inf.nemo.ml2.model.EntityDeclaration
import br.ufes.inf.nemo.ml2.model.Reference
import br.ufes.inf.nemo.ml2.model.Attribute
import br.ufes.inf.nemo.ml2.model.ModelPackage
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment
import br.ufes.inf.nemo.ml2.model.AttributeAssignment
import br.ufes.inf.nemo.ml2.util.ML2Util

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ML2ScopeProvider extends AbstractML2ScopeProvider {
	
	@Inject extension ML2Util
	
	override getScope(EObject context, EReference reference){
		if(context instanceof AttributeAssignment && reference == ModelPackage.eINSTANCE.attributeAssignment_Attribute){
			return getScopeForAttributeAssignmentOnAttributeAssignment_Attribute(context,reference)
		} 
		else if(context instanceof ReferenceAssignment && reference == ModelPackage.eINSTANCE.referenceAssignment_Reference){
			return getScopeForReferenceAssignmentOnReferenceAssignment_Reference(context,reference)
		} 
		else if(context instanceof Attribute && reference == ModelPackage.eINSTANCE.attribute_SubsetOf){
			return getScopeForAttributeOnAttribute_SubsetOf(context,reference)
		} 
		else if(context instanceof Reference && reference == ModelPackage.eINSTANCE.reference_SubsetOf){
			return getScopeForReferenceOnReference_SubsetOf(context,reference)
		}
		else if(context instanceof Reference && reference==ModelPackage.eINSTANCE.reference_OppositeTo){
			return getScopeForReferenceOnReference_OppositeTo(context,reference)
		}
		else if(context instanceof Attribute && reference==ModelPackage.eINSTANCE.feature_RegulatedFeature){
			return getScopeForAttributeOnFeature_ReguletedProperty(context,reference)
		}
		else if(context instanceof Reference && reference==ModelPackage.eINSTANCE.feature_RegulatedFeature){
			return getScopeForReferenceOnFeature_ReguletedProperty(context,reference)
		}
		else return super.getScope(context, reference)
	}
	
	def private IScope getScopeForAttributeAssignmentOnAttributeAssignment_Attribute(EObject context, EReference reference){
		val entity = context.eContainer as EntityDeclaration
		val attributes = entity.allAttributes
		return Scopes.scopeFor(attributes, [ att |
			if (attributes.exists[it.name.equals(att.name) && it != att])
				return QualifiedName.create((att.eContainer as EntityDeclaration).name, att.name)
			else
				return QualifiedName.create(att.name)
		], Scopes.scopeFor(entity.assignments))
	}
	
	def private IScope getScopeForReferenceAssignmentOnReferenceAssignment_Reference(EObject context, EReference reference){
		val entity = context.eContainer as EntityDeclaration
		val references = entity.allReferences
		val dup = references + references
		return Scopes.scopeFor(dup, [ ref |
			if (references.exists[it.name.equals(ref.name) && it != ref])
				return QualifiedName.create((ref.eContainer as EntityDeclaration).name, ref.name)
			else
				return QualifiedName.create(ref.name)
		], Scopes.scopeFor(entity.assignments))
	}
	
	def private IScope getScopeForAttributeOnAttribute_SubsetOf(EObject context, EReference reference){
		val c = context.eContainer as ML2Class
		val inheritedAtts = c.allInheritedAttributes
		return Scopes.scopeFor(inheritedAtts, [ att |
			if (inheritedAtts.exists[it.name.equals(att.name) && it != att])
				return QualifiedName.create((att.eContainer as EntityDeclaration).name, att.name)
			else
				return QualifiedName.create(att.name)
		], Scopes.scopeFor(c.attributes))
	}
	
	def private IScope getScopeForReferenceOnReference_SubsetOf(EObject context, EReference reference){
		val c = context.eContainer as ML2Class
		val inheritedRefs = c.allInheritedReferences
		return Scopes.scopeFor(inheritedRefs, [ ref |
			if (inheritedRefs.exists[it.name.equals(ref.name) && it != ref])
				return QualifiedName.create((ref.eContainer as EntityDeclaration).name, ref.name)
			else
				return QualifiedName.create(ref.name)
		], Scopes.scopeFor(c.references))
	}
	
	def private getScopeForReferenceOnReference_OppositeTo(EObject context, EReference reference) {
		val c = context.eContainer as ML2Class
		val ref = context as Reference
		return Scopes.scopeFor(ref._type.references.filter[it._type==c],
			[ QualifiedName.create(it.name) ], Scopes.scopeFor(c.references))
	}
	
	def private getScopeForAttributeOnFeature_ReguletedProperty(EObject context, EReference reference) {
		val c = context.eContainer as ML2Class
		val elements = new BasicEList<Attribute>()
		if(c.categorizedClass!==null) {
			elements.addAll(c.categorizedClass.attributes)
			elements.addAll(c.categorizedClass.allInheritedAttributes)
		}
//		return Scopes.scopeFor(elements, [ QualifiedName.create(it.name) ], IScope.NULLSCOPE)
		return Scopes.scopeFor(elements, [ att |
				if(elements.exists[name==att.name && it!=att])
					QualifiedName.create((att.eContainer as EntityDeclaration).name, att.name)
				else
					QualifiedName.create(att.name)
			], IScope.NULLSCOPE)
	}
	
	def private getScopeForReferenceOnFeature_ReguletedProperty(EObject context, EReference reference) {
		val c = context.eContainer as ML2Class
		val elements = new BasicEList<Reference>()
		if(c.categorizedClass!==null){
			elements.addAll(c.categorizedClass.references)
			elements.addAll(c.categorizedClass.allInheritedReferences)
		}
//		return Scopes.scopeFor(elements, [ QualifiedName.create(it.name) ], IScope.NULLSCOPE)
		return Scopes.scopeFor(elements, [ ref |
				if(elements.exists[name==ref.name && it!=ref])
					QualifiedName.create((ref.eContainer as EntityDeclaration).name, ref.name)
				else
					QualifiedName.create(ref.name)
			], IScope.NULLSCOPE)
	}

}
