/*
 * generated by Xtext 2.11.0
 */
package br.ufes.inf.nemo.ml2.ui;

import br.ufes.inf.nemo.ml2.ui.internal.Ml2Activator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ML2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Ml2Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Ml2Activator.getInstance().getInjector(Ml2Activator.BR_UFES_INF_NEMO_ML2_ML2);
	}
	
}
