package it.unibs.fp.tamazoo;

import java.util.ArrayList;
import it.unibs.fp.tamaadvanced.*;

public class TamaZoo {
	/** Class which manages a list of Tamagotchi.
	 * @author Matr715329 & Matr715805
	 */
	private ArrayList <Tamagotchi> tamaList = new ArrayList<>();
	
	/**
	 * This method will add a Tamagotchi to the list.
	 * 
	 * @param a Tamagotchi
	 */
	public void addTo(Tamagotchi tama) 
	{
		tamaList.add(tama);
	}
	
	/**
	 * This method will return a Tamagotchi at a certain index of the list.
	 * @param index
	 * @return a Tamagotchi
	 */
	public Tamagotchi getAt(int i) {
		return tamaList.get(i);
	}
	
	/**
	 * This method will return the size of the Tamagotchi list.
	 * @return the size of the Tamagotchi list
	 */
	public int getSize() {
		return tamaList.size();
	}
	
	/**
	 * This method will give hugs to all the Tamagotchi in the list.
	 * Using the specified setHugs for each Tamagotchi.
	 * 
	 * @param number of hugs to give
	 */
	public void setAllHugs(int n) {
		for(int i=0; i<tamaList.size(); i++)
		{
			tamaList.get(i).setHug(n);
		}
	}
	
	/**
	 * This method will give cookies to all the Tamagotchi in the list.
	 * Using the specified setCookie for each Tamagotchi.
	 * 
	 * @param number of cookies to give
	 */
	public void setAllCookies(int n) {
		for(int i=0; i<tamaList.size(); i++)
		{
			tamaList.get(i).setCookie(n);
		}
	}
	
	/**
	 * This method will keep checking if a Tamagotchi inside the list is dead,
	 * and if so, it will remove it from the list.
	 * 
	 * Please note that application will quit when all Tamagotchi are dead.
	 */
	public void checkForDead() {
		if(tamaList.size() == 0)
			System.exit(0);
		for(int i=0; i<tamaList.size(); i++)
		{
			if(!tamaList.get(i).isAlive())
				tamaList.remove(i);
		}
	}
}
