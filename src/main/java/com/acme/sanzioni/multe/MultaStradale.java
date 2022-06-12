package com.acme.sanzioni.multe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MultaStradale extends MultaImp {

	public MultaStradale(String dataEmissione, String dataMassimaPagamento) {
		super(dataEmissione, dataMassimaPagamento);
		// TODO Auto-generated constructor stub
	}

	public MultaStradale() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
