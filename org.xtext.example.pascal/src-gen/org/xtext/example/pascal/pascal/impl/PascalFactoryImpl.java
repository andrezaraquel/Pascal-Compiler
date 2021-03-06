/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.pascal.pascal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalFactoryImpl extends EFactoryImpl implements PascalFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PascalFactory init()
  {
    try
    {
      PascalFactory thePascalFactory = (PascalFactory)EPackage.Registry.INSTANCE.getEFactory(PascalPackage.eNS_URI);
      if (thePascalFactory != null)
      {
        return thePascalFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PascalFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PascalPackage.BEGIN: return createBegin();
      case PascalPackage.PROGRAM: return createprogram();
      case PascalPackage.PROGRAM_HEADING: return createprogram_heading();
      case PascalPackage.IDENTIFIER_LIST: return createidentifier_list();
      case PascalPackage.PROCEDURE_BLOCK: return createprocedure_block();
      case PascalPackage.FUNCTION_BLOCK: return createfunction_block();
      case PascalPackage.BLOCK: return createblock();
      case PascalPackage.STATEMENT_PART: return createstatement_part();
      case PascalPackage.STATEMENT_SEQUENCE: return createstatement_sequence();
      case PascalPackage.STATEMENT: return createstatement();
      case PascalPackage.SIMPLE_STATEMENT: return createsimple_statement();
      case PascalPackage.GOTO_STATEMENT: return creategoto_statement();
      case PascalPackage.PROCEDURE_STATEMENT: return createprocedure_statement();
      case PascalPackage.ACTUAL_PARAMETER_LIST: return createactual_parameter_list();
      case PascalPackage.ACTUAL_PARAMETER: return createactual_parameter();
      case PascalPackage.ACTUAL_FUNCTION: return createactual_function();
      case PascalPackage.ACTUAL_PROCEDURE: return createactual_procedure();
      case PascalPackage.ACTUAL_VARIABLE: return createactual_variable();
      case PascalPackage.ACTUAL_VALUE: return createactual_value();
      case PascalPackage.IDENTIFIER: return createidentifier();
      case PascalPackage.ASSIGNMENT_STATEMENT: return createassignment_statement();
      case PascalPackage.EXPRESSION: return createexpression();
      case PascalPackage.SIMPLE_EXPRESSION: return createsimple_expression();
      case PascalPackage.ADDITION_OPERATOR: return createaddition_operator();
      case PascalPackage.TERM: return createterm();
      case PascalPackage.FACTOR: return createfactor();
      case PascalPackage.FUNCTION_DESIGNATOR: return createfunction_designator();
      case PascalPackage.SET: return createset();
      case PascalPackage.ELEMENT_LIST: return createelement_list();
      case PascalPackage.NUMBER: return createnumber();
      case PascalPackage.REAL_NUMBER: return createreal_number();
      case PascalPackage.SCALE_FACTOR: return createscale_factor();
      case PascalPackage.VARIABLE: return createvariable();
      case PascalPackage.ENTIRE_VARIABLE: return createentire_variable();
      case PascalPackage.EXPRESSION_LIST: return createexpression_list();
      case PascalPackage.LABEL: return createlabel();
      case PascalPackage.INTEGER_NUMBER: return createinteger_number();
      case PascalPackage.DIGIT_SEQUENCE: return createdigit_sequence();
      case PascalPackage.STRUCTURED_STATEMENT: return createstructured_statement();
      case PascalPackage.WITH_STATEMENT: return createwith_statement();
      case PascalPackage.CONDITIONAL_STATEMENT: return createconditional_statement();
      case PascalPackage.CASE_STATEMENT: return createcase_statement();
      case PascalPackage.CASE_LIMB: return createcase_limb();
      case PascalPackage.CASE_LABEL_LIST: return createcase_label_list();
      case PascalPackage.IF_STATEMENT: return createif_statement();
      case PascalPackage.REPETITIVE_STATEMENT: return createrepetitive_statement();
      case PascalPackage.FOR_STATEMENT: return createfor_statement();
      case PascalPackage.FINAL_EXPRESSION: return createfinal_expression();
      case PascalPackage.INITIAL_EXPRESSION: return createinitial_expression();
      case PascalPackage.REPEAT_STATEMENT: return createrepeat_statement();
      case PascalPackage.WHILE_STATEMENT: return createwhile_statement();
      case PascalPackage.COMPOUND_STATEMENT: return createcompound_statement();
      case PascalPackage.DECLARATION_PART: return createdeclaration_part();
      case PascalPackage.LABEL_DECLARATION_PART: return createlabel_declaration_part();
      case PascalPackage.CONSTANT_DEFINITION_PART: return createconstant_definition_part();
      case PascalPackage.CONSTANT_DEFINITION: return createconstant_definition();
      case PascalPackage.CONSTANT: return createconstant();
      case PascalPackage.TYPE_DEFINITION_PART: return createtype_definition_part();
      case PascalPackage.TYPE_DEFINITION: return createtype_definition();
      case PascalPackage.TYPE: return createtype();
      case PascalPackage.TYPE_IDENTIFIER: return createtype_identifier();
      case PascalPackage.POINTER_TYPE: return createpointer_type();
      case PascalPackage.STRUCTURED_TYPE: return createstructured_type();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE: return createunpacked_structured_type();
      case PascalPackage.FILE_TYPE: return createfile_type();
      case PascalPackage.FILE_COMPONENT_TYPE: return createfile_component_type();
      case PascalPackage.SET_TYPE: return createset_type();
      case PascalPackage.BASE_TYPE: return createbase_type();
      case PascalPackage.RECORD_TYPE: return createrecord_type();
      case PascalPackage.FIELD_LIST: return createfield_list();
      case PascalPackage.FIXED_PART: return createfixed_part();
      case PascalPackage.RECORD_SECTION: return createrecord_section();
      case PascalPackage.VARIANT_PART: return createvariant_part();
      case PascalPackage.VARIANT: return createvariant();
      case PascalPackage.TAG_FIELD: return createtag_field();
      case PascalPackage.ARRAY_TYPE: return createarray_type();
      case PascalPackage.ELEMENT_TYPE: return createelement_type();
      case PascalPackage.INDEX_TYPE: return createindex_type();
      case PascalPackage.SIMPLE_TYPE: return createsimple_type();
      case PascalPackage.ENUMERATED_TYPE: return createenumerated_type();
      case PascalPackage.SUBRANGE_TYPE: return createsubrange_type();
      case PascalPackage.LOWER_BOUND: return createlower_bound();
      case PascalPackage.UPPER_BOUND: return createupper_bound();
      case PascalPackage.VARIABLE_DECLARATION_PART: return createvariable_declaration_part();
      case PascalPackage.VARIABLE_DECLARATION: return createvariable_declaration();
      case PascalPackage.FUNCTION_IDENTIFICATION: return createfunction_identification();
      case PascalPackage.FUNCTION_BODY: return createfunction_body();
      case PascalPackage.PROCEDURE_IDENTIFICATION: return createprocedure_identification();
      case PascalPackage.DIRECTIVE: return createdirective();
      case PascalPackage.COMPILER_DEFINED_DIRECTIVES: return createcompiler_defined_directives();
      case PascalPackage.PROCEDURE_BODY: return createprocedure_body();
      case PascalPackage.PROCEDURE_HEADING: return createprocedure_heading();
      case PascalPackage.FORMAL_PARAMETER_LIST: return createformal_parameter_list();
      case PascalPackage.FORMAL_PARAMETER_SECTION: return createformal_parameter_section();
      case PascalPackage.FUNCTION_PARAMETER_SECTION: return createfunction_parameter_section();
      case PascalPackage.FUNCTION_HEADING: return createfunction_heading();
      case PascalPackage.RESULT_TYPE: return createresult_type();
      case PascalPackage.PROCEDURE_PARAMETER_SECTION: return createprocedure_parameter_section();
      case PascalPackage.VARIABLE_PARAMETER_SECTION: return createvariable_parameter_section();
      case PascalPackage.VALUE_PARAMETER_SECTION: return createvalue_parameter_section();
      case PascalPackage.PARAMETER_TYPE: return createparameter_type();
      case PascalPackage.CONFORMANT_ARRAY_SCHEMA: return createconformant_array_schema();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA: return createunpacked_conformant_array_schema();
      case PascalPackage.BOUND_SPECIFICATION: return createbound_specification();
      case PascalPackage.ORDINAL_TYPE_IDENTIFIER: return createordinal_type_identifier();
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA: return createpacked_conformant_array_schema();
      case PascalPackage.OUTPUT_LIST: return createoutput_list();
      case PascalPackage.OUTPUT_VALUE: return createoutput_value();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Begin createBegin()
  {
    BeginImpl begin = new BeginImpl();
    return begin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public program createprogram()
  {
    programImpl program = new programImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public program_heading createprogram_heading()
  {
    program_headingImpl program_heading = new program_headingImpl();
    return program_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier_list createidentifier_list()
  {
    identifier_listImpl identifier_list = new identifier_listImpl();
    return identifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_block createprocedure_block()
  {
    procedure_blockImpl procedure_block = new procedure_blockImpl();
    return procedure_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_block createfunction_block()
  {
    function_blockImpl function_block = new function_blockImpl();
    return function_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block createblock()
  {
    blockImpl block = new blockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_part createstatement_part()
  {
    statement_partImpl statement_part = new statement_partImpl();
    return statement_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_sequence createstatement_sequence()
  {
    statement_sequenceImpl statement_sequence = new statement_sequenceImpl();
    return statement_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_statement createsimple_statement()
  {
    simple_statementImpl simple_statement = new simple_statementImpl();
    return simple_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public goto_statement creategoto_statement()
  {
    goto_statementImpl goto_statement = new goto_statementImpl();
    return goto_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_statement createprocedure_statement()
  {
    procedure_statementImpl procedure_statement = new procedure_statementImpl();
    return procedure_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actual_parameter_list createactual_parameter_list()
  {
    actual_parameter_listImpl actual_parameter_list = new actual_parameter_listImpl();
    return actual_parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actual_parameter createactual_parameter()
  {
    actual_parameterImpl actual_parameter = new actual_parameterImpl();
    return actual_parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actual_function createactual_function()
  {
    actual_functionImpl actual_function = new actual_functionImpl();
    return actual_function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actual_procedure createactual_procedure()
  {
    actual_procedureImpl actual_procedure = new actual_procedureImpl();
    return actual_procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actual_variable createactual_variable()
  {
    actual_variableImpl actual_variable = new actual_variableImpl();
    return actual_variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actual_value createactual_value()
  {
    actual_valueImpl actual_value = new actual_valueImpl();
    return actual_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier createidentifier()
  {
    identifierImpl identifier = new identifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_statement createassignment_statement()
  {
    assignment_statementImpl assignment_statement = new assignment_statementImpl();
    return assignment_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_expression createsimple_expression()
  {
    simple_expressionImpl simple_expression = new simple_expressionImpl();
    return simple_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public addition_operator createaddition_operator()
  {
    addition_operatorImpl addition_operator = new addition_operatorImpl();
    return addition_operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public term createterm()
  {
    termImpl term = new termImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factor createfactor()
  {
    factorImpl factor = new factorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_designator createfunction_designator()
  {
    function_designatorImpl function_designator = new function_designatorImpl();
    return function_designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public set createset()
  {
    setImpl set = new setImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_list createelement_list()
  {
    element_listImpl element_list = new element_listImpl();
    return element_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number createnumber()
  {
    numberImpl number = new numberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public real_number createreal_number()
  {
    real_numberImpl real_number = new real_numberImpl();
    return real_number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scale_factor createscale_factor()
  {
    scale_factorImpl scale_factor = new scale_factorImpl();
    return scale_factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable createvariable()
  {
    variableImpl variable = new variableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public entire_variable createentire_variable()
  {
    entire_variableImpl entire_variable = new entire_variableImpl();
    return entire_variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_list createexpression_list()
  {
    expression_listImpl expression_list = new expression_listImpl();
    return expression_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label createlabel()
  {
    labelImpl label = new labelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public integer_number createinteger_number()
  {
    integer_numberImpl integer_number = new integer_numberImpl();
    return integer_number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public digit_sequence createdigit_sequence()
  {
    digit_sequenceImpl digit_sequence = new digit_sequenceImpl();
    return digit_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structured_statement createstructured_statement()
  {
    structured_statementImpl structured_statement = new structured_statementImpl();
    return structured_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public with_statement createwith_statement()
  {
    with_statementImpl with_statement = new with_statementImpl();
    return with_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditional_statement createconditional_statement()
  {
    conditional_statementImpl conditional_statement = new conditional_statementImpl();
    return conditional_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_statement createcase_statement()
  {
    case_statementImpl case_statement = new case_statementImpl();
    return case_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_limb createcase_limb()
  {
    case_limbImpl case_limb = new case_limbImpl();
    return case_limb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_label_list createcase_label_list()
  {
    case_label_listImpl case_label_list = new case_label_listImpl();
    return case_label_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public if_statement createif_statement()
  {
    if_statementImpl if_statement = new if_statementImpl();
    return if_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public repetitive_statement createrepetitive_statement()
  {
    repetitive_statementImpl repetitive_statement = new repetitive_statementImpl();
    return repetitive_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_statement createfor_statement()
  {
    for_statementImpl for_statement = new for_statementImpl();
    return for_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public final_expression createfinal_expression()
  {
    final_expressionImpl final_expression = new final_expressionImpl();
    return final_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public initial_expression createinitial_expression()
  {
    initial_expressionImpl initial_expression = new initial_expressionImpl();
    return initial_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public repeat_statement createrepeat_statement()
  {
    repeat_statementImpl repeat_statement = new repeat_statementImpl();
    return repeat_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public while_statement createwhile_statement()
  {
    while_statementImpl while_statement = new while_statementImpl();
    return while_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compound_statement createcompound_statement()
  {
    compound_statementImpl compound_statement = new compound_statementImpl();
    return compound_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_part createdeclaration_part()
  {
    declaration_partImpl declaration_part = new declaration_partImpl();
    return declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label_declaration_part createlabel_declaration_part()
  {
    label_declaration_partImpl label_declaration_part = new label_declaration_partImpl();
    return label_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition_part createconstant_definition_part()
  {
    constant_definition_partImpl constant_definition_part = new constant_definition_partImpl();
    return constant_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition createconstant_definition()
  {
    constant_definitionImpl constant_definition = new constant_definitionImpl();
    return constant_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant createconstant()
  {
    constantImpl constant = new constantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition_part createtype_definition_part()
  {
    type_definition_partImpl type_definition_part = new type_definition_partImpl();
    return type_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition createtype_definition()
  {
    type_definitionImpl type_definition = new type_definitionImpl();
    return type_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type createtype()
  {
    typeImpl type = new typeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_identifier createtype_identifier()
  {
    type_identifierImpl type_identifier = new type_identifierImpl();
    return type_identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer_type createpointer_type()
  {
    pointer_typeImpl pointer_type = new pointer_typeImpl();
    return pointer_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structured_type createstructured_type()
  {
    structured_typeImpl structured_type = new structured_typeImpl();
    return structured_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpacked_structured_type createunpacked_structured_type()
  {
    unpacked_structured_typeImpl unpacked_structured_type = new unpacked_structured_typeImpl();
    return unpacked_structured_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public file_type createfile_type()
  {
    file_typeImpl file_type = new file_typeImpl();
    return file_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public file_component_type createfile_component_type()
  {
    file_component_typeImpl file_component_type = new file_component_typeImpl();
    return file_component_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public set_type createset_type()
  {
    set_typeImpl set_type = new set_typeImpl();
    return set_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public base_type createbase_type()
  {
    base_typeImpl base_type = new base_typeImpl();
    return base_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public record_type createrecord_type()
  {
    record_typeImpl record_type = new record_typeImpl();
    return record_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_list createfield_list()
  {
    field_listImpl field_list = new field_listImpl();
    return field_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fixed_part createfixed_part()
  {
    fixed_partImpl fixed_part = new fixed_partImpl();
    return fixed_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public record_section createrecord_section()
  {
    record_sectionImpl record_section = new record_sectionImpl();
    return record_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variant_part createvariant_part()
  {
    variant_partImpl variant_part = new variant_partImpl();
    return variant_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variant createvariant()
  {
    variantImpl variant = new variantImpl();
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tag_field createtag_field()
  {
    tag_fieldImpl tag_field = new tag_fieldImpl();
    return tag_field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public array_type createarray_type()
  {
    array_typeImpl array_type = new array_typeImpl();
    return array_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_type createelement_type()
  {
    element_typeImpl element_type = new element_typeImpl();
    return element_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public index_type createindex_type()
  {
    index_typeImpl index_type = new index_typeImpl();
    return index_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_type createsimple_type()
  {
    simple_typeImpl simple_type = new simple_typeImpl();
    return simple_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enumerated_type createenumerated_type()
  {
    enumerated_typeImpl enumerated_type = new enumerated_typeImpl();
    return enumerated_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subrange_type createsubrange_type()
  {
    subrange_typeImpl subrange_type = new subrange_typeImpl();
    return subrange_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lower_bound createlower_bound()
  {
    lower_boundImpl lower_bound = new lower_boundImpl();
    return lower_bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public upper_bound createupper_bound()
  {
    upper_boundImpl upper_bound = new upper_boundImpl();
    return upper_bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration_part createvariable_declaration_part()
  {
    variable_declaration_partImpl variable_declaration_part = new variable_declaration_partImpl();
    return variable_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration createvariable_declaration()
  {
    variable_declarationImpl variable_declaration = new variable_declarationImpl();
    return variable_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_identification createfunction_identification()
  {
    function_identificationImpl function_identification = new function_identificationImpl();
    return function_identification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_body createfunction_body()
  {
    function_bodyImpl function_body = new function_bodyImpl();
    return function_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_identification createprocedure_identification()
  {
    procedure_identificationImpl procedure_identification = new procedure_identificationImpl();
    return procedure_identification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public directive createdirective()
  {
    directiveImpl directive = new directiveImpl();
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compiler_defined_directives createcompiler_defined_directives()
  {
    compiler_defined_directivesImpl compiler_defined_directives = new compiler_defined_directivesImpl();
    return compiler_defined_directives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_body createprocedure_body()
  {
    procedure_bodyImpl procedure_body = new procedure_bodyImpl();
    return procedure_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_heading createprocedure_heading()
  {
    procedure_headingImpl procedure_heading = new procedure_headingImpl();
    return procedure_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formal_parameter_list createformal_parameter_list()
  {
    formal_parameter_listImpl formal_parameter_list = new formal_parameter_listImpl();
    return formal_parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formal_parameter_section createformal_parameter_section()
  {
    formal_parameter_sectionImpl formal_parameter_section = new formal_parameter_sectionImpl();
    return formal_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_parameter_section createfunction_parameter_section()
  {
    function_parameter_sectionImpl function_parameter_section = new function_parameter_sectionImpl();
    return function_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_heading createfunction_heading()
  {
    function_headingImpl function_heading = new function_headingImpl();
    return function_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public result_type createresult_type()
  {
    result_typeImpl result_type = new result_typeImpl();
    return result_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_parameter_section createprocedure_parameter_section()
  {
    procedure_parameter_sectionImpl procedure_parameter_section = new procedure_parameter_sectionImpl();
    return procedure_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_parameter_section createvariable_parameter_section()
  {
    variable_parameter_sectionImpl variable_parameter_section = new variable_parameter_sectionImpl();
    return variable_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public value_parameter_section createvalue_parameter_section()
  {
    value_parameter_sectionImpl value_parameter_section = new value_parameter_sectionImpl();
    return value_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_type createparameter_type()
  {
    parameter_typeImpl parameter_type = new parameter_typeImpl();
    return parameter_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conformant_array_schema createconformant_array_schema()
  {
    conformant_array_schemaImpl conformant_array_schema = new conformant_array_schemaImpl();
    return conformant_array_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpacked_conformant_array_schema createunpacked_conformant_array_schema()
  {
    unpacked_conformant_array_schemaImpl unpacked_conformant_array_schema = new unpacked_conformant_array_schemaImpl();
    return unpacked_conformant_array_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bound_specification createbound_specification()
  {
    bound_specificationImpl bound_specification = new bound_specificationImpl();
    return bound_specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ordinal_type_identifier createordinal_type_identifier()
  {
    ordinal_type_identifierImpl ordinal_type_identifier = new ordinal_type_identifierImpl();
    return ordinal_type_identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public packed_conformant_array_schema createpacked_conformant_array_schema()
  {
    packed_conformant_array_schemaImpl packed_conformant_array_schema = new packed_conformant_array_schemaImpl();
    return packed_conformant_array_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public output_list createoutput_list()
  {
    output_listImpl output_list = new output_listImpl();
    return output_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public output_value createoutput_value()
  {
    output_valueImpl output_value = new output_valueImpl();
    return output_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalPackage getPascalPackage()
  {
    return (PascalPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PascalPackage getPackage()
  {
    return PascalPackage.eINSTANCE;
  }

} //PascalFactoryImpl
