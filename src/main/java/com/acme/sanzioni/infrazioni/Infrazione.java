package com.acme.sanzioni.infrazioni;

import com.acme.sanzioni.persona.Criminale;
import com.acme.sanzioni.persona.Poliziotto;

public interface Infrazione {

	String getArticolo();

	String getComma();

	Criminale getCriminale();

	String getDataInfrazione();

	String getDescrizione();

	double getImporto();

	Poliziotto getPoliziotto();

	void setArticolo(String articolo);

	void setComma(String comma);

	void setCriminali(Criminale criminali);

	void setDataInfrazione(String dataInfrazione);

	void setDescrizione(String descrizione);

	void setImporto(double importo);

	void setPoliziotto(Poliziotto poliziotto);

}