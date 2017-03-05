package org.xtext.example.pascal.validation;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.pascal.pascal.block;
import org.xtext.example.pascal.pascal.declaration_part;
import org.xtext.example.pascal.pascal.procedure_heading;
import org.xtext.example.pascal.pascal.procedure_identification;
import org.xtext.example.pascal.validation.exception.InvalidException;
import org.xtext.example.pascal.validation.exception.Message;
import org.xtext.example.pascal.validation.obj.Procedure;

public class ProcedureValidator {

	public static void validateDeclarationProcedure(block block, procedure_heading procedure_heading) {
		
		String name = procedure_heading.getIdentifier().getIdentifier();
		Procedure newProcedure = new Procedure(name);
		
		if(BlockValidator.hasProcedure(block, newProcedure)) {
//			InvalidException.error(Message.DECLARED_PROCEDURE, procedure_heading);
			BlockValidator.addError(new InvalidException(Message.DECLARED_PROCEDURE, procedure_heading));
		}
		BlockValidator.addProcedure(newProcedure);
		
	}
	
	public static void validateDeclarationProcedure(block block, procedure_identification procedure_identification) {
		
		String name = procedure_identification.getIdentifier().getIdentifier();
		Procedure newProcedure = new Procedure(name);
		
		if(BlockValidator.hasProcedure(block, newProcedure)) {
//			InvalidException.error(Message.DECLARED_PROCEDURE, procedure_identification);
			BlockValidator.addError(new InvalidException(Message.DECLARED_PROCEDURE, procedure_identification));
		}
		BlockValidator.addProcedure(newProcedure);
		
	}
	
	
}
