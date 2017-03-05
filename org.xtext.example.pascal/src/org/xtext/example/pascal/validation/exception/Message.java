package org.xtext.example.pascal.validation.exception;

public enum Message {
	UNEXPECTE_ERROR("Erro inesperado."),
	DECLARED_VARIABLE("Variável já declarada com este nome."),
	UNDECLARED_VARIABLE("A variável não foi declarada."),
	DECLARED_PROCEDURE("Procedure já declarada com este nome."),
	DECLARED_FUNCTION("Função já declarada com este nome.");
	
	
	private String content;
	
	private Message(String content){
		this.content = content;
	}
	
	public String getContent(){
		return content;
	}
}
