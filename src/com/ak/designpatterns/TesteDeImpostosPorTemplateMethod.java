package com.ak.designpatterns;

public class TesteDeImpostosPorTemplateMethod {

	// TEMPLATE METHOD
	public static void main(String[] args) {
		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("CANETA", 50.0));
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, icpp);
		calculador.realizaCalculo(orcamento, ikcv);
	}
}
