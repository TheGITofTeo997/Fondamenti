package it.unibs.fp.veicoli;

public interface Veicolo {
	
	public int getNumeroRapporti();
	
	public String getTarga();
	
	public void setTarga(String parametroTarga);
	
	public int getNumeroRuote();
	
	public Alimentazione getAlimentazione();
	
	
	
}
