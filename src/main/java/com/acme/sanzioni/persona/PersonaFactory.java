package com.acme.sanzioni.persona;

public class PersonaFactory {
	
	public static final int CRIMINALE = 0;
	public static final int POLIZIOTTO = 1;
	
	public static Persona create (int tipo, String nome, String cognome) {
		Persona persona = null;
		
		if (tipo == 0) {
			persona = new Criminale(nome, cognome);
		}else {
			persona = new Poliziotto(nome, cognome);
		}
		
		return persona;
	}

}
