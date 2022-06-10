package com.acme.sanzioni.email;

public interface Email {

	String getDestinatario();

	String getMessaggio();

	String getMittente();

	String getOggetto();

	void setDestinatario(String destinatario);

	void setMessaggio(String messaggio);

	void setMittente(String mittente);

	void setOggetto(String oggetto);

}