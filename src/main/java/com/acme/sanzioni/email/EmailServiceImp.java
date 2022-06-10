package com.acme.sanzioni.email;

import lombok.Data;

/**
 * @author albert
 * 
 * in questa classe mi sono mantenuto astratto
 *
 */
@Data
public abstract class EmailServiceImp implements EmailService {
	
	private String Name;
	private String usernamePerInvio;
	private String password;
	
	
	
	
	
	

}
