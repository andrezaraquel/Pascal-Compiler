/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.pascal.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.pascal.pascal.*
import org.xtext.example.pascal.validation.exception.InvalidException
import javax.swing.text.html.BlockView
import org.eclipse.xtext.nodemodel.impl.InvariantChecker.InconsistentNodeModelException

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PascalValidator extends AbstractPascalValidator {
	
	
	@Check
	def checkBlockDeclaration(block block) {
		try {
			BlockValidator.validateBlock(block)				
			for (InvalidException exc : BlockValidator.getErrorList()) {
				error(exc.message, exc.component, null)
			}
				
//		} catch (InvalidException e) {
//			this.error(e.message, e.component, null);
		} catch (Exception e) {
			e.printStackTrace()
		}
	}
	
	
	
}
