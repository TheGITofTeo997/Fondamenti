package it.unibs.fp.tamazoo;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;
import it.unibs.fp.mylib.NumeriCasuali;
import it.unibs.fp.tamaadvanced.*;

public class TamaZooMain {
	/**Class which instances a TamaSad object
	 * @author Matr715329 & Matr715805
	 */
	private static int nTama;

	public static void main(String[] args) {
		TamaZoo zoo = new TamaZoo();
		TamaMain.welcome();
		nTama = InputDati.leggiIntero(TamaZooStrings.HOWMANY);
		for(int i=0; i<nTama; i++)
		{
			zoo.addTo(buildRandomTama());
		}
		System.out.println(TamaStrings.SEPARATOR);
		String[] menu = new String[]{TamaZooStrings.G_COOKIE_ALL, TamaZooStrings.G_HUG_ALL, TamaZooStrings.STATUS};
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
				zoo.setAllCookies(nc);
				printStatus(zoo);
				zoo.checkForDead();
				break;
			case 2: 
				int nh = InputDati.leggiInteroNonNegativo(TamaStrings.Q_HUG);
				if(nh>Tamagotchi.MAXINPUT)
					nh = Tamagotchi.MAXINPUT;
				zoo.setAllHugs(nh);
				printStatus(zoo);
				zoo.checkForDead();
				break;
			case 3:
				zoo.checkForDead();
				printStatus(zoo);			
			}
		}	
	}
	
	/**
	 * This method will build a random Tamagotchi type with random stats.
	 * 
	 * @return a type between 3 of Tamagotchi
	 */
	public static Tamagotchi buildRandomTama() {
		String nick = InputDati.leggiStringa(TamaStrings.ASKNICK);
		double happiness = NumeriCasuali.estraiDouble(0.0, 100.0);
		double hunger = NumeriCasuali.estraiDouble(0.0, 100.0);
		int choice;
		choice = NumeriCasuali.estraiIntero(1, 3);
		switch(choice)
		{		
		case 1:
			System.out.println(nick + TamaZooStrings.TAMASAD);
			return new TamaSad(happiness, hunger, nick);
		case 2:
			System.out.println(nick + TamaZooStrings.TAMAHUNGRY);
			return new TamaHungry(happiness, hunger, nick);
		}
		System.out.println(nick + TamaZooStrings.TAMABASE);
		return new Tamagotchi(happiness, hunger, nick);		
	}
	
	/*
	 * This method will print the status of every Tamagotchi in a TamaZoo list.
	 * 
	 * @param a TamaZoo list
	 */
	public static void printStatus(TamaZoo zoo) {
		for(int i=0; i<zoo.getSize();i++) {
			System.out.println(TamaStrings.SEPARATOR);
			System.out.println(i+1 + "." + zoo.getAt(i).getName()+":"+"("+zoo.getAt(i).getType()+")");
			System.out.println(TamaZooStrings.SOFTSEPARATOR);
			System.out.print(TamaStrings.HAPPINESS);
			System.out.printf("%.2f",zoo.getAt(i).getHappiness());
			System.out.println("");
			System.out.print(TamaStrings.HUNGER);
			System.out.printf("%.2f",zoo.getAt(i).getHunger());
			System.out.println("");
			System.out.println(TamaZooStrings.SOFTSEPARATOR);
			if(zoo.getAt(i).isSad()) {
				System.out.println(TamaStrings.SAD);
			}
			if(!zoo.getAt(i).isAlive())
			{
				System.out.println(zoo.getAt(i).getName() + TamaZooStrings.DIED);
			}	
		}
	}

}
