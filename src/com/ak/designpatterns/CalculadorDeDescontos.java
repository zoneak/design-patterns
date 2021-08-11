package com.ak.designpatterns;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		DescontoPorCincoItens d1 = new DescontoPorCincoItens();
		DescontoPorMaisDeQuinhentosReais d2 = new DescontoPorMaisDeQuinhentosReais();
		SemDesconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		return d1.desconta(orcamento);
	}
}
