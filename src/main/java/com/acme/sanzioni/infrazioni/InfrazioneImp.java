package com.acme.sanzioni.infrazioni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class InfrazioneImp implements Infrazione {
	private String descrizione;
	private String articolo;
	private String comma;
	private String dataInfrazione;
	private double importo;


	//Poliziotto;
	//Criminali;
}
