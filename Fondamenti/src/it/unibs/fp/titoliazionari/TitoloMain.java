package it.unibs.fp.titoliazionari;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class TitoloMain {

	public static void main(String[] args) {
		welcome();
		ElencoTitoli titlesList = new ElencoTitoli();
		Portafoglio myWallet = null;
		boolean walletCreated = false;
		String[] menu = new String[]{TitoliString.TITLE, TitoliString.WALLET, TitoliString.BUYTITLE, TitoliString.WALLETMENU};
		MyMenu titolimenu = new MyMenu(TitoliString.CHOICE , menu);
		while(true) {
			int choice = titolimenu.scegli();
			switch(choice)
			{
			case 0:
				System.exit(0);
			case 1:
				titlesList.addTitle(TitoloUtils.buildTitle());
				break;
			case 2:
				if(walletCreated==false){
					myWallet = TitoloUtils.buildWallet();
					walletCreated = true;
					break;
				}
				else{
					System.out.println(TitoliString.WARNWALLET);
					break;
				}
			case 3:
				if(myWallet == null){
					System.out.println(TitoliString.WARNING);
					break;
				}
				else
				{
					TitoloUtils.buyATitle(titlesList, myWallet);
					break;
				}
			case 4:
				
				break;
			}
		}

	}
	
	public static void welcome() {
		System.out.println(TitoliString.SEPARATOR);
		System.out.println(TitoliString.WELCOME);
		System.out.println(TitoliString.SEPARATOR);
	}
}
