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
			myWallet.get(i).updateLotValue();
			value += myWallet.get(i).getLotValue();
		}
		return value;
	}
	
	public String[] getOwnedLotsNames() {
		String[] names = new String[myWallet.size()];
		for(int i=0; i<myWallet.size();i++)
		{
			names[i]=myWallet.get(i).getRefLottoName();
		}
		return names;
	}
	
	public LottoPosseduto getLotAt(int i) {
		return myWallet.get(i);
	}
}
