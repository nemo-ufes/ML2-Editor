/*
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.ide.contentassist.antlr;

import br.ufes.inf.nemo.ml2.ide.contentassist.antlr.internal.InternalML2Parser;
import br.ufes.inf.nemo.ml2.services.ML2GrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ML2Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ML2GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ML2GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
			builder.put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
			builder.put(grammarAccess.getGreetingAccess().getNameAssignment_1(), "rule__Greeting__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ML2GrammarAccess grammarAccess;

	@Override
	protected InternalML2Parser createParser() {
		InternalML2Parser result = new InternalML2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ML2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ML2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
