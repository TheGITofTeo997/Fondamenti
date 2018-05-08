package it.unibs.fp.tamazoo;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.NumeriCasuali;
import it.unibs.fp.tamaadvanced.*;

public class TamaZooMain {
	private static int nTama;

	public static void main(String[] args) {
		TamaMain.welcome();
		nTama = InputDati.leggiIntero(TamaZooStrings.HOWMANY);
		for(int i=0; i<nTama; i++)
		{
			
		}
		
	}
	
	
	public static Tamagotchi buildTama() {
		String nick = InputDati.leggiStringa(TamaStrings.ASKNICK);
		double happiness = NumeriCasuali.estraiDouble(0.0, 100.0);
		double hunger = NumeriCasuali.estraiDouble(0.0, 100.0);
		return new Tamagotchi(happiness, hunger, nick);
	}
}
