package com.ak.designpatterns.flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {
	
	// http://www.jfugue.org/download.html
	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> musica = Arrays.asList(
				notas.pega("do"),
				notas.pega("re"),
				notas.pega("mi"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("fa")
				);
		
		Piano piano = new Piano();
		piano.toca(musica);
	}

}
