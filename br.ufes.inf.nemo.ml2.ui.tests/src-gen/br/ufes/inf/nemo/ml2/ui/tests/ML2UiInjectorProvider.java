/*
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.ui.tests;

import br.ufes.inf.nemo.ml2.ui.internal.Ml2Activator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ML2UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Ml2Activator.getInstance().getInjector("br.ufes.inf.nemo.ml2.ML2");
	}

}
