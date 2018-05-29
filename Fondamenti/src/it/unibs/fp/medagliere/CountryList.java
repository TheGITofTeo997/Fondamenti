package it.unibs.fp.medagliere;

import java.io.*;
import java.util.*;

/**Class which instances a CountryList object
 * @author Matr715329 & Matr715805
 */
public class CountryList {
	private ArrayList <MedalCountry> countryList;
/**
 * Constructor method
 */
	public CountryList() {	
		countryList = new ArrayList<MedalCountry>();
	}
/**
 * Method which adds a country to the list
 * @param countryToAdd
 */
	public void addCountry(String countryToAdd) {
		MedalCountry cToAdd = new MedalCountry(countryToAdd);
		if(checkIfCountryExists(countryToAdd) == true) {
			System.out.println(MedalStrings.WARNCOUNTRY);
		}
		else {
			countryList.add(cToAdd);
		}
	}
/**
 * Method which returns the size of the list
 * @return size
 */
	public int getCountryNumber() {
		return countryList.size();
	}
/**
 * Method which returns all the names of the country in the list
 * @return countryNames
 */
	public String[] getCountryNames() {
		String[] toReturn = new String[countryList.size()];
		for(int i=0; i<countryList.size(); i++)
		{
			toReturn[i] = countryList.get(i).getCountryName();
		}
		return toReturn;
	}
/**
 * Method that checks if the country is already in the list
 * @param country
 * @return true if it's in the list
 */
	public boolean checkIfCountryExists(String country) {
		for(int i=0; i<countryList.size(); i++) {
			if(countryList.get(i).getCountryName().equalsIgnoreCase(country))
				return true;
		}
		return false;
	}
/**
 * Method which finds a specific country in the list by its name
 * @param name
 * @return found country
 */
	public MedalCountry findInList(String name) {
		for(int i=0;i<countryList.size();i++) {
			if(countryList.get(i).getCountryName().equalsIgnoreCase(name))
				return countryList.get(i);
		}
		return null;
	}
}
