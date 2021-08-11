package com.ak.designpatterns;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontroExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem descontro extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está reprovado!");		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
	
}
