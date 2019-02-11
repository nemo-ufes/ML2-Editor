/*
 * generated by Xtext 2.16.0
 */
package br.ufes.inf.nemo.ml2.parser.antlr;

import br.ufes.inf.nemo.ml2.parser.antlr.internal.InternalML2Parser;
import br.ufes.inf.nemo.ml2.services.ML2GrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ML2Parser extends AbstractAntlrParser {

	@Inject
	private ML2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalML2Parser createParser(XtextTokenStream stream) {
		return new InternalML2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ML2Model";
	}

	public ML2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ML2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
