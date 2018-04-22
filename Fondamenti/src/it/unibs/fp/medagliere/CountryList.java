package it.unibs.fp.medagliere;

import java.io.*;
import java.util.*;


public class CountryList {
	private ArrayList <MedalCountry> countryList;
	
	public CountryList() {	
		countryList = new ArrayList<MedalCountry>();
	}

	public void addCountry(String countryToAdd) {
		MedalCountry cToAdd = new MedalCountry(countryToAdd);
		countryList.add(cToAdd);
	}
}
