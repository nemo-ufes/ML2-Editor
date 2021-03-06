/*
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.ide

import br.ufes.inf.nemo.ml2.ML2RuntimeModule
import br.ufes.inf.nemo.ml2.ML2StandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ML2IdeSetup extends ML2StandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ML2RuntimeModule, new ML2IdeModule))
	}
	
}
