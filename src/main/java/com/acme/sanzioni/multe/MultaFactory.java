package com.acme.sanzioni.multe;

public class MultaFactory {
	
	public final String TIPO_INFRAZIONE = "STRADALE";
	
	public static Multa create(String tipoInfrazione) {

		Multa multa = new MultaStradale(); //siccome la classe astratta non si puo istanziare ho creato Multa Stradale
		
		return multa;
		
	}
	
	public static Multa create(String dataEmissione, String dataMassimaPagamento) {
		
		return create(TIPO_INFRAZIONE, dataEmissione, dataMassimaPagamento);
	}
	
	public static Multa create(int tipo) {
		
		return create(TIPO_INFRAZIONE, dataEmissione, dataMassimaPagamento);
	}

}
