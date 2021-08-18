package com.ak.designpatterns.memento;

import java.util.Calendar;

public class Contrato {

	private Calendar data;
	private String cliente;
	private TipoContrato tipo;
	
	public Contrato(Calendar data, String cliente, TipoContrato tipo) {
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public Calendar getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}
	
	// Metodo que avança o estado do contrato
	public void avanca() {
		if (tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
		else if (tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
		else if (tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
	}
	
	// Método que "produz" o estado no momento certo
	public Estado salvaEstado() {
		return new Estado(new Contrato(this.data, this.cliente, this.tipo));
	}
	
	// Método que restaura um estado anterior
	public void restaura(Estado estado) {
		this.data = estado.getEstado().getData();
		this.cliente = estado.getEstado().getCliente();
		this.tipo = estado.getEstado().getTipo();
	}
}
