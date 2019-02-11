/*
 * generated by Xtext 2.16.0
 */
package br.ufes.inf.nemo.ml2

import org.eclipse.xtext.conversion.IValueConverterService
import com.google.inject.Binder
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.name.Names
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import com.google.inject.Singleton
import br.ufes.inf.nemo.ml2.util.ML2ValueConverter
import br.ufes.inf.nemo.ml2.scoping.ML2ImportedNamespaceAwareLocalScopeProvider
import br.ufes.inf.nemo.ml2.generator.ML2OutputConfigurationProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ML2RuntimeModule extends AbstractML2RuntimeModule {
	
	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return ML2ValueConverter
	}
	
	override configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider)
			.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
			.to(ML2ImportedNamespaceAwareLocalScopeProvider)
	}
	
	override configure(Binder binder) {
		super.configure(binder);
		binder.bind(IOutputConfigurationProvider).to(ML2OutputConfigurationProvider).in(Singleton);
	}
	
}
