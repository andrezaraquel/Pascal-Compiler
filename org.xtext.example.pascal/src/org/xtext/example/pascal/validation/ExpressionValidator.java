package org.xtext.example.pascal.validation;

import org.xtext.example.pascal.pascal.addition_operator;
import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.simple_expression;
import org.xtext.example.pascal.pascal.term;
import org.xtext.example.pascal.validation.exception.InvalidException;
import org.xtext.example.pascal.validation.exception.Message;

public class ExpressionValidator {

	public static void validateExpression(assignment_statement assignment_statement, String parameterType) {
		String expressionType = getTypeSimpleExpression(assignment_statement);

		if (parameterType != null && parameterType.equals("integer")) {
			if (expressionType == null || !expressionType.equals("integer")) {
				if (expressionType.equals("real")) {
					BlockValidator.addError(new InvalidException(Message.ARITHMETIC_INVALID_REAL, assignment_statement));
				} else {
					BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
				}
			}

		}
		if (parameterType != null && parameterType.equals("string")) {
			if (expressionType == null || !expressionType.equals("string")) {
				BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
			}

		}

		if (parameterType != null && parameterType.equals("boolean")) {
			if (expressionType == null || !expressionType.equals("boolean")) {
				BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
			}
		}
	}

	public static void validateSimpleExpression(assignment_statement assignment_statement) {

		String variableName = assignment_statement.getVariable().getEntire_variable().getIdentifier().getIdentifier();
		String variableType = BlockValidator.getTypeVariable(variableName);

		String expressionType = getTypeSimpleExpression(assignment_statement);

		if (variableType != null) {
			if (variableType.equals("integer")) {
				if (expressionType == null || !expressionType.equals("integer")) {
					if (expressionType != null && expressionType.equals("real")) {
						BlockValidator
								.addError(new InvalidException(Message.ARITHMETIC_INVALID_REAL, assignment_statement));
					} else {
						BlockValidator
								.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
					}
				}
			}
			if (variableType.equals("string")) {
				if (expressionType == null || !expressionType.equals("string")) {
					BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement));
				}

			}

			if (variableType.equals("boolean")) {
				if (expressionType == null || !expressionType.equals("boolean")) {
					if (assignment_statement.getExpression().getRelational_operator() == null) {
						BlockValidator.addError(new InvalidException(Message.INVALID_ATTRIBUITION,
								assignment_statement.getExpression()));

					}
				}
			}

		}
	}

	private static String getTypeSimpleExpression(assignment_statement assignment_statement) {
		for (simple_expression simple_expression : assignment_statement.getExpression().getSimple_expression()) {
			for (term termList : simple_expression.getTerm()) {
				for (factor factor : termList.getFactor()) {

					if (factor.getNumber() != null && factor.getNumber().getInteger_number() != null) {
						if (assignment_statement.getVariable() != null) {
							return "integer";
						}

					} else if (factor.getNumber() != null && factor.getNumber().getReal_number() != null) {
						if (assignment_statement.getVariable() != null) {
							return "real";
						}
					} else if (factor.getStrings() != null) {
						return "string";

					} else if (factor.getBoolean() != null) {
						return "boolean";

					} else if (factor.getVariable() != null) {
						String variableName = factor.getVariable().getEntire_variable().getIdentifier().getIdentifier();
						return BlockValidator.getTypeVariable(variableName);
					}
				}
			}
		}
		return null;
	}

	public static void validateBooleanExpression(assignment_statement assignment_statement) {
		if (assignment_statement.getExpression().getRelational_operator() != null) {

			if (assignment_statement.getVariable() != null) {
				String variableName = assignment_statement.getVariable().getEntire_variable().getIdentifier()
						.getIdentifier();
				String type = BlockValidator.getTypeVariable(variableName);
				if (type == null || !type.equals("boolean")) {
					BlockValidator.addError(
							new InvalidException(Message.INVALID_ATTRIBUITION, assignment_statement.getExpression()));
				}
			}
		}
	}

	public static void validateArithmeticExpression(assignment_statement assignment_statement) {

		String declaratedVariableName = assignment_statement.getVariable().getEntire_variable().getIdentifier()
				.getIdentifier();
		String declaratedVariableType = BlockValidator.getTypeVariable(declaratedVariableName);

		if (assignment_statement.getExpression().getSimple_expression() != null) {

			for (simple_expression simple_expression : assignment_statement.getExpression().getSimple_expression()) {

				validatePlusAndMinusExpression(simple_expression, declaratedVariableType);
				validateMultAndDivExpression(simple_expression, declaratedVariableType);

			}

		}
	}

	private static void validatePlusAndMinusExpression(simple_expression simple_expression,
			String declaratedVariableType) {
		if (simple_expression.getAddition_operator() != null) {
			for (addition_operator addition_operator : simple_expression.getAddition_operator()) {
				if (addition_operator != null && !addition_operator.equals("or")) {
					for (term terms : simple_expression.getTerm()) {
						for (factor factor : terms.getFactor()) {

							if (factor.getNumber() != null && factor.getNumber().getReal_number() != null) {
								if (declaratedVariableType.equals("integer")) {
									BlockValidator
											.addError(new InvalidException(Message.ARITHMETIC_INVALID_REAL, factor));
								}
							}

							if (factor.getVariable() != null) {
								String variableName = factor.getVariable().getEntire_variable().getIdentifier()
										.getIdentifier();
								String type = BlockValidator.getTypeVariable(variableName);

								if (type == null) {
									BlockValidator.addError(new InvalidException(Message.UNDECLARED_VARIABLE, factor));

								} else if (!type.equals("integer") && !type.equals("real")) {
									BlockValidator.addError(
											new InvalidException(Message.ARITHMETIC_INVALID_OPERATION, factor));

								} else if (type.equals("real") && declaratedVariableType.equals("integer")) {
									BlockValidator
											.addError(new InvalidException(Message.ARITHMETIC_INVALID_REAL, factor));
								}

							} else if (factor.getNumber() == null) {
								BlockValidator
										.addError(new InvalidException(Message.INVALID_EXPRESSION, simple_expression));
							}
						}
					}

				}
			}
		}
	}

	private static void validateMultAndDivExpression(simple_expression simple_expression,
			String declaratedVariableType) {
		for (term term : simple_expression.getTerm()) {
			if (term.getMultiplication_operator() != null) {
				for (String multiplication_operator : term.getMultiplication_operator()) {
					if (multiplication_operator != null) {
						for (factor factor : term.getFactor()) {

							if (factor.getNumber() != null && factor.getNumber().getReal_number() != null) {
								if (declaratedVariableType.equals("integer")) {
									BlockValidator
											.addError(new InvalidException(Message.ARITHMETIC_INVALID_REAL, factor));
								}
							}

							if (multiplication_operator.equals("div")) {

								if (declaratedVariableType.equals("real") || (factor.getNumber() != null
										&& factor.getNumber().getReal_number() != null)) {
									{
										BlockValidator.addError(new InvalidException(Message.ARITHMETIC_INVALID_DIV,
												simple_expression));
									}
								}

								if (factor.getVariable() != null) {
									String variableName = factor.getVariable().getEntire_variable().getIdentifier()
											.getIdentifier();
									String type = BlockValidator.getTypeVariable(variableName);

									if (type == null) {
										BlockValidator
												.addError(new InvalidException(Message.UNDECLARED_VARIABLE, factor));

									} else if (!type.equals("integer") && !type.equals("real")) {
										BlockValidator.addError(
												new InvalidException(Message.ARITHMETIC_INVALID_OPERATION, factor));

									} else if (type.equals("real") && declaratedVariableType.equals("integer")) {
										BlockValidator.addError(
												new InvalidException(Message.ARITHMETIC_INVALID_REAL, factor));
									}

									if (multiplication_operator.equals("div") && type.equals("real")) {
										BlockValidator
												.addError(new InvalidException(Message.ARITHMETIC_INVALID_DIV, term));
									}

								} else if (factor.getNumber() == null) {
									BlockValidator.addError(
											new InvalidException(Message.INVALID_EXPRESSION, simple_expression));
								}
							}

						}
					}
				}
			}
		}

	}
}