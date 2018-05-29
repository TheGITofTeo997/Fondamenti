package it.unibs.fp.medagliere;

import java.io.*;
import java.util.*;

/**Class which instances a MedalRace object
 * @author Matr715329 & Matr715805
 */
public class MedalRace {
	private String Rname;	
	private ArrayList<MedalCountry> winners = new ArrayList<>(); 
	/**
	 * Constructor method
	 * @param Rname
	 */
	public MedalRace(String Rname) {
		this.Rname = Rname;
	}
	/**
	 * Method which returns the name of the race
	 * @return name
	 */
	public String getRaceName() {
		return Rname;
	}
	/**
	 * Method which adds a winnerCountry to the list for this race
	 * @param country
	 */
	public void addWinner(MedalCountry country) {
		winners.add(country);
	}
	/**
	 * Method which returns all the winners names for this race in a list
	 * @return names
	 */
	public String[] getWinnerNames() {
		String[] toReturn = new String[winners.size()];
		for(int i=0; i<winners.size(); i++)
		{
			toReturn[i] = winners.get(i).getCountryName();
		}
		return toReturn;
	}
	/**
	 * Method which finds a specific winner in the list by its name
	 * @param name
	 * @return found winner
	 */
	public MedalCountry findInList(String name) {
		for(int i=0;i<winners.size();i++) {
			if(winners.get(i).getCountryName().equalsIgnoreCase(name))
				return winners.get(i);
		}
		return null;
	}
}
