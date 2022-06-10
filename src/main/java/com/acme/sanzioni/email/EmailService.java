package com.acme.sanzioni.email;

import java.util.List;

/**
 * @author albert
 * 
 * interfaccia sevizio email
 *
 */
public interface EmailService {

	String getName();

	String getPassword();

	String getUsernamePerInvio();

	void setName(String Name);

	void setPassword(String password);

	void setUsernamePerInvio(String usernamePerInvio);
	
	void send(Email email);
	
	void send(List<Email> emails);

}