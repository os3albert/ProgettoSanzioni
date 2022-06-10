package com.acme.sanzioni.multe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MultaImp implements Multa {
	
	private String dataEmissione;
	private String dataMassimaPagamento;

}
