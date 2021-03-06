/*
 * generated by Xtext
 */

package org.sourcepit.java.literals.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.sourcepit.java.literals.ui.internal.LiteralsActivator;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass.
 */
public class LiteralsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

   @Override
   protected Bundle getBundle() {
      return LiteralsActivator.getInstance().getBundle();
   }

   @Override
   protected Injector getInjector() {
      return LiteralsActivator.getInstance().getInjector(LiteralsActivator.ORG_SOURCEPIT_JAVA_LITERALS_LITERALS);
   }

}
