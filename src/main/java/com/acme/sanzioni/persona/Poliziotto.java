package com.acme.sanzioni.persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Poliziotto extends PersonaImp {

	public Poliziotto(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

}
