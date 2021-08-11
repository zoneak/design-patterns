package com.ak.designpatterns;

public class TesteAcoes {

	// OBSERVER
	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Empresa XPTO")
								.comCnpj("123")
								.comItem(new ItemDaNota("nome", 100.0))
								.comObservacoes("observações")
								.naDataAtual()
								.constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
