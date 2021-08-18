package com.ak.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	
	// Construtor que é chamado quando a JVM carrega a classe, executado apenas 1x
	static {
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("so", new Si());
	}
	
	public Nota pega(String nome) {
		return notas.get(nome);
	}
}
