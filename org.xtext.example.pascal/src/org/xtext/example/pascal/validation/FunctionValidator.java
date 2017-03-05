package org.xtext.example.pascal.validation;

import org.xtext.example.pascal.pascal.block;
import org.xtext.example.pascal.pascal.declaration_part;
import org.xtext.example.pascal.pascal.function_heading;
import org.xtext.example.pascal.pascal.function_identification;
import org.xtext.example.pascal.validation.exception.InvalidException;
import org.xtext.example.pascal.validation.exception.Message;
import org.xtext.example.pascal.validation.obj.Function;

public class FunctionValidator {

public static void validateDeclarationFunction(block block, function_heading function_heading) {
		
		String name = function_heading.getIdentifier().getIdentifier();
		Function newFunction = new Function(name);
		
		if(BlockValidator.hasFunction(block, newFunction)) {
			InvalidException.error(Message.DECLARED_FUNCTION, function_heading);
		}
		BlockValidator.addFunction(newFunction);
		
	}
	
	public static void validateDeclarationFunction(block block, function_identification function_identification) {
		
		String name = function_identification.getFunction_identifier().getIdentifier();
		Function newFunction = new Function(name);
		
		if(BlockValidator.hasFunction(block, newFunction)) {
			InvalidException.error(Message.DECLARED_FUNCTION, function_identification);
		}
		BlockValidator.addFunction(newFunction);
		
	}

}
