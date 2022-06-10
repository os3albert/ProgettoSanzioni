package com.acme.sanzioni.persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
public class Criminale extends PersonaImp {

	public Criminale(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

}
