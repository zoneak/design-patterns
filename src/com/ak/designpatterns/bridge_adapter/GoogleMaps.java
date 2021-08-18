package com.ak.designpatterns.bridge_adapter;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	// Exemplo de Bridge 
	@Override
	public String devolveMapa(String rua) {
		try {
			String googleMaps = "https://maps.google.com/maps?q=rua+vergueiro";
			URL url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			// ...
			return "mapa";
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
