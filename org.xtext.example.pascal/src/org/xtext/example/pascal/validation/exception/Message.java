package org.xtext.example.pascal.validation.exception;

public enum Message {
	UNEXPECTE_ERROR("Erro inesperado."),
	DECLARED_VARIABLE("Vari�vel j� declarada com este nome."),
	UNDECLARED_VARIABLE("A vari�vel n�o foi declarada."),
	DECLARED_PROCEDURE("Procedure j� declarada com este nome."),
	DECLARED_FUNCTION("Fun��o j� declarada com este nome.");
	
	
	private String content;
	
	private Message(String content){
		this.content = content;
	}
	
	public String getContent(){
		return content;
	}
}
