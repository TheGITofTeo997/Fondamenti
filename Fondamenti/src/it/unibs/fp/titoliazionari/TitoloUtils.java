package it.unibs.fp.titoliazionari;

import it.unibs.fp.mylib.EstrazioniCasuali;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;
import it.unibs.fp.mylib.NumeriCasuali;

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
				bought.updateLotValue();
			}
			else
			{
				needToExit=true;
			}
		}		
	}
	
	public static void dailyVariation(ElencoTitoli list)
	{
		for(int i=0; i<list.getListSize(); i++)
		{
			double variation = NumeriCasuali.estraiDouble(1.0, 10.0);
			if(chooseSign()==1)
			{
				variation = variation * (-1);
			}
			list.getTitleAt(i).updateValue(variation);
		}
	}
	
	public static int chooseSign() {
		int sign;
		sign = EstrazioniCasuali.estraiIntero(0, 1);
		return sign;
	}
}
