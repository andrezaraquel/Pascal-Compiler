package org.xtext.example.pascal.validation.exception;

public enum Message {
	UNEXPECTED_ERROR("Erro inesperado."),
	DECLARED_VARIABLE("Vari�vel j� declarada com este nome."),
	DECLARED_PROCEDURE("Procedure j� declarada com este nome."),
	DECLARED_FUNCTION("Fun��o j� declarada com este nome."),
	UNDECLARED_VARIABLE("Vari�vel n�o declarada."),
	INVALID_TERM("Termo da express�o inv�lido."),
	INVALID_TYPE("Tipo inv�lido.");
	
	
	private String content;
	
	private Message(String content){
		this.content = content;
	}
	
	public String getContent(){
		return content;
	}
}
