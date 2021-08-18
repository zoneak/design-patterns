package com.ak.designpatterns.command;

public class PagaPedido implements Comando {

	private Pedido p;

	public PagaPedido(Pedido p) {
		this.p = p;
	}
	
	@Override
	public void executa() {
		System.out.println("Pagando pedido de " + p.getCliente());
		p.paga();
	}

}
