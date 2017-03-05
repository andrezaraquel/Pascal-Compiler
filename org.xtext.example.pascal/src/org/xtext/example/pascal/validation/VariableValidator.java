package org.xtext.example.pascal.validation;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.pascal.pascal.block;
import org.xtext.example.pascal.pascal.declaration_part;
import org.xtext.example.pascal.pascal.variable_declaration;
import org.xtext.example.pascal.pascal.variable_declaration_part;
import org.xtext.example.pascal.validation.exception.InvalidException;
import org.xtext.example.pascal.validation.exception.Message;
import org.xtext.example.pascal.validation.obj.Variable;

public class VariableValidator {
		
	public static void validateDeclarationVariable(block block, declaration_part declaration) {
		variable_declaration_part declaration_variable = (variable_declaration_part) declaration.getVariable_declaration_part();

		EList<variable_declaration> varibles_declaration =  declaration_variable.getVariable_declaration();

		for (variable_declaration v_declaration : varibles_declaration){
			EList<String> names = v_declaration.getIdentifier_list().getIdentifier();
			String type = v_declaration.getType().getType_identifier().getIdentifier().getIdentifier();
			
			for (String name : names){
				Variable variable = new Variable(type, name);
				if (BlockValidator.hasVariable(block, variable)) {
					InvalidException.error(Message.DECLARED_VARIABLE, declaration.getVariable_declaration_part());
				} 
				BlockValidator.addVariable(block, variable);
			}
		}	
	}
	
}
