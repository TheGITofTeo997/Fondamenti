package it.unibs.fp.titoliazionari;

import java.util.ArrayList;
/**Class which instances a Wallet Object
 * @author Matr715329 & Matr715805
 */
public class Portafoglio {
	private ArrayList <LottoPosseduto> myWallet= new ArrayList<LottoPosseduto>();
	private String name;
	/**
	 * Constructor method for Portafoglio Object Class
	 * 
	 * @param name
	 */
	public Portafoglio(String name) {
		this.name = name;
	}
	/**
	 * Method which adds a Lot object in the wallet
	 * @param lot
	 */
	public void addLot(LottoPosseduto lot) {
		myWallet.add(lot);
	}
	/**
	 * Method which calculates and return the total wallet value
	 * @return value
	 */
	public double getWalletValue() {
		double value=0;
		for(int i=0; i<myWallet.size(); i++)
		{
			myWallet.get(i).updateLotValue();
			value += myWallet.get(i).getLotValue();
		}
		return value;
	}
	/**
	 * Method which returns in an array all the names of the Lots contained in the wallet
	 * @return names
	 */
	public String[] getOwnedLotsNames() {
		String[] names = new String[myWallet.size()];
		for(int i=0; i<myWallet.size();i++)
		{
			names[i]=myWallet.get(i).getRefLottoName();
		}
		return names;
	}
	/**
	 * Method which returns a Lot at a specific index
	 * @param index
	 * @return lot
	 */
	public LottoPosseduto getLotAt(int i) {
		return myWallet.get(i);
	}
}
