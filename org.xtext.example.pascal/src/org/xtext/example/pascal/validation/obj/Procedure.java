package org.xtext.example.pascal.validation.obj;

import java.util.List;

import com.google.common.base.Objects;

public class Procedure {
	
	private String name;
	private List<Variable> parameters; //Pode ser variável e outras coisas também. 
	
	public Procedure(String name){
		this.name = name;
	}

	public Procedure(String name, List<Variable> parameters){
		this.name = name;
		this.parameters = parameters;
	}
	
	public String getName(){
		return name;
	}
	
	public List<Variable> getParameters() {
		return parameters;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Procedure)) {
			return false;
		}
		Procedure other = (Procedure) obj;
		return this.name.equals(other.getName());
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}
}

