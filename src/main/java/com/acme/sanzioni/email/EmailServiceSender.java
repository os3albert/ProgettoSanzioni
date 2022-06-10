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
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(Email email) {

		
	}

	@Override
	public void send(List<Email> emails) {
		// TODO Auto-generated method stub
		
	}
	
	

}
