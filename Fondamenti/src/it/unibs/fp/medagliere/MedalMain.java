package it.unibs.fp.medagliere;

import it.unibs.fp.mylib.BelleStringhe;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;
import it.unibs.fp.titoliazionari.LottoPosseduto;
import it.unibs.fp.titoliazionari.TitoliString;

import java.io.*;
import java.util.*;


public class MedalMain {
	private static boolean menuExitFlag = false;
	private static CountryList clist = new CountryList();
	private static RaceList rlist = new RaceList();

	public static void main(String[] args) {
		welcomeMsg();

		String[] menu = new String[] {MedalStrings.MENU_OPT1_COUNTRY, MedalStrings.MENU_OPT2_RACE,
				MedalStrings.MENU_OPT3_RESULT, MedalStrings.MENU_OPT4_VIEW};
		MyMenu medalMenu = new MyMenu(MedalStrings.MEDAL, menu);
	do {
		int choice = medalMenu.scegli();
		switch(choice){
		case 0:
			menuExitFlag = true;
			System.out.print(MedalStrings.EXIT);
			break;
		case 1:
			System.out.println(MedalStrings.SEPARATOR);
			String toAddC = InputDati.leggiStringaNonVuota(MedalStrings.INSERT + MedalStrings.COUNTRY_ADD);
			clist.addCountry(toAddC);			
			break;
		case 2:
			System.out.println(MedalStrings.SEPARATOR);
			String toAddR = InputDati.leggiStringaNonVuota(MedalStrings.INSERT + MedalStrings.RACE_ADD);
			rlist.addRace(toAddR);
			break;
		case 3:
			System.out.println(MedalStrings.SEPARATOR);
			System.out.println(MedalStrings.INSERT_R);
			System.out.println(MedalStrings.SEPARATOR);
			MedalUtils.giveMedal(rlist, clist);
			break;
		case 4:
			System.out.println(MedalStrings.SEPARATOR);
			System.out.println(MedalStrings.VIEW);
			System.out.println(MedalStrings.SEPARATOR);
			MedalUtils.showMedal(rlist);
			break;
		}	
	}
	while(menuExitFlag!=true);
	}
	
	public static void welcomeMsg() {
		System.out.println(MedalStrings.WELCOME);
	}
}
