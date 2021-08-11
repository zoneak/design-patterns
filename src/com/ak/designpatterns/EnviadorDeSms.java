package com.ak.designpatterns;

public class EnviadorDeSms implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por SMS");
	}

}
