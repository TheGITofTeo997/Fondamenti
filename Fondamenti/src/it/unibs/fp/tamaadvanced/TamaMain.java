package it.unibs.fp.tamaadvanced;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class TamaMain {

	public static void main(String[] args) {
		welcome();
		Tamagotchi tama1 = buildTama();
		String[] menu = new String[]{TamaStrings.G_COOKIE, TamaStrings.G_HUG};
		MyMenu tamamenu = new MyMenu(TamaStrings.TAMA , menu);
		while(true) {
			int choice = tamamenu.scegli();
			switch(choice) {
			case 0:
				System.exit(0);		
			case 1: 
				int nc = InputDati.leggiInteroNonNegativo(TamaStrings.Q_COOKIE);
				if(nc>Tamagotchi.MAXINPUT)
					nc = Tamagotchi.MAXINPUT;
				tama1.setCookie(nc);
				System.out.println(TamaStrings.SEPARATOR);
				System.out.printf(TamaStrings.HAPPINESS + "%.2f", tama1.getHappiness());
				System.out.println("");
				System.out.printf(TamaStrings.HUNGER + "%.2f",tama1.getHunger());
				System.out.println("");
				if(tama1.isSad()==true)
				{
					System.out.println(TamaStrings.SAD);
				}
				System.out.println(TamaStrings.SEPARATOR);
				if(tama1.isAlive() == false) {
					System.out.println(TamaStrings.DEAD);
					System.exit(0);
				}
				break;
			case 2: 
				int nh = InputDati.leggiInteroNonNegativo(TamaStrings.Q_HUG);
				if(nh>Tamagotchi.MAXINPUT)
					nh = Tamagotchi.MAXINPUT;
				tama1.setHug(nh);
				System.out.println(TamaStrings.SEPARATOR);
				System.out.printf(TamaStrings.HAPPINESS + "%.2f", tama1.getHappiness());
				System.out.println("");
				System.out.printf(TamaStrings.HUNGER + "%.2f",tama1.getHunger());
				System.out.println("");
				if(tama1.isSad()==true)
				{
					System.out.println(TamaStrings.SAD);
				}
				System.out.println(TamaStrings.SEPARATOR);
				if(tama1.isAlive() == false) {
					System.out.println(TamaStrings.DEAD);
					System.exit(0);
				}
				break;
			}
		}
	}
	
	/**
	 * Method that welcomes you to Tama
	 */
	
	public static void welcome() {
		System.out.println(TamaStrings.SEPARATOR);
		System.out.println(TamaStrings.WELCOME);
		System.out.println(TamaStrings.SEPARATOR);
	}
	
	/**
	 * Method that builds Tamagotchi based on user input
	 * 
	 * @return new Tamagotchi Object
	 */
	public static Tamagotchi buildTama() {
		String nick = InputDati.leggiStringa(TamaStrings.ASKNICK);
		double happiness = InputDati.leggiIntero(TamaStrings.ASKHAP);
		double hunger = InputDati.leggiIntero(TamaStrings.ASKHUN);
		return new Tamagotchi(happiness, hunger, nick);
	}
	
}
