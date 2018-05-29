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
		if(checkIfCountryExists(countryToAdd) == true) {
			System.out.println(MedalStrings.WARNCOUNTRY);
		}
		else {
			countryList.add(cToAdd);
		}
	}
	
	public String[] getCountryNames() {
		String[] toReturn = new String[countryList.size()];
		for(int i=0; i<countryList.size(); i++)
		{
			toReturn[i] = countryList.get(i).getCountryName();
		}
		return toReturn;
	}
	
	public boolean checkIfCountryExists(String country) {
		for(int i=0; i<countryList.size(); i++) {
			if(countryList.get(i).getCountryName().equalsIgnoreCase(country))
				return true;
		}
		return false;
	}
	
	public MedalCountry findInList(String name) {
		for(int i=0;i<countryList.size();i++) {
			if(countryList.get(i).getCountryName().equals(name))
				return countryList.get(i);
		}
		return null;
	}
}
