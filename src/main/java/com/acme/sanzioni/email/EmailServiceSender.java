package com.acme.sanzioni.email;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author alber
 *
 */
@Data
@AllArgsConstructor
public class EmailServiceSender extends EmailServiceImp{

	
	
	/**
	 * @param Name Nome del email del ufficiio di polizia provinciale ed email del ufficio
	 * polizia municipale
	 *  
	 * @param usernamePerInvio 
	 * @param password
	 */
	public EmailServiceSender(String Name, String usernamePerInvio, String password) {
		super(Name, usernamePerInvio, password);
	}

	@Override
	public void send(Email email) {
		
		System.out.println(email.getDestinatario() + email.getMessaggio() + email.getMittente() + email.getOggetto());

		
	}

	@Override
	public void send(List<Email> emails) {

		for (Email email : emails) {
			System.out.println(email.getDestinatario() + email.getMessaggio() + email.getMittente() + email.getOggetto());
		}
	}
	
	

}
