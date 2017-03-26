package org.xtext.example.pascal.validation.exception;

public enum Message {
	UNEXPECTED_ERROR("Erro inesperado."),
	DECLARED_VARIABLE("Vari�vel j� declarada com este nome."),
	DECLARED_PROCEDURE("Procedure j� declarada com este nome."),
	DECLARED_FUNCTION("Fun��o j� declarada com este nome."),
	UNDECLARED_VARIABLE("Vari�vel n�o declarada."),
	INVALID_TERM("Termo da express�o inv�lido."),
	INVALID_TYPE("Tipo inv�lido."),
	PARAMS_EQUALS("Par�metros n�o podem ter o mesmo nome."),
	INVALID_ATTRIBUITION("Tipo e atribui��o n�o compat�veis."),
	INVALID_EXPRESSION("Express�o aritm�tica inv�lida."),
	ARITHMETIC_INVALID_OPERATION("Tipo da vari�vel n�o compat�vel com opera��o aritm�tica."),
	ARITHMETIC_INVALID_REAL("Express�o 'real' n�o aplicada a vari�vel 'integer'"),
	ARITHMETIC_INVALID_DIV("Operador 'div' aplicado apenas para 'integer'.");
	
	
	private String content;
	
	private Message(String content){
		this.content = content;
	}
	
	public String getContent(){
		return content;
	}
}