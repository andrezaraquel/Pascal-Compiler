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
	
	
	private static List<Variable> listVariables;
	private static List<Procedure> listProcedures;
	private static List<Function> listFunctions;
	
	private static void init() {
		listVariables = new ArrayList<>();
		listProcedures = new ArrayList<>();
		listFunctions = new ArrayList<>();
	}

	public static void validateBlock(block block) {
		init();		
		addField(block,  block.getDeclaration_part());

	}	
	
	public static void addField(block block, declaration_part declaration) {
		if (declaration.getVariable_declaration_part() != null) {
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
	
		
	public static void addVariable(block block, Variable variable) {
		getVariables().add(variable);
	}
	
	public static void addProcedure(Procedure procedure) {
		getListProcedures().add(procedure);
	}

	public static void addFunction(Function function) {
		getListFunctions().add(function);
	}
	
	private static List<Function> getListFunctions() {
		if (listFunctions == null) {
			listFunctions = new ArrayList<>();
		}
		return listFunctions;
	}

	public static List<Variable> getVariables() {
		if (listVariables == null) {
			listVariables = new ArrayList<>();
		}
		return listVariables;
	}

	public static boolean hasVariable(block block, Variable variable) {
		return getVariables().contains(variable);
	}
	
	public static List<Procedure> getListProcedures() {
		if (listProcedures == null) {
			listProcedures = new ArrayList<>();
		}
		return listProcedures;
	}
	
	public static boolean hasProcedure(block block, Procedure procedure) {				
		return getListProcedures().contains(procedure);
	}
	
	public static boolean hasFunction(block block, Function function) {				
		return getListFunctions().contains(function);
	}
	
}

