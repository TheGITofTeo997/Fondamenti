package it.unibs.fp.titoliazionari;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class TitoloMain {

	public static void main(String[] args) {
		welcome();
		String[] menu = new String[]{TitoliString.TITLE, TitoliString.WALLET};
		MyMenu titolimenu = new MyMenu(TitoliString.CHOICE , menu);
		while(true) {
			int choice = titolimenu.scegli();
			switch(choice)
			case 0:
				System.exit(0);
			case 1:
				TitoloUtils.buildTitle();
				break;
			case 2:
				
		}

	}
	
	public static void welcome() {
		System.out.println(TitoliString.SEPARATOR);
		System.out.println(TitoliString.WELCOME);
		System.out.println(TitoliString.SEPARATOR);
	}
}
