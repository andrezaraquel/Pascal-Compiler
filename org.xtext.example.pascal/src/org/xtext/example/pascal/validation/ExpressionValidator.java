package org.xtext.example.pascal.validation;

import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.simple_expression;
import org.xtext.example.pascal.pascal.term;
import org.xtext.example.pascal.validation.exception.InvalidException;
import org.xtext.example.pascal.validation.exception.Message;

public class ExpressionValidator {
	
	
	public static void validateExpression(assignment_statement assignment_statement, String parameterType) {
		String expressionType = getTypeExpression(assignment_statement);
		
		if (parameterType.equals("integer")) {			
			if (expressionType == null || !expressionType.equals("integer")) {
				BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
			}
			
		} 
		if (parameterType.equals("string")) {
			if (expressionType == null || !expressionType.equals("string")) {
				BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
			}
			
		}
		
		if (parameterType.equals("boolean")) {
			if (expressionType == null || !expressionType.equals("boolean")) {
				BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
			}
		}
	}
	
	
	public static void validateExpression(assignment_statement assignment_statement) {
		
		String variableName = assignment_statement.getVariable().getEntire_variable().getIdentifier().getIdentifier();
		String variableType = BlockValidator.getTypeVariable(variableName);		
		
		String expressionType = getTypeExpression(assignment_statement);
		
		if (variableType.equals("integer")) {			
			if (expressionType == null || !expressionType.equals("integer")) {
				BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
			}
			
		} 
		if (variableType.equals("string")) {
			if (expressionType == null || !expressionType.equals("string")) {
				BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
			}
			
		}
		
		if (variableType.equals("boolean")) {
			if (expressionType == null || !expressionType.equals("boolean")) {
				BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
			}
		}
		
		
	}

	private static String getTypeExpression(assignment_statement assignment_statement) {
		for (simple_expression simple_expression : assignment_statement.getExpression().getSimple_expression()) {
		 	for (term termList : simple_expression.getTerm()) {
			 	for (factor factorList : termList.getFactor()) {
			 		
			 		if (factorList.getNumber() != null && factorList.getNumber().getInteger_number() != null){
			 			if (assignment_statement.getVariable() != null) {			 				
			 				return "integer";
			 			}
			 			
			 		} else if (factorList.getStrings() != null) {
			 			return "string";
			 		
			 		} else if (factorList.getBoolean() != null) {
			 			return "boolean";
			 		}
			 	}
		 	}
	 	}
		return null;
	}

	public static void validateBooleanExpression(assignment_statement assignment_statement) {
		if (assignment_statement.getExpression().getRelational_operator() != null) {
			if (assignment_statement.getVariable() != null) {
				String variableName = assignment_statement.getVariable().getEntire_variable().getIdentifier().getIdentifier();
				String type = BlockValidator.getTypeVariable(variableName);
				if (type == null || !type.equals("boolean")) {
					BlockValidator.addError(new InvalidException(Message.INVALID_ATTR, assignment_statement.getExpression()));
				}
			}
		}
	}
	

}
