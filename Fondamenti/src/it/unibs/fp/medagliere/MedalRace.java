package it.unibs.fp.medagliere;

import java.io.*;
import java.util.*;


public class MedalRace {
	private String Rname;	
	private ArrayList<MedalCountry> winners = new ArrayList<>(); 
	
	public MedalRace(String Rname) {
		this.Rname = Rname;
	}
	
	public String getRaceName() {
		return Rname;
	}
	
	public void addWinner(MedalCountry country) {
		winners.add(country);
	}
}
