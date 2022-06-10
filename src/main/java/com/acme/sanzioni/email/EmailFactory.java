package com.acme.sanzioni.email;

public class EmailFactory {
	
	public static final  int MULTA_STRADALE = 1;
	
	public static Email create(int tipoEmail) throws WrongEmailTypeException {
		
		Email email = null;
		
		if(tipoEmail == MULTA_STRADALE) {
			return new EmailPerMultaStradale();
		}
		else {
			throw new WrongEmailTypeException();
		}
		
	}
}
