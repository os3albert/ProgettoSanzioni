package com.acme.sanzioni.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class EmailImp implements Email {
	
	private String mittente;
	private String destinatario;
	private String oggetto;
	private String messaggio;
	
	
}
