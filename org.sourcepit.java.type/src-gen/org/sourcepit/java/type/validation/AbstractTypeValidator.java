/*
 * generated by Xtext
 */

package org.sourcepit.java.type.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractTypeValidator extends org.sourcepit.java.literals.validation.LiteralsValidator {

   @Override
   protected List<EPackage> getEPackages() {
      List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
      result.add(org.sourcepit.java.type.type.TypePackage.eINSTANCE);
      return result;
   }
}
