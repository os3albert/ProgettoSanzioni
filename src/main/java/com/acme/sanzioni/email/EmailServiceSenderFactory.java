package com.acme.sanzioni.email;

public class EmailServiceSenderFactory {

	public static final String UFFICIO_PROVINCIALE = "server.ufficio.provinciale.it";
	public static final String UFFICIO_POLIZIA = "server.ufficio.polizia.it";

	public static EmailServiceSender create(String tipo, String usernamePerInvio, String password) {
		
		EmailServiceSender emailServiceSender = null;
		
		if (tipo.equals(UFFICIO_POLIZIA)) {
			emailServiceSender = new EmailServiceSender(tipo, usernamePerInvio, password);
		} else if (tipo.equals(UFFICIO_PROVINCIALE)) {
			emailServiceSender = new EmailServiceSender(tipo, usernamePerInvio, password);
		}
		
		return emailServiceSender;
		
	}

}
