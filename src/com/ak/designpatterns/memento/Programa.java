package com.ak.designpatterns.memento;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		
		Historico historico = new Historico();
		Contrato c1 = new Contrato(Calendar.getInstance(), "AK", TipoContrato.NOVO);
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		System.out.println(c1.getTipo());
		
		// Estado estadoAnterior = historico.pega(1);
		// Estado estadoAnterior = historico.pega(1);
		// Estado estadoAnterior = historico.pega(2);
		// System.out.println(estadoAnterior.getEstado().getTipo());
		
		c1.restaura(historico.pega(1));
		System.out.println(c1.getTipo());
	}
}
