package it.unibs.fp.tamazoo;

import java.util.ArrayList;
import it.unibs.fp.tamaadvanced.*;

public class TamaZoo {
	private ArrayList <Tamagotchi> tamaList = new ArrayList<>();
	
	public void addTo(Tamagotchi tama) 
	{
		tamaList.add(tama);
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
		
	}
}
