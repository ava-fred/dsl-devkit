/*
 * generated by Xtext
 */
package com.avaloq.tools.ddk.sample.helloworld.ide.contentassist.antlr;

import com.avaloq.tools.ddk.sample.helloworld.grammar.AbstractHelloWorldSemanticPredicates;
import com.avaloq.tools.ddk.sample.helloworld.ide.contentassist.antlr.internal.InternalHelloWorldParser;
import com.avaloq.tools.ddk.sample.helloworld.services.HelloWorldGrammarAccess;
import com.avaloq.tools.ddk.xtext.parser.ISemanticPredicates;
import com.avaloq.tools.ddk.xtext.parser.antlr.ParserContext;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class HelloWorldParser extends AbstractContentAssistParser {

  @Singleton
  public static final class NameMappings {
  	
  	private final Map<AbstractElement, String> mappings;
  	
  	@Inject
  	public NameMappings(HelloWorldGrammarAccess grammarAccess) {
  		ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
  		init(builder, grammarAccess);
  		this.mappings = builder.build();
  	}
  	
  	public String getRuleName(AbstractElement element) {
  		return mappings.get(element);
  	}
  	
  	private static void init(ImmutableMap.Builder<AbstractElement, String> builder, HelloWorldGrammarAccess grammarAccess) {
  		builder.put(grammarAccess.getKeywordsExampleAccess().getAlternatives(), "rule__KeywordsExample__Alternatives");
  		builder.put(grammarAccess.getEnumLikeOtherAccess().getAlternatives(), "rule__EnumLikeOther__Alternatives");
  		builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
  		builder.put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
  		builder.put(grammarAccess.getOptionTwoAccess().getGroup(), "rule__OptionTwo__Group__0");
  		builder.put(grammarAccess.getOptionFourAccess().getGroup(), "rule__OptionFour__Group__0");
  		builder.put(grammarAccess.getModelAccess().getGreetingsAssignment_0(), "rule__Model__GreetingsAssignment_0");
  		builder.put(grammarAccess.getModelAccess().getKeywordsExampleAssignment_1(), "rule__Model__KeywordsExampleAssignment_1");
  		builder.put(grammarAccess.getGreetingAccess().getNameAssignment_1(), "rule__Greeting__NameAssignment_1");
  		builder.put(grammarAccess.getKeywordsExampleAccess().getOptionAssignment_0(), "rule__KeywordsExample__OptionAssignment_0");
  		builder.put(grammarAccess.getKeywordsExampleAccess().getOptionAssignment_1(), "rule__KeywordsExample__OptionAssignment_1");
  		builder.put(grammarAccess.getKeywordsExampleAccess().getOptionAssignment_2(), "rule__KeywordsExample__OptionAssignment_2");
  		builder.put(grammarAccess.getKeywordsExampleAccess().getOptionAssignment_3(), "rule__KeywordsExample__OptionAssignment_3");
  	}
  }
  
  @Inject
  private NameMappings nameMappings;

  @Inject
  private HelloWorldGrammarAccess grammarAccess;

  @Inject
  private ISemanticPredicates predicates;

  /**
   * Creates compilation context.
   *
   * @param Input
   *          Stream
   * @return Compilation context
   */
  protected ParserContext createParserContext() {
    return new ParserContext();
  }

  @Override
  protected InternalHelloWorldParser createParser() {
    InternalHelloWorldParser result = new InternalHelloWorldParser(null);
    result.setGrammarAccess(grammarAccess);
    result.setParserContext(createParserContext());
    result.setPredicates((AbstractHelloWorldSemanticPredicates)predicates);
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

  public HelloWorldGrammarAccess getGrammarAccess() {
    return this.grammarAccess;
  }

  public void setGrammarAccess(HelloWorldGrammarAccess grammarAccess) {
    this.grammarAccess = grammarAccess;
  }

  public NameMappings getNameMappings() {
    return nameMappings;
  }

  public void setNameMappings(NameMappings nameMappings) {
    this.nameMappings = nameMappings;
  }
}
