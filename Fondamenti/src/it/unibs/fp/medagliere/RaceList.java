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
		raceList.add(rToAdd);
	}
	
	public String[] getRaceNames() {
		String[] toReturn = new String[raceList.size()];
		for(int i=0; i<raceList.size(); i++)
		{
			toReturn[i] = raceList.get(i).getRaceName();
		}
		return toReturn;
	}
}
