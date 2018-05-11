package it.unibs.fp.tamazoo;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;
import it.unibs.fp.mylib.NumeriCasuali;
import it.unibs.fp.tamaadvanced.*;

public class TamaZooMain {
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
		String[] menu = new String[]{TamaZooStrings.G_COOKIE_ALL, TamaZooStrings.G_HUG_ALL};
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
				System.out.println(TamaStrings.SEPARATOR);
				/*System.out.printf(TamaStrings.HAPPINESS + "%.2f", tama1.getHappiness());
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
				break;*/
				
			}
		}
			
	}
	
	
	
	
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
	
	public static void getStatus() {
		
	}

}
