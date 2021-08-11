package com.ak.designpatterns;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontroExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está finalizado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está finalizado!");		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está finalizado!");
	}

}
