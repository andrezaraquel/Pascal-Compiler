package org.xtext.example.pascal.validation;

import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.validation.exception.InvalidException;
import org.xtext.example.pascal.validation.exception.Message;

public class BooleanExpressionValidator {

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
