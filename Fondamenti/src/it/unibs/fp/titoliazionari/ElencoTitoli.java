package it.unibs.fp.titoliazionari;

import java.util.ArrayList;

public class ElencoTitoli {
	private ArrayList <Titolo> myTitles = new ArrayList <Titolo>();
	
	public void addTitle(Titolo title) {
		myTitles.add(title);
	}
	
	public Titolo getTitleAt(int i)
	{
		return myTitles.get(i);
	}
	
	public String getTitleNameAt(int i)
	{
		return myTitles.get(i).getName();
	}
	
	public int getListSize() {
		return myTitles.size();
	}
	
	public String[] getAllTitleNames() {
		String[] names = new String[myTitles.size()];
		for(int i=0; i<myTitles.size(); i++)
		{
			names[i] = myTitles.get(i).getName();
		}
		return names;
	}

}
