package it.unibs.fp.titoliazionari;

import it.unibs.fp.mylib.InputDati;

public class TitoloUtils {
	
	public static Titolo buildTitle() {
		String nameTitle = InputDati.leggiStringaNonVuota(TitoliString.NAMETITLE);
		double valueTitle = InputDati.leggiDouble(TitoliString.VALUETITLE);
		return new Titolo(nameTitle, valueTitle);		
	}
	
	public static Portafoglio buildWallet() {
		String nameWallet = InputDati.leggiStringaNonVuota(TitoliString.NAMEWALLET);
		return new Portafoglio(nameWallet);
	}
}
