package it.unibs.fp.titoliazionari;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

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
		
	public static void buyATitle(ElencoTitoli list, Portafoglio mWallet)
	{
		boolean needToExit = false;
		String[] menu = list.getAllTitleNames();
		MyMenu titolimenu = new MyMenu(TitoliString.CHOICE , menu);
		while(needToExit==false) {
			int choice = titolimenu.scegli();
			if(choice!=0) {
				int nAct = InputDati.leggiInteroNonNegativo(TitoliString.HOWMANYACTIONS);
				LottoPosseduto bought = new LottoPosseduto(list.getTitleAt(choice-1), nAct);
				mWallet.addLot(bought);
				bought.setLotValue();
			}
			else
			{
				needToExit=true;
			}
		}		
	}
}
