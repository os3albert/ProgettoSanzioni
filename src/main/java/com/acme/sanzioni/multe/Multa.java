package com.acme.sanzioni.multe;

public interface Multa {
	public String getDataEmissione();

	public String getDataMassimaPagamento();

	public void setDataEmissione(String dataEmissione);

	public void setDataMassimaPagamento(String dataMassimaPagamento);
}