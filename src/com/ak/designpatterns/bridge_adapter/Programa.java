package com.ak.designpatterns.bridge_adapter;

public class Programa {
	
	public static void main(String[] args) {
		
		// regra de negocio
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");
		// ...
	}

}
