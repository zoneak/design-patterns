package com.ak.designpatterns.interpreter_visitor;

public interface Expressao {
	
	int avalia();
	
	void aceita(Visitor impressora);

}
