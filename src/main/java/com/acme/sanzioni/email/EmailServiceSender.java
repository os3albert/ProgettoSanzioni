package com.acme.sanzioni.email;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class EmailServiceSender extends EmailServiceImp{

	
	
	/**
	 * @param Name 
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
