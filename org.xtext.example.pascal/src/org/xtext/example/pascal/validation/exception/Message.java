package org.xtext.example.pascal.validation.exception;

public enum Message {
	UNEXPECTED_ERROR("Erro inesperado."),
	DECLARED_VARIABLE("Variável já declarada com este nome."),
	DECLARED_PROCEDURE("Procedure já declarada com este nome."),
	DECLARED_FUNCTION("Função já declarada com este nome."),
	UNDECLARED_VARIABLE("Variável não declarada."),
	INVALID_TERM("Termo da expressão inválido."),
	INVALID_TYPE("Tipo inválido.");
	
	
	private String content;
	
	private Message(String content){
		this.content = content;
	}
	
	public String getContent(){
		return content;
	}
}
