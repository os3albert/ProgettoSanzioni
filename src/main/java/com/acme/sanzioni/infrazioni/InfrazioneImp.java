package com.acme.sanzioni.infrazioni;

import com.acme.sanzioni.persona.Criminale;
import com.acme.sanzioni.persona.Poliziotto;

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


	private Poliziotto poliziotto;
	private Criminale criminale;
}
