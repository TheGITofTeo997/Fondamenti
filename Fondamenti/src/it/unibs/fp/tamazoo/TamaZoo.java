package it.unibs.fp.tamazoo;

import java.util.ArrayList;
import it.unibs.fp.tamaadvanced.*;

public class TamaZoo {
	private ArrayList <Tamagotchi> tamaList = new ArrayList<>();
	
	public void addTo(Tamagotchi tama) 
	{
		tamaList.add(tama);
	}
	
	public Tamagotchi getAt(int i) {
		return tamaList.get(i);
	}
	
	public int getSize() {
		return tamaList.size();
	}
	
	public void setAllHugs(int n) {
		for(int i=0; i<tamaList.size(); i++)
		{
			tamaList.get(i).setHug(n);
		}
	}
	
	public void setAllCookies(int n) {
		for(int i=0; i<tamaList.size(); i++)
		{
			tamaList.get(i).setCookie(n);
		}
	}
	
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
