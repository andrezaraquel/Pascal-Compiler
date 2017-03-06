package org.xtext.example.pascal.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.pascal.pascal.*;
import org.xtext.example.pascal.validation.exception.InvalidException;
import org.xtext.example.pascal.validation.exception.Message;
import org.xtext.example.pascal.validation.obj.Function;
import org.xtext.example.pascal.validation.obj.Procedure;
import org.xtext.example.pascal.validation.obj.Variable;

public class BlockValidator {
	
	private static final String[] ARRAY_TYPES = 			
		{"string", "char", "integer", "shortint", "longint", "byte", "single", "extended", "word", "double", "real", "comp", "boolean"};
	
	private static List<String> declaredTypes;	
	private static List<String> typeList;	
	private static List<Variable> variablesList;
	private static List<Procedure> proceduresList;
	private static List<Function> functionsList;
	private static List<InvalidException> errorList;
	
	private static void init() {		

		typeList = new ArrayList<>();
		for (String s : ARRAY_TYPES) {
			typeList.add(s);
		}
		declaredTypes = new ArrayList<>();
		variablesList = new ArrayList<>();
		proceduresList = new ArrayList<>();
		functionsList = new ArrayList<>();
		errorList = new ArrayList<>();
	}

	public static void validateBlock(block block) {
		init();		
		addField(block,  block.getDeclaration_part());

	}	
	
	public static void addField(block block, declaration_part declaration) {
		
		
		
		
		if (declaration != null) {
			if (declaration.getVariable_declaration_part() != null) {
				
				for (type_definition type_definition : declaration.getType_definition_part().getType_definition()) {
					addDeclaredType(type_definition.getIdentifier().getIdentifier());
				}
				
				VariableValidator.validateDeclarationVariable(block, declaration);
			
			} 
			
			if (declaration.getProcedure_heading() != null){			
				
				EList<procedure_heading> procedures = declaration.getProcedure_heading();
				
				for (procedure_heading procedure : procedures){
					ProcedureValidator.validateDeclarationProcedure(block, procedure);
				}
			} else if (declaration.getProcedure_identification() != null) {
				
				EList<procedure_identification> procedures = declaration.getProcedure_identification();
				
				for (procedure_identification procedure : procedures){
					ProcedureValidator.validateDeclarationProcedure(block, procedure);
				}
			} 

			if (declaration.getFunction_heading() != null) {
				EList<function_heading> functions = declaration.getFunction_heading();
				
				for (function_heading function : functions){
					FunctionValidator.validateDeclarationFunction(block, function);
				}
			} else if (declaration.getFunction_identification() != null) {
				EList<function_identification> functions = declaration.getFunction_identification();
				
				for (function_identification function : functions){
					FunctionValidator.validateDeclarationFunction(block, function);
				}
			}
		}
		
	}
	
		
	public static void addVariable(block block, Variable variable) {
		getVariables().add(variable);
	}
	
	public static void addProcedure(Procedure procedure) {
		getProceduresList().add(procedure);
	}

	public static void addFunction(Function function) {
		getFunctionsList().add(function);
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

	private static List<Function> getFunctionsList() {
		if (functionsList == null) {
			functionsList = new ArrayList<>();
		}
		return functionsList;
	}

	public static List<Variable> getVariables() {
		if (variablesList == null) {
			variablesList = new ArrayList<>();
		}
		return variablesList;		
	}

	public static boolean hasVariable(block block, Variable variable) {
		return getVariables().contains(variable);
	}
	
	public static List<Procedure> getProceduresList() {
		if (proceduresList == null) {
			proceduresList = new ArrayList<>();
		}
		return proceduresList;
	}
		
	public static boolean hasProcedure(block block, Procedure procedure) {				
		return getProceduresList().contains(procedure);
	}
	
	public static boolean hasFunction(block block, Function function) {				
		return getFunctionsList().contains(function);
	}
	
	public static boolean isType(String string) {
		return typeList.contains(string);
	}
	
	public static void addDeclaredType(String newType) {
		declaredTypes.add(newType);
	}

	public static boolean hasDeclaredType(String type) {
		return declaredTypes.contains(type);
	}
	
}

