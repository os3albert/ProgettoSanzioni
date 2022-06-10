package com.acme.sanzioni.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author albert
 * 
 * in questa classe mi sono mantenuto astratto
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class EmailServiceImp implements EmailService {
	
	private String Name;
	private String usernamePerInvio;
	private String password;
	
	
	
	
	
	

}
