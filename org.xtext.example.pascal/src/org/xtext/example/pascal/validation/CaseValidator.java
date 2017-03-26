package org.xtext.example.pascal.validation;

import org.xtext.example.pascal.pascal.case_limb;
import org.xtext.example.pascal.pascal.case_statement;
import org.xtext.example.pascal.pascal.constant;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.simple_expression;
import org.xtext.example.pascal.pascal.term;
import org.xtext.example.pascal.validation.exception.InvalidException;
import org.xtext.example.pascal.validation.exception.Message;

public class CaseValidator {
	
	public static void validateCase(case_statement case_statement) {
		
		for (simple_expression simple_expression : case_statement.getExpression().getSimple_expression()) {
			
			for (term term: simple_expression.getTerm()){
				for (factor factor : term.getFactor()) {
					if ( factor.getVariable() != null && factor.getVariable().getEntire_variable() == null) {
						BlockValidator
						.addError(new InvalidException(Message.CASE_INVALID_EXPRESSION, factor));
					} else if (factor.getVariable() != null) {
						String variableName = factor.getVariable().getEntire_variable().getIdentifier().getIdentifier();
						String variableType = BlockValidator.getTypeVariable(variableName);
						
						if (variableType == null) {
							BlockValidator
							.addError(new InvalidException(Message.UNDECLARED_VARIABLE, factor));
						
						} else if (!variableType.equals("char") && !variableType.equals("integer") && !variableType.equals("boolean")) {
							BlockValidator
							.addError(new InvalidException(Message.CASE_INVALID_EXPRESSION, factor));
						
						} else {
							
							
								for (case_limb case_limb : case_statement.getCase_limb()) {
									for (constant constant : case_limb.getCase_label_list().getConstant()){
										if (variableType.equals("integer") && (constant.getNumber() == null || constant.getNumber().getInteger_number() == null) ) {
											BlockValidator
											.addError(new InvalidException(Message.CASE_INVALID_OPTION, constant));
										}
										
										if (variableType.equals("char") && (constant.getStrings() == null || constant.getStrings().length() > 3)) {
											BlockValidator
											.addError(new InvalidException(Message.CASE_INVALID_OPTION, constant));
										}
										
										if (variableType.equals("boolean") && constant.getBoolean() == null) {
											BlockValidator
											.addError(new InvalidException(Message.CASE_INVALID_OPTION, constant));
										}
									}
								}
							
							
						}
						
												
					}
				}
			}
			
		}
		
	}

}
