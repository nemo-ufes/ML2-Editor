/**
 * generated by Xtext 2.11.0
 */
package br.ufes.inf.nemo.ml2.ide;

import br.ufes.inf.nemo.ml2.ML2RuntimeModule;
import br.ufes.inf.nemo.ml2.ML2StandaloneSetup;
import br.ufes.inf.nemo.ml2.ide.ML2IdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class ML2IdeSetup extends ML2StandaloneSetup {
  @Override
  public Injector createInjector() {
    ML2RuntimeModule _mL2RuntimeModule = new ML2RuntimeModule();
    ML2IdeModule _mL2IdeModule = new ML2IdeModule();
    return Guice.createInjector(Modules2.mixin(_mL2RuntimeModule, _mL2IdeModule));
  }
}
