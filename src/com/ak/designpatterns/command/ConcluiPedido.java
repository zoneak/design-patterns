package com.ak.designpatterns.command;

public class ConcluiPedido implements Comando {

	private Pedido p;

	public ConcluiPedido(Pedido p) {
		this.p = p;
	}
	
	@Override
	public void executa() {
		System.out.println("Finalizando pedido de " + p.getCliente());
		p.finaliza();
	}

}
