package com.ak.designpatterns;

public class Impressora implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("Imprimi");
	}

}
