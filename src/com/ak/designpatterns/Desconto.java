package com.ak.designpatterns;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
