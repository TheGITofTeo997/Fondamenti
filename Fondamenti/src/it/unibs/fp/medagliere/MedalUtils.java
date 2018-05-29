package it.unibs.fp.medagliere;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;
/**Class which contains all the utils method for this project
 * @author Matr715329 & Matr715805
 */
public class MedalUtils {
	/**
	 * This method will assign the medals through a menu
	 * @param raceList
	 * @param countryList
	 */
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
	
	/**
	 * This method will show all the medals for the winners
	 * @param racelist
	 */
	public static void showMedal(RaceList rlist) {
		String[] raceNames = rlist.getRaceNames();
		for(int i=0; i<raceNames.length; i++) {
			System.out.println(MedalStrings.SEPARATOR);
			System.out.println(raceNames[i]);
			System.out.println(MedalStrings.SEPARATOR);
			MedalRace wonRace = rlist.findInList(raceNames[i]);
			String[] winnerNames = wonRace.getWinnerNames();
			for(int j=0; j<winnerNames.length; j++)
			{
				MedalCountry winner = wonRace.findInList(winnerNames[j]);
				System.out.println(winnerNames[j] + " O:"+ winner.getGoldsNumber() + " A:" + winner.getSilversNumber() + " B:" + winner.getBronzesNumber());
			}
		}	
	}
}
