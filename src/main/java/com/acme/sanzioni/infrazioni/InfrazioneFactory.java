package com.acme.sanzioni.infrazioni;


public class InfrazioneFactory {

	private static final String INFRAZIONE_DI_STRADA = null;
	private static final String INFRAZIONE_NOR = null;

	public static Infrazione create( String tipo) {
		Infrazione infrazione = null;
		if(tipoInfrazione == INFRAZIONE_DI STRADA) {
			infrazione = new InfrazioneDiStrada();
		} else if(tipoInfrazione == INFRAZIONE_NOR) {
			infrazione = new InfrazioneNor();
		} else {
			throw new WrongInfrazioneTypeException("Tipo infazione specificata errato");
		}
		
		return infrazione;
	}

}
