package com.acme.sanzioni.infrazioni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract  class InfrazioneStradale extends InfrazioneImp{
	private String strada;
	private String localita;
	public InfrazioneStradale(String descrizione, String articolo, String comma, String dataInfrazione,
			double importo,String strada, String localita) {
		super(descrizione, articolo, comma, dataInfrazione, importo);
			this.strada = strada;
			this.localita = localita;
	}

	
}
