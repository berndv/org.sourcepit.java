/*
 * generated by Xtext
 */

package org.sourcepit.java.literals.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LiteralsAntlrTokenFileProvider implements IAntlrTokenFileProvider {

   public InputStream getAntlrTokenFile() {
      ClassLoader classLoader = getClass().getClassLoader();
      return classLoader.getResourceAsStream("org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.tokens");
   }
}
