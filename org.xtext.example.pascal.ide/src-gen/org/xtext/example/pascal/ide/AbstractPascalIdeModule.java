/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.ide;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import org.eclipse.xtext.ide.DefaultIdeModule;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.FQNPrefixMatcher;
import org.eclipse.xtext.ide.editor.contentassist.IPrefixMatcher;
import org.eclipse.xtext.ide.editor.contentassist.IProposalConflictHelper;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AntlrProposalConflictHelper;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
import org.xtext.example.pascal.ide.contentassist.antlr.PascalParser;
import org.xtext.example.pascal.ide.contentassist.antlr.internal.InternalPascalLexer;

/**
 * Manual modifications go to {@link PascalIdeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractPascalIdeModule extends DefaultIdeModule {

	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public void configureContentAssistLexer(Binder binder) {
		binder.bind(Lexer.class)
			.annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST))
			.to(InternalPascalLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return PascalParser.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IProposalConflictHelper> bindIProposalConflictHelper() {
		return AntlrProposalConflictHelper.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.exporting.QualifiedNamesFragment2
	public Class<? extends IPrefixMatcher> bindIPrefixMatcher() {
		return FQNPrefixMatcher.class;
	}
	
}
