package it.unibs.fp.medagliere;

import java.io.*;
import java.util.*;

public class RaceList {
	private ArrayList <MedalRace> raceList;
	
	public RaceList() {
		raceList = new ArrayList<MedalRace>();
	}
	
	public void addRace(String raceToAdd) {
		MedalRace rToAdd = new MedalRace(raceToAdd);
		if(checkIfRaceExists(raceToAdd) == true) {
			System.out.println(MedalStrings.WARNRACE);
		}
		else {
			raceList.add(rToAdd);
		}
	}
	
	public String[] getRaceNames() {
		String[] toReturn = new String[raceList.size()];
		for(int i=0; i<raceList.size(); i++)
		{
			toReturn[i] = raceList.get(i).getRaceName();
		}
		return toReturn;
	}
	
	public boolean checkIfRaceExists(String race) {
		for(int i=0; i<raceList.size(); i++) {
			if(raceList.get(i).getRaceName().equalsIgnoreCase(race))
				return true;
		}
		return false;
	}
	
	public MedalRace findInList(String name) {
		for(int i=0;i<raceList.size();i++) {
			if(raceList.get(i).getRaceName().equals(name))
				return raceList.get(i);
		}
		return null;
	}
}
