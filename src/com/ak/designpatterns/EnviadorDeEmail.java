package com.ak.designpatterns;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por e-mail");
	}
}
