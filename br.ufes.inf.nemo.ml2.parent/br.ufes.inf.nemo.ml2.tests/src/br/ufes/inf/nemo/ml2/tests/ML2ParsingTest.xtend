/*
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ml2.tests

import br.ufes.inf.nemo.ml2.meta.ML2Model
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(ML2InjectorProvider)
class ML2ParsingTest{

	@Inject
	ParseHelper<ML2Model> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}