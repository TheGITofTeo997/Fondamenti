package it.unibs.fp.veicoli;

public abstract class Autoveicolo implements Veicolo {

	private static final int NUMERO_RUOTE_AUTO = 4;
	
	private String targa;
	
	private int numeroRapporti;

	@Override
	public int getNumeroRapporti() {
		return this.numeroRapporti;
	}

	@Override
	public String getTarga() {
		return targa;
	}

	@Override
	public void setTarga(String parametroTarga) {
		this.targa = parametroTarga;
	}

	@Override
	public int getNumeroRuote() {
		return NUMERO_RUOTE_AUTO;
	}

	public void setNumeroRapporti(int numeroRapporti) {
		this.numeroRapporti = numeroRapporti;
	}
}
