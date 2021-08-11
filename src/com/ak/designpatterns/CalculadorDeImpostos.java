package com.ak.designpatterns;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double calculo = impostoQualquer.calcula(orcamento);
		System.out.println(calculo);
	}
}