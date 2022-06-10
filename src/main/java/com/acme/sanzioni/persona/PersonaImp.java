package com.acme.sanzioni.persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaImp implements Persona {
	
	private String nome;
	private String cognome;
	

}
