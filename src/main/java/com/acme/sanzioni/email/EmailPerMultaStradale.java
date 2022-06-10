package com.acme.sanzioni.email;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmailPerMultaStradale extends EmailImp {

	public EmailPerMultaStradale(String mittente, String destinatario, String oggetto, String messaggio) {
		super(mittente, destinatario, oggetto, messaggio);
	}
	
}
