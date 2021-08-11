package com.ak.designpatterns;

public interface EstadoDeUmOrcamento {

	void aplicaDescontroExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	
	void reprova(Orcamento orcamento);
	
	void finaliza(Orcamento orcamento);
}
