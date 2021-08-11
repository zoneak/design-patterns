package com.ak.designpatterns;

public class TesteDeImpostosComplexos {
	
	// DECORATOR
	public static void main(String[] args) {
		ISS iss = new ISS(new ICPP());
		//ISS iss = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
	}

}
