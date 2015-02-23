/**
 * generated by Xtext
 */

package org.sourcepit.java.literals.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class LiteralsLabelProvider extends DefaultEObjectLabelProvider {
   @Inject
   public LiteralsLabelProvider(final AdapterFactoryLabelProvider delegate) {
      super(delegate);
   }
}
