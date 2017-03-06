package org.xtext.example.pascal.validation;

import java.util.ArrayList;
import java.util.List;

import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.expression;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.simple_expression;
import org.xtext.example.pascal.pascal.term;
import org.xtext.example.pascal.validation.exception.InvalidException;
import org.xtext.example.pascal.validation.exception.Message;
import org.xtext.example.pascal.validation.obj.Variable;

public class ExpressionValidator {

	private static List<InvalidException> errorList;
	
	private static void init() {
		errorList = new ArrayList<>();
	}
	
	public static void addError(InvalidException error) {
		getErrorList().add(error);
	}
	
	public static List<InvalidException> getErrorList() {
		if (errorList == null) {
			errorList = new ArrayList<>();
		}
		return errorList;
	}
	
	
	public static void validateExpression(assignment_statement statement) {		
	
		String variableName = statement.getVariable().getEntire_variable().getIdentifier().getIdentifier();
		Variable variable = new Variable(variableName);
		
		if (!BlockValidator.hasVariable(null, variable)) {
			addError(new InvalidException(Message.UNDECLARED_VARIABLE, statement));
		}
		
		for (simple_expression se : statement.getExpression().getSimple_expression()) {
			
			
			for (term term : se.getTerm()) {
				String additionOperator = null;
				for (String ao : se.getAddition_operator()) {
					System.out.println();
					additionOperator = ao;
				}
				
				
				if (additionOperator != null && !additionOperator.equals("or")){ // verificar se é uma subtração... se for, só pode ser netre 
					for (factor factor : term.getFactor()) {

						try {
						String number = factor.getNumber().getInteger_number().getDigit_sequence().getUnsigned_digit_sequence();
						
							
						
						} catch(Exception e) {
							addError(new InvalidException(Message.INVALID_TERM, se));
						}
						
					}
				}				
			}
			
		}
		
	}

}
