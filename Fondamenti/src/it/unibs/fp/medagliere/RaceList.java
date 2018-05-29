package it.unibs.fp.medagliere;

import java.io.*;
import java.util.*;
/**Class which instances a RaceList object
 * @author Matr715329 & Matr715805
 */
public class RaceList {
	private ArrayList <MedalRace> raceList;
/**
 * Constructor method
 */
	public RaceList() {
		raceList = new ArrayList<MedalRace>();
	}
	/**
	 * Method which adds a race to the list
	 * @param raceToAdd
	 */	
	public void addRace(String raceToAdd) {
		MedalRace rToAdd = new MedalRace(raceToAdd);
		if(checkIfRaceExists(raceToAdd) == true) {
			System.out.println(MedalStrings.WARNRACE);
		}
		else {
			raceList.add(rToAdd);
		}
	}
	/**
	 * Method which returns the size of the list
	 * @return size
	 */
	public int getRaceNumber() {
		return raceList.size();
	}
	/**
	 * Method which returns all the names of the races in the list
	 * @return raceNames
	 */
	public String[] getRaceNames() {
		String[] toReturn = new String[raceList.size()];
		for(int i=0; i<raceList.size(); i++)
		{
			toReturn[i] = raceList.get(i).getRaceName();
		}
		return toReturn;
	}
	/**
	 * Method that checks if the race is already in the list
	 * @param race
	 * @return true if it's in the list
	 */
	public boolean checkIfRaceExists(String race) {
		for(int i=0; i<raceList.size(); i++) {
			if(raceList.get(i).getRaceName().equalsIgnoreCase(race))
				return true;
		}
		return false;
	}
	/**
	 * Method which finds a specific race in the list by its name
	 * @param name
	 * @return found race
	 */
	public MedalRace findInList(String name) {
		for(int i=0;i<raceList.size();i++) {
			if(raceList.get(i).getRaceName().equalsIgnoreCase(name))
				return raceList.get(i);
		}
		return null;
	}
}
