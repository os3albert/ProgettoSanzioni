package com.acme.sanzioni.multe;

public class MultaFactory {
	
	public final String TIPO_INFRAZIONE = "STRADALE";
	
	public static final Multa create(String tipoInfrazione) {

		Multa multa = null;
		
	}
	
	public static Multa create(String dataEmissione, String dataMassimaPagamento) {
		
		return create(TIPO_INFRAZIONE, dataEmissione, dataMassimaPagamento);
	}
	
	public static Multa create(int tipo) {
		
		return create(TIPO_INFRAZIONE, dataEmissione, dataMassimaPagamento);
	}

}
