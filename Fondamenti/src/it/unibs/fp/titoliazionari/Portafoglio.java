package it.unibs.fp.titoliazionari;

import java.util.ArrayList;

public class Portafoglio {
	private ArrayList <LottoPosseduto> myWallet= new ArrayList<LottoPosseduto>();
	private String name;
	
	public Portafoglio(String name) {
		this.name = name;
	}
	
	public void addLot(LottoPosseduto lot) {
		myWallet.add(lot);
	}
	
	public double getWalletValue() {
		double value=0;
		for(int i=0; i<myWallet.size(); i++)
		{
			value += myWallet.get(i).getLotValue();
		}
		return value;
	}
	
	
}
