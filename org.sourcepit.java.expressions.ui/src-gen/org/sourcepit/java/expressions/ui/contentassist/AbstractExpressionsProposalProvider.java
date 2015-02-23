/*
 * generated by Xtext
 */

package org.sourcepit.java.expressions.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * Represents a generated, default implementation of superclass
 * {@link org.sourcepit.java.literals.ui.contentassist.LiteralsProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them
 * with a more concrete subtype.
 */
@SuppressWarnings("all")
public class AbstractExpressionsProposalProvider
   extends
      org.sourcepit.java.literals.ui.contentassist.LiteralsProposalProvider {

   public void completeModel_Greetings(EObject model, Assignment assignment, ContentAssistContext context,
      ICompletionProposalAcceptor acceptor) {
      completeRuleCall(((RuleCall) assignment.getTerminal()), context, acceptor);
   }

   public void complete_Model(EObject model, RuleCall ruleCall, ContentAssistContext context,
      ICompletionProposalAcceptor acceptor) {
      // subclasses may override
   }
}
