package com.ak.designpatterns;

public class TesteDaNotaFiscal {

	// BUILDER
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Empresa XPTO")
			.comCnpj("12.345.678/0001-12")
			.comItem(new ItemDaNota("item 1", 100.0))
			.comItem(new ItemDaNota("item 2", 200.0))
			.comItem(new ItemDaNota("item 3", 300.0))
			.comItem(new ItemDaNota("item 4", 400.0))
			.comObservacoes("observacoes")
			.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
			
		System.out.println(nf.getValorBruto());
	}
}
