package it.unibs.fp.medagliere;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class MedalUtils {
	
	public static void giveMedal(RaceList rList, CountryList cList) {
		boolean menuExitFlag = false;
		String raceToPrize = InputDati.leggiStringaNonVuota(MedalStrings.WHICHRACE);
		MedalRace rToPrize = rList.findInList(raceToPrize);
		if(rToPrize == null)
		{
			System.out.println(MedalStrings.RNOTFOUND);
			return;
		}
		String countryToPrize = InputDati.leggiStringaNonVuota(MedalStrings.WHICHCOUNTRY);
		MedalCountry cToPrize = cList.findInList(countryToPrize);
		if(cToPrize == null)
		{
			System.out.println(MedalStrings.CNOTFOUND);
			return;
		}
		rToPrize.addWinner(cToPrize);
		String[] menu = new String[] {MedalStrings.GOLD, MedalStrings.SILVER, MedalStrings.BRONZE};
		MyMenu prizeMenu = new MyMenu(MedalStrings.MEDALS, menu);
		do {
			int choice = prizeMenu.scegli();
			switch(choice) {				
			case 0:
				menuExitFlag = true;
				break;
			case 1:
				int g = InputDati.leggiInteroNonNegativo(MedalStrings.HMMEDALS);
				cToPrize.addGolds(g);
				break;
			case 2:
				int s = InputDati.leggiInteroNonNegativo(MedalStrings.HMMEDALS);
				cToPrize.addSilvers(s);
				break;
			case 3:
				int b = InputDati.leggiInteroNonNegativo(MedalStrings.HMMEDALS);
				cToPrize.addBronzes(b);
			}
		}
		while(menuExitFlag!=true);		
	}
	
	
	public static void showMedal(RaceList rlist) {
		String[] raceNames = rlist.getRaceNames();
		
	}
	
}
